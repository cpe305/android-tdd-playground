package org.pestrada.android_tdd_playground;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        /* if testing wanted, uncomment before_script in .travis.yml */
       // super(Application.class);
    }
}
