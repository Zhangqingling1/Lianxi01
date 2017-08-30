package view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.aqinga.lianxi01.R;

/**
 * Created by
 * 张庆龄
 * 1506A
 * Administrator
 * 2017/8/3014:03
 */

public class MyView extends View {
    private String text;
    private int textColor;
    private  float textSize;
    public MyView(Context context) {
        super(context);
        init(null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }
    public void init(@Nullable AttributeSet attrs){

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyView);
        text = typedArray.getString(R.styleable.MyView_text);
        textColor = typedArray.getColor(R.styleable.MyView_textColor,0xffffff);
        textSize = typedArray.getDimension(R.styleable.MyView_textsize,20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        canvas.drawText(text,200,200,paint);
    }
}
