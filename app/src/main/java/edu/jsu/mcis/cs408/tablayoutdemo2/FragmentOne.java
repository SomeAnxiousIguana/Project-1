package edu.jsu.mcis.cs408.tablayoutdemo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.lang.reflect.Field;

public class FragmentOne extends Fragment implements TabFragment {

    private final String title = "Calculator";
    private Calculator calculator;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        calculator = new Calculator(this);

        //Button iterator
        Field[] fields = R.id.class.getFields();
        for (int i = 0; i < fields.length; ++i) {
            String name = fields[i].getName();
            if (name.length() >= 3 && name.substring(0, 3).equals("btn")) {
                int id = getResources().getIdentifier(name, "id", getActivity().getPackageName());
                view.findViewById(id).setOnClickListener(this::onClick);
            }
        }
    }

    public void onClick(View v) {
        String button = ((Button) v).getText().toString();       // get input button text
        calculator.process(button);                              // pass input to Calculator for processing
        TextView display = getView().findViewById(R.id.display); // acquire reference to display TextView
        display.setText(calculator.getDisplay());                // show updated display buffer from Calculator
    }

    public String getTabTitle() { return title; }


}