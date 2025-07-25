package com.applovin.impl;

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
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.applovin.impl.C5779wg;
import com.applovin.impl.View$OnTouchListenerC4668jo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.applovin.impl.rk */
/* loaded from: classes2.dex */
public final class C5275rk extends GLSurfaceView {

    /* renamed from: n */
    public static final /* synthetic */ int f9458n = 0;

    /* renamed from: a */
    private final CopyOnWriteArrayList f9459a;

    /* renamed from: b */
    private final SensorManager f9460b;

    /* renamed from: c */
    private final Sensor f9461c;

    /* renamed from: d */
    private final C5779wg f9462d;

    /* renamed from: f */
    private final Handler f9463f;

    /* renamed from: g */
    private final View$OnTouchListenerC4668jo f9464g;

    /* renamed from: h */
    private final C4266dj f9465h;

    /* renamed from: i */
    private SurfaceTexture f9466i;

    /* renamed from: j */
    private Surface f9467j;

    /* renamed from: k */
    private boolean f9468k;

    /* renamed from: l */
    private boolean f9469l;

    /* renamed from: m */
    private boolean f9470m;

    /* renamed from: com.applovin.impl.rk$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5277b {
        /* renamed from: a */
        void mo95815a(Surface surface);

        /* renamed from: b */
        void mo95814b(Surface surface);
    }

    public C5275rk(Context context) {
        this(context, null);
    }

    public InterfaceC5672v2 getCameraMotionListener() {
        return this.f9465h;
    }

    public InterfaceC5656uq getVideoFrameMetadataListener() {
        return this.f9465h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f9467j;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9463f.post(new Runnable() { // from class: com.applovin.impl.m40
            {
                C5275rk.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5275rk.this.m95828a();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f9469l = false;
        m95823b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f9469l = true;
        m95823b();
    }

    public void setDefaultStereoMode(int i) {
        this.f9465h.m99755a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f9468k = z;
        m95823b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.rk$a */
    /* loaded from: classes2.dex */
    public final class C5276a implements GLSurfaceView.Renderer, View$OnTouchListenerC4668jo.InterfaceC4669a, C5779wg.InterfaceC5780a {

        /* renamed from: a */
        private final C4266dj f9471a;

        /* renamed from: d */
        private final float[] f9474d;

        /* renamed from: e */
        private final float[] f9475e;

        /* renamed from: f */
        private final float[] f9476f;

        /* renamed from: g */
        private float f9477g;

        /* renamed from: h */
        private float f9478h;

        /* renamed from: b */
        private final float[] f9472b = new float[16];

        /* renamed from: c */
        private final float[] f9473c = new float[16];

        /* renamed from: i */
        private final float[] f9479i = new float[16];

        /* renamed from: j */
        private final float[] f9480j = new float[16];

        public C5276a(C4266dj c4266dj) {
            C5275rk.this = r5;
            float[] fArr = new float[16];
            this.f9474d = fArr;
            float[] fArr2 = new float[16];
            this.f9475e = fArr2;
            float[] fArr3 = new float[16];
            this.f9476f = fArr3;
            this.f9471a = c4266dj;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f9478h = 3.1415927f;
        }

        /* renamed from: a */
        private float m95817a(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f9480j, 0, this.f9474d, 0, this.f9476f, 0);
                Matrix.multiplyMM(this.f9479i, 0, this.f9475e, 0, this.f9480j, 0);
            }
            Matrix.multiplyMM(this.f9473c, 0, this.f9472b, 0, this.f9479i, 0);
            this.f9471a.m99751a(this.f9473c, false);
        }

        @Override // com.applovin.impl.View$OnTouchListenerC4668jo.InterfaceC4669a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return C5275rk.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f9472b, 0, m95817a(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C5275rk.this.m95822b(this.f9471a.m99750b());
        }

        @Override // com.applovin.impl.C5779wg.InterfaceC5780a
        /* renamed from: a */
        public synchronized void mo93514a(float[] fArr, float f) {
            float[] fArr2 = this.f9474d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9478h = -f;
            m95818a();
        }

        @Override // com.applovin.impl.View$OnTouchListenerC4668jo.InterfaceC4669a
        /* renamed from: a */
        public synchronized void mo95816a(PointF pointF) {
            this.f9477g = pointF.y;
            m95818a();
            Matrix.setRotateM(this.f9476f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        /* renamed from: a */
        private void m95818a() {
            Matrix.setRotateM(this.f9475e, 0, -this.f9477g, (float) Math.cos(this.f9478h), (float) Math.sin(this.f9478h), 0.0f);
        }
    }

    public C5275rk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9459a = new CopyOnWriteArrayList();
        this.f9463f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) AbstractC4100b1.m100583a(context.getSystemService("sensor"));
        this.f9460b = sensorManager;
        Sensor defaultSensor = AbstractC5863xp.f12151a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9461c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C4266dj c4266dj = new C4266dj();
        this.f9465h = c4266dj;
        C5276a c5276a = new C5276a(c4266dj);
        View$OnTouchListenerC4668jo view$OnTouchListenerC4668jo = new View$OnTouchListenerC4668jo(context, c5276a, 25.0f);
        this.f9464g = view$OnTouchListenerC4668jo;
        this.f9462d = new C5779wg(((WindowManager) AbstractC4100b1.m100583a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), view$OnTouchListenerC4668jo, c5276a);
        this.f9468k = true;
        setEGLContextClientVersion(2);
        setRenderer(c5276a);
        setOnTouchListener(view$OnTouchListenerC4668jo);
    }

    /* renamed from: b */
    public void m95822b(final SurfaceTexture surfaceTexture) {
        this.f9463f.post(new Runnable() { // from class: com.applovin.impl.n40
            {
                C5275rk.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5275rk.this.m95827a(surfaceTexture);
            }
        });
    }

    /* renamed from: a */
    public void m95825a(InterfaceC5277b interfaceC5277b) {
        this.f9459a.add(interfaceC5277b);
    }

    /* renamed from: a */
    public /* synthetic */ void m95828a() {
        Surface surface = this.f9467j;
        if (surface != null) {
            Iterator it = this.f9459a.iterator();
            while (it.hasNext()) {
                ((InterfaceC5277b) it.next()).mo95815a(surface);
            }
        }
        m95826a(this.f9466i, surface);
        this.f9466i = null;
        this.f9467j = null;
    }

    /* renamed from: b */
    public void m95821b(InterfaceC5277b interfaceC5277b) {
        this.f9459a.remove(interfaceC5277b);
    }

    /* renamed from: b */
    private void m95823b() {
        boolean z = this.f9468k && this.f9469l;
        Sensor sensor = this.f9461c;
        if (sensor == null || z == this.f9470m) {
            return;
        }
        if (z) {
            this.f9460b.registerListener(this.f9462d, sensor, 0);
        } else {
            this.f9460b.unregisterListener(this.f9462d);
        }
        this.f9470m = z;
    }

    /* renamed from: a */
    public /* synthetic */ void m95827a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f9466i;
        Surface surface = this.f9467j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f9466i = surfaceTexture;
        this.f9467j = surface2;
        Iterator it = this.f9459a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5277b) it.next()).mo95814b(surface2);
        }
        m95826a(surfaceTexture2, surface);
    }

    /* renamed from: a */
    private static void m95826a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
