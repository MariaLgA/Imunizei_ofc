package com.example.imunzei_ofc;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.imunzei_ofc.databinding.FragmentLinkOfBinding;


public class Link_ofFragment extends Fragment {

    private  FragmentLinkOfBinding binding;


public View onCreateView(@NonNull LayoutInflater inflater,
        ViewGroup container, Bundle savedInstanceState) {
        //HomeViewModel homeViewModel =
        //      new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentLinkOfBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View v = inflater.inflate(R.layout.fragment_link_of, container, false);
        WebView comecar = (WebView)v.findViewById(R.id.ref);

        comecar.loadUrl("file:///android_asset/link.html");


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