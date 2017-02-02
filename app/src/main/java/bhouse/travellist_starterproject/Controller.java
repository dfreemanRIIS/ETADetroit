package bhouse.travellist_starterproject;

import android.content.Context;
import android.widget.CursorAdapter;

public class Controller {

    public CursorAdapter getRouteDetails(String routeName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getRouteDetails(routeName);
    }
}
