package com.example.akshay.authorjunctiondemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class A extends Fragment {
   private static final String ARG_SECTION_NUMBER = "section_number";

   public A() {

   }

   public static A newInstance(int sectionNumber) {
       A fragment = new A();
       Bundle args = new Bundle();
       args.putInt(ARG_SECTION_NUMBER, sectionNumber);
       fragment.setArguments(args);
       return fragment;
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.fragment_a, container, false);
//        TextView textView = rootView.findViewById(R.id.section_lable1);
//        textView.setText("AKSHAY");

       RecyclerView rv1 = rootView.findViewById(R.id.rv1);

       Radapter mAdapter = new Radapter();
       RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
       rv1.setLayoutManager(mLayoutManager);
       rv1.setItemAnimator(new DefaultItemAnimator());
       rv1.setAdapter(mAdapter);

       return rootView;

   }
   class Radapter extends RecyclerView.Adapter<Radapter.MyViewHolder>{

       @Override
       public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

           View itemView = LayoutInflater.from(parent.getContext())
                   .inflate(R.layout.movie_list_row, parent, false);

           return new MyViewHolder(itemView);
       }

       @Override
       public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText("position"+position);
       }

       @Override
       public int getItemCount() {
           return 5;
       }

       public class MyViewHolder extends RecyclerView.ViewHolder {

           public TextView title;
           public MyViewHolder(View itemView) {
               super(itemView);
                 title = (TextView) itemView.findViewById(R.id.rid1);
//               genre = (TextView) view.findViewById(R.id.genre);
//               year = (TextView) view.findViewById(R.id.year);
           }
       }
   }
}
