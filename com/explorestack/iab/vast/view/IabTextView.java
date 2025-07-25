package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10504a;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.InterfaceC10506c;

/* loaded from: classes3.dex */
public class IabTextView extends TextView implements InterfaceC10506c {

    /* renamed from: b */
    private final RectF f24303b;
    @Nullable

    /* renamed from: c */
    private GradientDrawable f24304c;
    @Nullable

    /* renamed from: d */
    private Paint f24305d;

    /* renamed from: f */
    private boolean f24306f;

    public IabTextView(Context context) {
        super(context);
        this.f24303b = new RectF();
        this.f24306f = false;
        m78958a(context);
    }

    /* renamed from: a */
    protected void m78958a(@NonNull Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f24304c = gradientDrawable;
        gradientDrawable.setColor(C10504a.f23991c);
        this.f24304c.setShape(0);
        setBackgroundDrawable(this.f24304c);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24306f && this.f24305d != null) {
            float height = getHeight() / 2.0f;
            canvas.drawRoundRect(this.f24303b, height, height, this.f24305d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i2) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float measureText = getPaint().measureText(getText(), 0, getText().length());
            float f = size2;
            if (f < measureText) {
                float textSize = (int) (getTextSize() * (f / measureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        super.onSizeChanged(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.f24304c;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i2 / 2.0f);
        }
        if (this.f24306f && (paint = this.f24305d) != null) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float f = 0.0f + strokeWidth;
            this.f24303b.set(f, f, i - strokeWidth, i2 - strokeWidth);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = this.f24304c;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    @Override // com.explorestack.iab.utils.InterfaceC10506c
    public void setStyle(@NonNull C10507d c10507d) {
        boolean booleanValue = c10507d.m79400C().booleanValue();
        this.f24306f = booleanValue;
        if (booleanValue) {
            Paint paint = new Paint(1);
            this.f24305d = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f24305d.setColor(c10507d.m79356v().intValue());
            this.f24305d.setStrokeWidth(c10507d.m79355w(getContext()).floatValue());
        }
        setTextColor(c10507d.m79356v().intValue());
        setBackgroundColor(c10507d.m79371g().intValue());
        setTextSize(0, c10507d.m79370h(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, c10507d.m79369i().intValue()));
        setAlpha(c10507d.m79361q().floatValue());
        setPadding(c10507d.m79359s(getContext()).intValue(), c10507d.m79357u(getContext()).intValue(), c10507d.m79358t(getContext()).intValue(), c10507d.m79360r(getContext()).intValue());
    }

    public IabTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24303b = new RectF();
        this.f24306f = false;
        m78958a(context);
    }
}
