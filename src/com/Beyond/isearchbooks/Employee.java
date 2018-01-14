package com.Beyond.isearchbooks;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Employee extends Activity {
	
	ImageView iv;
	TextView tvname;
	TextView tvposition;
	TextView tvemail;
	TextView tvintercom;
	
	
	Spinner spnr;
	  String[] employees = {
	      "ANNA DIVINE D. ESPIRITU",
	      "DONA B. BERENIO",
	      "ANTONINO P. DIAZ",
	      "GRACE ANN M. VALONDO",
	      "MARY JANE D. CARANTO",
	      "ALLAN M. ESBER",
	      "ERMA R. MANALO",
	      "JULIUS VINCENT D. LACSON"
	    	  };
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.employee);
		spnr = (Spinner)findViewById(R.id.spinner);
		
		iv  = (ImageView) findViewById(R.id.imageViewEmp);
		tvname = (TextView) findViewById (R.id.name);
		tvposition = (TextView) findViewById (R.id.position);
		tvemail = (TextView) findViewById (R.id.email);
		tvintercom = (TextView) findViewById (R.id.intercom);
		
		
		
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
	        Employee.this, android.R.layout.simple_spinner_item, employees);
	    spnr.setAdapter(adapter);
	    spnr.setOnItemSelectedListener(
	              new AdapterView.OnItemSelectedListener() {
	                  @Override
	                  public void onItemSelected(AdapterView<?> parent, View view,
	                          int employees, long arg3) {
	                	  if (employees == 0){
	                		  iv.setImageResource(R.drawable.espiritu);
	                		  tvname.setText(R.string.oic);
	                		  tvposition.setText(R.string.oicDetails);
	                		  tvemail.setText(R.string.oicEmail);
	              			  tvintercom.setText(R.string.oicCom);
	                		
	              			}
	                	  if (employees == 1){
	                		  iv.setImageResource(R.drawable.berenio);
	                		  tvname.setText(R.string.techstud);
	                		  tvposition.setText(R.string.techstudDetails);
	                		  tvemail.setText(R.string.techstudEmail);
	              			  tvintercom.setText(R.string.techstudCom);
	                		
	              			}
	                	  if (employees == 2){
	                		  iv.setImageResource(R.drawable.diaz);
	                		  tvname.setText(R.string.techsec);
	                		  tvposition.setText(R.string.techsecDetails);
	                		  tvemail.setText(R.string.techsecEmail);
	              			  tvintercom.setText(R.string.techsecCom);
	                		
	              			}
	                	  if (employees == 3){
	                		  iv.setImageResource(R.drawable.valondo);
	                		  tvname.setText(R.string.persec);
	                		  tvposition.setText(R.string.persecDetails);
	                		  tvemail.setText(R.string.persecEmail);
	              			  tvintercom.setText(R.string.persecCom);
	                		
	              			}
	                	  if (employees == 4){
	                		  iv.setImageResource(R.drawable.caranto);
	                		  tvname.setText(R.string.auvis);
	                		  tvposition.setText(R.string.auvisDetails);
	                		  tvemail.setText(R.string.auvisEmail);
	              			  tvintercom.setText(R.string.auvisCom);
	                		
	              			}
	                	  if (employees == 5){
	                		  iv.setImageResource(R.drawable.esber);
	                		  tvname.setText(R.string.cirsec);
	                		  tvposition.setText(R.string.cirsecDetails);
	                		  tvemail.setText(R.string.cirsecEmail);
	              			  tvintercom.setText(R.string.cirsecCom);
	                		
	              			}
	                	  if (employees == 6){
	                		  iv.setImageResource(R.drawable.manalo);
	                		  tvname.setText(R.string.hrm);
	                		  tvposition.setText(R.string.hrmDetails);
	                		  tvemail.setText(R.string.hrmEmail);
	              			  tvintercom.setText(R.string.hrmCom);
	                		
	              			}
	                	  if (employees == 7){
	                		  iv.setImageResource(R.drawable.lacson);
	                		  tvname.setText(R.string.juliusname);
	                		  tvposition.setText(R.string.auvisDetails);
	                		  tvemail.setText(R.string.auvisEmail);
	              			  tvintercom.setText(R.string.auvisCom);
	                		
	              			}
	                      // TODO Auto-generated method stub
	                  }
	                  @Override
	                  public void onNothingSelected(AdapterView<?> arg0) {
	                      // TODO Auto-generated method stub
	                  }
	              }
	          );
	}
	
	

}
