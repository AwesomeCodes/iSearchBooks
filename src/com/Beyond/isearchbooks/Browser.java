package com.Beyond.isearchbooks;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends Activity {

	private WebView mWebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web);
		
		mWebView = (WebView) findViewById(R.id.webview); 
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl("http://library.ua.edu.ph/athcgi/athweb.pl");
		mWebView.setWebViewClient(new BrowserClient());
	}
	private class BrowserClient extends WebViewClient{
		@Override
		public boolean shouldOverrideUrlLoading(WebView webview,String url)
		{
			webview.loadUrl(url);
			return true;
			
		}
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack())
		{
			mWebView.goBack();
			return true;
			
		}
		return super.onKeyDown(keyCode, event);
	}

}


