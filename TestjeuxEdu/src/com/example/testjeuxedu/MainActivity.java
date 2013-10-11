package com.example.testjeuxedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button alphabet;
	Button calcul;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		alphabet= (Button) findViewById(R.id.alphabet);
		alphabet.setOnClickListener(this);
        
		 calcul= (Button) findViewById(R.id.calcul);
         calcul.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		if (v == alphabet) {
			Intent intentAlphabet = new Intent(this, Alphabet.class);
			this.startActivityForResult(intentAlphabet, 10);
		}
		else if (v == calcul) {
			Intent intentCalcul = new Intent(this, Calcul.class);
			this.startActivityForResult(intentCalcul, 20);
		}
	}
}
