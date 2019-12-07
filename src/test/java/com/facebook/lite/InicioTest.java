package com.facebook.lite;

import org.testng.annotations.Test;

import pages.InicioPage;
import com.facebook.lite.BaseTest;

public class InicioTest extends BaseTest {
	@Test()
	public void validationTest() {
		System.out.println("Se hace prueba de registro"+myDriver);
		InicioPage inicioPage = new InicioPage(myDriver);
        inicioPage.registroCuenta();
        inicioPage.continuarRegistroCuenta();
        inicioPage.registrarNombre();
        inicioPage.registrarApellido();
        inicioPage.continuarRegistroNombres();
        //inicioPage.deny();
        //inicioPage.deny();
        inicioPage.registrarNumero();
        inicioPage.registrarFecha();
        inicioPage.genero();
        inicioPage.password();
	}
}