package dfreemanRIIS.ETADetroit;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

class BusCompanyData {

    private final String[] placeNameArray = {"DDOT", "RefleX", "SmartBus"};
    private Context context;

    public BusCompanyData(Context context) {
        this.context = context;
        Controller controller = new Controller();
        Cursor companyCursor = controller.getCompanies(context);
    }

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
