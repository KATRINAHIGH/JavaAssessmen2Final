package com.zipcodewilmington.assessment2;

import com.zipcodewilmington.assessment2.part3.RockPaperScissorTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to test all methods in this project
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        RockPaperScissorTestSuite.class,
})
public class ProjectTestSuite {
}
