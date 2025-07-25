package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ProxyNotificationPreferences {
    private ProxyNotificationPreferences() {
    }

    /* renamed from: a */
    private static SharedPreferences m66563a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences(BuildConfig.APPLICATION_ID, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public static boolean m66562b(Context context) {
        return m66563a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: c */
    public static void m66561c(Context context, boolean z) {
        SharedPreferences.Editor edit = m66563a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
