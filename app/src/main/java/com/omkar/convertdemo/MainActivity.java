package com.omkar.convertdemo;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle ntoggle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ntoggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(ntoggle);
        ntoggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final EditText tv1 = (EditText)findViewById(R.id.tv1);
        final EditText tv2 = (EditText) findViewById(R.id.tv2);

        RadioGroup r1 = (RadioGroup) findViewById(R.id.fromradio);
        RadioGroup r2 = (RadioGroup) findViewById(R.id.toradio);
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                double origin;
                TextView ed1 = (TextView) findViewById(R.id.header_text_unit_from);
                TextView ed2 = (TextView) findViewById(R.id.header_text_unit_to);
                RadioGroup r1 = (RadioGroup) findViewById(R.id.fromradio);
                RadioGroup r2 = (RadioGroup) findViewById(R.id.toradio);

                int fromid = r1.getCheckedRadioButtonId();
                int toid = r2.getCheckedRadioButtonId();
                RadioButton fr = (RadioButton) findViewById(fromid);
                RadioButton to = (RadioButton) findViewById(toid);
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
                TextView ed1 = (TextView) findViewById(R.id.header_text_unit_from);
                TextView ed2 = (TextView) findViewById(R.id.header_text_unit_to);
                RadioGroup r1 = (RadioGroup) findViewById(R.id.fromradio);
                RadioGroup r2 = (RadioGroup) findViewById(R.id.toradio);

                int fromid = r1.getCheckedRadioButtonId();
                int toid = r2.getCheckedRadioButtonId();
                RadioButton fr = (RadioButton) findViewById(fromid);
                RadioButton to = (RadioButton) findViewById(toid);
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
        double converted=0.0;
        final EditText tv1 = (EditText)findViewById(R.id.tv1);
        final EditText tv2 = (EditText) findViewById(R.id.tv2);
        RadioGroup r1 = (RadioGroup) findViewById(R.id.fromradio);
        final RadioGroup r2 = (RadioGroup) findViewById(R.id.toradio);

        int from = r1.indexOfChild(findViewById(r1.getCheckedRadioButtonId()));
        int to = r2.indexOfChild(findViewById(r2.getCheckedRadioButtonId()));
        int selectedId = r1.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(ntoggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment fragment = null;
        int id = item.getItemId();

        if (id == R.id.drawer_area) {
            // Handle the camera action
            fragment = new AreaFragment();
        } else if (id == R.id.drawer_cooking) {

        } else if (id == R.id.drawer_currency) {

        } else if (id == R.id.drawer_energy) {

        } else if (id == R.id.drawer_fuel) {

        } else if (id == R.id.drawer_length) {

        }

        if(fragment != null){

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.drawer, fragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
