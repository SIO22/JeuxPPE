package com.example.testjeuxedu;

public class Calculn1 extends SuperSon {

	// Images to display
	Integer[] imageIDs = {/*R.drawable.calcul_0,*/ R.drawable.calcul_1, R.drawable.calcul_2, R.drawable.calcul_3,
			R.drawable.calcul_4, R.drawable.calcul_5, R.drawable.calcul_6, R.drawable.calcul_7,
			R.drawable.calcul_8, R.drawable.calcul_9,
	};

	Integer[] sonIDs = { /*R.raw.calcul_0,*/ R.raw.calcul_1, R.raw.calcul_2, R.raw.calcul_3, R.raw.calcul_4, R.raw.calcul_5,
			R.raw.calcul_6, R.raw.calcul_7, R.raw.calcul_8, R.raw.calcul_9
	};

	@Override
	public Integer[] getImageIDs() {
		return this.imageIDs;
	}

	@Override
	protected Integer[] getSonIDs() {
		return this.sonIDs;
	}
}