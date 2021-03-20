package edu.jsu.mcis.cs408.tablayoutdemo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;

import java.text.NumberFormat;

public class FragmentTwo extends Fragment implements TabFragment {

    private final String title = "Tip";
    private TextInputEditText totalB, tipP, numberP;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        totalB = (TextInputEditText) view.findViewById(R.id.totalBill);
        tipP = (TextInputEditText) view.findViewById(R.id.tipP);
        numberP = (TextInputEditText) view.findViewById(R.id.numberP);
        view.findViewById(R.id.buttonCalculate).setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
            double bill = Double.parseDouble(totalB.getText().toString());
            double tip = Double.parseDouble(tipP.getText().toString());
            double people = Double.parseDouble(numberP.getText().toString());
            double split = (double)((bill + (bill * tip / 100)) / people);

            int dollars = (int)split;
            double cents = (Math.ceil((split - dollars) * 100)) / 100;
            split = (double)((dollars + cents));

            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            String textOutput = currencyFormat.format(split);

            TextView output = (TextView) getView().findViewById(R.id.textOutput);
            output.setText("Calculated split: " + textOutput);
        }
    public String getTabTitle() { return title; }

}