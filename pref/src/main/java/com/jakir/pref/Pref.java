package com.jakir.pref;

//
// Created by JAKIR HOSSAIN on 8/5/2025.
// Modified on 30/11/2025.
// Modified on 05/12/2025.
//


import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class Pref {
    public static void setString(String key, String data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.putString(key, data);
        editor.apply();
    }

    public static String getString(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getString(key, "");
    }

    public static String getString(String key, Context context, String defValue) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getString(key, defValue);
    }


    public static void setBoolean(String key, boolean data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key, data);
        editor.apply();
    }

    public static boolean getBoolean(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }

    public static boolean getBoolean(String key, Context context, Boolean defValue) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, defValue);
    }


    public static void setLong(String key, long data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.putLong(key, data);
        editor.apply();
    }

    public static long getLong(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getLong(key, 0);
    }

    public static long getLong(String key, Context context, long defValue) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getLong(key, defValue);
    }


    public static void setInteger(String key, int data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.putInt(key, data);
        editor.apply();
    }

    public static int getInteger(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getInt(key, 0);
    }

    public static int getInteger(String key, Context context, int defValue) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getInt(key, defValue);
    }


    public static void setFloat(String key, float data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.putFloat(key, data);
        editor.apply();
    }

    public static float getFloat(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getFloat(key, 0);
    }

    public static float getFloat(String key, Context context, float defValue) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        return preferences.getFloat(key, defValue);
    }


    public static void setTheme(int data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences("ThemePrefs", Context.MODE_PRIVATE).edit();
        editor.putInt("ThemeMode", data);
        editor.apply();
    }

    public static int getTheme(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("ThemePrefs", Context.MODE_PRIVATE);
        return preferences.getInt("ThemeMode", AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
    }

    public static int getTheme(Context context, int defValue) { //   MODE_NIGHT_FOLLOW_SYSTEM = -1; MODE_NIGHT_NO = 1; MODE_NIGHT_YES = 2;
        SharedPreferences preferences = context.getSharedPreferences("ThemePrefs", Context.MODE_PRIVATE);
        return preferences.getInt("ThemeMode", defValue);
    }


    public static void setTheme_2(String key, int data, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences("ThemePrefs_custom", Context.MODE_PRIVATE).edit();
        editor.putInt(key, data);
        editor.apply();
    }

    public static int getTheme_2(String key, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("ThemePrefs_custom", Context.MODE_PRIVATE);
        return preferences.getInt(key, AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
    }

    public static int getTheme_2(String key, Context context, int defValue) { //   MODE_NIGHT_FOLLOW_SYSTEM = -1; MODE_NIGHT_NO = 1; MODE_NIGHT_YES = 2;
        SharedPreferences preferences = context.getSharedPreferences("ThemePrefs_custom", Context.MODE_PRIVATE);
        return preferences.getInt(key, defValue);
    }

    /**
     * SharedPreferences থেকে একটি নির্দিষ্ট কী (key) এবং তার ভ্যালু মুছে ফেলে।
      * @param key যে কী-টি মুছে ফেলতে হবে।
     * @param context Context অবজেক্ট।
     */
    public static void remove( String key, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(key, Context.MODE_PRIVATE).edit();
        editor.remove(key);
        editor.apply();
    }

    /**
     * একটি নির্দিষ্ট SharedPreferences ফাইলের সমস্ত ডেটা মুছে ফেলে।
     * @param prefName SharedPreferences ফাইলের নাম।
     * @param context Context অবজেক্ট।
     */
    public static void clear(String prefName, Context context) {
        SharedPreferences.Editor editor = context.getSharedPreferences(prefName, Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.apply();
    }
}