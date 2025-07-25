package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;

/* renamed from: com.bytedance.sdk.openadsdk.utils.zx */
/* loaded from: classes3.dex */
public class C9568zx {

    /* renamed from: IL */
    static float f21334IL = 0.0f;

    /* renamed from: bX */
    private static long f21335bX = 0;

    /* renamed from: bg */
    static int f21336bg = -1;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.zx$bg */
    /* loaded from: classes3.dex */
    public static class C9569bg {

        /* renamed from: IL */
        public final float f21337IL;

        /* renamed from: bg */
        public final int f21338bg;

        public C9569bg(int i, float f) {
            this.f21338bg = i;
            this.f21337IL = f;
        }
    }

    /* renamed from: bg */
    private static void m82382bg(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            f21336bg = 1;
        } else {
            f21336bg = 0;
        }
        f21334IL = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    /* renamed from: bg */
    public static C9569bg m82383bg() {
        if (f21335bX == 0 || SystemClock.elapsedRealtime() - f21335bX > 60000) {
            Intent registerReceiver = C8838VzQ.m84740bg().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                m82382bg(registerReceiver);
                f21335bX = SystemClock.elapsedRealtime();
            }
        }
        return new C9569bg(f21336bg, f21334IL);
    }
}
