package com.bytedance.sdk.openadsdk.core.p314Kg.p315bg;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.Kg.bg.bg */
/* loaded from: classes3.dex */
public class C8567bg {
    /* renamed from: IL */
    public static float m85715IL(Context context) {
        return ZQc.eqN(context, ZQc.m82510eo(context));
    }

    @NonNull
    /* renamed from: bg */
    public static Pair<Float, Float> m85712bg(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = ZQc.eqN(window.getContext(), fArr[0]);
        float eqN = ZQc.eqN(window.getContext(), fArr[1]);
        fArr[1] = eqN;
        if (fArr[0] < 10.0f || eqN < 10.0f) {
            fArr = m85713bg(window.getContext(), ZQc.eqN(window.getContext(), ZQc.m82534bg()), i);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    /* renamed from: bg */
    private static float[] m85713bg(Context context, int i, int i2) {
        float m85714bg = m85714bg(context);
        float m85715IL = m85715IL(context);
        if ((i2 == 1) != (m85714bg > m85715IL)) {
            float f = m85714bg + m85715IL;
            m85715IL = f - m85715IL;
            m85714bg = f - m85715IL;
        }
        if (i2 == 1) {
            m85714bg -= i;
        } else {
            m85715IL -= i;
        }
        return new float[]{m85715IL, m85714bg};
    }

    /* renamed from: bg */
    public static float m85714bg(Context context) {
        return ZQc.eqN(context, ZQc.m82540WR(context));
    }
}
