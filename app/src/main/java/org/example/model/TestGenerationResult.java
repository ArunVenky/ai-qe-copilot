package org.example.model;
import java.util.List;

public class TestGenerationResult {
    private List<TestCase> testCases;
    private List<String> clarifications;

    public TestGenerationResult() {
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCase> testCases) {
        this.testCases = testCases;
    }

    public List<String> getClarifications() {
        return clarifications;
    }

    public void setClarifications(List<String> clarifications) {
        this.clarifications = clarifications;
    }

}
