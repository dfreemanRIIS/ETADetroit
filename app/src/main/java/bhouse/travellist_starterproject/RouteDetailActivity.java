package bhouse.travellist_starterproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
        CursorAdapter details = controller.getRouteDetails(thisRoute, this);

        ListView listView = (ListView)findViewById(R.id.listDetails);
        listView.setAdapter(details);
    }
}
