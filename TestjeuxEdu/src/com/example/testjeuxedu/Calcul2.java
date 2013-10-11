package com.example.testjeuxedu;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calcul2 extends Activity implements OnClickListener {
	TextView calcul;
	private Button calculer;
	private String valTappe;
	private String valeurFinal2;
	private int cpt;
	private int cptBonneRep;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcul);

		calcul = (TextView) findViewById(R.id.calcul);
		calculer = (Button) findViewById(R.id.calculer);
		
		Random r = new Random();
		cpt = this.getIntent().getExtras().getInt("cpt");
		cptBonneRep = this.getIntent().getExtras().getInt("cptBonneRep");
		if(cpt==3){
			Intent CalculResultat = new Intent(this,CalculResultat.class);
			CalculResultat.putExtra("cpt",cpt);
			CalculResultat.putExtra("cptBonneRep",cptBonneRep);
			this.startActivityForResult(CalculResultat,20);
		}
		Log.i("cpt", " " + cpt);
		int valeur = 0 + r.nextInt(9 - 0);
		int valeur2 = 0 + r.nextInt(9 - 0);
		int valeurFinal = valeur + valeur2;
		
		String test = String.valueOf(valeur) + "+" + String.valueOf(valeur2)+ " =";		
		
		valeurFinal2 = String.valueOf(valeurFinal);
		
		calcul.setText(test);
		calculer.setOnClickListener(this);
		
	}


	@Override
	public void onClick(View v) {
		EditText chiffreTap = (EditText) findViewById(R.id.chiffreTap);
		valTappe = chiffreTap.getText().toString();
		
		if (v == calculer) {
			
			

			   if(valTappe.equals(""))
			   {
			      Toast t =Toast.makeText(getApplicationContext(), "Please enter item", Toast.LENGTH_SHORT);
			      t.show();   
			   }

			else if (Integer.parseInt(valTappe) == Integer.parseInt(valeurFinal2)) {
				Toast toast1 = Toast.makeText(getApplicationContext(),
						"Bonne réponse !!", Toast.LENGTH_SHORT);
				toast1.show();
				cpt++;
				Intent intentQuizz = new Intent(this,Calcul2.class);
				intentQuizz.putExtra("cpt",cpt);
				
				cptBonneRep++;
				
				intentQuizz.putExtra("cptBonneRep",cptBonneRep);
				this.startActivityForResult(intentQuizz,10);
			} else {
				Toast toast2 = Toast.makeText(getApplicationContext(), "Fail :-(",
						Toast.LENGTH_SHORT);
				toast2.show();
				cpt++;
				Intent intentQuizz = new Intent(this,Calcul2.class);
				intentQuizz.putExtra("cpt",cpt);
				intentQuizz.putExtra("cptBonneRep",cptBonneRep);
				this.startActivityForResult(intentQuizz,10);
			}
		}
	}

}
