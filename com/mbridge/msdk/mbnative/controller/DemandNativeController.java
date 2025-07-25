package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;

/* renamed from: com.mbridge.msdk.mbnative.controller.a */
/* loaded from: classes6.dex */
public abstract class DemandNativeController {

    /* renamed from: a */
    public Handler f57524a;

    /* renamed from: a */
    public abstract void mo51270a(int i, long j, int i2, String str);

    /* renamed from: a */
    public final synchronized void m51269a(long j, int i, boolean z, String str, String str2) {
        mo51270a(1, j, i, str2);
    }
}
