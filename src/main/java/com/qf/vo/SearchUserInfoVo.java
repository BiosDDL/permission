package com.qf.vo;

public class SearchUserInfoVo extends SplitePageVo {

    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SearchUserInfoVo{" +
                "email='" + email + '\'' +
                '}';
    }
}
