package bhouse.travellist_starterproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dfreeman
 */

class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "starbuzz";
    private static final int DB_VERSION = 1;

    DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(oldVersion < 1) {
            db.execSQL("CREATE TABLE DRINK (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "NAME TEXT, " + "COMPANY TEXT, " + "ROUTE_NUMBER INTEGER);");
            insertDrink(db, "FORT ST-EUREKA RD", "SmartBus", 125);
            insertDrink(db, "SOUTHSHORE", "SmartBus", 140);
            insertDrink(db, "DOWNRIVER", "SmartBus", 160);
            insertDrink(db, "MICHIGAN AVENUE LOCAL", "SmartBus", 200);
            insertDrink(db, "FORD RD", "SmartBus", 250);
            insertDrink(db, "FORD RD EXPRESS", "SmartBus", 255);
            insertDrink(db, "TELEGRAPH", "SmartBus", 275);
            insertDrink(db, "MIDDLEBELT SOUTH", "SmartBus", 280);
            insertDrink(db, "SCHAEFER", "DDotBus", 41);
            insertDrink(db, "RUSSELL", "DDotBus", 40);
            insertDrink(db, "TIREMAN", "DDotBus", 47);
            insertDrink(db, "SOUTHFIELD", "DDotBus", 46);
            insertDrink(db, "SEVEN MILE", "DDotBus", 45);
            insertDrink(db, "SCHOOLCRAFT", "DDotBus", 43);
            insertDrink(db, "DEXTER", "DDotBus", 16);
            insertDrink(db, "EIGHT MILE", "DDotBus", 17);
            insertDrink(db, "REFLEX", "ReflexBus", 498);
            insertDrink(db, "GRATIOT REFLEX to DETROIT", "ReflexBus", 598);
            insertDrink(db, "GRATIOT REFLEX to DMC/WSU", "ReflexBus", 599);
        }
    }

    private static void insertDrink(SQLiteDatabase db, String name, String company, int routeNumber) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("COMPANY", company);
        drinkValues.put("ROUTE_NUMBER", routeNumber);
        db.insert("DRINK", null, drinkValues);
    }
}