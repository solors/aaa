package com.smaato.sdk.core.network;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class BaseConnectionStatusWatcher implements ConnectionStatusWatcher {
    @NonNull
    private final Application application;
    @Nullable
    private C27215a broadcastReceiver;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.smaato.sdk.core.network.BaseConnectionStatusWatcher$a */
    /* loaded from: classes7.dex */
    public static final class C27215a extends BroadcastReceiver {
        @NonNull

        /* renamed from: a */
        private final ConnectionStatusWatcher.Callback f71775a;

        public C27215a(@NonNull ConnectionStatusWatcher.Callback callback) {
            this.f71775a = callback;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @NonNull Intent intent) {
            this.f71775a.onConnectionStateChanged();
        }
    }

    public BaseConnectionStatusWatcher(@NonNull Application application) {
        this.application = (Application) Objects.requireNonNull(application);
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public boolean isCallbackRegistered() {
        if (this.broadcastReceiver != null) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public void registerCallback(@NonNull ConnectionStatusWatcher.Callback callback) {
        if (this.broadcastReceiver != null) {
            unregisterCallback();
        }
        C27215a c27215a = new C27215a(callback);
        this.broadcastReceiver = c27215a;
        if (Build.VERSION.SDK_INT >= 33) {
            this.application.registerReceiver(c27215a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
        } else {
            this.application.registerReceiver(c27215a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public void unregisterCallback() {
        C27215a c27215a = this.broadcastReceiver;
        if (c27215a != null) {
            this.application.unregisterReceiver(c27215a);
            this.broadcastReceiver = null;
        }
    }
}
