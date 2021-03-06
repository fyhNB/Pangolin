package com.yuheng.pangolin.constant;

public enum StatusCode {
    OK(200),
    UNKNOWN_ERR(600),
    USER_EXISTED(601),
    PWD_ERR(602),
    BAD_TOKEN(603),
    DID_NOT_SIGNIN(604),
    WRONG_USER(605),
    DUPLICATE_SHARE(606);

    private final int value;

    private StatusCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
