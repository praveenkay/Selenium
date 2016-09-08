package com.examples.dataproviders;

import org.testng.annotations.Test;

/**
 * Created by Praveen Kothapally.
 */
public class DataFromExternalClass {



    @Test(dataProvider = "userCredentials", dataProviderClass = TestDataUserCredentials.class)
    public void testUserLogin(String userName, String password){
        System.out.println("User name = " + userName + " Password " + password);
    }

}
