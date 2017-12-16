package com.example.alex_pc.test_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alex-PC on 15.12.2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "noteDB";
    public static final String TABEL_NOTES = "notes";

    public static final String KEY_ID = "_id";
    public static final String KEY_CAPTION = "caption";
    public static final String KEY_TEXT = "text";
    public static final String KEY_IMPORTANT = "important";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_LATITUDE = "latitude";
    public static final String KEY_LONGITUDE = "longitude";


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABEL_NOTES + "(" + KEY_ID
                + " integer primary key," + KEY_CAPTION
                + " text," + KEY_TEXT + " text," + KEY_IMPORTANT + " integer," + KEY_IMAGE
                + " text," + KEY_LATITUDE + " real," + KEY_LONGITUDE + " real" +")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABEL_NOTES);

        onCreate(sqLiteDatabase);
    }
}
