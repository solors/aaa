package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class AFj1wSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private final int AFInAppEventType;
    private double AFKeystoreWrapper;
    @NonNull
    private final Executor AFLogger;

    /* renamed from: d */
    private long f13091d;
    private final float[][] registerClient = new float[2];
    private final long[] unregisterClient = new long[2];
    @NonNull
    private final String valueOf;
    @NonNull
    private final String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFj1wSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.AFInAppEventParameterName = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.values = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.valueOf = str;
        this.AFInAppEventType = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.AFLogger = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: AFKeystoreWrapper */
    public void AFInAppEventType(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.registerClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.unregisterClient[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.registerClient[1] = copyOf;
            this.unregisterClient[1] = currentTimeMillis;
            this.AFKeystoreWrapper = values(fArr3, copyOf);
        } else if (50000000 <= j - this.f13091d) {
            this.f13091d = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.unregisterClient[1] = currentTimeMillis;
                return;
            }
            double values = values(fArr3, fArr);
            if (values > this.AFKeystoreWrapper) {
                this.registerClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.unregisterClient[1] = currentTimeMillis;
                this.AFKeystoreWrapper = values;
            }
        }
    }

    private boolean valueOf(int i, @NonNull String str, @NonNull String str2) {
        return this.AFInAppEventParameterName == i && this.values.equals(str) && this.valueOf.equals(str2);
    }

    private static double values(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventParameterName(@NonNull Map<AFj1wSDK, Map<String, Object>> map, boolean z) {
        if (valueOf()) {
            map.put(this, AFInAppEventParameterName());
            if (z) {
                int length = this.registerClient.length;
                for (int i = 0; i < length; i++) {
                    this.registerClient[i] = null;
                }
                int length2 = this.unregisterClient.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.unregisterClient[i2] = 0;
                }
                this.AFKeystoreWrapper = 0.0d;
                this.f13091d = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFInAppEventParameterName());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFj1wSDK) {
            AFj1wSDK aFj1wSDK = (AFj1wSDK) obj;
            return valueOf(aFj1wSDK.AFInAppEventParameterName, aFj1wSDK.values, aFj1wSDK.valueOf);
        }
        return false;
    }

    public final int hashCode() {
        return this.AFInAppEventType;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFLogger.execute(new Runnable() { // from class: com.appsflyer.internal.i0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1wSDK.this.AFInAppEventType(sensorEvent);
                }
            });
        } else {
            AFInAppEventType(sensorEvent);
        }
    }

    private boolean valueOf() {
        return this.registerClient[0] != null;
    }

    @NonNull
    private static List<Float> values(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NonNull
    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventParameterName));
        concurrentHashMap.put("sN", this.values);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.registerClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.registerClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
