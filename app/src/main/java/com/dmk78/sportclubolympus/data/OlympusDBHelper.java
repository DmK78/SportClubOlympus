package com.dmk78.sportclubolympus.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.dmk78.sportclubolympus.data.ClubOlympusContract.MemberEntry;

public class OlympusDBHelper extends SQLiteOpenHelper {
    public OlympusDBHelper(Context context) {
        super(context, ClubOlympusContract.DATABASE_NAME, null, ClubOlympusContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MEBERS_TABLE = "CREATE TABLE " + MemberEntry.TABLE_NAME + "("
            + MemberEntry._ID + " INTEGER PRIMARY KEY,"
            + MemberEntry.COLUMN_FIRST_NAME + " TEXT,"
            + MemberEntry.COLUMN_LAST_NAME + " TEXT,"
            + MemberEntry.COLUMN_GENDER + " INTEGER NOT NULL,"
            + MemberEntry.COLUMN_SPORT + " TEXT" + ")";


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + ClubOlympusContract.MemberEntry.TABLE_NAME);
        onCreate(db);

    }








}
