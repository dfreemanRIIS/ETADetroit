package dfreemanRIIS.ETADetroit.model;

import android.database.Cursor;

import dfreemanRIIS.ETADetroit.entity.DatabaseHelper;

public class CompanyDataModel {

    private DatabaseHelper databaseHelper;

    public CompanyDataModel(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    public Cursor getCompanies() {
        return  databaseHelper.getCompanies();
    }
}
