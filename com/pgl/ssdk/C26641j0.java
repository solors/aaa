package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pgl.ssdk.j0 */
/* loaded from: classes7.dex */
public final class C26641j0 implements SensorEventListener {

    /* renamed from: a */
    private static C26641j0 f69910a;

    /* renamed from: b */
    private SensorManager f69911b;

    /* renamed from: c */
    private int f69912c;

    /* renamed from: d */
    private int f69913d = 0;

    /* renamed from: e */
    private float[] f69914e = new float[3];

    /* renamed from: f */
    private List<String> f69915f = new ArrayList();

    private C26641j0(Context context) {
        this.f69911b = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.f69911b = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static C26641j0 m40846a(Context context) {
        if (f69910a == null) {
            synchronized (C26641j0.class) {
                if (f69910a == null) {
                    f69910a = new C26641j0(context);
                }
            }
        }
        return f69910a;
    }

    /* renamed from: d */
    private synchronized void m40843d() {
        try {
            SensorManager sensorManager = this.f69911b;
            if (sensorManager != null) {
                if (this.f69912c == 0) {
                    if (!this.f69911b.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                        return;
                    }
                }
                this.f69912c++;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private synchronized void m40842e() {
        try {
            SensorManager sensorManager = this.f69911b;
            if (sensorManager != null) {
                int i = this.f69912c - 1;
                this.f69912c = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public synchronized String m40845b() {
        String str = "";
        int size = this.f69915f.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f69915f.get(0);
        }
        try {
            List<String> list = this.f69915f;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List<String> subList = list.subList(i, size);
            for (int i2 = 0; i2 < subList.size(); i2++) {
                str = str + subList.get(i2) + SignedToken.f2767c;
            }
            str = str.substring(0, str.length() - 1);
        } catch (Throwable unused) {
        }
        return str;
    }

    /* renamed from: c */
    public String m40844c() {
        String str;
        try {
            m40843d();
            synchronized (this) {
                int i = 0;
                while (this.f69913d == 0 && i < 10) {
                    i++;
                    wait(100L);
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
            str = decimalFormat.format(this.f69914e[0]) + "," + decimalFormat.format(this.f69914e[1]) + "," + decimalFormat.format(this.f69914e[2]);
        } catch (Throwable unused) {
            str = null;
        }
        m40842e();
        this.f69913d = 0;
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f69914e = sensorEvent.values;
        this.f69913d = 1;
    }

    /* renamed from: a */
    public void m40847a() {
        String m40844c = m40844c();
        if (m40844c == null) {
            return;
        }
        this.f69915f.add(m40844c);
        try {
            int size = this.f69915f.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f69915f.subList(size - 10, size));
                this.f69915f.clear();
                this.f69915f = arrayList;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
