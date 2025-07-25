package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Utils.java */
/* renamed from: com.unity3d.scar.adapter.common.l */
/* loaded from: classes7.dex */
public class C28805l {
    /* renamed from: a */
    public static void m37569a(Runnable runnable) {
        m37568b(runnable, 0L);
    }

    /* renamed from: b */
    public static void m37568b(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
