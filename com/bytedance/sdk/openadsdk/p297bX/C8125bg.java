package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.bX.bg */
/* loaded from: classes3.dex */
public class C8125bg extends C9101Kg {

    /* renamed from: IL */
    private float f17793IL;

    /* renamed from: bX */
    private boolean f17794bX;

    /* renamed from: bg */
    private Paint f17795bg;
    private int eqN;

    public C8125bg(Context context) {
        super(context);
        m86974bg();
    }

    /* renamed from: bg */
    private void m86974bg() {
        this.f17793IL = ZQc.m82530bg(getContext(), 8.0f);
        this.f17795bg = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m86972bg(getText().toString(), getWidth());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.eqN = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.eqN);
        } else {
            layoutParams.height = this.eqN;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i = this.eqN;
        if (i != 0 && layoutParams != null) {
            layoutParams.height = i;
        }
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.f17793IL = f;
    }

    /* renamed from: bg */
    private void m86972bg(String str, int i) {
        if (!this.f17794bX && i > 0) {
            float textSize = getTextSize();
            this.f17795bg.set(getPaint());
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float m86973bg = m86973bg(textSize, str);
            while (m86973bg > paddingLeft) {
                textSize -= 1.0f;
                this.f17795bg.setTextSize(textSize);
                if (textSize <= this.f17793IL) {
                    break;
                }
                m86973bg = m86973bg(textSize, str);
            }
            setTextSize(0, textSize);
            this.f17794bX = true;
        }
    }

    /* renamed from: bg */
    private float m86973bg(float f, String str) {
        this.f17795bg.setTextSize(f);
        return this.f17795bg.measureText(str);
    }
}
