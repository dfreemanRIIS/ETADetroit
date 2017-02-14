package dfreemanRIIS.ETADetroit;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import dfreemanRIIS.ETADetroit.entity.DatabaseHelper;
import dfreemanRIIS.ETADetroit.model.RouteDetailModel;
import static junit.framework.Assert.assertEquals;



public class RouteDetailModelTest {

    @Mock
    DatabaseHelper mockDatabaseHelper;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        mockDatabaseHelper = org.mockito.Mockito.mock(DatabaseHelper.class);
        Mockito.when(mockDatabaseHelper.getRouteStops("1")).thenReturn(null);
    }

    @Test
    public void testRouteStops() {
        RouteDetailModel routeDetailModel = new RouteDetailModel(mockDatabaseHelper);
        assertEquals(routeDetailModel.getRouteStops("1"), null);
    }

    @Test
    public void testAllRoutes() {
        RouteDetailModel routeDetailModel = new RouteDetailModel(mockDatabaseHelper);
        assertEquals(routeDetailModel.getAllRoutes("1"), null);
    }

    @Test
    public void testRouteDetails() {
        RouteDetailModel routeDetailModel = new RouteDetailModel(mockDatabaseHelper);
        assertEquals(routeDetailModel.getRouteDetails("1"), null);
    }
}
