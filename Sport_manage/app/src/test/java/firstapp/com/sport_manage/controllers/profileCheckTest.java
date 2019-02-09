package firstapp.com.sport_manage.controllers;

import org.junit.Before;
import org.junit.Test;

import firstapp.com.sport_manage.ProfileCheck;

import static org.junit.Assert.*;

public class profileCheckTest {



    private final String userName="username";
    private final String password="Devesh@2019";

    @Before
    public void setup(){
       ProfileCheck profileCheck= new ProfileCheck();
    }
    @Test
    public void returnTrueWithValidUserName(){



        assertTrue(ProfileCheck.checkUser(userName));
    }


    @Test
    public void returnTrueWithValidPassword(){
        assertEquals(true, ProfileCheck.checkPassword(password));
    }

}