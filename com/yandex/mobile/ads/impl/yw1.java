package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.q02;
import com.yandex.mobile.ads.impl.qb1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes8.dex */
public final class yw1 extends GLSurfaceView {

    /* renamed from: a */
    private final CopyOnWriteArrayList<InterfaceC31935b> f88579a;

    /* renamed from: b */
    private final SensorManager f88580b;
    @Nullable

    /* renamed from: c */
    private final Sensor f88581c;

    /* renamed from: d */
    private final qb1 f88582d;

    /* renamed from: e */
    private final Handler f88583e;

    /* renamed from: f */
    private final cp1 f88584f;
    @Nullable

    /* renamed from: g */
    private SurfaceTexture f88585g;
    @Nullable

    /* renamed from: h */
    private Surface f88586h;

    /* renamed from: i */
    private boolean f88587i;

    /* renamed from: j */
    private boolean f88588j;

    /* renamed from: k */
    private boolean f88589k;

    /* renamed from: com.yandex.mobile.ads.impl.yw1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31935b {
        /* renamed from: a */
        void mo26545a(Surface surface);

        /* renamed from: b */
        void mo26544b();
    }

    public yw1(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m26555a(yw1 yw1Var) {
        yw1Var.m26551c();
    }

    /* renamed from: b */
    public static /* synthetic */ void m26552b(yw1 yw1Var, SurfaceTexture surfaceTexture) {
        yw1Var.m26556a(surfaceTexture);
    }

    /* renamed from: d */
    private void m26549d() {
        boolean z;
        if (this.f88587i && this.f88588j) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.f88581c;
        if (sensor != null && z != this.f88589k) {
            if (z) {
                this.f88580b.registerListener(this.f88582d, sensor, 0);
            } else {
                this.f88580b.unregisterListener(this.f88582d);
            }
            this.f88589k = z;
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f88583e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.j13
            @Override // java.lang.Runnable
            public final void run() {
                yw1.m26555a(yw1.this);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f88588j = false;
        m26549d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f88588j = true;
        m26549d();
    }

    public void setDefaultStereoMode(int i) {
        this.f88584f.m35190a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f88587i = z;
        m26549d();
    }

    public yw1(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88579a = new CopyOnWriteArrayList<>();
        this.f88583e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C30937nf.m31570a(context.getSystemService("sensor"));
        this.f88580b = sensorManager;
        Sensor defaultSensor = y32.f88010a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f88581c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        cp1 cp1Var = new cp1();
        this.f88584f = cp1Var;
        C31934a c31934a = new C31934a(cp1Var);
        View.OnTouchListener q02Var = new q02(context, c31934a);
        this.f88582d = new qb1(((WindowManager) C30937nf.m31570a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), q02Var, c31934a);
        this.f88587i = true;
        setEGLContextClientVersion(2);
        setRenderer(c31934a);
        setOnTouchListener(q02Var);
    }

    /* renamed from: c */
    public void m26551c() {
        Surface surface = this.f88586h;
        if (surface != null) {
            Iterator<InterfaceC31935b> it = this.f88579a.iterator();
            while (it.hasNext()) {
                it.next().mo26544b();
            }
        }
        SurfaceTexture surfaceTexture = this.f88585g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f88585g = null;
        this.f88586h = null;
    }

    /* renamed from: a */
    public final InterfaceC31671vm m26557a() {
        return this.f88584f;
    }

    /* renamed from: b */
    public final y82 m26554b() {
        return this.f88584f;
    }

    /* renamed from: a */
    public void m26556a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f88585g;
        Surface surface = this.f88586h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f88585g = surfaceTexture;
        this.f88586h = surface2;
        Iterator<InterfaceC31935b> it = this.f88579a.iterator();
        while (it.hasNext()) {
            it.next().mo26545a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: b */
    public void m26553b(final SurfaceTexture surfaceTexture) {
        this.f88583e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.k13
            @Override // java.lang.Runnable
            public final void run() {
                yw1.m26552b(yw1.this, surfaceTexture);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.yw1$a */
    /* loaded from: classes8.dex */
    public final class C31934a implements GLSurfaceView.Renderer, q02.InterfaceC31167a, qb1.InterfaceC31191a {

        /* renamed from: a */
        private final cp1 f88590a;

        /* renamed from: d */
        private final float[] f88593d;

        /* renamed from: e */
        private final float[] f88594e;

        /* renamed from: f */
        private final float[] f88595f;

        /* renamed from: g */
        private float f88596g;

        /* renamed from: h */
        private float f88597h;

        /* renamed from: b */
        private final float[] f88591b = new float[16];

        /* renamed from: c */
        private final float[] f88592c = new float[16];

        /* renamed from: i */
        private final float[] f88598i = new float[16];

        /* renamed from: j */
        private final float[] f88599j = new float[16];

        public C31934a(cp1 cp1Var) {
            yw1.this = r5;
            float[] fArr = new float[16];
            this.f88593d = fArr;
            float[] fArr2 = new float[16];
            this.f88594e = fArr2;
            float[] fArr3 = new float[16];
            this.f88595f = fArr3;
            this.f88590a = cp1Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f88597h = 3.1415927f;
        }

        @Override // com.yandex.mobile.ads.impl.qb1.InterfaceC31191a
        @BinderThread
        /* renamed from: a */
        public final synchronized void mo26546a(float[] fArr, float f) {
            float[] fArr2 = this.f88593d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.f88597h = f2;
            Matrix.setRotateM(this.f88594e, 0, -this.f88596g, (float) Math.cos(f2), (float) Math.sin(this.f88597h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f88599j, 0, this.f88593d, 0, this.f88595f, 0);
                Matrix.multiplyMM(this.f88598i, 0, this.f88594e, 0, this.f88599j, 0);
            }
            Matrix.multiplyMM(this.f88592c, 0, this.f88591b, 0, this.f88598i, 0);
            this.f88590a.m35187a(this.f88592c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            float f;
            GLES20.glViewport(0, 0, i, i2);
            float f2 = i / i2;
            if (f2 > 1.0f) {
                f = (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2)) * 2.0d);
            } else {
                f = 90.0f;
            }
            Matrix.perspectiveM(this.f88591b, 0, f, f2, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            yw1.this.m26553b(this.f88590a.m35191a());
        }

        @UiThread
        /* renamed from: a */
        public final synchronized void m26548a(PointF pointF) {
            float f = pointF.y;
            this.f88596g = f;
            Matrix.setRotateM(this.f88594e, 0, -f, (float) Math.cos(this.f88597h), (float) Math.sin(this.f88597h), 0.0f);
            Matrix.setRotateM(this.f88595f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @UiThread
        /* renamed from: a */
        public final boolean m26547a(MotionEvent motionEvent) {
            return yw1.this.performClick();
        }
    }
}
