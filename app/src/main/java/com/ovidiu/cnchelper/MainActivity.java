package com.ovidiu.cnchelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText xstart;
    EditText xfinal;
    EditText zstart;
    EditText zfinal;
    TextView afisareUnghi;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xstart = (EditText) findViewById(R.id.x_start);
        xfinal = (EditText) findViewById(R.id.x_final);
        zstart = (EditText) findViewById(R.id.z_start);
        zfinal = (EditText) findViewById(R.id.z_final);
        afisareUnghi = (TextView) findViewById(R.id.afisare_unghi_txt);
        calculate = (Button) findViewById(R.id.calculate_btn);

    calculate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double xsc= Double.parseDouble(xstart.getText().toString());
            double xfc= Double.parseDouble(xfinal.getText().toString());
            double zsc= Double.parseDouble(zstart.getText().toString());
            double zfc= Double.parseDouble(zfinal.getText().toString());
            afisareUnghi.setText(Calculate(xsc,xfc,zsc,zfc));
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
}
