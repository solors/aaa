package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Metadata {

    /* renamed from: a */
    private final Context f43221a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f43222b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f43223c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f43224d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f43225e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Metadata(Context context) {
        this.f43221a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m66586c(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m66583f(String str) {
        try {
            return this.f43221a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(Constants.TAG, "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m66581h() {
        PackageInfo m66583f = m66583f(this.f43221a.getPackageName());
        if (m66583f != null) {
            this.f43222b = Integer.toString(m66583f.versionCode);
            this.f43223c = m66583f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m66588a() {
        if (this.f43222b == null) {
            m66581h();
        }
        return this.f43222b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m66587b() {
        if (this.f43223c == null) {
            m66581h();
        }
        return this.f43223c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m66585d() {
        PackageInfo m66583f;
        if (this.f43224d == 0 && (m66583f = m66583f("com.google.android.gms")) != null) {
            this.f43224d = m66583f.versionCode;
        }
        return this.f43224d;
    }

    /* renamed from: e */
    synchronized int m66584e() {
        int i = this.f43225e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f43221a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e(Constants.TAG, "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f43225e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f43225e = 2;
            return 2;
        }
        Log.w(Constants.TAG, "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f43225e = 2;
        } else {
            this.f43225e = 1;
        }
        return this.f43225e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m66582g() {
        if (m66584e() != 0) {
            return true;
        }
        return false;
    }
}
