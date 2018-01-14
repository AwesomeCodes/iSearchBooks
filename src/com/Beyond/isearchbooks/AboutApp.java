package com.Beyond.isearchbooks;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutApp extends Activity{
	
	WebView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutapp);
        tv = (WebView) findViewById(R.id.webviewapp);
       
		//String text;
		//text = "<html><body> <p align=\"justify\">";
		//text+= getResources().getString(R.string.aboutapp);
		//text+= "</p></body></html>";
		//tv.loadData(text, "text/html", "utf-8");
		
		 tv.loadData(getString(R.string.library), "text/html", "utf-8");
	}


}
