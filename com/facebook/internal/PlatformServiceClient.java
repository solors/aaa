package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatformServiceClient.kt */
@Metadata
/* loaded from: classes4.dex */
public abstract class PlatformServiceClient implements ServiceConnection {
    @NotNull
    private final String applicationId;
    @NotNull
    private final Context context;
    @NotNull
    private final Handler handler;
    @Nullable
    private CompletedListener listener;
    @Nullable
    private final String nonce;
    private final int protocolVersion;
    private final int replyMessage;
    private final int requestMessage;
    private boolean running;
    @Nullable
    private Messenger sender;

    /* compiled from: PlatformServiceClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface CompletedListener {
        void completed(@Nullable Bundle bundle);
    }

    public PlatformServiceClient(@NotNull Context context, int i, int i2, int i3, @NotNull String applicationId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context;
        this.requestMessage = i;
        this.replyMessage = i2;
        this.applicationId = applicationId;
        this.protocolVersion = i3;
        this.nonce = str;
        this.handler = new Handler() { // from class: com.facebook.internal.PlatformServiceClient.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message message) {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    if (CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    Intrinsics.checkNotNullParameter(message, "message");
                    PlatformServiceClient.this.handleMessage(message);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        };
    }

    private final void callback(Bundle bundle) {
        if (!this.running) {
            return;
        }
        this.running = false;
        CompletedListener completedListener = this.listener;
        if (completedListener != null) {
            completedListener.completed(bundle);
        }
    }

    private final void sendMessage() {
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.EXTRA_APPLICATION_ID, this.applicationId);
        String str = this.nonce;
        if (str != null) {
            bundle.putString(NativeProtocol.EXTRA_NONCE, str);
        }
        populateRequestBundle(bundle);
        Message obtain = Message.obtain((Handler) null, this.requestMessage);
        obtain.arg1 = this.protocolVersion;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.handler);
        try {
            Messenger messenger = this.sender;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            callback(null);
        }
    }

    public final void cancel() {
        this.running = false;
    }

    @NotNull
    protected final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getNonce() {
        return this.nonce;
    }

    protected final void handleMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == this.replyMessage) {
            Bundle data = message.getData();
            if (data.getString(NativeProtocol.STATUS_ERROR_TYPE) != null) {
                callback(null);
            } else {
                callback(data);
            }
            try {
                this.context.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.sender = new Messenger(service);
        sendMessage();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.sender = null;
        try {
            this.context.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        callback(null);
    }

    protected abstract void populateRequestBundle(@NotNull Bundle bundle);

    public final void setCompletedListener(@Nullable CompletedListener completedListener) {
        this.listener = completedListener;
    }

    public final boolean start() {
        synchronized (this) {
            boolean z = false;
            if (this.running) {
                return false;
            }
            NativeProtocol nativeProtocol = NativeProtocol.INSTANCE;
            if (NativeProtocol.getLatestAvailableProtocolVersionForService(this.protocolVersion) == -1) {
                return false;
            }
            Intent createPlatformServiceIntent = NativeProtocol.createPlatformServiceIntent(getContext());
            if (createPlatformServiceIntent != null) {
                z = true;
                this.running = true;
                getContext().bindService(createPlatformServiceIntent, this, 1);
            }
            return z;
        }
    }
}
