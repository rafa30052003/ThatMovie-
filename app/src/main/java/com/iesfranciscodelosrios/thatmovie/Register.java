package com.iesfranciscodelosrios.thatmovie;

import android.content.Context;
import android.content.SharedPreferences;

public class Register {

    private static final String PREF_NAME = "user_pref";
    private static final String KEY_FIRST_NAME = "first_name";
    private static final String KEY_LAST_NAME = "last_name";

    // Método para registrar un nuevo usuario
    public static void registerUser(Context context, String firstName, String lastName) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY_FIRST_NAME, firstName);
        editor.putString(KEY_LAST_NAME, lastName);

        editor.apply();
    }

    // Método para obtener el nombre del usuario registrado
    public static String getUserName(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        String firstName = sharedPreferences.getString(KEY_FIRST_NAME, "");
        String lastName = sharedPreferences.getString(KEY_LAST_NAME, "");

        return firstName + " " + lastName;
    }
}

