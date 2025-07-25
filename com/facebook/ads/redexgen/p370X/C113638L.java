package com.facebook.ads.redexgen.p370X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.8L */
/* loaded from: assets/audience_network.dex */
public class C113638L implements SensorEventListener {
    public C113638L() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C113658N.A0D(sensorEvent.values);
        C113658N.A04();
    }
}
