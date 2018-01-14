package com.Beyond.isearchbooks;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

	
public class Map extends Activity{
	
  ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps);
		
		 lv= (ListView) findViewById(R.id.lvfloor);
		 
		 String[] values = new String[] { "Second Floor", 
                 "Third Floor",
               
             };

		 	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		 		android.R.layout.simple_list_item_1, android.R.id.text1, values);

		lv.setAdapter(adapter); 

		lv.setOnItemClickListener(new OnItemClickListener() {
		
		@Override
		public void onItemClick(AdapterView<?> parent, View view,
		int position, long id) {
		
		if (position == 0){
		Intent i = new Intent(Map.this,MapSecondFloor.class);
		startActivity(i);
		}
		else if (position == 1){
		Intent i = new Intent(Map.this,MapThirdFloor.class);
		startActivity(i);
		}
		}	}); 
			 
}
}