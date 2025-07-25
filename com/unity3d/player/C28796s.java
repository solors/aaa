package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p685g8.InterfaceC33217a;

/* renamed from: com.unity3d.player.s */
/* loaded from: classes7.dex */
public class C28796s {

    /* renamed from: B */
    private static CameraManager f74868B;

    /* renamed from: C */
    private static String[] f74869C;

    /* renamed from: D */
    private static Semaphore f74870D = new Semaphore(1);

    /* renamed from: a */
    private InterfaceC33217a f74872a;

    /* renamed from: b */
    private CameraDevice f74873b;

    /* renamed from: c */
    private HandlerThread f74874c;

    /* renamed from: d */
    private Handler f74875d;

    /* renamed from: e */
    private Rect f74876e;

    /* renamed from: f */
    private Rect f74877f;

    /* renamed from: g */
    private int f74878g;

    /* renamed from: h */
    private int f74879h;

    /* renamed from: k */
    private int f74882k;

    /* renamed from: l */
    private int f74883l;

    /* renamed from: n */
    private Range f74885n;

    /* renamed from: p */
    private Image f74887p;

    /* renamed from: q */
    private CaptureRequest.Builder f74888q;

    /* renamed from: t */
    private int f74891t;

    /* renamed from: u */
    private SurfaceTexture f74892u;

    /* renamed from: i */
    private float f74880i = -1.0f;

    /* renamed from: j */
    private float f74881j = -1.0f;

    /* renamed from: m */
    private boolean f74884m = false;

    /* renamed from: o */
    private ImageReader f74886o = null;

    /* renamed from: r */
    private CameraCaptureSession f74889r = null;

    /* renamed from: s */
    private Object f74890s = new Object();

    /* renamed from: v */
    private Surface f74893v = null;

    /* renamed from: w */
    private EnumC28795r f74894w = EnumC28795r.f74867c;

    /* renamed from: x */
    private CameraCaptureSession.CaptureCallback f74895x = new C28790m(this);

    /* renamed from: y */
    private final CameraDevice.StateCallback f74896y = new C28792o(this);

    /* renamed from: z */
    private final ImageReader.OnImageAvailableListener f74897z = new C28793p(this);

    /* renamed from: A */
    private final SurfaceTexture.OnFrameAvailableListener f74871A = new C28794q(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public C28796s(InterfaceC33217a interfaceC33217a) {
        this.f74872a = null;
        this.f74872a = interfaceC33217a;
        m37603d();
    }

    /* renamed from: a */
    public static int m37618a(Context context) {
        return m37610b(context).length;
    }

    /* renamed from: c */
    public static int m37605c(Context context, int i) {
        try {
            return ((Integer) m37606c(context).getCameraCharacteristics(m37610b(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    /* renamed from: d */
    private void m37603d() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f74874c = handlerThread;
        handlerThread.start();
        this.f74875d = new Handler(this.f74874c.getLooper());
    }

    /* renamed from: e */
    private void m37600e() {
        try {
            CameraCaptureSession cameraCaptureSession = this.f74889r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
                this.f74888q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f74888q.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.f74888q.setTag("Cancel focus");
                this.f74889r.capture(this.f74888q.build(), this.f74895x, this.f74875d);
            }
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m37597f() {
        try {
            if (this.f74879h != 0) {
                float f = this.f74880i;
                if (f >= 0.0f && f <= 1.0f) {
                    float f2 = this.f74881j;
                    if (f2 >= 0.0f && f2 <= 1.0f) {
                        this.f74884m = true;
                        int width = this.f74877f.width();
                        int i = this.f74882k;
                        int height = this.f74877f.height();
                        int i2 = this.f74883l;
                        int i3 = (int) (((height - (i2 * 2)) * (1.0d - this.f74881j)) + i2);
                        int max = Math.max(this.f74878g + 1, Math.min((int) (((width - (i * 2)) * this.f74880i) + i), (this.f74877f.width() - this.f74878g) - 1));
                        int max2 = Math.max(this.f74878g + 1, Math.min(i3, (this.f74877f.height() - this.f74878g) - 1));
                        CaptureRequest.Builder builder = this.f74888q;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i4 = this.f74878g;
                        int i5 = i4 * 2;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(max - i4, max2 - i4, i5, i5, 999)});
                        this.f74888q.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.f74888q.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.f74888q.setTag("Focus");
                        this.f74889r.capture(this.f74888q.build(), this.f74895x, this.f74875d);
                    }
                }
            }
            this.f74888q.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.f74888q.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.f74889r;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.setRepeatingRequest(this.f74888q.build(), this.f74895x, this.f74875d);
            }
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: b */
    public Rect m37611b() {
        return this.f74876e;
    }

    /* renamed from: g */
    public void m37595g() {
        Surface surface;
        if (this.f74891t != 0) {
            if (this.f74893v == null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f74891t);
                this.f74892u = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f74876e.width(), this.f74876e.height());
                this.f74892u.setOnFrameAvailableListener(this.f74871A, this.f74875d);
                surface = new Surface(this.f74892u);
                this.f74893v = surface;
            }
        } else if (this.f74893v == null && this.f74886o == null) {
            ImageReader newInstance = ImageReader.newInstance(this.f74876e.width(), this.f74876e.height(), 35, 2);
            this.f74886o = newInstance;
            newInstance.setOnImageAvailableListener(this.f74897z, this.f74875d);
            this.f74887p = null;
            surface = this.f74886o.getSurface();
            this.f74893v = surface;
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.f74889r;
            if (cameraCaptureSession == null) {
                this.f74873b.createCaptureSession(Arrays.asList(this.f74893v), new C28791n(this), this.f74875d);
            } else if (this.f74894w == EnumC28795r.f74866b) {
                cameraCaptureSession.setRepeatingRequest(this.f74888q.build(), this.f74895x, this.f74875d);
            }
            this.f74894w = EnumC28795r.f74865a;
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    /* renamed from: h */
    public void m37593h() {
        synchronized (this.f74890s) {
            CameraCaptureSession cameraCaptureSession = this.f74889r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e) {
                    AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.f74889r.close();
                this.f74889r = null;
                this.f74894w = EnumC28795r.f74867c;
            }
        }
    }

    /* renamed from: a */
    public static int m37617a(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = m37606c(context).getCameraCharacteristics(m37610b(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* renamed from: b */
    public static int[] m37609b(Context context, int i) {
        try {
            Size[] m37615a = m37615a(m37606c(context).getCameraCharacteristics(m37610b(context)[i]));
            if (m37615a != null) {
                int[] iArr = new int[m37615a.length * 2];
                for (int i2 = 0; i2 < m37615a.length; i2++) {
                    int i3 = i2 * 2;
                    iArr[i3] = m37615a[i2].getWidth();
                    iArr[i3 + 1] = m37615a[i2].getHeight();
                }
                return iArr;
            }
            return null;
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
            return null;
        }
    }

    /* renamed from: c */
    private static CameraManager m37606c(Context context) {
        if (f74868B == null) {
            f74868B = (CameraManager) context.getSystemService("camera");
        }
        return f74868B;
    }

    /* renamed from: d */
    public static boolean m37602d(Context context, int i) {
        try {
            return ((Integer) m37606c(context).getCameraCharacteristics(m37610b(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m37599e(Context context, int i) {
        try {
            return ((Integer) m37606c(context).getCameraCharacteristics(m37610b(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m37614a(CameraDevice cameraDevice) {
        synchronized (this.f74890s) {
            this.f74889r = null;
        }
        cameraDevice.close();
        this.f74873b = null;
    }

    /* renamed from: b */
    private static String[] m37610b(Context context) {
        if (f74869C == null) {
            try {
                f74869C = m37606c(context).getCameraIdList();
            } catch (CameraAccessException e) {
                AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
                f74869C = new String[0];
            }
        }
        return f74869C;
    }

    /* renamed from: c */
    public void m37607c() {
        synchronized (this.f74890s) {
            CameraCaptureSession cameraCaptureSession = this.f74889r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.f74894w = EnumC28795r.f74866b;
                } catch (CameraAccessException e) {
                    AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m37612a(Object obj) {
        if (obj != "Focus") {
            if (obj == "Cancel focus") {
                synchronized (this.f74890s) {
                    if (this.f74889r != null) {
                        m37597f();
                    }
                }
                return;
            }
            return;
        }
        this.f74884m = false;
        synchronized (this.f74890s) {
            if (this.f74889r != null) {
                try {
                    this.f74888q.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                    this.f74888q.setTag("Regular");
                    this.f74889r.setRepeatingRequest(this.f74888q.build(), this.f74895x, this.f74875d);
                } catch (CameraAccessException e) {
                    AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m37619a(float f, float f2) {
        if (this.f74879h > 0) {
            if (this.f74884m) {
                AbstractC28798u.Log(5, "Camera2: Setting manual focus point already started.");
                return false;
            }
            this.f74880i = f;
            this.f74881j = f2;
            synchronized (this.f74890s) {
                if (this.f74889r != null && this.f74894w != EnumC28795r.f74866b) {
                    m37600e();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Size[] m37615a(CameraCharacteristics cameraCharacteristics) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            AbstractC28798u.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        return outputSizes;
    }

    /* renamed from: a */
    public void m37620a() {
        if (this.f74873b != null) {
            m37593h();
            try {
                Semaphore semaphore = f74870D;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (semaphore.tryAcquire(4L, timeUnit)) {
                    this.f74873b.close();
                    try {
                        if (!f74870D.tryAcquire(4L, timeUnit)) {
                            AbstractC28798u.Log(5, "Camera2: Timeout waiting to close camera.");
                        }
                    } catch (InterruptedException e) {
                        AbstractC28798u.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
                    }
                    this.f74873b = null;
                    f74870D.release();
                } else {
                    AbstractC28798u.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                }
            } catch (InterruptedException e2) {
                AbstractC28798u.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
            }
            this.f74895x = null;
            this.f74893v = null;
            this.f74892u = null;
            Image image = this.f74887p;
            if (image != null) {
                image.close();
                this.f74887p = null;
            }
            ImageReader imageReader = this.f74886o;
            if (imageReader != null) {
                imageReader.close();
                this.f74886o = null;
            }
        }
        this.f74874c.quit();
        try {
            this.f74874c.join(4000L);
            this.f74874c = null;
            this.f74875d = null;
        } catch (InterruptedException e3) {
            this.f74874c.interrupt();
            AbstractC28798u.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e3);
        }
    }

    /* renamed from: a */
    public boolean m37616a(Context context, int i, int i2, int i3, int i4, int i5, Surface surface) {
        Rect rect;
        int i6 = i4;
        try {
            CameraCharacteristics cameraCharacteristics = f74868B.getCameraCharacteristics(m37610b(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                AbstractC28798u.Log(5, "Camera2: only LEGACY hardware level is supported.");
            }
            Size[] m37615a = m37615a(cameraCharacteristics);
            if (m37615a == null || m37615a.length == 0) {
                return false;
            }
            double d = i2;
            double d2 = i3;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            double d3 = Double.MAX_VALUE;
            while (i7 < m37615a.length) {
                int width = m37615a[i7].getWidth();
                int height = m37615a[i7].getHeight();
                CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
                double d4 = d;
                double abs = Math.abs(Math.log(d / width)) + Math.abs(Math.log(d2 / height));
                if (abs < d3) {
                    i8 = height;
                    d3 = abs;
                    i9 = width;
                }
                i7++;
                cameraCharacteristics = cameraCharacteristics2;
                d = d4;
            }
            CameraCharacteristics cameraCharacteristics3 = cameraCharacteristics;
            this.f74876e = new Rect(0, 0, i9, i8);
            Range[] rangeArr = (Range[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null || rangeArr.length == 0) {
                AbstractC28798u.Log(6, "Camera2: target FPS ranges are not avialable.");
                return false;
            }
            int i10 = -1;
            int i11 = 0;
            double d5 = Double.MAX_VALUE;
            while (true) {
                if (i11 < rangeArr.length) {
                    int intValue = ((Integer) rangeArr[i11].getLower()).intValue();
                    int intValue2 = ((Integer) rangeArr[i11].getUpper()).intValue();
                    float f = i6;
                    if (f + 0.1f > intValue && f - 0.1f < intValue2) {
                        break;
                    }
                    if (r7 < d5) {
                        i10 = i11;
                        d5 = r7;
                    }
                    i11++;
                } else {
                    i6 = ((Integer) (i6 > ((Integer) rangeArr[i10].getUpper()).intValue() ? rangeArr[i10].getUpper() : rangeArr[i10].getLower())).intValue();
                }
            }
            this.f74885n = new Range(Integer.valueOf(i6), Integer.valueOf(i6));
            try {
                Semaphore semaphore = f74870D;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (!semaphore.tryAcquire(4L, timeUnit)) {
                    AbstractC28798u.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                    return false;
                }
                try {
                    f74868B.openCamera(m37610b(context)[i], this.f74896y, this.f74875d);
                    try {
                    } catch (InterruptedException e) {
                        AbstractC28798u.Log(6, "Camera2: Interrupted while waiting to open camera " + e);
                    }
                    if (!f74870D.tryAcquire(4L, timeUnit)) {
                        AbstractC28798u.Log(5, "Camera2: Timeout waiting to open camera.");
                        return false;
                    }
                    f74870D.release();
                    this.f74891t = i5;
                    this.f74893v = surface;
                    int intValue3 = ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                    this.f74879h = intValue3;
                    if (intValue3 > 0) {
                        this.f74877f = (Rect) cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        float width2 = this.f74876e.width() / this.f74876e.height();
                        if (width2 > rect.width() / this.f74877f.height()) {
                            this.f74882k = 0;
                            this.f74883l = (int) ((this.f74877f.height() - (this.f74877f.width() / width2)) / 2.0f);
                        } else {
                            this.f74883l = 0;
                            this.f74882k = (int) ((this.f74877f.width() - (this.f74877f.height() * width2)) / 2.0f);
                        }
                        this.f74878g = Math.min(this.f74877f.width(), this.f74877f.height()) / 20;
                    }
                    return this.f74873b != null;
                } catch (CameraAccessException e2) {
                    AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e2);
                    f74870D.release();
                    return false;
                }
            } catch (InterruptedException e3) {
                AbstractC28798u.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e3);
                return false;
            }
        } catch (CameraAccessException e4) {
            AbstractC28798u.Log(6, "Camera2: CameraAccessException " + e4);
            return false;
        }
    }
}
