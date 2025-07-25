package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class RequirementsWatcher {

    /* renamed from: a */
    private final Context f34113a;

    /* renamed from: b */
    private final Listener f34114b;

    /* renamed from: c */
    private final Requirements f34115c;

    /* renamed from: d */
    private final Handler f34116d = Util.createHandlerForCurrentOrMainLooper();
    @Nullable

    /* renamed from: e */
    private DeviceStatusChangeReceiver f34117e;

    /* renamed from: f */
    private int f34118f;
    @Nullable

    /* renamed from: g */
    private NetworkCallback f34119g;

    /* loaded from: classes4.dex */
    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
            RequirementsWatcher.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                RequirementsWatcher.this.m73918e();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i);
    }

    @RequiresApi(24)
    /* loaded from: classes4.dex */
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        private boolean f34121a;

        /* renamed from: b */
        private boolean f34122b;

        private NetworkCallback() {
            RequirementsWatcher.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m73914a(NetworkCallback networkCallback) {
            networkCallback.m73912c();
        }

        /* renamed from: b */
        public static /* synthetic */ void m73913b(NetworkCallback networkCallback) {
            networkCallback.m73911d();
        }

        /* renamed from: c */
        public /* synthetic */ void m73912c() {
            if (RequirementsWatcher.this.f34119g != null) {
                RequirementsWatcher.this.m73918e();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void m73911d() {
            if (RequirementsWatcher.this.f34119g != null) {
                RequirementsWatcher.this.m73917f();
            }
        }

        /* renamed from: e */
        private void m73910e() {
            RequirementsWatcher.this.f34116d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.b
                @Override // java.lang.Runnable
                public final void run() {
                    RequirementsWatcher.NetworkCallback.m73914a(RequirementsWatcher.NetworkCallback.this);
                }
            });
        }

        /* renamed from: f */
        private void m73909f() {
            RequirementsWatcher.this.f34116d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.a
                @Override // java.lang.Runnable
                public final void run() {
                    RequirementsWatcher.NetworkCallback.m73913b(RequirementsWatcher.NetworkCallback.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            m73910e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                m73909f();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.f34121a && this.f34122b == hasCapability) {
                if (hasCapability) {
                    m73909f();
                    return;
                }
                return;
            }
            this.f34121a = true;
            this.f34122b = hasCapability;
            m73910e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            m73910e();
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
        this.f34113a = context.getApplicationContext();
        this.f34114b = listener;
        this.f34115c = requirements;
    }

    /* renamed from: e */
    public void m73918e() {
        int notMetRequirements = this.f34115c.getNotMetRequirements(this.f34113a);
        if (this.f34118f != notMetRequirements) {
            this.f34118f = notMetRequirements;
            this.f34114b.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* renamed from: f */
    public void m73917f() {
        if ((this.f34118f & 3) == 0) {
            return;
        }
        m73918e();
    }

    @RequiresApi(24)
    /* renamed from: g */
    private void m73916g() {
        NetworkCallback networkCallback = new NetworkCallback();
        this.f34119g = networkCallback;
        ((ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.f34113a.getSystemService("connectivity"))).registerDefaultNetworkCallback(networkCallback);
    }

    @RequiresApi(24)
    /* renamed from: h */
    private void m73915h() {
        ((ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.f34113a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) Assertions.checkNotNull(this.f34119g));
        this.f34119g = null;
    }

    public Requirements getRequirements() {
        return this.f34115c;
    }

    public int start() {
        this.f34118f = this.f34115c.getNotMetRequirements(this.f34113a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f34115c.isNetworkRequired()) {
            if (Util.SDK_INT >= 24) {
                m73916g();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f34115c.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f34115c.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f34115c.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.f34117e = deviceStatusChangeReceiver;
        this.f34113a.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.f34116d);
        return this.f34118f;
    }

    public void stop() {
        this.f34113a.unregisterReceiver((BroadcastReceiver) Assertions.checkNotNull(this.f34117e));
        this.f34117e = null;
        if (Util.SDK_INT >= 24 && this.f34119g != null) {
            m73915h();
        }
    }
}
