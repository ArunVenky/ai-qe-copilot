package org.example;
import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;

public class LlmClient {
    private final OpenAIClient client;

    public LlmClient() {
        this.client = OpenAIOkHttpClient.fromEnv();
    }

    public Response ask(String prompt){
        ResponseCreateParams params =
                ResponseCreateParams.builder()
                        .input(prompt)
                        .model(ChatModel.GPT_5_MINI)
                        .build();
        return client.responses().create(params);
    }
}