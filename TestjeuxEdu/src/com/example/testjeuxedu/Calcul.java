package com.example.testjeuxedu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Calcul extends Activity {
	TextView calcul = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcul);
		
		
		calcul=(TextView)findViewById(R.id.calcul); 
	    calcul.setText("Step One: blast egg");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calcul, menu);
		return true;
	}

}
