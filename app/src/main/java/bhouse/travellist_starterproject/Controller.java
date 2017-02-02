package bhouse.travellist_starterproject;

import android.content.Context;
import android.database.Cursor;

public class Controller {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getRouteDetails(routeName);
    }
}
