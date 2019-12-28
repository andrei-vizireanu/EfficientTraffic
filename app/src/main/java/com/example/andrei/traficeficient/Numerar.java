package com.example.andrei.traficeficient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Numerar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerar);

        Bundle bundle = getIntent().getExtras();

        TextView drum4 = (TextView) findViewById(R.id.textView13);
        EditText d4 = (EditText) findViewById(R.id.editText5);

        if(bundle.getString("3 drumuri")!= null){

        }
        else if(bundle.getString("4 drumuri")!= null){

            drum4.setVisibility(View.VISIBLE);
            d4.setVisibility(View.VISIBLE);

        }
    }

    public void calculeaza(View v){

        Bundle bundle = getIntent().getExtras();

        EditText drum1 = (EditText) findViewById(R.id.editText2);
        EditText drum2 = (EditText) findViewById(R.id.editText3);
        EditText drum3 = (EditText) findViewById(R.id.editText4);
        EditText drum4 = (EditText) findViewById(R.id.editText5);

        TextView secunda1 = (TextView) findViewById(R.id.textView15);
        TextView secunda2 = (TextView) findViewById(R.id.textView14);
        TextView secunda3 = (TextView) findViewById(R.id.textView16);
        TextView secunda4 = (TextView) findViewById(R.id.textView17);

        TextView verde = (TextView) findViewById(R.id.textView35);
        TextView rosu = (TextView) findViewById(R.id.textView36);
        TextView verde2 = (TextView) findViewById(R.id.textView37);
        TextView rosu2 = (TextView) findViewById(R.id.textView38);

        TextView secunda11 = (TextView) findViewById(R.id.textView18);
        TextView secunda22 = (TextView) findViewById(R.id.textView19);
        TextView secunda33 = (TextView) findViewById(R.id.textView20);
        TextView secunda44 = (TextView) findViewById(R.id.textView21);

        verde.setVisibility(View.VISIBLE);
        rosu.setVisibility(View.VISIBLE);
        verde2.setVisibility(View.VISIBLE);
        rosu2.setVisibility(View.VISIBLE);

        int a = 0, b = 0, c = 0, d = 0;

        a = Integer.parseInt(drum1.getText().toString());
        b = Integer.parseInt(drum2.getText().toString());
        c = Integer.parseInt(drum3.getText().toString());


        if(bundle.getString("3 drumuri")!= null){

            double aa = (a*2.5)/3;
            double bb = (b*2.5)/3;
            double cc = (c*2.5)/3;

            //calculeaza a deja aproximat
            if(aa == (int)aa){
                System.out.println("BBBBBBBBBBB" + aa);
            }
            else if(aa<((int)aa+0.5)){
                aa = (int)aa;
                System.out.println("MMMMMMMMMM" + aa);
            }
            else if(aa>((int)aa+0.5)){
                aa = (int)aa +1;
                System.out.println("YYYYYYYYYYY" + aa);
            }

            //calculeaza b deja aproximat
            if(bb == (int)bb){
                System.out.println("BBBBBBBBBBB" + bb);
            }
            else if(bb<((int)bb+0.5)){
                bb = (int)bb;
                System.out.println("MMMMMMMMMM" + bb);
            }
            else if(bb>((int)bb+0.5)){
                bb = (int)bb +1;
                System.out.println("YYYYYYYYYYY" + bb);
            }

            //calculeaza c deja aproximat
            if(cc == (int)cc){
                System.out.println("BBBBBBBBBBB" + cc);
            }
            else if(cc<((int)cc+0.5)){
                cc = (int)cc;
                System.out.println("MMMMMMMMMM" + cc);
            }
            else if(cc>((int)cc+0.5)){
                cc = (int)cc +1;
                System.out.println("YYYYYYYYYYY" + cc);
            }

            secunda1.setText("" + (int)aa);
            secunda2.setText("" + (int)bb);
            secunda3.setText("" + (int)cc);

            secunda11.setText("" + ((int)bb + (int)cc));
            secunda22.setText("" + ((int)aa + (int)cc));
            secunda33.setText("" + ((int)aa + (int)bb));

        }

        if(bundle.getString("4 drumuri")!= null){

            d = Integer.parseInt(drum4.getText().toString());

            double aa = (a*2.5)/3;
            double bb = (b*2.5)/3;
            double cc = (c*2.5)/3;
            double dd = (d*2.5)/3;

            //calculeaza a deja aproximat
            if(aa == (int)aa){
                aa = (int)aa;
                System.out.println("BBBBBBBBBBB" + aa);
            }
            else if(aa<((int)aa+0.5)){
                aa = (int)aa;
                System.out.println("MMMMMMMMMM" + aa);
            }
            else if(aa>((int)aa+0.5)){
                aa = (int)aa +1;
                System.out.println("YYYYYYYYYYY" + aa);
            }

            //calculeaza b deja aproximat
            if(bb == (int)bb){
                System.out.println("BBBBBBBBBBB" + bb);
            }
            else if(bb<((int)bb+0.5)){
                bb = (int)bb;
                System.out.println("MMMMMMMMMM" + bb);
            }
            else if(bb>((int)bb+0.5)){
                bb = (int)bb +1;
                System.out.println("YYYYYYYYYYY" + bb);
            }

            //calculeaza c deja aproximat
            if(cc == (int)cc){
                System.out.println("BBBBBBBBBBB" + cc);
            }
            else if(cc<((int)cc+0.5)){
                cc = (int)cc;
                System.out.println("MMMMMMMMMM" + cc);
            }
            else if(cc>((int)cc+0.5)){
                cc = (int)cc +1;
                System.out.println("YYYYYYYYYYY" + cc);
            }

            //calculeaza d deja aproximat
            if(dd == (int)dd){
                System.out.println("BBBBBBBBBBB" + dd);
            }
            else if(dd<((int)dd+0.5)){
                dd = (int)dd;
                System.out.println("MMMMMMMMMM" + dd);
            }
            else if(dd>((int)dd+0.5)){
                dd = (int)dd +1;
                System.out.println("YYYYYYYYYYY" + dd);
            }


            secunda1.setText("" + (int)aa);
            secunda2.setText("" + (int)bb);
            secunda3.setText("" + (int)cc);
            secunda4.setText("" + (int)dd);

            secunda11.setText("" + ((int)bb + (int)cc + (int)dd));
            secunda22.setText("" + ((int)aa + (int)cc + (int)dd));
            secunda33.setText("" + ((int)aa + (int)bb + (int)dd));
            secunda44.setText("" + ((int)aa + (int)bb + (int)cc));

        }

    }
}
