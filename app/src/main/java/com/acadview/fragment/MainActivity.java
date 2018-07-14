package com.acadview.fragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import org.json.JSONObject;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity{

    String headline,news;
    LinearLayout head_fragment,article_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_article);

        head_fragment = findViewById(R.id.headline);
        article_fragment = findViewById(R.id.article);

        String json = null;

        try{
            InputStream is = getApplication().getAssets().open("news.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
            Log.d("TEST",json);
            JSONObject obj = new JSONObject(json);

            news=obj.getString("news");
            headline=obj.getString("headline");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        HeadlineFragment headlineFragment = new HeadlineFragment();
        Bundle bundle = new Bundle();
        bundle.putString("headline",headline);
        headlineFragment.setArguments(bundle);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.headline,headlineFragment).commit();

//        head_fragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ArticleFragment articleFragment = new ArticleFragment();
//                Bundle bundle = new Bundle();
//                bundle.putString("headline",headline);
//                articleFragment.setArguments(bundle);
//
//                FragmentManager fragmentManager = getSupportFragmentManager();
//
//                fragmentManager.beginTransaction().replace(R.id.article,articleFragment).commit();
//            }
//        });

    }


    }


