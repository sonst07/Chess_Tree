package com.example.myapplication;

public class UserAccount {
    private String idToken;
    private String nickName;
    private String emailId;
    private String password;
    private int winning_Num;
    private int losing_Num;
    private int point;

    public UserAccount() {
        winning_Num = 0;
        losing_Num = 0;
        point = 1000;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getWinning_Num() {
        return winning_Num;
    }

    public void setWinning_Num(int winning_Num) {
        this.winning_Num = winning_Num;
    }

    public int getLosing_Num() {
        return losing_Num;
    }

    public void setLosing_Num(int losing_Num) {
        this.losing_Num = losing_Num;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
