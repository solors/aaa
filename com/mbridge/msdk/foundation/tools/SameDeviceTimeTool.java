package com.mbridge.msdk.foundation.tools;

import android.os.SystemClock;

/* renamed from: com.mbridge.msdk.foundation.tools.aa */
/* loaded from: classes6.dex */
public final class SameDeviceTimeTool {
    /* renamed from: a */
    public static final long m51907a() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (currentTimeMillis > 0) {
                return (currentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
