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

public class HeadlineFragment extends Fragment{
    TextView headlines;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.headlineresource,container,false);
        headlines = v.findViewById(R.id.headline);
        Bundle bundle = getArguments();
        String headline = bundle.getString("headline");
        headlines.setText(headline);
        return  v;


    }
}
