package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by PC on 04-Mar-17.
 */

public final class PetContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PetContract() {}

    public static final class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public static final String COLUMN_WEIGHT = "weight";

        /**
         * Possible values for the style of the headphone.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUMN_NAME + " TEXT NOT NULL," +
                        COLUMN_BREED + " TEXT," +
                        COLUMN_GENDER + " INTEGER NOT NULL," +
                        COLUMN_WEIGHT + " INTEGER NOT NULL DEFAULT 0)";

        public static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + TABLE_NAME;

    }
}
