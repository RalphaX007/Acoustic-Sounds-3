package com.example.as;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class video_leccion extends AppCompatActivity {

    private Context context;
WebView leccion1;
String video1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_leccion);

          leccion1 = findViewById(R.id.leccion1);
          video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gKazDze4RVk?si=MJWk2b8ekMCOrg8C\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
          leccion1.loadData(video1, "text/html", "utf-8");
          leccion1.getSettings().setJavaScriptEnabled(true);
          leccion1.setWebChromeClient(new WebChromeClient());
    }

}