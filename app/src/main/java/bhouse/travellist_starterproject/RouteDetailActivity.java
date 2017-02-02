package bhouse.travellist_starterproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.database.Cursor;

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
        Cursor details = controller.getRouteDetails(thisRoute, this);

        if(details.moveToFirst()) {
            TextView textView1 = (TextView)findViewById(R.id.listDetails1);
            TextView textView2 = (TextView)findViewById(R.id.listDetails2);
            TextView textView3 = (TextView)findViewById(R.id.listDetails3);
            textView1.setText(details.getString(1));
            textView2.setText(details.getString(2));
            textView3.setText(details.getString(3));
        }
    }
}
