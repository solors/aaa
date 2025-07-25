package com.bytedance.adsdk.p183IL.p189bg;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;

/* renamed from: com.bytedance.adsdk.IL.bg.bg */
/* loaded from: classes3.dex */
public class C6795bg extends Paint {
    public C6795bg() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((C6868zx.m90597bg(i, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
            return;
        }
        super.setAlpha(C6868zx.m90597bg(i, 0, 255));
    }

    public C6795bg(int i) {
        super(i);
    }

    public C6795bg(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C6795bg(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
