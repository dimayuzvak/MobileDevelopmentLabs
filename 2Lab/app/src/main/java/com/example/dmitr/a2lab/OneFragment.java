package com.example.dmitr.a2lab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {
    EditText num1, num2;
    Button addBtn, subBtn, mulBtn, divBtn;



    public OneFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one,container,false);

        num1 = (EditText) rootView.findViewById(R.id.num1);
        num2 = (EditText) rootView.findViewById(R.id.num2);
        addBtn= (Button) rootView.findViewById(R.id.addBtn);
        subBtn= (Button) rootView.findViewById(R.id.subBtn);
        mulBtn= (Button) rootView.findViewById(R.id.mulBtn);
        divBtn= (Button) rootView.findViewById(R.id.divBtn);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Num1", n1);
                bundle.putString("Num2", n2);

                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                AddFragment addFragment = new AddFragment();
                addFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frame_container,addFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Num1", n1);
                bundle.putString("Num2", n2);

                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SubtractFragment subtractFragment = new SubtractFragment();
                subtractFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frame_container,subtractFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Num1", n1);
                bundle.putString("Num2", n2);

                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                MultiplyFragment multiplyFragment = new MultiplyFragment();
                multiplyFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frame_container,multiplyFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("Num1", n1);
                bundle.putString("Num2", n2);

                android.support.v4.app.FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                DivideFragment divideFragment = new DivideFragment();
                divideFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.frame_container,divideFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return rootView;
    }

}
