package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MultiInstanceInvalidationClient.kt */
@Metadata
/* loaded from: classes2.dex */
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    @NotNull
    private final IMultiInstanceInvalidationCallback callback;
    private int clientId;
    @NotNull
    private final Executor executor;
    @NotNull
    private final InvalidationTracker invalidationTracker;
    @NotNull
    private final String name;
    public InvalidationTracker.Observer observer;
    @NotNull
    private final Runnable removeObserverRunnable;
    @Nullable
    private IMultiInstanceInvalidationService service;
    @NotNull
    private final ServiceConnection serviceConnection;
    @NotNull
    private final Runnable setUpRunnable;
    @NotNull
    private final AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent, @NotNull InvalidationTracker invalidationTracker, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new AtomicBoolean(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName name2, @NotNull IBinder service) {
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(service, "service");
                MultiInstanceInvalidationClient.this.setService(IMultiInstanceInvalidationService.Stub.asInterface(service));
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName name2) {
                Intrinsics.checkNotNullParameter(name2, "name");
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.serviceConnection = serviceConnection;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.d
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.m104109a(MultiInstanceInvalidationClient.this);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.e
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.m104108b(MultiInstanceInvalidationClient.this);
            }
        };
        Object[] array = invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0]);
        Intrinsics.m17073h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setObserver(new InvalidationTracker.Observer((String[]) array) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            {
                MultiInstanceInvalidationClient.this = this;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(@NotNull Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        int clientId = MultiInstanceInvalidationClient.this.getClientId();
                        Object[] array2 = tables.toArray(new String[0]);
                        Intrinsics.m17073h(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        service.broadcastInvalidation(clientId, (String[]) array2);
                    }
                } catch (RemoteException e) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e);
                }
            }
        });
        applicationContext.bindService(serviceIntent, serviceConnection, 1);
    }

    /* renamed from: a */
    public static /* synthetic */ void m104109a(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        setUpRunnable$lambda$1(multiInstanceInvalidationClient);
    }

    /* renamed from: b */
    public static /* synthetic */ void m104108b(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        removeObserverRunnable$lambda$2(multiInstanceInvalidationClient);
    }

    public static final void removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidationTracker.removeObserver(this$0.getObserver());
    }

    public static final void setUpRunnable$lambda$1(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.service;
            if (iMultiInstanceInvalidationService != null) {
                this$0.clientId = iMultiInstanceInvalidationService.registerCallback(this$0.callback, this$0.name);
                this$0.invalidationTracker.addObserver(this$0.getObserver());
            }
        } catch (RemoteException e) {
            Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e);
        }
    }

    @NotNull
    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.callback;
    }

    public final int getClientId() {
        return this.clientId;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        Intrinsics.m17056y("observer");
        return null;
    }

    @NotNull
    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    @Nullable
    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    @NotNull
    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    @NotNull
    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    @NotNull
    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void setClientId(int i) {
        this.clientId = i;
    }

    public final void setObserver(@NotNull InvalidationTracker.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "<set-?>");
        this.observer = observer;
    }

    public final void setService(@Nullable IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.callback, this.clientId);
                }
            } catch (RemoteException e) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
