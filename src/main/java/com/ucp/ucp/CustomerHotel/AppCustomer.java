package com.ucp.ucp.CustomerHotel;

import java.sql.Date;

public class AppCustomer {
    public static void main(String[] args) {
        CustomerHotel customer1 = new CustomerHotel();

        customer1.infotamu();
        customer1.setchekin(new Date(System.currentTimeMillis()));
        customer1.setchekout(new Date(System.currentTimeMillis()));
        customer1.informasipembayaran();
        customer1.pesananMakanan();
    }
}
