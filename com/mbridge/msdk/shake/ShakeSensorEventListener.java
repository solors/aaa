package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: com.mbridge.msdk.shake.b */
/* loaded from: classes6.dex */
public abstract class ShakeSensorEventListener implements SensorEventListener {

    /* renamed from: a */
    private int f59234a;

    /* renamed from: b */
    private int f59235b;

    /* renamed from: d */
    public long f59236d = 0;

    /* renamed from: e */
    public float f59237e = 0.0f;

    /* renamed from: f */
    public float f59238f = 0.0f;

    /* renamed from: g */
    public float f59239g = 0.0f;

    public ShakeSensorEventListener(int i, int i2) {
        this.f59234a = i;
        this.f59235b = i2;
    }

    /* renamed from: a */
    public abstract void mo48766a();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (java.lang.Math.abs(r9 - r2) > r8.f59234a) goto L5;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r9) {
        /*
            r8 = this;
            float[] r9 = r9.values
            r0 = 0
            r0 = r9[r0]
            float r0 = -r0
            r1 = 1
            r1 = r9[r1]
            float r1 = -r1
            r2 = 2
            r9 = r9[r2]
            float r9 = -r9
            float r2 = r8.f59237e
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L22
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f59234a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L22:
            float r2 = r8.f59238f
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L35
            float r2 = r1 - r2
            float r2 = java.lang.Math.abs(r2)
            int r4 = r8.f59234a
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L48
        L35:
            float r2 = r8.f59239g
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            float r2 = r9 - r2
            float r2 = java.lang.Math.abs(r2)
            int r3 = r8.f59234a
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5c
        L48:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r8.f59236d
            long r4 = r2 - r4
            int r6 = r8.f59235b
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L5c
            r8.f59236d = r2
            r8.mo48766a()
        L5c:
            r8.f59237e = r0
            r8.f59238f = r1
            r8.f59239g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.shake.ShakeSensorEventListener.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
