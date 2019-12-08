package pages;

import org.openqa.selenium.By;

import coreappium.MyDriverAppium;

import io.appium.java_client.android.AndroidElement;

public class InicioPage extends BasePage{
	
	public InicioPage(MyDriverAppium myDriver) {
		super(myDriver);
		// TODO Auto-generated constructor stub
	}

	public final String titleIntroductionId = "section_label";
	
	public boolean getTitleIntroduction() {
		System.out.println("llegas al método"+titleIntroductionId);
		AndroidElement titleIntroduction = getDriver().findElementById(titleIntroductionId);
		System.out.println("Entro al método"+titleIntroductionId);
		return titleIntroduction.isDisplayed();
	}
    
	public void btnCreateFacebookAccount() {
		String btnxPathFacebookAccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
		waitVisibility(By.xpath(btnxPathFacebookAccount));
		AndroidElement btnRegistrar = getDriver().findElementByXPath(btnxPathFacebookAccount);
		btnRegistrar.click();
	}
	
	public void btnNextFacebookAccount() {
		String btnPathNextFacebookAccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]";
		waitVisibility(By.xpath(btnPathNextFacebookAccount));
		AndroidElement continuarNext = getDriver().findElementByXPath(btnPathNextFacebookAccount);
		continuarNext.click();
	}
	
	public void registerName() {
		String EditTexNamePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]";
		waitVisibility(By.xpath(EditTexNamePath));
		AndroidElement registroNombre = getDriver().findElementByXPath(EditTexNamePath);
		registroNombre.click();
		registroNombre.sendKeys("Ulises Francisco");	
	}
	
	public void registerLastName() {
		String EditTexLastNamePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]";
		waitVisibility(By.xpath(EditTexLastNamePath));
		AndroidElement registroApellido = getDriver().findElementByXPath(EditTexLastNamePath);
		registroApellido.click();
		registroApellido.sendKeys("Soto Arroyo");
	}
	
	public void btnNextRegisterName() {
		String btnNextPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]";
		waitVisibility(By.xpath(btnNextPath));
		AndroidElement continuarNext = getDriver().findElementByXPath(btnNextPath);
		continuarNext.click();
	}
	
	public void alertDenyPermission() {
		String btnDenyid= "com.android.packageinstaller:id/permission_deny_button";
		waitVisibility(By.id(btnDenyid));
		AndroidElement deny = getDriver().findElementById(btnDenyid);
		deny.click();
	}
	
	public void alertDenyPermission2() {
		String btnAllowid= "com.android.packageinstaller:id/permission_allow_button";
		waitVisibility(By.id(btnAllowid));
		AndroidElement allow = getDriver().findElementById(btnAllowid);
		allow.click();
	}
	
	public void registerPhone() {
		String editTextPhonePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
		waitVisibility(By.xpath(editTextPhonePath));
		AndroidElement numberPhone = getDriver().findElementByXPath(editTextPhonePath);
		numberPhone.click();
		waitVisibility(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView"));
		numberPhone.clear();
		numberPhone.sendKeys("9531057452");
		
		String btnNextPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]";
		waitVisibility(By.xpath(btnNextPath));
		AndroidElement continuarNumero = getDriver().findElementByXPath(btnNextPath);
		continuarNumero.click();
		waitVisibility(By.xpath(btnNextPath));
	}
	
	public void registerBirthDay() {
		String dayx = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";
		String dayxx= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup";
		waitVisibility(By.xpath(dayx));
		AndroidElement x1 = getDriver().findElementByXPath(dayx);
		x1.sendKeys("1");
		waitVisibility(By.xpath(dayxx));
		AndroidElement x2 = getDriver().findElementByXPath(dayxx);
		x2.sendKeys("1");
		
		
		String MM1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[17]/android.view.ViewGroup";
		String MM2= "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup";
		waitVisibility(By.xpath(MM1));
		AndroidElement m1 = getDriver().findElementByXPath(MM1);
		m1.sendKeys("1");
		waitVisibility(By.xpath(MM2));
		AndroidElement m2 = getDriver().findElementByXPath(MM2);
		m2.sendKeys("0");
		waitVisibility(By.xpath(MM2));
		
		String Y1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";
		String Y2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup\"";
		String Y3 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup";
		String Y4 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup";
		String BtnNext = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]";
		AndroidElement YYYY1 = getDriver().findElementByXPath(Y1);
		YYYY1.sendKeys("1");
		waitVisibility(By.xpath(Y2));
		AndroidElement YYYY2 = getDriver().findElementByXPath(Y2);
		YYYY2.sendKeys("9");
		waitVisibility(By.xpath(Y3));
		AndroidElement YYYY3 = getDriver().findElementByXPath(Y3);
		YYYY3.sendKeys("9");
		waitVisibility(By.xpath(Y4));
		AndroidElement YYYY4 = getDriver().findElementByXPath(Y4);
		YYYY4.sendKeys("1");
		
		waitVisibility(By.xpath(BtnNext));
		AndroidElement btnSig = getDriver().findElementByXPath(BtnNext);
		btnSig.click();
		}
	
	public void genus() {
		String sexPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[2]";
		waitVisibility(By.xpath(sexPath));	
		AndroidElement gender = getDriver().findElementByXPath(sexPath);
		gender.click();
	}
	
	public void RegisterPassword() {
		String EditTextpwdxPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
		waitVisibility(By.xpath(EditTextpwdxPath));	
		AndroidElement pwd = getDriver().findElementByXPath(EditTextpwdxPath);
		pwd.click();
		pwd.sendKeys("TestQaPassword1");
		
		//TapButtonRegisterAccount
		String btnRegisterXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[10]";
		waitVisibility(By.xpath(btnRegisterXpath));
		AndroidElement btnRegister = getDriver().findElementByXPath(btnRegisterXpath);
		btnRegister.click();
	}
	
}

