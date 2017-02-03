package dfreemanRIIS.ETADetroit;

import java.util.ArrayList;

class BusCompanyData {

  private final String[] placeNameArray = {"DDOT", "RefleX", "SmartBus"};

  public ArrayList<BusCompany> placeList() {
    ArrayList<BusCompany> list = new ArrayList<>();
    for (String aPlaceNameArray : placeNameArray) {
      BusCompany busCompany = new BusCompany();
      busCompany.name = aPlaceNameArray;
      busCompany.imageName = aPlaceNameArray.replaceAll("\\s+", "").toLowerCase();
      list.add(busCompany);
    }
    return (list);
  }
}
