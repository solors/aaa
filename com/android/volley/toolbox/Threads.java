package com.android.volley.toolbox;

import android.os.Looper;

/* renamed from: com.android.volley.toolbox.p */
/* loaded from: classes2.dex */
final class Threads {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m102201a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
