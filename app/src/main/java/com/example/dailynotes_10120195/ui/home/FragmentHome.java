package com.example.dailynotes_10120195.ui.home;

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

import androidx.fragment.app.Fragment;

import com.example.dailynotes_10120195.R;

public class FragmentHome extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
