package bhouse.travellist_starterproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RouteDetailActivity extends Activity {

    public static final String EXTRA_ROUTE = "route";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_detail);

        Controller controller = new Controller();
        String[] test = controller.getRouteDetails(1);

        TextView nameView = (TextView)findViewById(R.id.showNameDetail);
        nameView.setText(test[0]);
        TextView companyView = (TextView)findViewById(R.id.showCompanyDetail);
        companyView.setText(test[1]);
        TextView numberView = (TextView)findViewById(R.id.showRouteNumber);
        numberView.setText(test[2]);
    }
}
