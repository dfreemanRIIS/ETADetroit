package bhouse.travellist_starterproject;

import android.content.Context;

public class Controller {

    public String[] getRouteDetails(String routeName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getRouteDetails(routeName);
    }
}
