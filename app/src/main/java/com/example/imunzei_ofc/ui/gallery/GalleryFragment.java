package com.example.imunzei_ofc.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.imunzei_ofc.R;
import com.example.imunzei_ofc.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       // GalleryViewModel galleryViewModel =
      //          new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View v = inflater.inflate(R.layout.fragment_gallery, container, false);


       /*/ Button next = (Button) v.findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Fragment gest = new fragment_gestantes2();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_content_main, gest);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                //Intent it = new Intent(getActivity(), MainActivity4.class);
                //startActivity(it);

            }
       });/*/
        WebView comecar = (WebView)v.findViewById(R.id.webView2);

        comecar.loadUrl("file:///android_asset/gestante.html");




        return v;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}