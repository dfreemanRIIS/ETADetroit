package dfreemanRIIS.ETADetroit;

import java.util.ArrayList;

class BusCompanyData {

  private final static String[] placeNameArray = {"DDOT", "RefleX", "SmartBus"};

  public static ArrayList<BusCompany> placeList() {
    ArrayList<BusCompany> list = new ArrayList<>();
    for (int i = 0; i < placeNameArray.length; i++) {
      BusCompany busCompany = new BusCompany();
      busCompany.name = placeNameArray[i];
      busCompany.imageName = placeNameArray[i].replaceAll("\\s+", "").toLowerCase();
      list.add(busCompany);
    }
    return (list);
  }
}
