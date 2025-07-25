package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class AFj1vSDK implements AFj1zSDK {
    private static final BitSet AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final SensorManager AFKeystoreWrapper;
    private boolean AFLogger;
    private final Runnable afInfoLog;

    /* renamed from: d */
    private final Map<AFj1wSDK, Map<String, Object>> f13088d;

    /* renamed from: e */
    private boolean f13089e;
    private final Map<AFj1wSDK, AFj1wSDK> registerClient;
    private final Runnable unregisterClient;

    /* renamed from: v */
    private final Runnable f13090v;
    private final Handler valueOf;
    private final Object values;

    static {
        BitSet bitSet = new BitSet(6);
        AFInAppEventParameterName = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    @VisibleForTesting
    private AFj1vSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.values = new Object();
        BitSet bitSet = AFInAppEventParameterName;
        this.registerClient = new HashMap(bitSet.size());
        this.f13088d = new ConcurrentHashMap(bitSet.size());
        this.unregisterClient = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.4
            {
                AFj1vSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.values) {
                    AFj1vSDK.this.valueOf();
                    AFj1vSDK.this.valueOf.postDelayed(AFj1vSDK.this.afInfoLog, 150L);
                    AFj1vSDK.this.f13089e = true;
                }
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.h0
            {
                AFj1vSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.this.registerClient();
            }
        };
        this.f13090v = new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.2
            {
                AFj1vSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1vSDK.this.values) {
                    if (AFj1vSDK.this.f13089e) {
                        AFj1vSDK.this.valueOf.removeCallbacks(AFj1vSDK.this.unregisterClient);
                        AFj1vSDK.this.valueOf.removeCallbacks(AFj1vSDK.this.afInfoLog);
                        AFj1vSDK.this.AFInAppEventType();
                        AFj1vSDK.this.f13089e = false;
                    }
                }
            }
        };
        this.AFKeystoreWrapper = sensorManager;
        this.valueOf = handler;
        this.AFInAppEventType = executorService;
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> AFLogger() {
        synchronized (this.values) {
            if (!this.registerClient.isEmpty() && this.AFLogger) {
                for (AFj1wSDK aFj1wSDK : this.registerClient.values()) {
                    aFj1wSDK.AFInAppEventParameterName(this.f13088d, false);
                }
            }
            if (this.f13088d.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.f13088d.values());
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m92114d() {
        try {
            for (Sensor sensor : this.AFKeystoreWrapper.getSensorList(-1)) {
                if (valueOf(sensor.getType())) {
                    AFj1wSDK aFj1wSDK = new AFj1wSDK(sensor, this.AFInAppEventType);
                    if (!this.registerClient.containsKey(aFj1wSDK)) {
                        this.registerClient.put(aFj1wSDK, aFj1wSDK);
                    }
                    this.AFKeystoreWrapper.registerListener(this.registerClient.get(aFj1wSDK), sensor, 1, this.valueOf);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.AFLogger = true;
    }

    /* renamed from: e */
    public /* synthetic */ void m92113e() {
        try {
            if (!this.registerClient.isEmpty()) {
                for (AFj1wSDK aFj1wSDK : this.registerClient.values()) {
                    this.AFKeystoreWrapper.unregisterListener(aFj1wSDK);
                    aFj1wSDK.AFInAppEventParameterName(this.f13088d, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.AFLogger = false;
    }

    public /* synthetic */ void registerClient() {
        synchronized (this.values) {
            this.valueOf.post(new RunnableC6285f0(this));
        }
    }

    @NonNull
    @VisibleForTesting
    private List<Map<String, Object>> unregisterClient() {
        synchronized (this.values) {
            for (AFj1wSDK aFj1wSDK : this.registerClient.values()) {
                aFj1wSDK.AFInAppEventParameterName(this.f13088d, true);
            }
            if (this.f13088d.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.f13088d.values());
        }
    }

    private static boolean valueOf(int i) {
        return i >= 0 && AFInAppEventParameterName.get(i);
    }

    final void AFInAppEventType() {
        this.valueOf.post(new RunnableC6285f0(this));
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final synchronized void AFKeystoreWrapper() {
        this.valueOf.post(this.f13090v);
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    @NonNull
    public final Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> AFLogger = AFLogger();
        if (!AFLogger.isEmpty()) {
            concurrentHashMap.put(KeyConstants.Android.KEY_SENSORS, AFLogger);
        } else {
            List<Map<String, Object>> unregisterClient = unregisterClient();
            if (!unregisterClient.isEmpty()) {
                concurrentHashMap.put(KeyConstants.Android.KEY_SENSORS, unregisterClient);
            }
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    public final void AFInAppEventParameterName() {
        this.valueOf.post(this.f13090v);
        this.valueOf.post(this.unregisterClient);
    }

    @VisibleForTesting
    final void valueOf() {
        this.valueOf.post(new Runnable() { // from class: com.appsflyer.internal.g0
            {
                AFj1vSDK.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AFj1vSDK.this.m92114d();
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFj1vSDK(@androidx.annotation.NonNull android.content.Context r3, java.util.concurrent.ExecutorService r4) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1vSDK.<init>(android.content.Context, java.util.concurrent.ExecutorService):void");
    }
}
