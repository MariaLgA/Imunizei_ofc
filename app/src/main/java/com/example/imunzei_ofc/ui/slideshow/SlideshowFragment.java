package com.example.imunzei_ofc.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.imunzei_ofc.MainActivity6;
import com.example.imunzei_ofc.R;
import com.example.imunzei_ofc.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // final TextView textView = binding.textSlideshow;
       // slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        View v = inflater.inflate(R.layout.fragment_slideshow, container, false);

         Button next = (Button) v.findViewById(R.id.button2);
         next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent it = new Intent(getActivity(), MainActivity6.class);
                startActivity(it);

                //Intent it = new Intent(getActivity(), MainActivity4.class);
                //startActivity(it);

            }
       });

        WebView idoso = (WebView)v.findViewById(R.id.webView);
        idoso.loadUrl("file:///android_asset/idoso.html");

        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}