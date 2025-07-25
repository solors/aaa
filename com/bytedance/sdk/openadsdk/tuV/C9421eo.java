package com.bytedance.sdk.openadsdk.tuV;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.eo */
/* loaded from: classes3.dex */
public class C9421eo {

    /* renamed from: bg */
    public static WeakReference<AbstractC9396bg> f21039bg;

    /* renamed from: IL */
    protected static final float[] f21037IL = new float[3];

    /* renamed from: bX */
    protected static final float[] f21038bX = new float[3];
    protected static final float[] eqN = new float[9];

    /* renamed from: zx */
    protected static final float[] f21040zx = new float[3];

    /* renamed from: IL */
    public static void m82740IL(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<AbstractC9396bg> weakReference = f21039bg;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th) {
                C9423iR.m82732bg("SensorHub", "startListenGyroscope error", th);
            }
        }
    }

    /* renamed from: bX */
    public static void m82739bX(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<AbstractC9396bg> weakReference = f21039bg;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th) {
                C9423iR.m82732bg("SensorHub", "startListenLinearAcceleration error", th);
            }
        }
    }

    /* renamed from: bg */
    public static void m82737bg(Context context, SensorEventListener sensorEventListener) {
    }

    public static void eqN(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                WeakReference<AbstractC9396bg> weakReference = f21039bg;
                if (weakReference != null) {
                    weakReference.get();
                }
            } catch (Throwable th) {
                C9423iR.m82732bg("SensorHub", "startListenRotationVector err", th);
            }
        }
    }

    /* renamed from: bg */
    public static void m82735bg(AbstractC9396bg abstractC9396bg) {
        f21039bg = new WeakReference<>(abstractC9396bg);
    }

    /* renamed from: bg */
    public static void m82736bg(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<AbstractC9396bg> weakReference = f21039bg;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            C9423iR.m82732bg("SensorHub", "startListenAccelerometer error", th);
        }
    }

    /* renamed from: bg */
    public static void m82738bg(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
