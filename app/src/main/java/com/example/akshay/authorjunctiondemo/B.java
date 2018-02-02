package com.example.akshay.authorjunctiondemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class B extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public B() {

    }

    public static B newInstance(int sectionNumber) {
        B fragment = new B();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
//        TextView textView = rootView.findViewById(R.id.section_lable1);
//        textView.setText("AKSHAY");
        return rootView;
    }
}