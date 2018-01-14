package com.Beyond.isearchbooks;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class Sections extends Activity{
	
	ListView listView;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sections);

	        listView = (ListView) findViewById(R.id.listViewSec);
	        
	        // Defined Array values to show in ListView
	        String[] values = new String[] { "Search All Books", 
	        								 "Audio Visual Center Materials",
	        								 "Circulation Section",
	        								 "Filipiniana Section",
	        								 "Graduate School Section",
	        								 "HRM Section",
	        								 "Nursing Section",
	                                         "Reference Section",
	                                         "Reserve Section",
	                                         "Technological Studies Section",
	                                         
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
			Intent i = new Intent(Sections.this,SearchableBooks.class);
			startActivity(i);
			}
			else if (position == 1){
			Intent i = new Intent(Sections.this,SearchableBooksAudio.class);
			startActivity(i);
			}
			else if (position == 2){
			Intent i = new Intent(Sections.this,SearchableBooksCirc.class);
			startActivity(i);
			}
			else if (position == 3){
			Intent i = new Intent(Sections.this,SearchableBooksFil.class);
			startActivity(i);
			}  
			else if (position == 4){
			Intent i = new Intent(Sections.this,SearchableBooksGrad.class);
			startActivity(i);
			}  
			else if (position == 5){
			Intent i = new Intent(Sections.this,SearchableBooksHRM.class);
			startActivity(i);
			}  
			else if (position == 6){
			Intent i = new Intent(Sections.this,SearchableBooksNursing.class);
			startActivity(i);
			} 
			else if (position == 7){
			Intent i = new Intent(Sections.this,SearchableBooksReference.class);
			startActivity(i);
			}       
			else if (position == 8){
			Intent i = new Intent(Sections.this,SearchableBooksReserve.class);
			startActivity(i);
			}
			else if (position == 9){
			Intent i = new Intent(Sections.this,SearchableBooksTech.class);
			startActivity(i);
			}
	              }

	         }); 
	    
	    }
}
