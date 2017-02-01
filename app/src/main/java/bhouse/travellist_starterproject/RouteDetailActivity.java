package bhouse.travellist_starterproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
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
        TextView detailView = (TextView)findViewById(R.id.showNameDetail);
        detailView.setText(test[0]);
    }
}
