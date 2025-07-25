package io.bidmachine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.BidMachineActivityManager;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.l1 */
/* loaded from: classes9.dex */
public class BidMachineActivityManager {
    @NonNull
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    @Nullable
    private static WeakReference<Activity> weakTopActivity;

    BidMachineActivityManager() {
    }

    @Nullable
    public static Activity getTopActivity() {
        WeakReference<Activity> weakReference = weakTopActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void initialize(@NonNull Context context) {
        if (!isInitialized.compareAndSet(false, true)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C35757b());
            }
        } catch (Throwable th) {
            Logger.m20086w(th);
        }
    }

    static void setTopActivity(@NonNull Activity activity) {
        weakTopActivity = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidMachineActivityManager.java */
    /* renamed from: io.bidmachine.l1$b */
    /* loaded from: classes9.dex */
    public static class C35757b implements Application.ActivityLifecycleCallbacks {
        private C35757b() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m20060a() {
            lambda$onActivityPaused$1();
        }

        /* renamed from: b */
        public static /* synthetic */ void m20059b() {
            lambda$onActivityResumed$0();
        }

        public static /* synthetic */ void lambda$onActivityPaused$1() {
            try {
                SessionManager.get().pause();
            } catch (Throwable unused) {
            }
        }

        public static /* synthetic */ void lambda$onActivityResumed$0() {
            try {
                SessionManager.get().resume();
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            try {
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BidMachineActivityManager.C35757b.m20060a();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            try {
                BidMachineActivityManager.setTopActivity(activity);
                Utils.onBackgroundThread(new Runnable() { // from class: io.bidmachine.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BidMachineActivityManager.C35757b.m20059b();
                    }
                });
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            try {
                BidMachineActivityManager.setTopActivity(activity);
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }
    }
}
