package com.ovidiu.cnchelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    EditText xstart;
    EditText xfinal;
    EditText zstart;
    EditText zfinal;
    TextView afisareUnghi;
    Button calculateBtn;
    Button plusBtn;
    Button minusBtn;
    ToggleButton toggleBtn;
    ToggleButton incZO;
    ToggleButton incZZO;
    ToggleButton incZZZO;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xstart = (EditText) findViewById(R.id.x_start);
        xfinal = (EditText) findViewById(R.id.x_final);
        zstart = (EditText) findViewById(R.id.z_start);
        zfinal = (EditText) findViewById(R.id.z_final);
        afisareUnghi = (TextView) findViewById(R.id.afisare_unghi_txt);
        calculateBtn = (Button) findViewById(R.id.calculate_btn);
        plusBtn = (Button) findViewById(R.id.plus_button);
        minusBtn = (Button) findViewById(R.id.minus_button);
        toggleBtn = (ToggleButton) findViewById(R.id.toggle_btn);
        incZO = (ToggleButton) findViewById(R.id.inczo_btn);
        incZZO= (ToggleButton) findViewById(R.id.inczzo_btn);
        incZZZO = (ToggleButton) findViewById(R.id.inczzzo_btn);

    calculateBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double xsc= Double.parseDouble(xstart.getText().toString());
            double xfc= Double.parseDouble(xfinal.getText().toString());
            double zsc= Double.parseDouble(zstart.getText().toString());
            double zfc= Double.parseDouble(zfinal.getText().toString());
            afisareUnghi.setText(Calculate(xsc,xfc,zsc,zfc));
        }
    });
    plusBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean stareButon = toggleBtn.isChecked();
            double aa = Double.parseDouble(xstart.getText().toString());
            if (stareButon){

                xstart.setText(Increment(aa));
                double xsc= Double.parseDouble(xstart.getText().toString());
                double xfc= Double.parseDouble(xfinal.getText().toString());
                double zsc= Double.parseDouble(zstart.getText().toString());
                double zfc= Double.parseDouble(zfinal.getText().toString());
                afisareUnghi.setText(Calculate(xsc,xfc,zsc,zfc));

            }
        }
    });
    minusBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
    }


    public String Calculate(double xs,double xf,double zs,double zf){
        double param, result;
        param = ((xf-xs)/2)/(zf-zs);
        result = Math.atan(param) * 180 / 3.14159265;
        int degree = (int) result;
        int minutes = (int) ( (result - (double)degree) * 60.0);
        int seconds = (int) ( (result - (double)degree - (double)minutes / 60.0) * 60.0 * 60.0 );
        return "Decimal Degrees: " + result +"°" + "\n"
                + "Degrees Minutes Seconds: "+ degree +"° " + minutes + "' " + seconds + "'' ";
    }
    public String Increment (double nr) {
        boolean stareinc01 = incZO.isChecked();
        boolean stareinc001 = incZZO.isChecked();
        boolean stareinc0001 = incZZZO.isChecked();
        if (stareinc01 == true && stareinc001 == true && stareinc0001 == true) {
            return " " + (nr + 0.1 + 0.01 + 0.001);
        } else if (stareinc01 == true && stareinc001 == true) {
            return " " + (nr + 0.1 + 0.01);
        } else if (stareinc01 == true && stareinc0001 == true) {
            return " " + (nr + 0.1 + 0.001);
        } else if (stareinc001 == true && stareinc0001 == true) {
            return " " + (nr + 0.01 + 0.001);
        } else if (stareinc01 == true) {
            return " " + (nr + 0.1);
        } else if (stareinc001 == true){
            return " " + (nr + 0.01);
        } else if (stareinc0001 == true){
            return " " + (nr + 0.001);
        }
          else return "error";
    }
    public String Decrement (double nr) {
        boolean stareinc01 = incZO.isChecked();
        boolean stareinc001 = incZZO.isChecked();
        boolean stareinc0001 = incZZZO.isChecked();
        if (stareinc01 == true && stareinc001 == true && stareinc0001 == true) {
            return " " + (nr - 0.1 - 0.01 - 0.001);
        } else if (stareinc01 == true && stareinc001 == true) {
            return " " + (nr - 0.1 - 0.01);
        } else if (stareinc01 == true && stareinc0001 == true) {
            return " " + (nr - 0.1 - 0.001);
        } else if (stareinc001 == true && stareinc0001 == true) {
            return " " + (nr - 0.01 - 0.001);
        } else if (stareinc01 == true) {
            return " " + (nr - 0.1);
        } else if (stareinc001 == true){
            return " " + (nr - 0.01);
        } else if (stareinc0001 == true){
            return " " + (nr - 0.001);
        }
        else return "error";
    }
}
