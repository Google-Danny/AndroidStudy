package com.cm.xingyu.networkprogramminglearn.WebViewLearn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.cm.xingyu.networkprogramminglearn.R;

public class WebJsActiviry extends Activity {
    private WebView myWebView = null;
    private Button myButton = null;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_js_activiry);
        myWebView = (WebView) findViewById(R.id.myWebView);

        // 得到设置属性的对象
        WebSettings webSettings = myWebView.getSettings();

        // 使能JavaScript
        webSettings.setJavaScriptEnabled(true);

        // 支持中文，否则页面中中文显示乱码
        webSettings.setDefaultTextEncodingName("GBK");

        // 限制在WebView中打开网页，而不用默认浏览器
        myWebView.setWebViewClient(new WebViewClient());

        // 如果不设置这个，JS代码中的按钮会显示，但是按下去却不弹出对话框
        // Sets the chrome handler. This is an implementation of WebChromeClient
        // for use in handling JavaScript dialogs, favicons, titles, and the
        // progress. This will replace the current handler.
        myWebView.setWebChromeClient(new WebChromeClient()
        {

            @Override
            public boolean onJsAlert(WebView view, String url, String message,
                                     JsResult result)
            {
                // TODO Auto-generated method stub
                return super.onJsAlert(view, url, message, result);
            }

        });

        // 用JavaScript调用Android函数：
        // 先建立桥梁类，将要调用的Android代码写入桥梁类的public函数
        // 绑定桥梁类和WebView中运行的JavaScript代码
        // 将一个对象起一个别名传入，在JS代码中用这个别名代替这个对象，可以调用这个对象的一些方法
        myWebView.addJavascriptInterface(new WebAppInterface(this),
                "myInterfaceName");

        // 载入页面：本地html资源文件
        myWebView.loadUrl("file:///android_asset/sample.html");

        // 这里用一个Android按钮按下后调用JS中的代码
        myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // 用Android代码调用JavaScript函数：
                myWebView.loadUrl("javascript:myFunction()");

                // 这里实现的效果和在网页中点击第一个按钮的效果一致

            }
        });

    }

    public  class WebAppInterface{
        Context mContext;

        public WebAppInterface(Context c) {
            mContext = c;
        }

        public void showToast(String toast){
            // Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
            Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
        }
    }
}
