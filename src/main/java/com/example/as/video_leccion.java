package com.example.as;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.AsyncListUtil;

public class video_leccion extends AppCompatActivity {

    private Context context;
    WebView leccion1, leccion2, leccion3, leccion4;
    String video1, video2, video3, video4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_leccion);

        //Procedo a meter los vídeos tutoriales de YouTube:

        leccion1 = findViewById(R.id.leccion1);
        leccion2 = findViewById(R.id.leccion2);
        leccion3 = findViewById(R.id.leccion3);
        leccion4 = findViewById(R.id.leccion4);
        //Links de los vídeos:
        video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gKazDze4RVk?si=MJWk2b8ekMCOrg8C\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        video2 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/HKsjLFAIWkc?si=rztRqMBJB-zwXWaZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        video3 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/a9m-VPByt30?si=3S1NnjoYb5X3zRnB\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>\n";

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