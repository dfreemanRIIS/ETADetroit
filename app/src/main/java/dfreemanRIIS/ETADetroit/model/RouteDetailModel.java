package dfreemanRIIS.ETADetroit.model;

import android.database.Cursor;

import dfreemanRIIS.ETADetroit.entity.DatabaseHelper;

public class RouteDetailModel {

    private DatabaseHelper databaseHelper;

    public RouteDetailModel(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    public Cursor getRouteStops(String route_id) {
        return databaseHelper.getRouteStops(route_id);
    }

    public Cursor getAllRoutes(String companyName) {
        return databaseHelper.getAllRoutes(companyName);
    }

    public Cursor getRouteDetails(String routeName) {
        return databaseHelper.getRouteDetails(routeName);
    }
}
