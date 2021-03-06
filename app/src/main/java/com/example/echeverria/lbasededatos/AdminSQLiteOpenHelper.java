package com.example.echeverria.lbasededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    // Creamos el constructor
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    // Se crea la tabla
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table contactos (id_A integer primary key unique, nombre text, apellido_p text, apellido_m text, email text, telefono integer, edad integer)");
    }

    // borrar la tabla y crear la nueva tabla
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists contactos");
        db.execSQL("create table contactos (id_A integer primary key unique, nombre text, apellido_p text, apellido_m text, email text, telefono integer, edad integer) ");
    }
}

