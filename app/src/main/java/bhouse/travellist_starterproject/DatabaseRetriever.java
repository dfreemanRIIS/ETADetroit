package bhouse.travellist_starterproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DatabaseRetriever {

    private final Context context;

    public DatabaseRetriever(Context context) {
        this.context = context;
    }

    public Cursor getRouteDetails(String routeName) {

        try {
            SQLiteOpenHelper DatabaseHelper = new DatabaseHelper(context);
            SQLiteDatabase db = DatabaseHelper.getReadableDatabase();
            String[] thisRouteName = {routeName};
            Cursor cursor = db.query("routes",
                    new String[]{"_id", "company", "route_name", "route_number", "direction1", "direction2", "days_active"},
                    "route_name = ?", thisRouteName, null, null, null);

            return cursor;

        } catch (Exception e) {
            System.out.println("DatabaseRetriever BROKE");
            return null;
        }
    }
}
