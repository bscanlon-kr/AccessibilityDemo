package com.kroger.library

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
public class HelloWorldTest {

    @Test
    public fun testingHelloWorld() {
        assertEquals("Hello World Should Equal itself ", "Hello World", helloWorld())
    }

    private fun helloWorld(): String = "Hello World"
}
