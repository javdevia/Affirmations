package com.project

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.runner.AndroidJUnit4
import com.project.affirmations.MainActivity
import com.project.affirmations.R

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)

class ExampleInstrumentedTest {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.project.affirmations", appContext.packageName)
    }

    @Test
    fun scrollToItem() {
        onView(withId(R.id.rvAffirmations)).perform(
            RecyclerViewActions
                .scrollTo<RecyclerView.ViewHolder>(
                    withText(R.string.affirmation10)
                )
        )

        onView(withText(R.string.affirmation10))
            .check(matches(isDisplayed())
            )

    }
}