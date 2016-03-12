package com.javarush.test.level27.lesson15.big01;

import com.javarush.test.level27.lesson15.big01.kitchen.Cook;
import com.javarush.test.level27.lesson15.big01.kitchen.Waitor;

/**
 * Created by
 * Polurival on 03.03.2016.
 */
public class Restaurant
{
    private static final int ORDER_CREATING_INTERVAL = 100;

    public static void main(String[] args)
    {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        Waitor waitor = new Waitor();
        tablet.addObserver(cook);
        cook.addObserver(waitor);
        tablet.createOrder();
        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printCookWorkloading();
        directorTablet.printActiveVideoSet();
        directorTablet.printArchivedVideoSet();
    }
}
