package com.Beyond.isearchbooks;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Help2 extends Activity {

	WebView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help2);
		 tv = (WebView) findViewById(R.id.webViewhelp2);
	       
			
			 tv.loadData(getString(R.string.help2), "text/html", "utf-8");
		
	}

}
