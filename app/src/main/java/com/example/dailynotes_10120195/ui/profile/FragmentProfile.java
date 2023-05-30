package com.example.dailynotes_10120195.ui.profile;

/*
 * NIM : 10120195
 *Nama : Muhammad Raihan Firdaus
 *Kelas : IF5
 *Email : raihan.10120195@mahasiswa.unikom.ac.id
 * */



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.dailynotes_10120195.DialogAbout;
import com.example.dailynotes_10120195.R;

public class FragmentProfile extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Putri Silva Amrillah");
        });

        return root;
    }
}

