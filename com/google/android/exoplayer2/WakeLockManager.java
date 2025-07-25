package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;

/* loaded from: classes4.dex */
final class WakeLockManager {
    @Nullable

    /* renamed from: a */
    private final PowerManager f32035a;
    @Nullable

    /* renamed from: b */
    private PowerManager.WakeLock f32036b;

    /* renamed from: c */
    private boolean f32037c;

    /* renamed from: d */
    private boolean f32038d;

    public WakeLockManager(Context context) {
        this.f32035a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    /* renamed from: a */
    private void m75303a() {
        PowerManager.WakeLock wakeLock = this.f32036b;
        if (wakeLock == null) {
            return;
        }
        if (this.f32037c && this.f32038d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.f32036b == null) {
            PowerManager powerManager = this.f32035a;
            if (powerManager == null) {
                Log.m72602w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f32036b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f32037c = z;
        m75303a();
    }

    public void setStayAwake(boolean z) {
        this.f32038d = z;
        m75303a();
    }
}
