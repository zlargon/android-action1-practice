package com.zlargon.action1;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // action bar
        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);

        // add fragment 1
        Fragment1 fragment1 = new Fragment1();
        actionBar.addTab(
            actionBar.newTab()
                     .setText("Tab 1")
                     .setTabListener(new MyTabListener(fragment1))
        );
    }
}
