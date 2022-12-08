package com.example.lesson2.storage;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {

    private static final String THEME_KEY = "THEME_KEY";
    private static final String THEME_ONE = "THEME_ONE";
    private static final String THEME_TWO = "THEME_TWO";

private static final Object MODE_PRIVATE = 0;
    private static ThemeStorage INSTANCE;
    private Context context;
    private SharedPreferences sharedPreferences;

    private ThemeStorage(Context context) {
        this.context = context;

        SharedPreferences sharedPreferences = context.getSharedPreferences("preferences", Context.MODE_PRIVATE);
    }


    public static ThemeStorage getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new ThemeStorage(context);
        }
        return INSTANCE;
    }

    public void saveTheme () {

    }

}
