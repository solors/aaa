package com.yandex.mobile.ads.impl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* loaded from: classes8.dex */
final class qb1 implements SensorEventListener {

    /* renamed from: a */
    private final float[] f84288a = new float[16];

    /* renamed from: b */
    private final float[] f84289b = new float[16];

    /* renamed from: c */
    private final float[] f84290c = new float[16];

    /* renamed from: d */
    private final float[] f84291d = new float[3];

    /* renamed from: e */
    private final Display f84292e;

    /* renamed from: f */
    private final InterfaceC31191a[] f84293f;

    /* renamed from: g */
    private boolean f84294g;

    /* renamed from: com.yandex.mobile.ads.impl.qb1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31191a {
        /* renamed from: a */
        void mo26546a(float[] fArr, float f);
    }

    public qb1(Display display, InterfaceC31191a... interfaceC31191aArr) {
        this.f84292e = display;
        this.f84293f = interfaceC31191aArr;
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        SensorManager.getRotationMatrixFromVector(this.f84288a, sensorEvent.values);
        float[] fArr = this.f84288a;
        int rotation = this.f84292e.getRotation();
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i2 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            float[] fArr2 = this.f84289b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f84289b, i2, i, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f84288a, 1, 131, this.f84289b);
        SensorManager.getOrientation(this.f84289b, this.f84291d);
        float f = this.f84291d[2];
        Matrix.rotateM(this.f84288a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f84288a;
        if (!this.f84294g) {
            ca0.m35325a(this.f84290c, fArr3);
            this.f84294g = true;
        }
        float[] fArr4 = this.f84289b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f84289b, 0, this.f84290c, 0);
        float[] fArr5 = this.f84288a;
        for (InterfaceC31191a interfaceC31191a : this.f84293f) {
            interfaceC31191a.mo26546a(fArr5, f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
