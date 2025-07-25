package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
/* loaded from: classes4.dex */
public class ServiceStarter {
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;

    /* renamed from: e */
    private static ServiceStarter f43262e;
    @Nullable
    @GuardedBy("this")

    /* renamed from: a */
    private String f43263a = null;

    /* renamed from: b */
    private Boolean f43264b = null;

    /* renamed from: c */
    private Boolean f43265c = null;

    /* renamed from: d */
    private final Queue<Intent> f43266d = new ArrayDeque();

    private ServiceStarter() {
    }

    /* renamed from: a */
    private int m66552a(Context context, Intent intent) {
        ComponentName startService;
        String m66547f = m66547f(context, intent);
        if (m66547f != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Restricting intent to a specific service: " + m66547f);
            }
            intent.setClassName(context.getPackageName(), m66547f);
        }
        try {
            if (m66548e(context)) {
                startService = WakeLockHolder.m66488e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d(Constants.TAG, "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e(Constants.TAG, "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            Log.e(Constants.TAG, "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e(Constants.TAG, "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized ServiceStarter m66551b() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (f43262e == null) {
                f43262e = new ServiceStarter();
            }
            serviceStarter = f43262e;
        }
        return serviceStarter;
    }

    @Nullable
    /* renamed from: f */
    private synchronized String m66547f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f43263a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f43263a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f43263a = serviceInfo.name;
                }
                return this.f43263a;
            }
            Log.e(Constants.TAG, "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + RemoteSettings.FORWARD_SLASH_STRING + serviceInfo.name);
            return null;
        }
        Log.e(Constants.TAG, "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        f43262e = serviceStarter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MainThread
    /* renamed from: c */
    public Intent m66550c() {
        return this.f43266d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m66549d(Context context) {
        boolean z;
        if (this.f43265c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f43265c = Boolean.valueOf(z);
        }
        if (!this.f43264b.booleanValue() && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f43265c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m66548e(Context context) {
        boolean z;
        if (this.f43264b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f43264b = Boolean.valueOf(z);
        }
        if (!this.f43264b.booleanValue() && Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f43264b.booleanValue();
    }

    @MainThread
    public int startMessagingService(Context context, Intent intent) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Starting service");
        }
        this.f43266d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m66552a(context, intent2);
    }
}
