package com.example.imunzei_ofc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.imunzei_ofc.R;
import com.example.imunzei_ofc.databinding.FragmentIdoso2Binding;
import com.example.imunzei_ofc.databinding.FragmentSlideshowBinding;
import com.example.imunzei_ofc.fragment_idoso_2;


public class fragment_idoso_2 extends Fragment {

    private FragmentIdoso2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //HomeViewModel homeViewModel =
        //      new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentIdoso2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View v = inflater.inflate(R.layout.fragment_idoso_2, container, false);
        WebView comecar = (WebView)v.findViewById(R.id.idosos_2);

        comecar.loadUrl("file:///android_asset/idosos_2.html");

        return v;


        //  final TextView textView = binding.project3;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        // return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}