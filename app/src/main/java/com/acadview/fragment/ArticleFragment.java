package com.acadview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acadview.fragment.R;

public class ArticleFragment extends Fragment {

    TextView article;

    String news;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.articlelayout,container,false);
        article = v.findViewById(R.id.article);

        Bundle bundle = getArguments();
        news = bundle.getString("news");
        article.setText(news);
        return v;
    }
}
