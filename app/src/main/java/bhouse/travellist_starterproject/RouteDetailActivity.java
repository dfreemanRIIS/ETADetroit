package bhouse.travellist_starterproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

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
        String[] details = controller.getRouteDetails(thisRoute, this);

        //Display it
        TextView nameView = (TextView)findViewById(R.id.showNameDetail);
        nameView.setText(details[0]);
        TextView companyView = (TextView)findViewById(R.id.showCompanyDetail);
        companyView.setText(details[1]);
        TextView numberView = (TextView)findViewById(R.id.showRouteNumber);
        numberView.setText(details[2]);
    }
}
