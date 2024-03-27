package ru.omgtu.laba2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import ru.omgtu.laba2.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {
private FragmentBlankBinding bind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bind = FragmentBlankBinding.inflate(getLayoutInflater());
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    public void hi() {
        Toast tost = Toast.makeText(getContext(), bind.text.getText().toString(), Toast.LENGTH_SHORT);
        tost.show();
    }
}