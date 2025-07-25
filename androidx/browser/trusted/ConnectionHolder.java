package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConnectionHolder implements ServiceConnection {
    private static final int STATE_AWAITING_CONNECTION = 0;
    private static final int STATE_CANCELLED = 3;
    private static final int STATE_CONNECTED = 1;
    private static final int STATE_DISCONNECTED = 2;
    @Nullable
    private Exception mCancellationException;
    @NonNull
    private final Runnable mCloseRunnable;
    @NonNull
    private List<CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection>> mCompleters;
    @Nullable
    private TrustedWebActivityServiceConnection mService;
    private int mState;
    @NonNull
    private final WrapperFactory mWrapperFactory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class WrapperFactory {
        WrapperFactory() {
        }

        @NonNull
        TrustedWebActivityServiceConnection create(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.AbstractBinderC0059a.asInterface(iBinder), componentName);
        }
    }

    @MainThread
    public ConnectionHolder(@NonNull Runnable runnable) {
        this(runnable, new WrapperFactory());
    }

    /* renamed from: d */
    public static /* synthetic */ Object m105476d(ConnectionHolder connectionHolder, CallbackToFutureAdapter.Completer completer) {
        return connectionHolder.lambda$getServiceWrapper$0(completer);
    }

    public /* synthetic */ Object lambda$getServiceWrapper$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        int i = this.mState;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Connection state is invalid");
                    }
                    throw this.mCancellationException;
                }
                throw new IllegalStateException("Service has been disconnected.");
            }
            TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = this.mService;
            if (trustedWebActivityServiceConnection != null) {
                completer.set(trustedWebActivityServiceConnection);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        } else {
            this.mCompleters.add(completer);
        }
        return "ConnectionHolder, state = " + this.mState;
    }

    @MainThread
    public void cancel(@NonNull Exception exc) {
        for (CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection> completer : this.mCompleters) {
            completer.setException(exc);
        }
        this.mCompleters.clear();
        this.mCloseRunnable.run();
        this.mState = 3;
        this.mCancellationException = exc;
    }

    @NonNull
    @MainThread
    public ListenableFuture<TrustedWebActivityServiceConnection> getServiceWrapper() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.browser.trusted.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ConnectionHolder.m105476d(ConnectionHolder.this, completer);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mService = this.mWrapperFactory.create(componentName, iBinder);
        for (CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection> completer : this.mCompleters) {
            completer.set(this.mService);
        }
        this.mCompleters.clear();
        this.mState = 1;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceDisconnected(ComponentName componentName) {
        this.mService = null;
        this.mCloseRunnable.run();
        this.mState = 2;
    }

    @MainThread
    ConnectionHolder(@NonNull Runnable runnable, @NonNull WrapperFactory wrapperFactory) {
        this.mState = 0;
        this.mCompleters = new ArrayList();
        this.mCloseRunnable = runnable;
        this.mWrapperFactory = wrapperFactory;
    }
}
