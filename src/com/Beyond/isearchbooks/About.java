package com.Beyond.isearchbooks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class About extends Activity {

	
	ListView listView ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		 // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView1);
        
        // Defined Array values to show in ListView
        String[] values = new String[] { "About the Library", 
                                         "About the App",
                                         "About the Developers",
                                     };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter); 
        
        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> parent, View view,
                 int position, long id) {
                
             if (position == 0){
		Intent i = new Intent(About.this,AboutLibrary.class);
		startActivity(i);
		}
		else if (position == 1){
		Intent i = new Intent(About.this,AboutApp.class);
		startActivity(i);
		}
		else if (position == 2){
		Intent i = new Intent(About.this,AboutDevelopers.class);
		startActivity(i);
		}
             
              }

         }); 
    
	}


}
