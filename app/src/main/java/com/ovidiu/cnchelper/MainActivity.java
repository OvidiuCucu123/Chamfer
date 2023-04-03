package com.ovidiu.cnchelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
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
    TextView afisareUnghiAlfa;
    TextView afisareUnghiBeta;
    TextView afisareCatHyp;
    Button calculateBtn;
    Button resetBtn;
    Button plusBtn;
    Button plusBtn2;
    Button plusBtn3;
    Button plusBtn4;
    Button minusBtn;
    Button minusBtn2;
    Button minusBtn3;
    Button minusBtn4;
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
        afisareUnghiAlfa = (TextView) findViewById(R.id.afisare_unghi_alfa_txt);
        afisareUnghiBeta =(TextView) findViewById(R.id.afisare_unghi_beta_txt);
        afisareCatHyp = (TextView) findViewById(R.id.afisare_cat_hyp_txt);
        calculateBtn = (Button) findViewById(R.id.calculate_btn);
        resetBtn = (Button) findViewById(R.id.reset_btn);
        plusBtn = (Button) findViewById(R.id.plus_button1);
        plusBtn2 = (Button) findViewById(R.id.plus_button2);
        plusBtn3 = (Button) findViewById(R.id.plus_button3);
        plusBtn4 = (Button) findViewById(R.id.plus_button4);
        minusBtn = (Button) findViewById(R.id.minus_button1);
        minusBtn2 = (Button) findViewById(R.id.minus_button2);
        minusBtn3 = (Button) findViewById(R.id.minus_button3);
        minusBtn4 = (Button) findViewById(R.id.minus_button4);
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
            afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
            afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
            afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
        }
    });

    resetBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            xstart.setText(ResetareCampuri());
            xfinal.setText(ResetareCampuri());
            zstart.setText(ResetareCampuri());
            zfinal.setText(ResetareCampuri());
            afisareCatHyp.setText(ResetareCampuri());
            afisareUnghiAlfa.setText(ResetareCampuri());
            afisareUnghiBeta.setText(ResetareCampuri());
        }
    });

    plusBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //afisareCatHyp.setText("15");
            boolean stareButon = toggleBtn.isChecked();
            double aa = Double.parseDouble(xstart.getText().toString());
            if (stareButon){
                xstart.setText(Increment(aa));
                double xsc= Double.parseDouble(xstart.getText().toString());
                double xfc= Double.parseDouble(xfinal.getText().toString());
                double zsc= Double.parseDouble(zstart.getText().toString());
                double zfc= Double.parseDouble(zfinal.getText().toString());
                afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
            }

        }
    });

    plusBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(xfinal.getText().toString());
                if (stareButon){
                    xfinal.setText(Increment(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
    });

    plusBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(zstart.getText().toString());
                if (stareButon){
                    zstart.setText(Increment(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
    });

    plusBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(zfinal.getText().toString());
                if (stareButon){
                    zfinal.setText(Increment(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
    });

    minusBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            boolean stareButon = toggleBtn.isChecked();
            double aa = Double.parseDouble(xstart.getText().toString());
            if (stareButon){
                xstart.setText(Decrement(aa));
                double xsc= Double.parseDouble(xstart.getText().toString());
                double xfc= Double.parseDouble(xfinal.getText().toString());
                double zsc= Double.parseDouble(zstart.getText().toString());
                double zfc= Double.parseDouble(zfinal.getText().toString());
                afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
            }
        }
    });

    minusBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(xfinal.getText().toString());
                if (stareButon){
                    xfinal.setText(Decrement(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
    });

    minusBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(zstart.getText().toString());
                if (stareButon){
                    zstart.setText(Decrement(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
        });

    minusBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean stareButon = toggleBtn.isChecked();
                double aa = Double.parseDouble(zfinal.getText().toString());
                if (stareButon){
                    zfinal.setText(Decrement(aa));
                    double xsc= Double.parseDouble(xstart.getText().toString());
                    double xfc= Double.parseDouble(xfinal.getText().toString());
                    double zsc= Double.parseDouble(zstart.getText().toString());
                    double zfc= Double.parseDouble(zfinal.getText().toString());
                    afisareCatHyp.setText(CalculateCatHyp(xsc,xfc,zsc,zfc));
                    afisareUnghiAlfa.setText(CalculateAlfa(xsc,xfc,zsc,zfc));
                    afisareUnghiBeta.setText(CalculateBeta(xsc,xfc,zsc,zfc));
                }
            }
    });
    }
    public String ResetareCampuri(){
        return "";
    }

    public String CalculateCatHyp(double xs,double xf,double zs,double zf){
        double a, b, c;
        a = (xf-xs)/2;
        b = zf-zs;
        c = Math.sqrt(a*a+b*b);
        return "a=" + String.format("%.3f", a) + "; " + "b=" + String.format("%.3f", b) + "; " + "c=" + String.format("%.3f", c) + ";";
    }
    public String CalculateAlfa(double xs,double xf,double zs,double zf){
        double param, result;
        param = ((xf-xs)/2)/(zf-zs);
        result = Math.atan(param) * 180 / 3.14159265;
        int degree = (int) result;
        int minutes = (int) ( (result - (double)degree) * 60.0);
        int seconds = (int) ( (result - (double)degree - (double)minutes / 60.0) * 60.0 * 60.0 );
        return "Decimal Degrees: " + String.format("%.3f", result) +"°" + "\n"
                + "Degrees Minutes Seconds: "+ degree +"° " + minutes + "' " + seconds + "'' ";
    }
    public String CalculateBeta(double xs,double xf,double zs,double zf){
        double param, result;
        param = (zf-zs)/((xf-xs)/2);
        result = Math.atan(param) * 180 / 3.14159265;
        int degree = (int) result;
        int minutes = (int) ( (result - (double)degree) * 60.0);
        int seconds = (int) ( (result - (double)degree - (double)minutes / 60.0) * 60.0 * 60.0 );
        return "Decimal Degrees: " + String.format("%.3f", result) +"°" + "\n"
                + "Degrees Minutes Seconds: "+ degree +"° " + minutes + "' " + seconds + "'' ";
    }
    public String Increment (double nr) {
        boolean stareinc01 = incZO.isChecked();
        boolean stareinc001 = incZZO.isChecked();
        boolean stareinc0001 = incZZZO.isChecked();
        if (stareinc01 && stareinc001 && stareinc0001) {
            nr = nr + 0.1 + 0.01 + 0.001;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc01 && stareinc001) {
            nr = nr + 0.1 + 0.01;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc01 && stareinc0001) {
            nr = nr + 0.1 + 0.001;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc001 && stareinc0001) {
            nr = nr + 0.01 + 0.001;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc01) {
            nr = nr + 0.1;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc001){
            nr = nr +0.01;
            return " " + String.format("%.3f",(nr));
        } else if (stareinc0001){
            nr = nr +0.001;
            return " " + String.format("%.3f",(nr));
        }
          else return "error";
    }
    public String Decrement (double nr) {
        boolean stareinc01 = incZO.isChecked();
        boolean stareinc001 = incZZO.isChecked();
        boolean stareinc0001 = incZZZO.isChecked();
        if (stareinc01 && stareinc001 && stareinc0001) {
            return " " + String.format("%.3f",(nr - 0.1 - 0.01 - 0.001));
        } else if (stareinc01 && stareinc001) {
            return " " + String.format("%.3f",(nr - 0.1 - 0.01));
        } else if (stareinc01 && stareinc0001) {
            return " " + String.format("%.3f",(nr - 0.1 - 0.001));
        } else if (stareinc001 && stareinc0001) {
            return " " + String.format("%.3f",(nr - 0.01 - 0.001));
        } else if (stareinc01) {
            return " " + String.format("%.3f",(nr - 0.1));
        } else if (stareinc001 ){
            return " " + String.format("%.3f",(nr - 0.01));
        } else if (stareinc0001){
            return " " + String.format("%.3f",(nr - 0.001));
        }
        else return "error";
    }
}
