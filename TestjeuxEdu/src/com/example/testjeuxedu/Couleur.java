package com.example.testjeuxedu;

public class Couleur extends SuperSon {

	// Images to display
	Integer[] imageIDs = { R.drawable.couleur_blanc, R.drawable.couleur_noir,
			R.drawable.couleur_bleu, R.drawable.couleur_vert,
			R.drawable.couleur_rouge, R.drawable.couleur_jaune,
			R.drawable.couleur_rose, R.drawable.couleur_orange,
			R.drawable.couleur_violet, R.drawable.couleur_marron,
			R.drawable.couleur_gris,

	};

	Integer[] sonIDs = { R.raw.couleur_blanc, R.raw.couleur_noir,
			R.raw.couleur_bleu, R.raw.couleur_vert, R.raw.couleur_rouge,
			R.raw.couleur_jaune, R.raw.couleur_rose, R.raw.couleur_orange,
			R.raw.couleur_violet, R.raw.couleur_marron, R.raw.couleur_gris
			
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