package com.example.androidunittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer: ResourceComparer

    @Test
    fun stringSameAsGivenString_returnsTrue(){
        val content = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "AndroidUnitTest")
        assertThat(result).isTrue()
    }

    @Test
    fun stringSameAsGivenString_returnsFalse(){
        val content = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "AndroidUnitTest")
        assertThat(result).isFalse()
    }
}