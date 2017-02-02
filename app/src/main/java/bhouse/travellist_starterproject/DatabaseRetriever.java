package bhouse.travellist_starterproject;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;

public class DatabaseRetriever {

    private SQLiteDatabase db;
    private Cursor cursor;
    private Context context;

    public DatabaseRetriever(Context context) {
        this.context = context;
    }

    public Cursor getRouteDetails(String routeName) {

        try {
            SQLiteOpenHelper DatabaseHelper = new DatabaseHelper(context);
            db = DatabaseHelper.getReadableDatabase();
            String[] thisCompanyName = {routeName};
            cursor = db.query("DRINK",
                    new String[]{"_id", "NAME", "COMPANY", "ROUTE_NUMBER"},
                    "NAME = ?", thisCompanyName, null, null, null);

            return cursor;

        } catch (Exception e) {
            System.out.println("DatabaseRetriever BROKE");
            System.out.println(e);
            return null;
        }
    }
}
