package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");
    @Nullable
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private Handler mHandler;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    @RequiresApi(29)
    /* loaded from: classes2.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void startForeground(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    @RequiresApi(31)
    /* loaded from: classes2.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static void startForeground(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.get().warning(SystemForegroundService.TAG, "Unable to start foreground service", e);
            }
        }
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @MainThread
    private void initializeDispatcher() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(final int i) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.cancel(i);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(final int i, @NonNull final Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.notify(i, notification);
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent != null) {
            this.mDispatcher.onStartCommand(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(final int i, final int i2, @NonNull final Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            @Override // java.lang.Runnable
            public void run() {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    Api31Impl.startForeground(SystemForegroundService.this, i, notification, i2);
                } else if (i3 >= 29) {
                    Api29Impl.startForeground(SystemForegroundService.this, i, notification, i2);
                } else {
                    SystemForegroundService.this.startForeground(i, notification);
                }
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    @MainThread
    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }
}
