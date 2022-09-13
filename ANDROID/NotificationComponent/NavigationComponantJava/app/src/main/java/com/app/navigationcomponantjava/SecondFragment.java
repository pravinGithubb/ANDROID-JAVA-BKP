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
import android.widget.TextView;

import com.app.navigationcomponantjava.model.User;


public class SecondFragment extends Fragment {

    Button btnClick;
    TextView tvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnClick = view.findViewById(R.id.btn_click);
        tvResult = view.findViewById(R.id.tv_result);
        //NavController navController = Navigation.findNavController(getActivity(), R.id.fragmentContainerView);
        int num = SecondFragmentArgs.fromBundle(getArguments()).getNum();
        String message = SecondFragmentArgs.fromBundle(getArguments()).getMessage();
        User user = SecondFragmentArgs.fromBundle(getArguments()).getUser();

        tvResult.setText(num +"\n"+message+"\n"+user.getEmail());

        NavDirections action = SecondFragmentDirections.actionSecondFragmentToFirstFragment();

        btnClick.setOnClickListener(view1 -> {
            //navController.navigate(R.id.action_secondFragment_to_firstFragment);
            Navigation.findNavController(view1).navigate(action);

        });

    }
}