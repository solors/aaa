package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class WithinAppServiceConnection implements ServiceConnection {

    /* renamed from: b */
    private final Context f43314b;

    /* renamed from: c */
    private final Intent f43315c;

    /* renamed from: d */
    private final ScheduledExecutorService f43316d;

    /* renamed from: f */
    private final Queue<BindRequest> f43317f;
    @Nullable

    /* renamed from: g */
    private WithinAppServiceBinder f43318g;
    @GuardedBy("this")

    /* renamed from: h */
    private boolean f43319h;

    /* loaded from: classes4.dex */
    public static class BindRequest {

        /* renamed from: a */
        final Intent f43320a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f43321b = new TaskCompletionSource<>();

        BindRequest(Intent intent) {
            this.f43320a = intent;
        }

        /* renamed from: a */
        public static /* synthetic */ void m66480a(BindRequest bindRequest) {
            bindRequest.m66475f();
        }

        /* renamed from: b */
        public static /* synthetic */ void m66479b(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        /* renamed from: f */
        public /* synthetic */ void m66475f() {
            Log.w(Constants.TAG, "Service took too long to process intent: " + this.f43320a.getAction() + " App may get closed.");
            m66477d();
        }

        /* renamed from: c */
        void m66478c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.f0
                @Override // java.lang.Runnable
                public final void run() {
                    WithinAppServiceConnection.BindRequest.m66480a(WithinAppServiceConnection.BindRequest.this);
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m66476e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    WithinAppServiceConnection.BindRequest.m66479b(schedule, task);
                }
            });
        }

        /* renamed from: d */
        public void m66477d() {
            this.f43321b.trySetResult(null);
        }

        /* renamed from: e */
        Task<Void> m66476e() {
            return this.f43321b.getTask();
        }
    }

    public WithinAppServiceConnection(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @GuardedBy("this")
    /* renamed from: m */
    private void m66484m() {
        while (!this.f43317f.isEmpty()) {
            this.f43317f.poll().m66477d();
        }
    }

    /* renamed from: n */
    private synchronized void m66483n() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "flush queue called");
        }
        while (!this.f43317f.isEmpty()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "found intent to be delivered");
            }
            WithinAppServiceBinder withinAppServiceBinder = this.f43318g;
            if (withinAppServiceBinder != null && withinAppServiceBinder.isBinderAlive()) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "binder is alive, sending the intent.");
                }
                this.f43318g.m66485c(this.f43317f.poll());
            } else {
                m66481p();
                return;
            }
        }
    }

    @GuardedBy("this")
    /* renamed from: p */
    private void m66481p() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f43319h);
            Log.d(Constants.TAG, sb2.toString());
        }
        if (this.f43319h) {
            return;
        }
        this.f43319h = true;
        try {
        } catch (SecurityException e) {
            Log.e(Constants.TAG, "Exception while binding the service", e);
        }
        if (ConnectionTracker.getInstance().bindService(this.f43314b, this.f43315c, this, 65)) {
            return;
        }
        Log.e(Constants.TAG, "binding to the service failed");
        this.f43319h = false;
        m66484m();
    }

    /* renamed from: o */
    public synchronized Task<Void> m66482o(Intent intent) {
        BindRequest bindRequest;
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "new intent queued in the bind-strategy delivery");
        }
        bindRequest = new BindRequest(intent);
        bindRequest.m66478c(this.f43316d);
        this.f43317f.add(bindRequest);
        m66483n();
        return bindRequest.m66476e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "onServiceConnected: " + componentName);
        }
        this.f43319h = false;
        if (!(iBinder instanceof WithinAppServiceBinder)) {
            Log.e(Constants.TAG, "Invalid service connection: " + iBinder);
            m66484m();
            return;
        }
        this.f43318g = (WithinAppServiceBinder) iBinder;
        m66483n();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "onServiceDisconnected: " + componentName);
        }
        m66483n();
    }

    @VisibleForTesting
    WithinAppServiceConnection(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f43317f = new ArrayDeque();
        this.f43319h = false;
        Context applicationContext = context.getApplicationContext();
        this.f43314b = applicationContext;
        this.f43315c = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f43316d = scheduledExecutorService;
    }
}
