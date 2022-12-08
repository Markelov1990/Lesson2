package com.example.lesson2.storage;

import androidx.annotation.StringRes;

import com.example.lesson2.R;

public enum Theme {
    //ONE (R.string.THEME_ONE, key),
    //TWO (title, key);


    private @StringRes int title;
    private String key;

    Theme(int title, String key) {
        this.title = title;
        this.key = key;
    }

    public int getTitle () {
        return title;
    }
    public int getKey () {
        return key;
    }
}
