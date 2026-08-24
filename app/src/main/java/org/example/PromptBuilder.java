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
            - return only five test cases in JSON format with the following structure:

            {
              "testCases": [
                {
                  "id": "TC001",
                  "type": "POSITIVE",
                  "scenario": "description",
                  "expectedResult": "expected result",
                  "priority": "HIGH"
                }
              ],
              "clarifications": [
                "clarification if required"
              ]
            }

            Rules:
            - Do not invent business rules.
            - Do not assume values that are not provided.
            - Identify missing or ambiguous information.
            - If information is missing, add it to clarifications.

            Return the result as JSON using exactly this structure:

            {
              "testCases": [
                {
                  "id": "TC001",
                  "type": "POSITIVE",
                  "scenario": "description",
                  "expectedResult": "expected result",
                  "priority": "HIGH"
                }
              ],
              "clarifications": [
                "clarification if required"
              ]
            }

            Allowed type values:
            POSITIVE, NEGATIVE, BOUNDARY, COMPLIANCE, INTEGRATION

            Allowed priority values:
            HIGH, MEDIUM, LOW

            Return JSON only.
            Do not return markdown.
            Do not return explanations outside the JSON.

            Business Requirement:
            %s
            """.formatted(requirement);

    }

    
}
