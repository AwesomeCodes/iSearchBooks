package com.Beyond.isearchbooks;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutLibrary extends Activity{

	
	WebView wb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutlibrary);
		wb = (WebView) findViewById(R.id.webviewaboutlib);
	
		//String text1;
		//text1 = "<html><body> <p align=\"justify\">";
		//text1+= getResources().getString(R.string.library1);
		//text1+= "</p></br> <p align=\"justify\">";
		//text1+= getResources().getString(R.string.library2);
		//text1+= "</p> <p align=\"justify\">";
		//text1+= getResources().getString(R.string.library3);
		//text1+= "</p></body></html>";
		//wb.loadData(text1, "text/html", "utf-8");
		
		wb.loadData(getString(R.string.library2), "text/html", "utf-8");
		
		
	}

}
