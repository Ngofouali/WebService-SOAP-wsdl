package com.icodi.banqueservice;

import jakarta.xml.ws.Endpoint;

public class ServerJXWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8585 /banqueservice";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web Service déployé avec succès sur " + url);
    }
}
