package com.demo.example;

class Browser implements WebSite {

    @Override
    public void connectToWebsite (String url) {
        System.out.println("Connecting to: " + url);
    }
}
