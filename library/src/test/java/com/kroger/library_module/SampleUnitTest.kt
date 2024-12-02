package com.kroger.library

import org.junit.jupiter.api.Test

internal class SampleUnitTest {

    /**
     * 'Given, When, Then' syntax is preferred for unit tests
     */
    @Test
    fun `Given a thing, When another thing happens, Then this other thing should be true`() {
        assert(true)
        assert(false.not())
    }
}
