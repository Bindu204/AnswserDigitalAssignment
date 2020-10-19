package com.ansdig.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
      (features= {".//src\\test\\java\\com\\ansdig\\feature"},
       glue = {"com.ansdig"},
      format ={"pretty" , "html:reports"}
       
        )
public class Runner {

}


