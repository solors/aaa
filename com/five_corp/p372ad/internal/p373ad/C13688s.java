package com.five_corp.p372ad.internal.p373ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: com.five_corp.ad.internal.ad.s */
/* loaded from: classes4.dex */
public final class C13688s extends AppCompatTextView {

    /* renamed from: a */
    public Paint f25398a;

    public C13688s(Context context) {
        super(context);
        m78446a();
    }

    /* renamed from: a */
    public final void m78446a() {
        Paint paint = new Paint(getPaint());
        this.f25398a = paint;
        paint.setAntiAlias(true);
        this.f25398a.setStrokeWidth(4.0f);
        this.f25398a.setColor(-1);
        this.f25398a.setStyle(Paint.Style.STROKE);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawText(getText().toString(), (getWidth() - this.f25398a.measureText(getText().toString())) / 2.0f, getBaseline(), this.f25398a);
        super.onDraw(canvas);
    }
}
