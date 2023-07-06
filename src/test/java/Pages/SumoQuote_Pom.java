package Pages;

import Utilities.BasicDriver;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SumoQuote_Pom extends Methods {
    public SumoQuote_Pom() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(id = "accountName")
    private WebElement organizationName;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "emailAddress")
    private WebElement email;
    @FindBy(id = "phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(id = "repeatPassword")
    private WebElement confirmPassword;
    @FindBy(id = "howHeard")
    private WebElement selectOneBtn;
    @FindBy(xpath = "//div[text()='Other']")
    private WebElement aboutSumoQuote;
    @FindBy(css = "div[class='v-input--selection-controls__ripple']")
    private WebElement checkBox;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;
    @FindBy(css = "input[name='email']")
    private WebElement emailOnLogin;
    @FindBy(css = "input[name='password']")
    private WebElement passwordOnLogin;
    @FindBy(xpath = "//button[@class='auth0-lock-submit']")
    private WebElement LoginButton;
    @FindBy(xpath = "//span[contains(text(),'Get started')]")
    private WebElement getStartedButton;
    @FindBy(xpath = "//a[@class='v-tab']")
    private WebElement logIn;
    @FindBy(css = "input[class='input-file']")
    private WebElement companyLogo;
    @FindBy(xpath = "//input[@placeholder=\"ie. Roofing, Siding, Gutters (appears on cover page)\"]")
    private WebElement HelpingLine1;
    @FindBy(xpath = "//input[@placeholder=\"ie. Residential & Commercial (appears on cover page)\"]")
    private WebElement HelpingLine2;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[5]")
    private WebElement seeMyBrandBtn;
    @FindBy(xpath = "//input[@id='mail']")
    private WebElement mailAddress;
    @FindBy(xpath = "//a[contains(text(),'VERIFY MY')]")
    private WebElement verifyBtn;
    @FindBy(xpath = "//span[text()='Refresh']")
    private WebElement refreshBtn;
    @FindBy(css = "img[src='/images/templates/Template2.png']")
    private WebElement myBrand;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[6]")
    private WebElement brandConfirmBtn;
    @FindBy(xpath = "(//div[@class='v-responsive__content'])[5]")
    private WebElement typeOfWork;
    @FindBy(xpath = "(//span[@class='v-btn__content'])[6]")
    private WebElement finishBtn;
    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement LetsGoBtn;

    public WebElement getVerifyBtn() {
        return verifyBtn;
    }

    public WebElement getLetsGoBtn() {
        return LetsGoBtn;
    }

    public WebElement getMyBrand() {
        return myBrand;
    }

    public WebElement getRefreshBtn() {
        return refreshBtn;
    }

    public WebElement getMailAddress() {
        return mailAddress;
    }

    public WebElement getGetStartedButton() {
        return getStartedButton;

    }

    public WebElement getLogIn() {
        return logIn;
    }

    public WebElement getOrganizationName() {
        return organizationName;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    public WebElement getAboutSumoQuote() {
        return aboutSumoQuote;
    }

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getEmailOnLogin() {
        return emailOnLogin;
    }

    public WebElement getPasswordOnLogin() {
        return passwordOnLogin;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public WebElement getCompanyLogo() {
        return companyLogo;
    }

    public WebElement getHelpingLine1() {
        return HelpingLine1;
    }

    public WebElement getHelpingLine2() {
        return HelpingLine2;
    }

    public WebElement getSeeMyBrandBtn() {
        return seeMyBrandBtn;
    }

    public WebElement getSelectOneBtn() {
        return selectOneBtn;
    }

    public WebElement getBrandConfirmBtn() {
        return brandConfirmBtn;
    }

    public WebElement getTypeOfWork() {
        return typeOfWork;
    }

    public WebElement getFinishBtn() {
        return finishBtn;
    }
}