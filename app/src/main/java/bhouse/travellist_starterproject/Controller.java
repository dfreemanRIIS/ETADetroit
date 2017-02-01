package bhouse.travellist_starterproject;

public class Controller {

    public String[] getRouteDetails(String routeName) {
        DatabaseRetriever databaseRetriever = new DatabaseRetriever();
        return databaseRetriever.getRouteDetails(routeName);
    }
}
