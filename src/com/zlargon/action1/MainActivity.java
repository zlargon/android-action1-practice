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
        actionBar.setDisplayShowHomeEnabled(false);

        // add fragment 1
        Fragment1 fragment1 = new Fragment1();
        actionBar.addTab(
            actionBar.newTab()
                     .setText("Tab 1")
                     .setTabListener(new MyTabListener(fragment1))
        );

        // add fragment 2
        Fragment2 fragment2 = new Fragment2();
        actionBar.addTab(
            actionBar.newTab()
                     .setText("Tab 2")
                     .setTabListener(new MyTabListener(fragment2))
        );
    }
}
