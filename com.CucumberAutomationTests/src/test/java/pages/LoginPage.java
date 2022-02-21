package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Locators

    @FindBy(partialLinkText = "Signup")
    public WebElement signupButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;

    @FindBy(name= "name")
    public WebElement nameBox;

    @FindBy(css = "[type=\"password\"]")
    public WebElement loginPasswordBox;

    @FindBy(css = "[data-qa=\"login-email\"]")
    public WebElement loginemailElement;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginYourAccountText;

    @FindBy(xpath = "(//*[@type= 'submit'])[2]")
    public WebElement accountCreatSignupButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),' Logout')]")
    public WebElement logoutButton;

    @FindBy(xpath = "//b[contains (text(),'Enter Account Information')]")
    public WebElement createAccountPageVerification;

    @FindBy(xpath="(//p)[1]")
    public WebElement existingEmailVerification;

    @FindBy(xpath = "(//p)[1]")   //  //p[contains(text(),'password is incorrect')]
    public WebElement negativeLoginText;

    @FindBy (xpath = "//p[text()='Your email or password is incorrect!']")
    public WebElement mailyadaSifreHataliYazisi;

    @FindBy (xpath = "//p[text()='Email Address already exist!']")
    public WebElement EmailZatenVarYazisiElementi;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameTextBox;

    @FindBy (xpath = "(//input[@type='email'])[2]")
    public WebElement emailBox;
}
