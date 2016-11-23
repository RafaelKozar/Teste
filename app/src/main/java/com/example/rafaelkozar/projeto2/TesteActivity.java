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

    public TesteActivity(Context context) {
        super(context);

    }

    public TesteActivity(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        setBackgroundColor(Color.GRAY);
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#CD5C5C"));
        Bitmap bg = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
        canvas.drawRect(50, 50, 500, 500, paint);
    }
}
