package com.arithimatic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class SimpleActivityTest {
  @Rule
    public ActivityTestRule<SimpleActivity> testRule =
            new ActivityTestRule<>(SimpleActivity.class);
    private String mText = "Hello";

    @Test
    public void TestUI() throws Exception
    {
        onView(withId(R.id.etText))
                .perform(typeText(mText));

        closeSoftKeyboard();

        onView(withId(R.id.btnClick))
                .perform(click());
        onView(withId(R.id.tvDisplay))
                .check(matches(withText(mText)));

    }

}
