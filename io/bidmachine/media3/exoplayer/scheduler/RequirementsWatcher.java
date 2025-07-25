package io.bidmachine.media3.exoplayer.scheduler;

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
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.scheduler.RequirementsWatcher;

@UnstableApi
/* loaded from: classes9.dex */
public final class RequirementsWatcher {
    private final Context context;
    private final Handler handler = Util.createHandlerForCurrentOrMainLooper();
    private final Listener listener;
    @Nullable
    private C36329c networkCallback;
    private int notMetRequirements;
    @Nullable
    private C36328b receiver;
    private final Requirements requirements;

    /* loaded from: classes9.dex */
    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i);
    }

    /* renamed from: io.bidmachine.media3.exoplayer.scheduler.RequirementsWatcher$b */
    /* loaded from: classes9.dex */
    public class C36328b extends BroadcastReceiver {
        private C36328b() {
            RequirementsWatcher.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                RequirementsWatcher.this.checkRequirements();
            }
        }
    }

    @RequiresApi(24)
    /* renamed from: io.bidmachine.media3.exoplayer.scheduler.RequirementsWatcher$c */
    /* loaded from: classes9.dex */
    public final class C36329c extends ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;

        private C36329c() {
            RequirementsWatcher.this = r1;
        }

        /* renamed from: a */
        public static /* synthetic */ void m19713a(C36329c c36329c) {
            c36329c.lambda$postCheckRequirements$0();
        }

        /* renamed from: b */
        public static /* synthetic */ void m19712b(C36329c c36329c) {
            c36329c.lambda$postRecheckNotMetNetworkRequirements$1();
        }

        public /* synthetic */ void lambda$postCheckRequirements$0() {
            if (RequirementsWatcher.this.networkCallback != null) {
                RequirementsWatcher.this.checkRequirements();
            }
        }

        public /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
            if (RequirementsWatcher.this.networkCallback != null) {
                RequirementsWatcher.this.recheckNotMetNetworkRequirements();
            }
        }

        private void postCheckRequirements() {
            RequirementsWatcher.this.handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.scheduler.a
                @Override // java.lang.Runnable
                public final void run() {
                    RequirementsWatcher.C36329c.m19713a(RequirementsWatcher.C36329c.this);
                }
            });
        }

        private void postRecheckNotMetNetworkRequirements() {
            RequirementsWatcher.this.handler.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.scheduler.b
                @Override // java.lang.Runnable
                public final void run() {
                    RequirementsWatcher.C36329c.m19712b(RequirementsWatcher.C36329c.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                postRecheckNotMetNetworkRequirements();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.receivedCapabilitiesChange && this.networkValidated == hasCapability) {
                if (hasCapability) {
                    postRecheckNotMetNetworkRequirements();
                    return;
                }
                return;
            }
            this.receivedCapabilitiesChange = true;
            this.networkValidated = hasCapability;
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            postCheckRequirements();
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
        this.context = context.getApplicationContext();
        this.listener = listener;
        this.requirements = requirements;
    }

    public void checkRequirements() {
        int notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        if (this.notMetRequirements != notMetRequirements) {
            this.notMetRequirements = notMetRequirements;
            this.listener.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    public void recheckNotMetNetworkRequirements() {
        if ((this.notMetRequirements & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    @RequiresApi(24)
    private void registerNetworkCallbackV24() {
        C36329c c36329c = new C36329c();
        this.networkCallback = c36329c;
        ((ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.context.getSystemService("connectivity"))).registerDefaultNetworkCallback(c36329c);
    }

    @RequiresApi(24)
    private void unregisterNetworkCallbackV24() {
        ((ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.context.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) Assertions.checkNotNull(this.networkCallback));
        this.networkCallback = null;
    }

    public Requirements getRequirements() {
        return this.requirements;
    }

    public int start() {
        this.notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        IntentFilter intentFilter = new IntentFilter();
        if (this.requirements.isNetworkRequired()) {
            if (Util.SDK_INT >= 24) {
                registerNetworkCallbackV24();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        C36328b c36328b = new C36328b();
        this.receiver = c36328b;
        this.context.registerReceiver(c36328b, intentFilter, null, this.handler);
        return this.notMetRequirements;
    }

    public void stop() {
        this.context.unregisterReceiver((BroadcastReceiver) Assertions.checkNotNull(this.receiver));
        this.receiver = null;
        if (Util.SDK_INT >= 24 && this.networkCallback != null) {
            unregisterNetworkCallbackV24();
        }
    }
}
