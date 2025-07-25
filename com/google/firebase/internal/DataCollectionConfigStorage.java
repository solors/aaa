package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

/* loaded from: classes4.dex */
public class DataCollectionConfigStorage {
    @VisibleForTesting
    public static final String DATA_COLLECTION_DEFAULT_ENABLED = "firebase_data_collection_default_enabled";

    /* renamed from: a */
    private final Context f43144a;

    /* renamed from: b */
    private final SharedPreferences f43145b;

    /* renamed from: c */
    private final Publisher f43146c;

    /* renamed from: d */
    private boolean f43147d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context m66723a = m66723a(context);
        this.f43144a = m66723a;
        this.f43145b = m66723a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f43146c = publisher;
        this.f43147d = m66722b();
    }

    /* renamed from: a */
    private static Context m66723a(Context context) {
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    private boolean m66722b() {
        if (this.f43145b.contains(DATA_COLLECTION_DEFAULT_ENABLED)) {
            return this.f43145b.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED, true);
        }
        return m66721c();
    }

    /* renamed from: c */
    private boolean m66721c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f43144a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f43144a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(DATA_COLLECTION_DEFAULT_ENABLED)) {
                return applicationInfo.metaData.getBoolean(DATA_COLLECTION_DEFAULT_ENABLED);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: d */
    private synchronized void m66720d(boolean z) {
        if (this.f43147d != z) {
            this.f43147d = z;
            this.f43146c.publish(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }

    public synchronized boolean isEnabled() {
        return this.f43147d;
    }

    public synchronized void setEnabled(Boolean bool) {
        if (bool == null) {
            this.f43145b.edit().remove(DATA_COLLECTION_DEFAULT_ENABLED).apply();
            m66720d(m66721c());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f43145b.edit().putBoolean(DATA_COLLECTION_DEFAULT_ENABLED, equals).apply();
            m66720d(equals);
        }
    }
}
