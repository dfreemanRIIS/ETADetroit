package bhouse.travellist_starterproject;

import android.content.Context;
import java.util.ArrayList;

public class Controller {

    public ArrayList<String> getRouteDetails(String routeName, Context context) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever(context);
        return databaseRetriever.getRouteDetails(routeName);
    }
}
