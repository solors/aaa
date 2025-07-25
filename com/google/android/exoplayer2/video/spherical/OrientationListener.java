package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;

/* loaded from: classes4.dex */
final class OrientationListener implements SensorEventListener {

    /* renamed from: b */
    private final float[] f36398b = new float[16];

    /* renamed from: c */
    private final float[] f36399c = new float[16];

    /* renamed from: d */
    private final float[] f36400d = new float[16];

    /* renamed from: f */
    private final float[] f36401f = new float[3];

    /* renamed from: g */
    private final Display f36402g;

    /* renamed from: h */
    private final Listener[] f36403h;

    /* renamed from: i */
    private boolean f36404i;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onOrientationChange(float[] fArr, float f);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.f36402g = display;
        this.f36403h = listenerArr;
    }

    /* renamed from: a */
    private float m72361a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f36399c);
        SensorManager.getOrientation(this.f36399c, this.f36401f);
        return this.f36401f[2];
    }

    /* renamed from: b */
    private void m72360b(float[] fArr, float f) {
        for (Listener listener : this.f36403h) {
            listener.onOrientationChange(fArr, f);
        }
    }

    /* renamed from: c */
    private void m72359c(float[] fArr) {
        if (!this.f36404i) {
            FrameRotationQueue.computeRecenterMatrix(this.f36400d, fArr);
            this.f36404i = true;
        }
        float[] fArr2 = this.f36399c;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f36399c, 0, this.f36400d, 0);
    }

    /* renamed from: d */
    private void m72358d(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 130;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i3 = 130;
                }
            } else {
                i3 = 129;
                i2 = 2;
            }
            float[] fArr2 = this.f36399c;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f36399c, i2, i3, fArr);
        }
    }

    /* renamed from: e */
    private static void m72357e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f36398b, sensorEvent.values);
        m72358d(this.f36398b, this.f36402g.getRotation());
        float m72361a = m72361a(this.f36398b);
        m72357e(this.f36398b);
        m72359c(this.f36398b);
        m72360b(this.f36398b, m72361a);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
