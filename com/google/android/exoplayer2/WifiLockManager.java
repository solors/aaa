package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.ironsource.C20747r8;

/* loaded from: classes4.dex */
final class WifiLockManager {
    @Nullable

    /* renamed from: a */
    private final WifiManager f32039a;
    @Nullable

    /* renamed from: b */
    private WifiManager.WifiLock f32040b;

    /* renamed from: c */
    private boolean f32041c;

    /* renamed from: d */
    private boolean f32042d;

    public WifiLockManager(Context context) {
        this.f32039a = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
    }

    /* renamed from: a */
    private void m75302a() {
        WifiManager.WifiLock wifiLock = this.f32040b;
        if (wifiLock == null) {
            return;
        }
        if (this.f32041c && this.f32042d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.f32040b == null) {
            WifiManager wifiManager = this.f32039a;
            if (wifiManager == null) {
                Log.m72602w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f32040b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f32041c = z;
        m75302a();
    }

    public void setStayAwake(boolean z) {
        this.f32042d = z;
        m75302a();
    }
}
