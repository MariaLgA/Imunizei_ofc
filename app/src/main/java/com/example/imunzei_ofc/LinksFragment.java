package com.example.imunzei_ofc;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.example.imunzei_ofc.databinding.FragmentLinks2Binding;


public class LinksFragment extends Fragment {

    private FragmentLinks2Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_links2, container, false);

        binding = FragmentLinks2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();


        View v = inflater.inflate(R.layout.fragment_links2, container, false);
        WebView idoso = (WebView)v.findViewById(R.id.in4);
        idoso.loadUrl("file:///android_asset/indigena.html");



            Button saiba = (Button) v.findViewById(R.id.button3);
            saiba.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent it = new Intent(getActivity(), MainActivity4.class);
                startActivity(it);

            }
        });

        return v;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}