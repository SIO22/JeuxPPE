package com.example.testjeuxedu;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class Calculn2_Resultat extends Activity {
private int cptBonneRep;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcul_resultat);
		TextView rep = (TextView) findViewById(R.id.rep);
		
		cptBonneRep = this.getIntent().getExtras().getInt("cptBonneRep");
		String bonneRep = String.valueOf(cptBonneRep);
		
		rep.setText(bonneRep+" bonnnes r�ponse !!!");
		
		
	}


}
