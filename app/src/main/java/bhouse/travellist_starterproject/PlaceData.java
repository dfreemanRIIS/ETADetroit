package bhouse.travellist_starterproject;

import java.util.ArrayList;

class PlaceData {

  private final static String[] placeNameArray = {"DDOT", "RefleX", "SmartBus"};

  public static ArrayList<Place> placeList() {
    ArrayList<Place> list = new ArrayList<>();
    for (int i = 0; i < placeNameArray.length; i++) {
      Place place = new Place();
      place.name = placeNameArray[i];
      place.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
      list.add(place);
    }
    return (list);
  }
}
