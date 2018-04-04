package com.omkar.convertdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by omkar on 15/3/18.
 */

public class AreaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_area, null);

    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText tv1 = (EditText)view.findViewById(R.id.tv1);
        final EditText tv2 = (EditText) view.findViewById(R.id.tv2);

        RadioGroup r1 = (RadioGroup) view.findViewById(R.id.fromradio);
        RadioGroup r2 = (RadioGroup) view.findViewById(R.id.toradio);
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                double origin;
                TextView ed1 = (TextView) view.findViewById(R.id.header_text_unit_from);
                TextView ed2 = (TextView) view.findViewById(R.id.header_text_unit_to);
                RadioGroup r1 = (RadioGroup) view.findViewById(R.id.fromradio);
                RadioGroup r2 = (RadioGroup) view.findViewById(R.id.toradio);

                int fromid = r1.getCheckedRadioButtonId();
                int toid = r2.getCheckedRadioButtonId();
                RadioButton fr = (RadioButton) view.findViewById(fromid);
                RadioButton to = (RadioButton) view.findViewById(toid);
                String fro = fr.getText().toString();
                String tos = to.getText().toString();
                ed1.setText(fro);
                ed2.setText(tos);

                final String myStr = tv1.getText().toString();
                if(!myStr.isEmpty()) {
                    origin = Double.parseDouble(myStr);
                }else{
                    origin = 0.0;
                }

                convert(origin);

            }
        });
        r2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                double origin;
                TextView ed1 = (TextView) view.findViewById(R.id.header_text_unit_from);
                TextView ed2 = (TextView) view.findViewById(R.id.header_text_unit_to);
                RadioGroup r1 = (RadioGroup) view.findViewById(R.id.fromradio);
                RadioGroup r2 = (RadioGroup) view.findViewById(R.id.toradio);

                int fromid = r1.getCheckedRadioButtonId();
                int toid = r2.getCheckedRadioButtonId();
                RadioButton fr = (RadioButton) view.findViewById(fromid);
                RadioButton to = (RadioButton) view.findViewById(toid);
                String fro = fr.getText().toString();
                String tos = to.getText().toString();
                ed1.setText(fro);
                ed2.setText(tos);

                final String myStr = tv1.getText().toString();
                if(!myStr.isEmpty()) {
                    origin = Double.parseDouble(myStr);
                }else{
                    origin = 0.0;
                }

                convert(origin);

            }
        });



        tv1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void afterTextChanged(Editable editable) {

                double origin;

                final String myStr = tv1.getText().toString();
                if(!myStr.isEmpty()) {
                    origin = Double.parseDouble(myStr);
                }else{
                    origin = 0.0;
                }

                convert(origin);



            }


        });
    }

    private void convert(double origin) {
         EditText tv1;
         EditText tv2;
        double converted=0.0;
          tv1 = (EditText) getActivity().findViewById(R.id.tv1);
          tv2 = (EditText) getActivity().findViewById(R.id.tv2);
        RadioGroup r1 = (RadioGroup) getActivity().findViewById(R.id.fromradio);
        RadioGroup r2 = (RadioGroup) getActivity().findViewById(R.id.toradio);

        int from = r1.indexOfChild(getActivity().findViewById(r1.getCheckedRadioButtonId()));
        int to = r2.indexOfChild(getActivity().findViewById(r2.getCheckedRadioButtonId()));
        int selectedId = r1.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) getActivity().findViewById(selectedId);

        switch(from){
            case 0: {
                switch (to) {
                    case 0:
                        converted = origin;
                        break;
                    case 1:
                        converted = 64.96 * origin;
                        break;
                    case 2:
                        converted = 0.72 * origin;
                        break;
                    case 3:
                        converted = 0.81 * origin;
                        break;
                    case 4:
                        converted = 6.33 * origin;
                        break;
                    case 5:
                        converted = 106.54 * origin;
                        break;
                };
                break;
            }
            case 1: {
                switch (to) {
                    case 0:
                        converted = 0.015 * origin;
                        break;
                    case 1:
                        converted = origin;
                        break;
                    case 2:
                        converted = 0.011 * origin;
                        break;
                    case 3:
                        converted = 0.012 * origin;
                        break;
                    case 4:
                        converted = 0.097 * origin;
                        break;
                    case 5:
                        converted = 1.64 * origin;
                        break;
                };
                break;
            }
            case 2: {
                switch (to) {
                    case 0:
                        converted = 1.39 * origin;
                        break;
                    case 1:
                        converted = 88.85 * origin;
                        break;
                    case 2:
                        converted = origin;
                        break;
                    case 3:
                        converted = 1.12 * origin;
                        break;
                    case 4:
                        converted = 8.79 * origin;
                        break;
                    case 5:
                        converted = 148.69 * origin;
                        break;
                };
                break;
            }
            case 3: {
                switch (to) {
                    case 0:
                        converted = 1.23 * origin;
                        break;
                    case 1:
                        converted = 79.11 * origin;
                        break;
                    case 2:
                        converted = 0.89 * origin;
                        break;
                    case 3:
                        converted = origin;
                        break;
                    case 4:
                        converted = 7.83 * origin;
                        break;
                    case 5:
                        converted = 132.4 * origin;
                        break;
                };
                break;
            }
            case 4: {
                switch (to) {
                    case 0:
                        converted = 0.157 * origin;
                        break;
                    case 1:
                        converted = 10.27 * origin;
                        break;
                    case 2:
                        converted = 0.11 * origin;
                        break;
                    case 3:
                        converted = 0.13 * origin;
                        break;
                    case 4:
                        converted = origin;
                        break;
                    case 5:
                        converted = 16.82 * origin;
                        break;
                };
                break;
            }
            case 5: {
                switch (to) {
                    case 0:
                        converted = 0.012 * origin;
                        break;
                    case 1:
                        converted = 0.61 * origin;
                        break;
                    case 2:
                        converted = 0.0068 * origin;
                        break;
                    case 3:
                        converted = 0.0076 * origin;
                        break;
                    case 4:
                        converted = 0.059 * origin;
                        break;
                    case 5:
                        converted = origin;
                        break;
                };
                break;
            }
            default: converted = 12.00 * origin;
                break;
        }

        tv2.setText(Double.toString(converted));


    }

    }

