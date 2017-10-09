package com.example.thomas.lek2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t;
    WebView wv;

    Button btn1;
    EditText navn;
    int i=1;
    public static final String TAG = "ThomassBesked";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// laver javaobjekter af xml'en
        Log.i(TAG,"onCreate");
        System.out.println("bum");
        t = (TextView) findViewById(R.id.textView2);
        // man kunne fra java sige: TextView t = new TextView(this);
        wv = (WebView) findViewById(R.id.wv);
        navn = (EditText) findViewById(R.id.navn);
        t.setText("velkommen");
        btn1 = (Button) findViewById(R.id.vejl);
        btn1.setOnClickListener(this);
        wv.setWebViewClient(new WebViewClient());
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }



        public void setText()
    {
            if (t.getText().toString().equals("Vejldening"))
            {
                t.setText("Find ud af det");
            }
            else if(btn1.getText().equals("Indstillinger"));
            {
                t.setText("Indstil noget");

            }
    }

    @Override
    public void onClick(View view) {
        if (view == btn1) {
            String s = navn.getText().toString();
            t.setText("velkommen " + s);
            System.out.println("Der blev trykket");
            wv.loadUrl(s);

        }
    }

    // mA = (MainActivity) findViewById(R.id.MainActivity);
}
