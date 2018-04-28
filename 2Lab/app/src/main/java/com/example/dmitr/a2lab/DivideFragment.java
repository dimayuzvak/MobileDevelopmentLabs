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
public class DivideFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_divide,container,false);

        Bundle bundle = getArguments();

        String Num1 = bundle.getString("Num1");
        String Num2 = bundle.getString("Num2");

        TextView Result =(TextView) rootView.findViewById(R.id.dividing);

        Float f1 = Float.parseFloat(Num1.toString());
        Float f2 = Float.parseFloat(Num2.toString());

        Result.setText(String.valueOf(f1) + " / " + String.valueOf(f2) + " = " + String.valueOf(f1/f2));
        return rootView;
    }

}
