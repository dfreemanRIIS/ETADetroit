package dfreemanRIIS.ETADetroit.controller;

import android.content.Context;
import android.database.Cursor;

import dfreemanRIIS.ETADetroit.entity.DatabaseHelper;
import dfreemanRIIS.ETADetroit.model.CompanyDataModel;
import dfreemanRIIS.ETADetroit.model.RouteDetailModel;

public class Controller {

    public Cursor getRouteDetails(String routeName, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        RouteDetailModel routeDetailModel = new RouteDetailModel(databaseHelper);
        return routeDetailModel.getRouteDetails(routeName);
    }

    public Cursor getAllRoute(String companyName, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        RouteDetailModel routeDetailModel = new RouteDetailModel(databaseHelper);
        return routeDetailModel.getAllRoutes(companyName);
    }

    public Cursor getRouteStops(String route_id, Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        RouteDetailModel routeDetailModel = new RouteDetailModel(databaseHelper);
        return routeDetailModel.getRouteStops(route_id);
    }

    public Cursor getCompanies(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        CompanyDataModel companyDataModel = new CompanyDataModel(databaseHelper);
        return companyDataModel.getCompanies();
    }

}
