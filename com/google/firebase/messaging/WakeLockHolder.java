package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class WakeLockHolder {

    /* renamed from: a */
    private static final long f43310a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f43311b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static WakeLock f43312c;

    WakeLockHolder() {
    }

    @GuardedBy("WakeLockHolder.syncObject")
    /* renamed from: a */
    private static void m66492a(Context context) {
        if (f43312c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f43312c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m66491b(@NonNull Intent intent) {
        synchronized (f43311b) {
            if (f43312c != null && m66490c(intent)) {
                m66489d(intent, false);
                f43312c.release();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    static boolean m66490c(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m66489d(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ComponentName m66488e(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f43311b) {
            m66492a(context);
            boolean m66490c = m66490c(intent);
            m66489d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m66490c) {
                f43312c.acquire(f43310a);
            }
            return startService;
        }
    }
}
