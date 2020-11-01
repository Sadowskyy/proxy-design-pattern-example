package com.demo.example;

import java.util.ArrayList;
import java.util.List;

class InternetProxy implements WebSite {
    WebSite browser = new Browser();

    static List<String> historyOfBrowsingUrls;

    public InternetProxy () {
        historyOfBrowsingUrls = new ArrayList<>();
        historyOfBrowsingUrls.add("google.com");
    }

    @Override
    public void connectToWebsite (final String url) {
        String correctUrl = url.toLowerCase();
        if(historyOfBrowsingUrls.contains(correctUrl))
            System.out.println("You have been here");

        browser.connectToWebsite(correctUrl);
    }
}
