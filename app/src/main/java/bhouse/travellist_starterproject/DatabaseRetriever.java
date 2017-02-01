package bhouse.travellist_starterproject;

public class DatabaseRetriever {

    public String[] getRouteDetails(String routeName) {
        String[] routeDetails = {routeName, "Company", "Route_number"};
        return routeDetails;
    }
}
