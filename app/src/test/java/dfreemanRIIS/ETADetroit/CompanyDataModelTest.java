package dfreemanRIIS.ETADetroit;

import android.test.mock.MockContext;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import dfreemanRIIS.ETADetroit.model.CompanyDataModel;
import dfreemanRIIS.ETADetroit.entity.DatabaseHelper;

import static junit.framework.Assert.assertEquals;



public class CompanyDataModelTest {

    @Mock
    DatabaseHelper mockDatabaseHelper;
    @Mock
    MockContext context;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        mockDatabaseHelper = org.mockito.Mockito.mock(DatabaseHelper.class);
        Mockito.when(mockDatabaseHelper.getRouteStops("1")).thenReturn(null);
    }

    @Test
    public void testBusCompany() {
        CompanyDataModel companyDataModel = new CompanyDataModel(mockDatabaseHelper);
        assertEquals(companyDataModel.getCompanies(), null);
    }
}