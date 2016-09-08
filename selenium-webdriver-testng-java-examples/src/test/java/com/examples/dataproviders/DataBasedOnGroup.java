package com.examples.dataproviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class DataBasedOnGroup {


    @Test(groups = {"group1"}, dataProvider = "userCredentials")
    public void testLogin1(String country, String capital) {
        System.out.println("Country " + country + " Capital " + capital);
    }


    @Test(groups = {"group2"}, dataProvider = "userCredentials")
    public void testLogin2(String country) {
        System.out.println("Country " + country);

    }


    @DataProvider(name = "userCredentials")
    public Object[][] getDataProvider(ITestContext testContext) {
        Object[][] groupArray = null;

        for (String group : testContext.getIncludedGroups()) {
            if (group.equalsIgnoreCase("group1")) {
                groupArray= new Object[][]{

                        {"Sri Lanka", "Colombo"},
                        {"India", "Delhi"},
                        {"Paskisthan", "Islamabad"}
                };
            } else {
                groupArray= new Object[][]{
                        {"Sri Lanka"},
                        {"India"},
                        {"Paskisthan"}
                };
            }
            break;
        }

        return groupArray;
    }

}

