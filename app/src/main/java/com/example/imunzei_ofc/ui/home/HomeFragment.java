package com.example.imunzei_ofc.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.imunzei_ofc.MainActivity2;
import com.example.imunzei_ofc.MainActivity3;
import com.example.imunzei_ofc.R;
import com.example.imunzei_ofc.databinding.FragmentHomeBinding;
import com.google.android.material.chip.Chip;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //HomeViewModel homeViewModel =
          //      new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View v = inflater.inflate(R.layout.fragment_home, container, false);
        WebView comecar = (WebView)v.findViewById(R.id.teste1);



        comecar.loadUrl("file:///android_asset/home.html");

        Chip saiba = (Chip) v.findViewById(R.id.mais);
        saiba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent it = new Intent(getActivity(), MainActivity3.class);
                startActivity(it);

            }
        });


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