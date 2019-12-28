package com.example.andrei.traficeficient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Aleatoriu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatoriu);

        Bundle bundle = getIntent().getExtras();

        TextView drum1 = (TextView) findViewById(R.id.textView5);
        TextView drum2 = (TextView) findViewById(R.id.textView6);
        TextView drum3 = (TextView) findViewById(R.id.textView7);
        TextView drum4 = (TextView) findViewById(R.id.textView10);
        TextView drum = (TextView) findViewById(R.id.textView9);

        TextView secunda1 = (TextView) findViewById(R.id.textView22);
        TextView secunda2 = (TextView) findViewById(R.id.textView23);
        TextView secunda3 = (TextView) findViewById(R.id.textView24);
        TextView secunda4 = (TextView) findViewById(R.id.textView25);

        TextView secunda11 = (TextView) findViewById(R.id.textView26);
        TextView secunda22 = (TextView) findViewById(R.id.textView27);
        TextView secunda33 = (TextView) findViewById(R.id.textView28);
        TextView secunda44 = (TextView) findViewById(R.id.textView29);

        int a = (int )(Math.random() * 50 + 1);
        int b = (int )(Math.random() * 50 + 1);
        int c = (int )(Math.random() * 50 + 1);
        int d = (int )(Math.random() * 50 + 1);

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

            drum1.setText("" + a);
            drum2.setText("" + b);
            drum3.setText("" + c);
            drum4.setText("" + d);

            secunda1.setText("" + (int)aa);
            secunda2.setText("" + (int)bb);
            secunda3.setText("" + (int)cc);

            secunda11.setText("" + ((int)bb + (int)cc));
            secunda22.setText("" + ((int)aa + (int)cc));
            secunda33.setText("" + ((int)aa + (int)bb));

        }
        else if(bundle.getString("4 drumuri")!= null){
            drum4.setVisibility(View.VISIBLE);
            drum.setVisibility(View.VISIBLE);

            double aa = (a*2.5)/3;
            double bb = (b*2.5)/3;
            double cc = (c*2.5)/3;
            double dd = (d*2.5)/3;

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

            drum1.setText("" + a);
            drum2.setText("" + b);
            drum3.setText("" + c);
            drum4.setText("" + d);

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

    public void again(View view){

        Bundle bundle = getIntent().getExtras();

        TextView drum1 = (TextView) findViewById(R.id.textView5);
        TextView drum2 = (TextView) findViewById(R.id.textView6);
        TextView drum3 = (TextView) findViewById(R.id.textView7);
        TextView drum4 = (TextView) findViewById(R.id.textView10);
        TextView drum = (TextView) findViewById(R.id.textView9);

        TextView secunda1 = (TextView) findViewById(R.id.textView22);
        TextView secunda2 = (TextView) findViewById(R.id.textView23);
        TextView secunda3 = (TextView) findViewById(R.id.textView24);
        TextView secunda4 = (TextView) findViewById(R.id.textView25);

        TextView secunda11 = (TextView) findViewById(R.id.textView26);
        TextView secunda22 = (TextView) findViewById(R.id.textView27);
        TextView secunda33 = (TextView) findViewById(R.id.textView28);
        TextView secunda44 = (TextView) findViewById(R.id.textView29);

        int a = (int )(Math.random() * 50 + 1);
        int b = (int )(Math.random() * 50 + 1);
        int c = (int )(Math.random() * 50 + 1);
        int d = (int )(Math.random() * 50 + 1);

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

            drum1.setText("" + a);
            drum2.setText("" + b);
            drum3.setText("" + c);
            drum4.setText("" + d);

            secunda1.setText("" + (int)aa);
            secunda2.setText("" + (int)bb);
            secunda3.setText("" + (int)cc);

            secunda11.setText("" + ((int)bb + (int)cc));
            secunda22.setText("" + ((int)aa + (int)cc));
            secunda33.setText("" + ((int)aa + (int)bb));

        }
        else if(bundle.getString("4 drumuri")!= null){
            drum4.setVisibility(View.VISIBLE);
            drum.setVisibility(View.VISIBLE);

            double aa = (a*2.5)/3;
            double bb = (b*2.5)/3;
            double cc = (c*2.5)/3;
            double dd = (d*2.5)/3;

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

            drum1.setText("" + a);
            drum2.setText("" + b);
            drum3.setText("" + c);
            drum4.setText("" + d);

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
