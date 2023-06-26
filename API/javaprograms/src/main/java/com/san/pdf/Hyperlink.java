package com.san.pdf;

public class Hyperlink {
	private String text;
    private String url;

    public Hyperlink(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public String getURL() {
        return url;
    }
}
