package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class ProxyNotificationInitializer {
    private ProxyNotificationInitializer() {
    }

    /* renamed from: b */
    private static boolean m66569b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: c */
    public static void m66568c(Context context) {
        if (ProxyNotificationPreferences.m66562b(context)) {
            return;
        }
        m66565f(new ExecutorC2515a(), context, m66564g(context));
    }

    /* renamed from: d */
    public static boolean m66567d(Context context) {
        String notificationDelegate;
        if (!PlatformVersion.isAtLeastQ()) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Platform doesn't support proxying.");
            }
            return false;
        } else if (m66569b(context)) {
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "GMS core is set for proxying");
                return true;
            }
            return true;
        } else {
            Log.e(Constants.TAG, "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m66566e(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!m66569b(context)) {
                Log.e(Constants.TAG, "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            ProxyNotificationPreferences.m66561c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    /* renamed from: f */
    public static Task<Void> m66565f(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.m66566e(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    private static boolean m66564g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
