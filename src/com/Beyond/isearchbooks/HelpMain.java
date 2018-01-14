package com.Beyond.isearchbooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class HelpMain extends Activity {
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helpmain);
		
		lv= (ListView) findViewById(R.id.listViewhelp);
		 
		 String[] values = new String[] { "Search Result", 
                 "Athena WebServer",
                 "Viewing the Floor Plan",
                 
               
             };

		 	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		 		android.R.layout.simple_list_item_1, android.R.id.text1, values);

		lv.setAdapter(adapter); 

		lv.setOnItemClickListener(new OnItemClickListener() {
		
		@Override
		public void onItemClick(AdapterView<?> parent, View view,
		int position, long id) {
		
		if (position == 0){
		Intent i = new Intent(HelpMain.this,Help.class);
		startActivity(i);
		}
		else if (position == 1){
		Intent i = new Intent(HelpMain.this,Help2.class);
		startActivity(i);
		}
		else if (position == 2){
		Intent i = new Intent(HelpMain.this,Help3.class);
		startActivity(i);
		}
		
		}	}); 
	}

}
