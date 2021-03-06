package com.cybertek.tests.Reviews.trypackage;

import org.testng.Assert;
import org.testng.annotations.*;

public class _0TestNgAllCases {


        @BeforeClass
        public void tryBeforeClass(){
            System.out.println("");
            System.out.println("HI I AM BEFORE CLASS. I WORK JUST ONCE");
            System.out.println("");
        }

        @BeforeTest
        public void tryBeforeTest(){
            System.out.println("THIS IS BEFORE TEST");

        }

        @BeforeMethod
        public void setUp(){
            System.out.println("-Before Method-");

        }

    @AfterMethod
    public void TearDown() {
        System.out.println("-After Method-");

    }
    @AfterClass
    public void tryAfeterClass(){
        System.out.println("");
            System.out.println("HI I AM AFTER CLASS. I WORK JUST ONCE ");
        System.out.println("");
    }
    @AfterTest
    public void tryAfterTest(){
        System.out.println("THIS IS AFTER TEST");

    }






    @Test
        public void test1FailandPass() {
            System.out.println("TEST 1");


            System.out.println("First Test First Assertion");
            Assert.assertEquals("titile", "tiTle");

            //after method

            System.out.println("First Test Second Assertion");
            Assert.assertEquals("url", "url");
        }

        @Test
        public void test2Pass(){
            System.out.println("TEST 2");
            Assert.assertEquals("test2","test2");
        }


        @Test
        public void test3PasswithMessage(){
            System.out.println("TEST 3");

            String expectedTitle = "Cyb";
            String actualTitle= "Cybertek";

            Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verrify title stars with Cyb");
        }

        @Test
        public void test4FailwithMessage(){
            System.out.println("TEST 4");

            String email="mikesmith.com";


            Assert.assertTrue(email.contains("@"), "Verrify emailcontains'@' ");

        }

        @Test
        public void test5PassCondition(){
            System.out.println("TEST 5");
            Assert.assertFalse(1>0,"verify that 0 is not greater than 1");
        }





    }
/*
Assertions

Assert --> this is the class in testNg, it has methods used to do assertions like when we compare values.

in testng, if assertion fails, rest of the method will NOT execute, it will be ignored/skipped.

If your code fail in one @Test annotation, it will not effect other @Test s, each of them working independently.

Note: whether your testcase fail or not, your before and after method will executed ALWAYS. so even if you code failes, you can quit from driver, close browser.



 */



