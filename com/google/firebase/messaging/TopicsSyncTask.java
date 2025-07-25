package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TopicsSyncTask implements Runnable {

    /* renamed from: h */
    private static final Object f43300h = new Object();
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: i */
    private static Boolean f43301i;
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")

    /* renamed from: j */
    private static Boolean f43302j;

    /* renamed from: b */
    private final Context f43303b;

    /* renamed from: c */
    private final Metadata f43304c;

    /* renamed from: d */
    private final PowerManager.WakeLock f43305d;

    /* renamed from: f */
    private final TopicsSubscriber f43306f;

    /* renamed from: g */
    private final long f43307g;

    @VisibleForTesting
    /* loaded from: classes4.dex */
    class ConnectivityChangeReceiver extends BroadcastReceiver {
        @Nullable
        @GuardedBy("this")

        /* renamed from: a */
        private TopicsSyncTask f43308a;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.f43308a = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.f43308a;
            if (topicsSyncTask == null) {
                return;
            }
            if (!topicsSyncTask.m66494i()) {
                return;
            }
            if (TopicsSyncTask.m66501b()) {
                Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
            }
            this.f43308a.f43306f.m66511m(this.f43308a, 0L);
            context.unregisterReceiver(this);
            this.f43308a = null;
        }

        public void registerReceiver() {
            if (TopicsSyncTask.m66501b()) {
                Log.d(Constants.TAG, "Connectivity change received registered");
            }
            TopicsSyncTask.this.f43303b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.f43306f = topicsSubscriber;
        this.f43303b = context;
        this.f43307g = j;
        this.f43304c = metadata;
        this.f43305d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m66501b() {
        return m66493j();
    }

    /* renamed from: e */
    private static String m66498e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m66497f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f43300h) {
            Boolean bool = f43302j;
            if (bool == null) {
                booleanValue = m66496g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f43302j = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m66496g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, m66498e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m66495h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f43300h) {
            Boolean bool = f43301i;
            if (bool == null) {
                booleanValue = m66496g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f43301i = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m66494i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f43303b.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: j */
    private static boolean m66493j() {
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m66495h(this.f43303b)) {
            this.f43305d.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.f43306f.m66509o(true);
                } catch (IOException e) {
                    Log.e(Constants.TAG, "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    this.f43306f.m66509o(false);
                    if (m66495h(this.f43303b)) {
                        wakeLock = this.f43305d;
                    } else {
                        return;
                    }
                }
                if (!this.f43304c.m66582g()) {
                    this.f43306f.m66509o(false);
                    if (m66495h(this.f43303b)) {
                        try {
                            this.f43305d.release();
                        } catch (RuntimeException unused) {
                            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (m66497f(this.f43303b) && !m66494i()) {
                    new ConnectivityChangeReceiver(this).registerReceiver();
                    if (m66495h(this.f43303b)) {
                        try {
                            this.f43305d.release();
                        } catch (RuntimeException unused2) {
                            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f43306f.m66505s()) {
                        this.f43306f.m66509o(false);
                    } else {
                        this.f43306f.m66504t(this.f43307g);
                    }
                    if (m66495h(this.f43303b)) {
                        wakeLock = this.f43305d;
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (m66495h(this.f43303b)) {
                    try {
                        this.f43305d.release();
                    } catch (RuntimeException unused3) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
