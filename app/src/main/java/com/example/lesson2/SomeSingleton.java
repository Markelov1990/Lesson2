package com.example.lesson2;

import android.content.Context;

public class SomeSingleton {

    private static SomeSingleton INSTANCE;
    private final Context context;

    private SomeSingleton (Context context) {
        this.context = context;
    }


    public static SomeSingleton getINSTANCE(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SomeSingleton(context);
        }
        return INSTANCE;
    }






}
