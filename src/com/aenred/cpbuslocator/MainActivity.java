package com.aenred.cpbuslocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()){
			case(R.id.itemMap):
				Log.d("Map", "Map menu button press.");
				Intent intentMain = new Intent(this, MainActivity.class);
				startActivity(intentMain);
			break;
			case(R.id.itemConfig):
				Log.d("Config", "Config menu button press.");
				Intent intentConfig = new Intent(this, ConfigActivity.class);
				startActivity(intentConfig);
			break;
			case(R.id.itemAbout):
				Log.d("About", "About menu button press.");
				Intent intentAbout = new Intent(this, AboutActivity.class);
				startActivity(intentAbout);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
}