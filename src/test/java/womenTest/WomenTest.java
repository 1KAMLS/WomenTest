package womenTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class WomenTest
{
    @Test
    public void checkIfIOnWomenPage()
    {
        open("http://automationpractice.com");
        $(By.linkText("Women")).click();//кликнул на Women
        $(By.xpath("//h2[@class='title_block']")).shouldHave(text("Women"));//проверил наличие появившегося Women
    }


}
