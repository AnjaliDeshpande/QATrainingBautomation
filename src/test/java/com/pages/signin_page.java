package com.pages;

import com.webDriverClass;
import org.openqa.selenium.By;

public class signin_page extends webDriverClass {


public void GotoURL(String URL) {
    System.out.println(URL);
    //Step2:Enter URL.
    driver.get(URL);
}

public void ClickRegisterButton(){
    driver.findElement(By.linkText("Register")).click();

}
}

