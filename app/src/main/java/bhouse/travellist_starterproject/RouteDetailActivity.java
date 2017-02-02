package bhouse.travellist_starterproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RouteDetailActivity extends Activity {

    public static final String EXTRA_ROUTE_NAME = "route_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_detail);

        //Get info from controller
        Controller controller = new Controller();
        String thisRoute = (String)getIntent().getExtras().get(EXTRA_ROUTE_NAME);
        //Get from controller
        ArrayList<String> details = controller.getRouteDetails(thisRoute, this);

        if(details.size() == 3) {
            TextView nameView = (TextView) findViewById(R.id.showNameDetail);
            nameView.setText(details.get(0));
            TextView companyView = (TextView) findViewById(R.id.showCompanyDetail);
            companyView.setText(details.get(1));
            TextView numberView = (TextView) findViewById(R.id.showRouteNumber);
            numberView.setText(details.get(2));
        } else {
            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
        }
    }
}
