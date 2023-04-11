package joshuuduan.laptrinh.java.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import joshuuduan.laptrinh.java.R;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainStringHtml extends AppCompatActivity {
    WebView webView;
    private   AdView    mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_string_html);


        int a = getIntent().getIntExtra("StringJava",0);
        webView = findViewById(R.id.idWebViewString);
        if(a==0){
            webView.loadUrl("file:///android_asset/string/bai1.html");
        }if(a==1){
            webView.loadUrl("file:///android_asset/string/bai2.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/string/bai3.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/string/bai4.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/string/bai5.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/string/bai6.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/string/bai7.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/string/bai8.html");
        }if(a==8){
            webView.loadUrl("file:///android_asset/string/bai9.html");
        }if(a==9){
            webView.loadUrl("file:///android_asset/string/bai10.html");
        }if(a==10){
            webView.loadUrl("file:///android_asset/string/bai11.html");
        }if(a==11){
            webView.loadUrl("file:///android_asset/string/bai12.html");
        }if(a==12){
            webView.loadUrl("file:///android_asset/string/bai13.html");
        }

        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5382625544778444/5261032551");
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}