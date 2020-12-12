package com.example.androiddrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomTextView  extends androidx.appcompat.widget.AppCompatTextView {
private Paint paint;

    public CustomTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint= new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(125f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawText("Hello world", getMeasuredWidth()/2, getMeasuredHeight()/2, paint);
canvas.save();
        super.onDraw(canvas);
    }
}
