package com.example.spring4shell.model;

public class HelloWorld {

    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    private String endpoint;
    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) {this.endpoint = endpoint; }

    private Boolean isVulnerable;
    public Boolean isVulnerable(){ return isVulnerable; }
    public void setIsVulnerable(Boolean vulnerable) { this.isVulnerable = vulnerable; }

    private String dateTime;
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}
