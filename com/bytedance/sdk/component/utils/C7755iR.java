package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.p233Kg.p237bg.C7246bg;

/* renamed from: com.bytedance.sdk.component.utils.iR */
/* loaded from: classes3.dex */
public class C7755iR {

    /* renamed from: bg */
    private static volatile Handler f16929bg;

    /* renamed from: IL */
    public static Handler m87832IL() {
        if (f16929bg == null) {
            synchronized (C7755iR.class) {
                if (f16929bg == null) {
                    f16929bg = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f16929bg;
    }

    /* renamed from: bg */
    public static Handler m87831bg() {
        return C7246bg.m89489bg().m89492IL();
    }
}
