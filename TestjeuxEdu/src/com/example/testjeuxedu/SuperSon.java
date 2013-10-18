package com.example.testjeuxedu;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class SuperSon extends Activity {

	protected Integer[] imageIDs = null;
	 Integer[] sonIDs =null;

	public SuperSon() {
		super();
	}


	public class ImageAdapter2 extends BaseAdapter {
		private Context context;

		public ImageAdapter2(Context c) {
			context = c;
		}

		// Returns the number of images
		@Override
		public int getCount() {
			return getImageIDs().length;
		}

		// Returns the ID of an item
		@Override
		public Object getItem(int position) {
			return position;
		}

		// Returns the ID of an item
		@Override
		public long getItemId(int position) {
			return position;
		}

		// Returns an ImageView View
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) {
				imageView = new ImageView(context);
				imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(5, 5, 5, 5);
			} else {
				imageView = (ImageView) convertView;
			}

			imageView.setImageResource(getImageIDs()[position]);
			return imageView;
		}

	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid);
	
		GridView gridview = (GridView) findViewById(R.id.gridview_sons);
		gridview.setAdapter(new ImageAdapter2(this));
	
		gridview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast toast = Toast.makeText(getApplicationContext(), id, Toast.LENGTH_SHORT);
				toast.show();
				
			MediaPlayer mp = new MediaPlayer();
				mp.reset();
				int pos = position;
				playThatSound(mp, pos);
			}
		});
	}

	public Integer[] getImageIDs() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void playThatSound(MediaPlayer mp, int pos) {
		if (mp != null) {
			mp.reset();
			mp.release();
		}
		
		mp = MediaPlayer.create(this, getSonIDs()[pos]);
		mp.start();
	}

	protected Integer[] getSonIDs() {
		// TODO Auto-generated method stub
		return null;
	}

}