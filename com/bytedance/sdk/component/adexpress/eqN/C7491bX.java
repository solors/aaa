package com.bytedance.sdk.component.adexpress.eqN;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.bX */
/* loaded from: classes3.dex */
public class C7491bX {
    /* renamed from: bg */
    public static Drawable m88671bg(Context context, C7464iR c7464iR) {
        if (context == null || c7464iR == null) {
            return null;
        }
        return m88672bg(context, (int) C7489Kg.m88675bg(context, c7464iR.xxp()), c7464iR.m88883vb(), c7464iR.DDQ());
    }

    /* renamed from: bg */
    public static Drawable m88672bg(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
