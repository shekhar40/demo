package com.bill.desco.dto;

public class ApiGetTokenResponseDTO {
    private String username;
    private String status;
    private String accessToken;
    private String tokenType;

    public ApiGetTokenResponseDTO() {
    }

    public ApiGetTokenResponseDTO(String username, String status, String accessToken, String tokenType) {
        this.username = username;
        this.status = status;
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return "ApiGetTokenResponseDTO{" +
                "username='" + username + '\'' +
                ", status='" + status + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                '}';
    }
}
