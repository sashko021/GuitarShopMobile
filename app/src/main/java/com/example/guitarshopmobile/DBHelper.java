package com.example.guitarshopmobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;






public class DBHelper extends SQLiteOpenHelper {

    //USERS TABLE
    public static final String USERS = "Users";
    public static final String ID = "ID";
    public static final String USERNAME = "Username";
    public static final String EMAIL = "Email";
    public static final String PASSWORD = "Password";
    private static final String CREATE_TABLE = "CREATE TABLE " + USERS + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            " " + USERNAME + " TEXT, " + EMAIL + " Text, " + PASSWORD + " Text )";


    //GUITAR TABLE
    String createTableQuery = "CREATE TABLE " + GUITAR_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_NAME + " TEXT NOT NULL, "
            + COLUMN_BRAND + " TEXT NOT NULL, " + COLUMN_PRICE + " REAL NOT NULL, " + COLUMN_QUANTITY + " INTEGER NOT NULL" + ");";
    private static final String GUITAR_TABLE = "Guitars";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_NAME = "Guitars";
    private static final String COLUMN_BRAND = "Brand";
    private static final String COLUMN_PRICE = "Price";
    private static final String COLUMN_QUANTITY = "Quantity";


    public DBHelper(@Nullable Context context) {
        super(context, "GuitarShop.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int vold, int vnew) {
        db.execSQL("DROP TABLE IF EXISTS " + USERS);
        db.execSQL(createTableQuery);
        db.execSQL("DROP TABLE IF EXISTS " + GUITAR_TABLE);
        onCreate(db);

    }

    //Add one User
    public boolean addOne(Usermodel usermodel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(USERNAME, usermodel.getUsername());
        cv.put(EMAIL, usermodel.getEmail());
        cv.put(PASSWORD, usermodel.getPassword());

        long insert = db.insert(USERS, null, cv);
        db.close();
        return insert != -1;
    }

    //remove one user
    public int removeOne(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.close();
        return db.delete(USERS,"ID = ?", new String[]{id});
    }

    //Check if user exists
    public boolean getEmail(String email){
        SQLiteDatabase db = this.getReadableDatabase();
        String[] projection = {
                EMAIL
        };
        String selection = EMAIL + " =?";
        String[] selectionArgs = { email };

        Cursor cursor = db.query(USERS, projection, selection, selectionArgs, null,null,null,"1");
        boolean exists;
        exists = cursor.moveToFirst();
        cursor.close();
        db.close();
        return exists;
    }

    //check db Version
    public int dbVersion(){
        SQLiteDatabase db = this.getReadableDatabase();
        int a = db.getVersion();
        return a;
    }
}

