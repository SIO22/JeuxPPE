package com.example.testjeuxedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Calcul extends Activity implements OnClickListener {
	Button niveau1;
	Button niveau2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcul_menu);
		
		niveau1= (Button) findViewById(R.id.niveau1);
		niveau1.setOnClickListener(this);
        
		niveau2= (Button) findViewById(R.id.niveau2);
		niveau2.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		if (v == niveau1) {
			Intent intentN1 = new Intent(this, Calculn1.class);
			this.startActivityForResult(intentN1, 10);
		}
		else if (v == niveau2) {
			Intent intentN2 = new Intent(this, Calculn2.class);
			this.startActivityForResult(intentN2, 20);
		}
	}
}
