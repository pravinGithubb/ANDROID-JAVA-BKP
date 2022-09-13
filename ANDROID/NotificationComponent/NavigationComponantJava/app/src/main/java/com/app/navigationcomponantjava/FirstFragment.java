package com.app.navigationcomponantjava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.app.navigationcomponantjava.model.User;


public class FirstFragment extends Fragment {


    Button btnClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnClick = view.findViewById(R.id.btn_click);


        //NavController navController = Navigation.findNavController(getActivity(), R.id.fragmentContainerView);
        NavDirections action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
                .setNum(123)
                .setUser(new User(1, "tops", "tops@gmail.com"))
                .setMessage("Tops Technologies");


        btnClick.setOnClickListener(view1 -> {
            //navController.navigate(R.id.action_firstFragment_to_secondFragment);
            Navigation.findNavController(view1).navigate(action);
        });

    }
}