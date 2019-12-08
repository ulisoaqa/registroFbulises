package com.facebook.lite;

import org.testng.annotations.Test;

import pages.InicioPage;
import com.facebook.lite.BaseTest;

public class InicioTest extends BaseTest {
	@Test()
	public void validationTest() {
		System.out.println("Test RegisterFB"+ myDriver);
		InicioPage inicioPage = new InicioPage(myDriver);
        inicioPage.btnCreateFacebookAccount();
        inicioPage.btnNextFacebookAccount();
        inicioPage.registerName();
        inicioPage.registerLastName();
        inicioPage.btnNextRegisterName();
        inicioPage.alertDenyPermission();
        inicioPage.alertDenyPermission2();
        inicioPage.registerPhone();
        inicioPage.registerBirthDay();
        inicioPage.genus();
        inicioPage.RegisterPassword();
	}
}