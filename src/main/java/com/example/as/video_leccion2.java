package com.example.as;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class video_leccion2 extends AppCompatActivity {

    private Context context;
    WebView leccion1, leccion2, leccion3, leccion4;
    String video1, video2, video3, video4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_leccion2);

        leccion1 = findViewById(R.id.leccion1);
        leccion2 = findViewById(R.id.leccion2);
        leccion3 = findViewById(R.id.leccion3);
        leccion4 = findViewById(R.id.leccion4);

        //Links de los vídeos:
        video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/pCaKxqTHvjc?si=sSs5u6Lb9Pjwdy-p\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/GrbL8_78XSg?si=aDVNL6-GoOKDY7S5\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        video4 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SNMSrQS9ysA?si=h9pbIKqFwOXftZ5O\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";

        //Ingresar los links en los WebViewers:
        leccion1.loadData(video1, "text/html", "utf-8");
        leccion1.setWebViewClient(new WebViewClient());
        leccion1.getSettings().setJavaScriptEnabled(true);

        leccion2.loadData(video2, "text/html", "utf-8");
        leccion2.setWebViewClient(new WebViewClient());
        leccion2.getSettings().setJavaScriptEnabled(true);

        leccion4.loadData(video4, "text/html", "utf-8");
        leccion4.setWebViewClient(new WebViewClient());
        leccion4.getSettings().setJavaScriptEnabled(true);

        //Habilitar pantalla completa para contenido multimedia:
        leccion1.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                super.onShowCustomView(view, callback);

                view.setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                );
                setContentView(view);
            }


            //Para volver a la vista normal:
            @Override
            public void onHideCustomView() {
                super.onHideCustomView();

                setContentView(R.layout.activity_video_leccion);

            }
        });


        leccion2.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                super.onShowCustomView(view, callback);

                view.setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                );

                setContentView(view);
            }

            @Override
            public void onHideCustomView() {
                super.onHideCustomView();

                setContentView(R.layout.activity_video_leccion);

            }
        });


        leccion4.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onShowCustomView(View view, CustomViewCallback callback) {
                super.onShowCustomView(view, callback);

                view.setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                );
                setContentView(view);

            }

            @Override
            public void onHideCustomView() {
                super.onHideCustomView();

                setContentView(R.layout.activity_video_leccion);
            }
        });

    }
}