package com.example.dmitr.a2lab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_add,container,false);

        Bundle bundle = getArguments();

        String Num1 = bundle.getString("Num1");
        String Num2 = bundle.getString("Num2");

        TextView Result =(TextView) rootView.findViewById(R.id.adding);

        int n1 = Integer.parseInt(Num1.toString());
        int n2 = Integer.parseInt(Num2.toString());

        Result.setText(String.valueOf(n1) + " + " + String.valueOf(n2) + " = " + String.valueOf(n1+n2));

        return rootView;
    }

}
