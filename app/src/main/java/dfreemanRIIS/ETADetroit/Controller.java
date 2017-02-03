package dfreemanRIIS.ETADetroit;

import android.content.Context;
import android.database.Cursor;

class Controller {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseHelper databaseRetriever = new DatabaseHelper(context);
        return databaseRetriever.getRouteDetails(routeName);
    }

    public Cursor getAllRoute(String companyName, Context context) {
        DatabaseHelper databaseRetriever = new DatabaseHelper(context);
        return databaseRetriever.getAllRoutes(companyName);
    }
}
