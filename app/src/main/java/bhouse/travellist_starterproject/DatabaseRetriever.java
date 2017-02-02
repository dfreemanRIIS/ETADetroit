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
            String[] thisRouteName = {routeName};
            cursor = db.query("routes",
                    new String[]{"_id", "company", "route_name", "route_number", "direction1", "direction2", "days_active"},
                    "route_name = ?", thisRouteName, null, null, null);

            return cursor;

        } catch (Exception e) {
            System.out.println("DatabaseRetriever BROKE");
            System.out.println(e);
            return null;
        }
    }
}
