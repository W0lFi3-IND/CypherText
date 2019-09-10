package com.wolfie.cyphertext;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class decrypt extends Fragment {
    EditText ed1,ed2;
    ImageButton btn1;
    TextView tv1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View RootView = inflater.inflate(R.layout.encrypt,viewGroup, false);
    return RootView;
}}