package com.Beyond.isearchbooks;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Help3 extends Activity {

	WebView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help3);
		
		 tv = (WebView) findViewById(R.id.webviewhelp3);
	       
			
		 tv.loadData(getString(R.string.help3), "text/html", "utf-8");
	}

}
