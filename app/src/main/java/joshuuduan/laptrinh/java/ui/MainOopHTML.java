package joshuuduan.laptrinh.java.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import joshuuduan.laptrinh.java.R;

public class MainOopHTML extends AppCompatActivity {
    WebView webView;
    private   AdView    mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oop_html);

        int a = getIntent().getIntExtra("MainOopHTML",0);
        webView = findViewById(R.id.webViewOop);
        if(a==0){
            webView.loadUrl("file:///android_asset/oop/bai1.html");
        }if(a==1){
            webView.loadUrl("file:///android_asset/oop/bai2.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/oop/bai3.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/oop/bai4.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/oop/bai5.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/oop/bai6.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/oop/bai7.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/oop/bai8.html");
        }if(a==8){
            webView.loadUrl("file:///android_asset/oop/bai9.html");
        }if(a==9){
            webView.loadUrl("file:///android_asset/oop/bai10.html");
        }if(a==10){
            webView.loadUrl("file:///android_asset/oop/bai11.html");
        }if(a==11){
            webView.loadUrl("file:///android_asset/oop/bai12.html");
        }if(a==12){
            webView.loadUrl("file:///android_asset/oop/bai13.html");
        }if(a==13){
            webView.loadUrl("file:///android_asset/oop/bai14.html");
        }if(a==14){
            webView.loadUrl("file:///android_asset/oop/bai15.html");
        }if(a==15){
            webView.loadUrl("file:///android_asset/oop/bai16.html");
        }if(a==16){
            webView.loadUrl("file:///android_asset/oop/bai17.html");
        }if(a==17){
            webView.loadUrl("file:///android_asset/oop/bai18.html");
        }if(a==18){
            webView.loadUrl("file:///android_asset/oop/bai19.html");
        }if(a==19){
            webView.loadUrl("file:///android_asset/oop/bai20.html");
        }if(a==20){
            webView.loadUrl("file:///android_asset/oop/bai21.html");
        }if(a==21){
            webView.loadUrl("file:///android_asset/oop/bai22.html");
        }if(a==22){
            webView.loadUrl("file:///android_asset/oop/bai23.html");
        }if(a==23){
            webView.loadUrl("file:///android_asset/oop/bai24.html");
        }if(a==24){
            webView.loadUrl("file:///android_asset/oop/bai25.html");
        }if(a==25){
            webView.loadUrl("file:///android_asset/oop/bai26.html");
        }if(a==26){
            webView.loadUrl("file:///android_asset/oop/bai27.html");
        }if(a==27){
            webView.loadUrl("file:///android_asset/oop/bai28.html");
        }if(a==28){
            webView.loadUrl("file:///android_asset/oop/bai29.html");
        }if(a==29){
            webView.loadUrl("file:///android_asset/oop/bai30.html");
        }if(a==30){
            webView.loadUrl("file:///android_asset/oop/bai31.html");
        }if(a==31){
            webView.loadUrl("file:///android_asset/oop/bai32.html");
        }if(a==32){
            webView.loadUrl("file:///android_asset/oop/bai33.html");
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