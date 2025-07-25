package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.tools.at */
/* loaded from: classes6.dex */
public final class ViewUtil {

    /* renamed from: a */
    private static final AtomicInteger f56951a = new AtomicInteger(1);

    /* renamed from: a */
    public static void m51671a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* renamed from: a */
    public static int m51672a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f56951a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }
}
