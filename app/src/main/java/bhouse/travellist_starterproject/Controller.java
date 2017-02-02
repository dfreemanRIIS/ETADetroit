package bhouse.travellist_starterproject;

import android.content.Context;
import android.database.Cursor;

class Controller {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getRouteDetails(routeName);
    }

    public Cursor getAllRoute(String companyName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getAllRoutes(companyName);
    }
}
