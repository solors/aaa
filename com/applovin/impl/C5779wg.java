package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: com.applovin.impl.wg */
/* loaded from: classes2.dex */
final class C5779wg implements SensorEventListener {

    /* renamed from: a */
    private final float[] f11743a = new float[16];

    /* renamed from: b */
    private final float[] f11744b = new float[16];

    /* renamed from: c */
    private final float[] f11745c = new float[16];

    /* renamed from: d */
    private final float[] f11746d = new float[3];

    /* renamed from: f */
    private final Display f11747f;

    /* renamed from: g */
    private final InterfaceC5780a[] f11748g;

    /* renamed from: h */
    private boolean f11749h;

    /* renamed from: com.applovin.impl.wg$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5780a {
        /* renamed from: a */
        void mo93514a(float[] fArr, float f);
    }

    public C5779wg(Display display, InterfaceC5780a... interfaceC5780aArr) {
        this.f11747f = display;
        this.f11748g = interfaceC5780aArr;
    }

    /* renamed from: a */
    private float m93519a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f11744b);
        SensorManager.getOrientation(this.f11744b, this.f11746d);
        return this.f11746d[2];
    }

    /* renamed from: b */
    private void m93516b(float[] fArr) {
        if (!this.f11749h) {
            C4642j9.m98284a(this.f11745c, fArr);
            this.f11749h = true;
        }
        float[] fArr2 = this.f11744b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f11744b, 0, this.f11745c, 0);
    }

    /* renamed from: c */
    private static void m93515c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f11743a, sensorEvent.values);
        m93517a(this.f11743a, this.f11747f.getRotation());
        float m93519a = m93519a(this.f11743a);
        m93515c(this.f11743a);
        m93516b(this.f11743a);
        m93518a(this.f11743a, m93519a);
    }

    /* renamed from: a */
    private void m93518a(float[] fArr, float f) {
        for (InterfaceC5780a interfaceC5780a : this.f11748g) {
            interfaceC5780a.mo93514a(fArr, f);
        }
    }

    /* renamed from: a */
    private void m93517a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else if (i != 3) {
                throw new IllegalStateException();
            } else {
                i2 = 130;
            }
            float[] fArr2 = this.f11744b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f11744b, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
