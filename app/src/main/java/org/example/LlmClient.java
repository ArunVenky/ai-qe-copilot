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

    public String extractText(Response response) {

    return response.output().stream()
            .flatMap(item -> item.message().stream())
            .flatMap(message -> message.content().stream())
            .flatMap(content -> content.outputText().stream())
            .map(outputText -> outputText.text())
            .findFirst()
            .orElseThrow(() ->
                    new IllegalStateException("No text returned by LLM"));
}
}