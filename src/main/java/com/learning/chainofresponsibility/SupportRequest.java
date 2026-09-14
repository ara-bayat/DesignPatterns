package com.learning.chainofresponsibility;

public class SupportRequest {
    private final String issue;
    private final int severity; // ۱ = ساده، ۲ = متوسط، ۳ = بحرانی

    public SupportRequest(String issue, int severity) {
        this.issue = issue;
        this.severity = severity;
    }

    public String getIssue() { return issue; }
    public int getSeverity() { return severity; }
}