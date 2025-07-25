package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class AFf1xSDK<Result> implements Comparable<AFf1xSDK<?>>, Callable<AFe1fSDK> {

    /* renamed from: e */
    private static final AtomicInteger f13038e = new AtomicInteger();
    @NonNull
    public final Set<AFf1ySDK> AFInAppEventParameterName;
    public volatile int AFInAppEventType;
    @NonNull
    public final AFf1ySDK AFKeystoreWrapper;
    @Nullable
    private Throwable AFLogger;

    /* renamed from: d */
    private final String f13039d;

    /* renamed from: i */
    private boolean f13040i;
    private final int registerClient;
    private long unregisterClient;
    @NonNull
    public final Set<AFf1ySDK> valueOf;
    @Nullable
    public AFe1fSDK values;

    public AFf1xSDK(@NonNull AFf1ySDK aFf1ySDK, @NonNull AFf1ySDK[] aFf1ySDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventParameterName = hashSet;
        this.valueOf = new HashSet();
        int incrementAndGet = f13038e.incrementAndGet();
        this.registerClient = incrementAndGet;
        this.f13040i = false;
        this.AFInAppEventType = 0;
        this.AFKeystoreWrapper = aFf1ySDK;
        Collections.addAll(hashSet, aFf1ySDKArr);
        if (str != null) {
            this.f13039d = str;
        } else {
            this.f13039d = String.valueOf(incrementAndGet);
        }
    }

    @NonNull
    @WorkerThread
    protected abstract AFe1fSDK AFInAppEventParameterName() throws Exception;

    @WorkerThread
    protected void AFKeystoreWrapper(Throwable th) {
    }

    @Nullable
    /* renamed from: d */
    public final Throwable m92155d() {
        return this.AFLogger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj;
        if (this.AFKeystoreWrapper != aFf1xSDK.AFKeystoreWrapper) {
            return false;
        }
        return this.f13039d.equals(aFf1xSDK.f13039d);
    }

    public final int hashCode() {
        return (this.AFKeystoreWrapper.hashCode() * 31) + this.f13039d.hashCode();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: registerClient */
    public final AFe1fSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APPSFLYER.hashCode());
        this.values = null;
        this.AFLogger = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventType++;
        try {
            AFe1fSDK AFInAppEventParameterName = AFInAppEventParameterName();
            this.values = AFInAppEventParameterName;
            return AFInAppEventParameterName;
        } finally {
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFKeystoreWrapper);
        sb2.append("-");
        sb2.append(this.f13039d);
        String obj = sb2.toString();
        if (!String.valueOf(this.registerClient).equals(this.f13039d)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("-");
            sb3.append(this.registerClient);
            return sb3.toString();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean unregisterClient() {
        return this.f13040i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long valueOf();

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    public abstract boolean values();

    @CallSuper
    @WorkerThread
    public void AFKeystoreWrapper() {
        this.f13040i = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: AFKeystoreWrapper */
    public final int compareTo(AFf1xSDK<?> aFf1xSDK) {
        int i = this.AFKeystoreWrapper.AFPurchaseDetails - aFf1xSDK.AFKeystoreWrapper.AFPurchaseDetails;
        if (i == 0) {
            if (this.f13039d.equals(aFf1xSDK.f13039d)) {
                return 0;
            }
            return this.registerClient - aFf1xSDK.registerClient;
        }
        return i;
    }

    @WorkerThread
    protected void AFInAppEventType() {
    }
}
