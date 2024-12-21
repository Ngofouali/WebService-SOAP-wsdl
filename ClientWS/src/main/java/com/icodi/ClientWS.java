package com.icodi;

import STUB_Proxy.BanqueService;
import STUB_Proxy.BanqueWebService;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWebService().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToMAD(300));
    }
}
