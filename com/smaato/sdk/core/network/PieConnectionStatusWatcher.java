package com.smaato.sdk.core.network;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.util.Objects;

@RequiresApi(28)
/* loaded from: classes7.dex */
public final class PieConnectionStatusWatcher implements ConnectionStatusWatcher {
    @NonNull
    private final ConnectivityManager connectivityManager;
    @Nullable
    private C27217b networkCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.smaato.sdk.core.network.PieConnectionStatusWatcher$b */
    /* loaded from: classes7.dex */
    public static final class C27217b extends ConnectivityManager.NetworkCallback {
        @NonNull

        /* renamed from: a */
        private final ConnectionStatusWatcher.Callback f71776a;

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            this.f71776a.onConnectionStateChanged();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            this.f71776a.onConnectionStateChanged();
        }

        private C27217b(@NonNull ConnectionStatusWatcher.Callback callback) {
            this.f71776a = callback;
        }
    }

    public PieConnectionStatusWatcher(@NonNull ConnectivityManager connectivityManager) {
        this.connectivityManager = (ConnectivityManager) Objects.requireNonNull(connectivityManager);
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public boolean isCallbackRegistered() {
        if (this.networkCallback != null) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public void registerCallback(@NonNull ConnectionStatusWatcher.Callback callback) {
        try {
            if (this.networkCallback != null) {
                unregisterCallback();
            }
            C27217b c27217b = new C27217b(callback);
            this.networkCallback = c27217b;
            this.connectivityManager.registerDefaultNetworkCallback(c27217b);
        } catch (Exception unused) {
        }
    }

    @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher
    public void unregisterCallback() {
        C27217b c27217b = this.networkCallback;
        if (c27217b != null) {
            this.connectivityManager.unregisterNetworkCallback(c27217b);
            this.networkCallback = null;
        }
    }
}
