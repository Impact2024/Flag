package com.example.flag;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public abstract class ActionBarActivity {
    protected abstract void onCreate(Bundle savedInstanceState);

    public abstract boolean onCreateOptionsMenu(Menu menu);

    protected boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
