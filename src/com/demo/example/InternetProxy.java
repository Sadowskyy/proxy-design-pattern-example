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
    /**
     * This method give us information about that we have been at website.
     * Otherwise browser connect to the WWW.
     * @param url String is used to connect to specified website.
     * */
    public void connectToWebsite (final String url) {
        String correctUrl = url.toLowerCase();
        if(historyOfBrowsingUrls.contains(correctUrl))
            System.out.println("You have been here");

        browser.connectToWebsite(correctUrl);
    }
}
