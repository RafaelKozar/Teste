package com.example.rafaelkozar.projeto2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private ImageButton btAdd;
    private int count = 1;
    private final int sdk = Build.VERSION.SDK_INT;
    private int der[];
    private Canvas canvas;
    private ViewGroup inclusionViewGroup;
    private RelativeLayout leiaute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inclusionViewGroup = (ViewGroup) findViewById(R.id.leiaute);
       leiaute = (RelativeLayout) findViewById(R.id.leiaute);
        final TesteActivity testeActivity = new TesteActivity(getApplicationContext(), null);


        btAdd = (ImageButton) findViewById(R.id.btadd1);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Infor", "infor");

                View child1 = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.botao_layout, null);
                //child1.draw(canvas);
                leiaute.addView(child1);

                Canvas canvas = new Canvas();
                testeActivity.setP(150, 150, 600, 600);

                testeActivity.draw(canvas);
                leiaute.addView(testeActivity, 300, 600);
                TesteActivity maisUm = new TesteActivity(getApplicationContext(), null);
                maisUm.setP(600, 600, 900, 900);

                leiaute.addView(maisUm, 300, 600);

                View v = new View(getApplicationContext());
                leiaute.addView(v);
                v.draw(canvas);



            }
        });
    }
}
