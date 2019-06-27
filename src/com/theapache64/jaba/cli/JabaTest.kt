package com.theapache64.jaba.cli

import org.junit.Test
import kotlin.test.assertEquals

class JabaTest {

    @org.junit.Before
    fun setUp() {
    }

    @Test
    fun toCamelCase() {
        var input = "MyList"
        var output = Jaba.toSnackCase(input)
        assertEquals("my_list", output)
        input = "my"
        output = Jaba.toSnackCase(input)
        assertEquals("my", output)
    }
}