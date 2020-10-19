package com.ansdig.constants;

public class Constants {
	
	public static final String url = "http://the-internet.herokuapp.com/";
	public static final String formAuthenticationLocPath = "//*[@id=\"content\"]/ul/li[21]/a";
	public static final String userNameLocPath = "username";
	public static final String validUserNameKey = "tomsmith";
	public static final String inValidUserNameKey = "tomsmith23";
	public static final String passwordLocPath = "password";
	public static final String validPasswordKey = "SuperSecretPassword!";
	public static final String inValidPasswordKey = "SuperSecretPassword!6";
	public static final String loginLocPath = "//*[@id=\"login\"]/button/i";
	public static final String loginSuccessMsgLocPath = "flash";
	public static final String logoutLocPath = "//*[@id=\"content\"]/div/a/i";
	public static final String logoutSuccessMsgLocPath = "flash";
	public static final String errorMsg1LocPath = "flash";
	public static final String errorMsg2LocPath = "flash";
	public static final String actualLogoutSuccessMsg = "You logged out of the secure area!"+"\n"+"×";
	public static final String actualSuccessMsg = "You logged into a secure area!"+"\n"+"×";
	public static final String actualLoginErrorMsg1 = "Your username is invalid!"+"\n"+"×";
	public static final String actualLoginErrorMsg2 = "Your password is invalid!"+"\n"+"×";
	public static final String infiniteScrollLocPath = "//*[@id=\"content\"]/ul/li[26]/a";
	public static final String infiniteScrollTextLocPath = "//*[@id=\"content\"]/div/h3";
	public static final String actualElement = "Infinite Scroll";
	public static final String keyPressesLocPath = "//*[@id=\"content\"]/ul/li[31]/a";
	public static final String youEnteredLocPath = "result";
	public static final String actualText1 = "You entered: DOWN";
	public static final String actualText2 = "You entered: CONTROL";
	public static final String actualText3 = "You entered: ALT";
	public static final String actualText4 = "You entered: SPACE";
}
