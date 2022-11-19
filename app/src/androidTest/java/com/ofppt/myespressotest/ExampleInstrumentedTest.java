package com.ofppt.myespressotest;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isNotChecked;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Context;
import android.os.SystemClock;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.anything;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    public @Rule
    ActivityScenarioRule<MainActivity> asr = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.

        onView(withId(R.id.name)).perform(typeText("my name"));
        onView(withId(R.id.surname)).perform(typeText("my last name"));
        onView(withId(R.id.age)).perform(typeText("20"));

        onView(withId(R.id.man)).check(matches(isNotChecked())).perform(scrollTo(), click());
        SystemClock.sleep(1500);

        onView(withId(R.id.save)).perform(click());

        onData(anything()).atPosition(2).perform(click());
        SystemClock.sleep(1500);


    }
}