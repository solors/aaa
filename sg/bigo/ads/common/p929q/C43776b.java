package sg.bigo.ads.common.p929q;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: sg.bigo.ads.common.q.b */
/* loaded from: classes10.dex */
public final class C43776b {

    /* renamed from: a */
    public final WeakReference<Context> f114551a;

    /* renamed from: b */
    public InterfaceC43775a f114552b;

    /* renamed from: c */
    public SensorManager f114553c;
    @NonNull

    /* renamed from: f */
    public final List<Integer> f114556f;

    /* renamed from: d */
    long f114554d = 0;

    /* renamed from: e */
    final float[] f114555e = new float[3];

    /* renamed from: h */
    private final float f114558h = 1.0E-9f;

    /* renamed from: g */
    public SensorEventListener f114557g = new SensorEventListener() { // from class: sg.bigo.ads.common.q.b.1
        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor;
            if (sensorEvent != null && (sensor = sensorEvent.sensor) != null && sensorEvent.values.length >= 3) {
                int type = sensor.getType();
                if (type == 4) {
                    float[] fArr = new float[3];
                    C43776b c43776b = C43776b.this;
                    long j = c43776b.f114554d;
                    if (j != 0) {
                        float f = ((float) (sensorEvent.timestamp - j)) * 1.0E-9f;
                        float[] fArr2 = c43776b.f114555e;
                        float f2 = fArr2[0];
                        float[] fArr3 = sensorEvent.values;
                        float f3 = f2 + (fArr3[0] * f);
                        fArr2[0] = f3;
                        fArr2[1] = fArr2[1] + (fArr3[1] * f);
                        fArr2[2] = fArr2[2] + (fArr3[2] * f);
                        float abs = Math.abs((float) Math.toDegrees(f3));
                        float abs2 = Math.abs((float) Math.toDegrees(C43776b.this.f114555e[1]));
                        float abs3 = Math.abs((float) Math.toDegrees(C43776b.this.f114555e[2]));
                        fArr[0] = abs;
                        fArr[1] = abs2;
                        fArr[2] = abs3;
                    }
                    C43776b c43776b2 = C43776b.this;
                    c43776b2.f114554d = sensorEvent.timestamp;
                    c43776b2.f114552b.mo5025a(type, sensorEvent.values, fArr);
                } else if (type == 9 || type == 1) {
                    C43776b.this.f114552b.mo5025a(type, sensorEvent.values, new float[3]);
                }
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    public C43776b(@NonNull Context context, @NonNull List<Integer> list, @NonNull InterfaceC43775a interfaceC43775a) {
        this.f114551a = new WeakReference<>(context);
        this.f114556f = list;
        this.f114552b = interfaceC43775a;
    }
}
