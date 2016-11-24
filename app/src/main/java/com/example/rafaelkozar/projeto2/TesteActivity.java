package com.example.rafaelkozar.projeto2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class TesteActivity extends View {
    private int p1, p2, p3, p4;

    public TesteActivity(Context context) {
        super(context);

    }

    public TesteActivity(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        setBackgroundColor(Color.GRAY);
        setFocusable(true);
    }

    public void setP(int p1, int p2, int p3, int p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#7799DF"));
        //Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        canvas.drawRect(p1, p2, p3, p4, paint);
    }
}
