package com.bsejawal.behavioral.observer.postoffice;

public class Mail {
    private String receiverName;
    private String address;
    private String content;

    public Mail(String receiverName, String address, String content) {
        this.receiverName = receiverName;
        this.address = address;
        this.content = content;
    }
}
