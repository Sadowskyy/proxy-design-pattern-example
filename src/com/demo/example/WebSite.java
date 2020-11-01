package com.demo.example;

/**
 * @author Wiktor Sadowski
 */
interface WebSite {
    /**
     * * This interface is used in proxy to connect with website saved in browser history, or connect via WWW.
     * @param url String param is used to get the website from repository(Browser) or from in memory database(InternetProexy)
     */
    void connectToWebsite (String url);
}
