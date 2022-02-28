package StepDefinition59;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\acer\\eclipse-workspace\\Selenium\\ZomCucumber\\src\\test\\resources\\Zomato_Features",glue= {"StepDefinition59"},
tags =  "@SmokeTest or @RegressionTest",
plugin = {"pretty", "html:C:\\Users\\acer\\Desktop\\Cucumber\\Zom_Con_Test.html"})
public class Zom_Runner{

}