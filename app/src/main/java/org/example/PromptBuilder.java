package org.example;

public class PromptBuilder {
    public String buildTestGenerationPrompt(String requirement){
         return """
                You are a senior Quality Engineer working
                on a regulated banking application.

                Analyze the following business requirement.

                Generate:
                - Positive test scenarios
                - Negative test scenarios
                - Boundary test scenarios
                - Compliance test scenarios
                - Integration test scenarios
                - generate maximum 10 test scenarios in total

                Rules:
                - Do not invent business rules.
                - Do not assume values that are not provided.
                - Identify missing or ambiguous information.
                - If information is missing, list it under
                  "Clarifications Required".

                Business Requirement:
                %s
                """.formatted(requirement);

    }

    
}
