package com.example.aluno.projetoz1k4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Conversor extends AppCompatActivity {
    Spinner Conversor;
    Spinner Convertido;
    Spinner Tipo;

    ArrayList<String> tipo = new ArrayList<String>();
    ArrayList<String> moeda = new ArrayList<String>();
    ArrayList<String> peso = new ArrayList<String>();
    ArrayList<String> temperatura = new ArrayList<String>();
    ArrayList<String> comprimento = new ArrayList<String>();
    ArrayList<String> pressao = new ArrayList<String>();

    EditText n1;
    TextView n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        Conversor = (Spinner) findViewById(R.id.unidadeConversor);
        Convertido = (Spinner) findViewById(R.id.unidadeConvertido);
        Tipo = (Spinner) findViewById(R.id.tipo);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (TextView) findViewById(R.id.n2);

        fillarray();

        Tipo.setAdapter(new ArrayAdapter<String>(Conversor.this, android.R.layout.simple_dropdown_item_1line, tipo));

        Tipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long arg3) {
                if (pos == 0) {
                    Conversor.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, moeda));
                    Convertido.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, moeda));
                } else if(pos == 1){
                    Conversor.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, peso));
                    Convertido.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, peso));
                }else if(pos == 2){
                    Conversor.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, temperatura));
                    Convertido.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, temperatura));
                }else if(pos == 3){
                    Conversor.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, comprimento));
                    Convertido.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, comprimento));
                }else if(pos == 4){
                    Conversor.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, pressao));
                    Convertido.setAdapter(new ArrayAdapter<String>(
                            Conversor.this, android.R.layout.simple_dropdown_item_1line, pressao));
                }
            }

            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    private void fillarray() {
        tipo.clear();
        tipo.add("Moeda (04/09/17)");
        tipo.add("Peso");
        tipo.add("Temperatura");
        tipo.add("Comprimento");
        tipo.add("Pressão");

        moeda.clear();
        moeda.add("Real");
        moeda.add("Dólar");
        moeda.add("Euro");
        moeda.add("Iene");
        moeda.add("Libra");

        peso.clear();
        peso.add("T");
        peso.add("Kg");
        peso.add("Lb");
        peso.add("g");
        peso.add("Mg");

        temperatura.clear();
        temperatura.add("ºC");
        temperatura.add("ºF");
        temperatura.add("ºK");
        temperatura.add("ºR");
        temperatura.add("ºN");

        comprimento.clear();
        comprimento.add("Km");
        comprimento.add("Mi");
        comprimento.add("m");
        comprimento.add("Cm");
        comprimento.add("Mm");

        pressao.clear();
        pressao.add("Pa");
        pressao.add("mmHg");
        pressao.add("Atm");
        pressao.add("Bar");
        pressao.add("PSI");
    }

    public void Converter(View v){
        Integer tipo = Tipo.getSelectedItemPosition();
        Integer conversor = Conversor.getSelectedItemPosition();
        Integer convertido = Convertido.getSelectedItemPosition();
        Double valor1 = Double.parseDouble(n1.getText().toString().trim());
        DecimalFormat formato = new DecimalFormat("0.00");
        Double valor2 = 0.00;

        if(tipo == 0){
            //Se tipo se referir a moeda
            switch(conversor){
                //procurar o valor de conversor
                case 0:  //se o conversor for "Real"
                    switch(convertido){
                        case 0:  //se o convertido for Real
                            valor2 = valor1;
                            break;
                        case 1:  //se o convertido for Dólar
                            valor2 = valor1 * 0.31837;
                            break;
                        case 2:  //se o convertido for Euro
                            valor2 = valor1 * 0.267616526;
                            break;
                        case 3:  //se o convertido for Iene
                            valor2 = valor1 * 34.9204782;
                            break;
                        case 4: //se o convertido for Libra
                            valor2 = valor1 * 0.246168716;
                            break;
                    }
                    break;
                case 1:  //se o conversor for "Dólar"
                    switch(convertido){
                        case 0:  //se o convertido for Real
                            valor2 = valor1 * 3.14099947;
                            break;
                        case 1:  //se o convertido for Dólar
                            valor2 = valor1;
                            break;
                        case 2:  //se o convertido for Euro
                            valor2 = valor1 * 0.840583365;
                            break;
                        case 3:  //se o convertido for Iene
                            valor2 = valor1 * 109.685203;
                            break;
                        case 4:  //se o convertido for Libras
                            valor2 = valor1 * 0.773215805;
                            break;
                    }
                    break;
                case 2:  //se o conversor for "Euro"
                    switch(convertido){
                        case 0:  //se o convertido for Real
                            valor2 = valor1 * 3.73669001;
                            break;
                        case 1:  //se o convertido for Dólar
                            valor2 = valor1 * 1.18965;
                            break;
                        case 2:  //se o convertido for Euro
                            valor2 = valor1;
                            break;
                        case 3:  //se o convertido for Iene
                            valor2 = valor1 * 130.487002;
                            break;
                        case 4:  //se o convertido for Libras
                            valor2 = valor1 * 0.919856182;
                            break;
                    }
                    break;
                case 3:  //se o conversor for "Iene"
                    switch(convertido){
                        case 0:  //se o convertido for Real
                            valor2 = valor1 * 0.0286364921;
                            break;
                        case 1:  //se o convertido for Dólar
                            valor2 = valor1 * 0.009117;
                            break;
                        case 2:  //se o convertido for Euro
                            valor2 = valor1 * 0.00766359854;
                            break;
                        case 3:  //se o convertido for Iene
                            valor2 = valor1;
                            break;
                        case 4:  //se o convertido for Libras
                            valor2 = valor1 * 0.00704940849;
                            break;
                    }
                    break;
                case 4:  //se o conversor for "Libras"
                    switch(convertido){
                        case 0:  //se o convertido for Real
                            valor2 = valor1 * 4.06225461;
                            break;
                        case 1:  //se o convertido for Dólar
                            valor2 = valor1 * 1.2933;
                            break;
                        case 2:  //se o convertido for Euro
                            valor2 = valor1 * 1.08712647;
                            break;
                        case 3:  //se o convertido for Iene
                            valor2 = valor1 * 141.855874;
                            break;
                        case 4:  //se o convertido for Libras
                            valor2 = valor1;
                            break;
                    }
                    break;
            }
            n2.setText(formato.format(valor2));
        }
        if(tipo == 1){
            //se tipo se referir a peso
            switch(conversor){
                case 0:  //se o conversor for Toneladas
                    switch(convertido){
                        case 0:  //se o convertido for Toneladas
                            valor2 = valor1;
                            break;
                        case 1:  //se o convertido for Quilogramas
                            valor2 = valor1 * 1000;
                            break;
                        case 2:  //se o formato for Libras
                            valor2 = valor1 * 2204.62;
                            break;
                        case 3:  //se o formato for Gramas
                            valor2 = valor1 * 1000000;
                            break;
                        case 4:  //se o formato for Miligramas
                            valor2 = valor1 * 1000000000;
                            break;
                    }
                    break;
                case 1:  //se o conversor for KG
                    switch(convertido){
                        case 0:  //toneladas
                            valor2 = valor1 * 0.001;
                            break;
                        case 1:  //quilogramas
                            valor2 = valor1;
                            break;
                        case 2:  //libras
                            valor2 = valor1 * 2.20462;
                            break;
                        case 3:  //gramas
                            valor2 = valor1 * 1000;
                            break;
                        case 4:  //miligramas
                            valor2 = valor1 * 1000000;
                            break;
                    }
                    break;
                case 2:  //se o conversor for lb
                    switch(convertido){
                        case 0:  //toneladas
                            valor2 = valor1 * 0.000453592;
                            break;
                        case 1:  //quilogramas
                            valor2 = valor1 * 0.453592;
                            break;
                        case 2:  //libras
                            valor2 = valor1;
                            break;
                        case 3:  //gramas
                            valor2 = valor1 * 453.592;
                            break;
                        case 4:  //miligramas
                            valor2 = valor1 * 453592;
                            break;
                    }
                    break;
                case 3:  //se o convertido for g
                    switch(convertido){
                        case 0:  //toneladas
                            valor2 = valor1 * 0.000001;
                            break;
                        case 1:  //quilogramas
                            valor2 = valor1 * 0.001;
                            break;
                        case 2:  //libras
                            valor2 = valor1 * 0.00220462;
                            break;
                        case 3:  //gramas
                            valor2 = valor1;
                            break;
                        case 4:  //miligramas
                            valor2 = valor1 * 1000;
                            break;
                    }
                    break;
                case 4: //se o conversor for mg
                    switch(convertido){
                        case 0:  //toneladas
                            valor2 = valor1 * 0.000000001;
                            break;
                        case 1:  //quilogramas
                            valor2 = valor1 * 0.000001;
                            break;
                        case 2:  //libras
                            valor2 = valor1 * 0.0000022046;
                            break;
                        case 3:  //gramas
                            valor2 = valor1 * 0.001;
                            break;
                        case 4:  //miligramas
                            valor2 = valor1;
                            break;
                    }
                    break;
            }
            n2.setText(formato.format(valor2));
        }
        if(tipo == 2){
            //se tipo se referir a temperatura
            switch(conversor){
                case 0:  //se o conversor for ºC
                    switch(convertido){
                        case 0:  //para ºC
                            valor2 = valor1;
                            break;
                        case 1:  //para ºF
                            valor2 = (valor1 * 1.8) + 32;
                            break;
                        case 2:  //para ºK
                            valor2 = valor1 + 273.15;
                            break;
                        case 3:  //para ºR
                            valor2 = (valor1 + 273.15) * 1.8;
                            break;
                        case 4:  //para ºN
                            valor2 = valor1 * 0.33;
                            break;
                    }
                    break;
                case 1:  //se o conversor for ºF
                    switch(convertido){
                        case 0:  //para ºC
                            valor2 = (valor1 - 32) * (5/9);
                            break;
                        case 1:  //para ºF
                            valor2 = valor1;
                            break;
                        case 2:  //para ºK
                            valor2 = (valor1 + 459.67) * (5/9);
                            break;
                        case 3:  //para ºR
                            valor2 = valor1 + 459.67;
                            break;
                        case 4:  //para ºN
                            valor2 = (valor1 - 32) * (11/60);
                            break;
                    }
                    break;
                case 2:  //se o conversor for ºK
                    switch(convertido){
                        case 0:  //para ºC
                            valor2 = valor1 - 273.15;
                            break;
                        case 1:  //para ºF
                            valor2 = (valor1 * (9/5)) - 459.67;
                            break;
                        case 2:  //para ºK
                            valor2 = valor1;
                            break;
                        case 3:  //para ºR
                            valor2 = valor1 * (9/5);
                            break;
                        case 4:  //para ºN
                            valor2 = (valor1 - 273.15) * 0.33;
                            break;
                    }
                    break;
                case 3:  //se o conversor for ºR
                    switch(convertido){
                        case 0:  //para ºC
                            valor2 = (valor1 / 1.8) - 273.15;
                            break;
                        case 1:  //para ºF
                            valor2 = valor1 - 459.67;
                            break;
                        case 2:  //para ºK
                            valor2 = valor1 * (5/9);
                            break;
                        case 3:  //para ºR
                            valor2 = valor1;
                            break;
                        case 4:  //para ºN
                            valor2 = (valor1 * - 491.67) * (11/60);
                            break;
                    }
                    break;
                case 4:  //se o conversor for ºN
                    switch(convertido){
                        case 0:  //para ºC
                            valor2 = valor1 * (100/33);
                            break;
                        case 1:  //para ºF
                            valor2 = (valor1 * 60/11) + 32;
                            break;
                        case 2:  //para ºK
                            valor2 = (valor1 * 100/33) + 273.15;
                            break;
                        case 3:  //para ºR
                            valor2 = (valor1 * (60/11)) + 491.67;
                            break;
                        case 4:  //para ºN
                            valor2 = valor1;
                            break;
                    }
                    break;
            }
            n2.setText(formato.format(valor2));
        }
        if(tipo==3){
            //se tipo se referir a comprimento
            switch(conversor){
                case 0:  //se o conversor for quilometros
                    switch(convertido){
                        case 0:  //quilometros
                            valor2 = valor1;
                            break;
                        case 1:  //milhas
                            valor2 = valor1 * 0.621371;
                            break;
                        case 2:  //metros
                            valor2 = valor1 * 1000;
                            break;
                        case 3:  //centimetros
                            valor2 = valor1 * 100000;
                            break;
                        case 4:  //milimetros
                            valor2 = valor1 * 1000000;
                            break;
                    }
                    break;
                case 1:  //se o conversor for milhas
                    switch(convertido){
                        case 0:  //quilometros
                            valor2 = valor1 * 1.60934;
                            break;
                        case 1:  //milhas
                            valor2 = valor1;
                            break;
                        case 2:  //metros
                            valor2 = valor1 * 1609.34;
                            break;
                        case 3:  //centimetros
                            valor2 = valor1 * 160934;
                            break;
                        case 4:  //milimetros
                            valor2 = valor1 * 1609344;
                            break;
                    }
                    break;
                case 2:  //se o conversor for metros
                    switch(convertido){
                        case 0:  //quilometros
                            valor2 = valor1 * 0.001;
                            break;
                        case 1:  //milhas
                            valor2 = valor1 * 0.000621371;
                            break;
                        case 2:  //metros
                            valor2 = valor1;
                            break;
                        case 3:  //centimetros
                            valor2 = valor1 * 100;
                            break;
                        case 4:  //milimetros
                            valor2 = valor1 * 1000;
                            break;
                    }
                    break;
                case 3:  //se o conversor for centimetros
                    switch(convertido){
                        case 0:  //quilometros
                            valor2 = valor1 * 0.00001;
                            break;
                        case 1:  //milhas
                            valor2 = valor1 * 0.0000062137;
                            break;
                        case 2:  //metros
                            valor2 = valor1 * 0.01;
                            break;
                        case 3:  //centimetros
                            valor2 = valor1;
                            break;
                        case 4:  //milimetros
                            valor2 = valor1 * 10;
                            break;
                    }
                    break;
                case 4:  //se o conversor for milimetros
                    switch(convertido){
                        case 0:  //quilometros
                            valor2 = valor1 * 0.000001;
                            break;
                        case 1:  //milhas
                            valor2 = valor1 * 0.00000062137;
                            break;
                        case 2:  //metros
                            valor2 = valor1 * 0.001;
                            break;
                        case 3:  //centimetros
                            valor2 = valor1 * 0.1;
                            break;
                        case 4:  //milimetros
                            valor2 = valor1;
                            break;
                    }
                    break;
            }
            n2.setText(formato.format(valor2));
        }
        if(tipo==4){
            //se tipo se referir a pressão
            switch(conversor){
                case 0:  //se o conversor se referir a pascal
                    switch(convertido){
                        case 0:  //pascal
                            valor2 = valor1;
                            break;
                        case 1:  //mmHg
                            valor2 = valor1 * 0.007501;
                            break;
                        case 2:  //atm
                            valor2 = valor1 * 0.0000098692;
                            break;
                        case 3:  //bar
                            valor2 = valor1 * 0.00001;
                            break;
                        case 4:  //psi
                            valor2 = valor1 * 0.000145038;
                            break;
                    }
                    break;
                case 1:  //se o conversor se referir a mmHg
                    switch(convertido){
                        case 0:  //pascal
                            valor2 = valor1 * 133.315558;
                            break;
                        case 1:  //mmHg
                            valor2 = valor1;
                            break;
                        case 2:  //atm
                            valor2 = valor1 * 0.001316;
                            break;
                        case 3:  //bar
                            valor2 = valor1 * 0.001333;
                            break;
                        case 4:  //psi
                            valor2 = valor1 * 0.019336777871316;
                            break;
                    }
                    break;
                case 2:  //se o conversor se referir a atm
                    switch(convertido){
                        case 0:  //pascal
                            valor2 = valor1 * 101325;
                            break;
                        case 1:  //mmHg
                            valor2 = valor1 * 760;
                            break;
                        case 2:  //atm
                            valor2 = valor1;
                            break;
                        case 3:  //bar
                            valor2 = valor1 * 1.01325;
                            break;
                        case 4:  //psi
                            valor2 = valor1 * 14.6959;
                            break;
                    }
                    break;
                case 3:  //se o conversor se referir a bar
                    switch(convertido){
                        case 0:  //pascal
                            valor2 = valor1 * 100000;
                            break;
                        case 1:  //mmHg
                            valor2 = valor1 * 750.0615613026439;
                            break;
                        case 2:  //atm
                            valor2 = valor1 * 0.986923;
                            break;
                        case 3:  //bar
                            valor2 = valor1;
                            break;
                        case 4:  //psi
                            valor2 = valor1 * 14.5038;
                            break;
                    }
                    break;
                case 4:  //se o conversor se referir a psi
                    switch(convertido){
                        case 0:  //pascal
                            valor2 = valor1 * 6894.76;
                            break;
                        case 1:  //mmHg
                            valor2 = valor1 * 51.714924102396;
                            break;
                        case 2:  //atm
                            valor2 = valor1 * 0.068046;
                            break;
                        case 3:  //bar
                            valor2 = valor1 * 0.0689476;
                            break;
                        case 4:  //psi
                            valor2 = valor1;
                            break;
                    }
                    break;
            }
            n2.setText(formato.format(valor2));
        }
    }
}
