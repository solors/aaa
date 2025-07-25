package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import com.mbridge.msdk.p409b.p410a.PreloadListenerEx;
import com.mbridge.msdk.p411c.UnitSetting;

/* renamed from: com.mbridge.msdk.mbnative.controller.b */
/* loaded from: classes6.dex */
public abstract class DemandNativePreloadController {

    /* renamed from: a */
    protected Handler f57525a;

    /* renamed from: a */
    public abstract void mo51256a(int i, long j, int i2, UnitSetting unitSetting, String str, String str2, PreloadListenerEx preloadListenerEx, boolean z);

    /* renamed from: a */
    public final synchronized void m51268a(int i, long j, int i2, UnitSetting unitSetting, String str, String str2, boolean z, PreloadListenerEx preloadListenerEx) {
        try {
            mo51256a(i, j, i2, unitSetting, str, str2, preloadListenerEx, z);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
