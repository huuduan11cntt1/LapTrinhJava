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
public class MainFileIOHTML extends AppCompatActivity {
    WebView webView;
    private   AdView    mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_file_iohtml);

        webView = findViewById(R.id.webViewFile);

        int a = getIntent().getIntExtra("FileIO",0);

        if(a==0){
            webView.loadUrl("file:///android_asset/fileio/bai1.html");
        }if(a==1){
            webView.loadUrl("file:///android_asset/fileio/bai2.html");
        }if(a==2){
            webView.loadUrl("file:///android_asset/fileio/bai3.html");
        }if(a==3){
            webView.loadUrl("file:///android_asset/fileio/bai4.html");
        }if(a==4){
            webView.loadUrl("file:///android_asset/fileio/bai5.html");
        }if(a==5){
            webView.loadUrl("file:///android_asset/fileio/bai6.html");
        }if(a==6){
            webView.loadUrl("file:///android_asset/fileio/bai7.html");
        }if(a==7){
            webView.loadUrl("file:///android_asset/fileio/bai8.html");
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