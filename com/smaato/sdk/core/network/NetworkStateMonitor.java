package com.smaato.sdk.core.network;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import com.smaato.sdk.core.util.notifier.ChangeSenderUtils;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class NetworkStateMonitor {
    @NonNull
    private final Set<Callback> callbacks;
    @NonNull
    private final ChangeSender<Boolean> changeSender;
    @NonNull
    private final ChangeNotifier.Listener<Boolean> changeSenderListener;
    @NonNull
    private final ConnectionStatusWatcher connectionStatusWatcher;
    @NonNull
    private final ConnectionStatusWatcher.Callback connectionStatusWatcherCallback;
    @NonNull
    private final ConnectivityManager connectivityManager;

    /* loaded from: classes7.dex */
    public interface Callback {
        void onNetworkStateChanged(boolean z);
    }

    public NetworkStateMonitor(@NonNull ConnectivityManager connectivityManager, @NonNull ConnectionStatusWatcher connectionStatusWatcher) {
        ChangeNotifier.Listener<Boolean> listener = new ChangeNotifier.Listener() { // from class: com.smaato.sdk.core.network.l
            {
                NetworkStateMonitor.this = this;
            }

            @Override // com.smaato.sdk.core.util.notifier.ChangeNotifier.Listener
            public final void onNextValue(Object obj) {
                NetworkStateMonitor.this.notifyCallbacks(((Boolean) obj).booleanValue());
            }
        };
        this.changeSenderListener = listener;
        this.callbacks = Collections.newSetFromMap(new WeakHashMap());
        this.connectivityManager = (ConnectivityManager) Objects.requireNonNull(connectivityManager, "Parameter connectivityManager cannot be null for NetworkStateMonitor::new");
        this.connectionStatusWatcher = (ConnectionStatusWatcher) Objects.requireNonNull(connectionStatusWatcher, "Parameter connectionStatusWatcher cannot be null for NetworkStateMonitor::new");
        ChangeSender<Boolean> createDebounceChangeSender = ChangeSenderUtils.createDebounceChangeSender(Boolean.valueOf(isOnline()), 500L);
        this.changeSender = createDebounceChangeSender;
        createDebounceChangeSender.addListener(listener);
        this.connectionStatusWatcherCallback = new ConnectionStatusWatcher.Callback() { // from class: com.smaato.sdk.core.network.m
            {
                NetworkStateMonitor.this = this;
            }

            @Override // com.smaato.sdk.core.network.ConnectionStatusWatcher.Callback
            public final void onConnectionStateChanged() {
                NetworkStateMonitor.this.lambda$new$0();
            }
        };
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    private NetworkInfo getNetworkInfo() {
        return this.connectivityManager.getActiveNetworkInfo();
    }

    private boolean isConnected() {
        NetworkInfo networkInfo = getNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$new$0() {
        this.changeSender.newValue(Boolean.valueOf(isOnline()));
    }

    public synchronized void notifyCallbacks(final boolean z) {
        Iterables.forEach(new HashSet(this.callbacks), new Consumer() { // from class: com.smaato.sdk.core.network.k
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((NetworkStateMonitor.Callback) obj).onNetworkStateChanged(z);
            }
        });
    }

    public synchronized void addCallback(@NonNull Callback callback) {
        Objects.requireNonNull(callback);
        this.callbacks.add(callback);
        if (!this.callbacks.isEmpty() && !this.connectionStatusWatcher.isCallbackRegistered()) {
            this.connectionStatusWatcher.registerCallback(this.connectionStatusWatcherCallback);
        }
    }

    @Nullable
    public NetworkConnectionType getNetworkConnectionType() {
        NetworkInfo networkInfo = getNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 1) {
                return NetworkConnectionType.WIFI;
            }
            if (networkInfo.getType() == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return NetworkConnectionType.CARRIER_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return NetworkConnectionType.CARRIER_3G;
                    case 13:
                    case 18:
                    case 19:
                        return NetworkConnectionType.CARRIER_4G;
                    default:
                        return NetworkConnectionType.CARRIER_UNKNOWN;
                }
            } else if (networkInfo.getType() == 9) {
                return NetworkConnectionType.ETHERNET;
            } else {
                return NetworkConnectionType.OTHER;
            }
        }
        return null;
    }

    public boolean isOnline() {
        return isConnected();
    }

    public synchronized void removeCallback(@Nullable Callback callback) {
        this.callbacks.remove(callback);
        if (this.callbacks.isEmpty() && this.connectionStatusWatcher.isCallbackRegistered()) {
            this.connectionStatusWatcher.unregisterCallback();
        }
    }
}
