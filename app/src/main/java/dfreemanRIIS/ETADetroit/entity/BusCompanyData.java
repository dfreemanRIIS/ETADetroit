package dfreemanRIIS.ETADetroit.entity;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;

import dfreemanRIIS.ETADetroit.controller.Controller;

public class BusCompanyData {

    private final String[] placeNameArray = new String[4];

    public BusCompanyData(Context context) {
        Controller controller = new Controller();
        Cursor companyCursor = controller.getCompanies(context);

        if(companyCursor.moveToFirst()) {
            int i = 0;
            do {
                String newPlace = "" + companyCursor.getString(0);
                placeNameArray[i] = newPlace;
                i++;
            } while (companyCursor.moveToNext());
        }
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

    public boolean isTrain(int position) {
        for(int i = 0; i < placeNameArray.length; i++) {
            if(placeNameArray[i].equals("Detroit Transportation Corporation")) {
                if(position == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
