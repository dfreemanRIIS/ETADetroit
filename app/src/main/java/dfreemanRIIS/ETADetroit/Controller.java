package dfreemanRIIS.ETADetroit;

import android.content.Context;
import android.database.Cursor;

class Controller {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getRouteDetails(routeName);
    }

    public Cursor getAllRoute(String companyName, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getAllRoutes(companyName);
    }

    public Cursor getRouteStops(String route_id, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getRouteStops(route_id);
    }

    public Cursor getCompanies(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return databaseHelper.getCompanies();
    }

}
