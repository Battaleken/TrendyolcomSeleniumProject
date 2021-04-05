package com.trendyol.test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static Services.GetEmailAcc.takeEmail;

public class OrderJourney extends BaseTest {

    WebDriver webDriver;


    @Test
    public void trendyolJourney() throws InterruptedException {


        BasePage basePage = goToTrendyol();                 // Go to Trendyol.com
        basePage.closePopUp();                              // Close to PopUp
        LoginPage loginPage = basePage.clickAccount();      // Click to Giriş Yap/Hesabım


        loginPage.clickSignUp();                            // Click "Sign Up" form
        HomePage homePage = loginPage.signUp();             // SignUp with email and Password
        homePage.closeDiscountPopup();                      // Close to discount PopUp
        homePage.clickElectronicPage();                     // Click the Electronic Category


//        homePage.hoverElectronicPage();
//        homePage.clickTvGoruntuSes();
        Thread.sleep(1400);


//        closeDiscountPopup();
//        electronicPage();
    }















//    public void scroolHomePage(){
//        webDriver.
//    }


    }




/* TODO:
1- Go to https://www.trendyol.com
2- Click "Giriş" icon
3- Click "Üye Ol" icon
4- Get Email from "10minEmail"
5- Send Keys to Email&Password + Click Gender + Click "Üye Ol"
6- Hover "Elektronik" + Click "Tv&Görüntü&Ses"
7- 3 times scrolling(WhileLoop) + Click an Item
8- Check item info in "Tv&Görüntü&Ses" info
9- Add to basket and check the info
 */