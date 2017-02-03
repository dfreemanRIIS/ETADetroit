package dfreemanRIIS.ETADetroit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
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
        Cursor details = controller.getRouteDetails(thisRoute, this);

        if(details.moveToFirst()) {
            TextView textView1 = (TextView)findViewById(R.id.listDetails1);
            TextView textView2 = (TextView)findViewById(R.id.listDetails2);
            TextView textView3 = (TextView)findViewById(R.id.listDetails3);
            TextView textView4 = (TextView)findViewById(R.id.listDetails4);
            TextView textView5 = (TextView)findViewById(R.id.listDetails5);
            TextView textView6 = (TextView)findViewById(R.id.listDetails6);
            String placeHolder1 = "Company: " + details.getString(1);
            String placeHolder2 = "Route name: " + details.getString(2);
            String placeHolder3 = "Route number: " + details.getString(3);
            String placeHolder4 = "Direction 1: " + details.getString(4);
            String placeHolder5 = "Direction 2: " + details.getString(5);
            String placeHolder6 = "Days active: " + details.getString(6);
            textView1.setText(placeHolder1);
            textView2.setText(placeHolder2);
            textView3.setText(placeHolder3);
            textView4.setText(placeHolder4);
            textView5.setText(placeHolder5);
            textView6.setText(placeHolder6);
        }

		Cursor stops = controller.getRouteStops(details.getString(3), this);
        CursorAdapter listAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                stops,
                new String[]{"stop_name"},
                new int[]{android.R.id.text1},
                0);

        ListView listStops = (ListView) findViewById(R.id.listStops);
        listStops.setAdapter(listAdapter);
    }
}
