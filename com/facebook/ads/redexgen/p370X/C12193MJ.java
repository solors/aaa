package com.facebook.ads.redexgen.p370X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.MJ */
/* loaded from: assets/audience_network.dex */
public final class C12193MJ implements SensorEventListener {
    public static byte[] A0A;
    public static String[] A0B = {"Uaa3J2scapV8yes5b6pnu2IZk0LU1rHr", "LXJurOGNRLg3EZS8fSyHIDjya5ZXSJzZ", "hCsv3utrXnSLOEX2XFPv3VRLBGlOvh7o", "RmYGkVFgjEbS5IzY3jbSoV7saQb", "K5WWR24mbSYeRgwsb3gP0cRcHXaCk4OY", "QLQ7H5Nzwy1ReHmp", "O9fDe2IL", "IeHuYhXCHfpoc9Iu6CaN8EzSXeA"};
    public long A04;
    public long A05;
    public long A06;
    public SensorManager A07;
    public final C13029Zs A08;
    public int A03 = 0;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public final Set<InterfaceC12192MI> A09 = new CopyOnWriteArraySet();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0B[5].length() != 16) {
                throw new RuntimeException();
            }
            A0B[6] = "nz7up3lN";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A02() {
        A0A = new byte[]{122, 76, 71, 90, 70, 91, 90, 9, 71, 70, 93, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 5, 62, 55, 61, 63, 56, 49, 118, 56, 57, 34, 118, 37, 35, 38, 38, 57, 36, 34, 51, 50, 25, 15, 4, 25, 5, 24};
    }

    static {
        A02();
    }

    public C12193MJ(C13029Zs c13029Zs) {
        this.A08 = c13029Zs;
    }

    private void A01() {
        this.A07 = (SensorManager) this.A08.getSystemService(A00(42, 6, 72));
        if (this.A07 == null) {
            Toast.makeText(this.A08, A00(0, 21, 11), 1).show();
        }
        boolean z = false;
        try {
            z = this.A07.registerListener(this, this.A07.getDefaultSensor(1), 3);
        } catch (Exception unused) {
            Toast.makeText(this.A08, A00(21, 21, 116), 1).show();
        }
        if (!z && this.A07 != null) {
            this.A07.unregisterListener(this);
        }
    }

    public final void A03(InterfaceC12192MI interfaceC12192MI) {
        if (this.A09.isEmpty()) {
            A01();
        } else if (this.A09.contains(interfaceC12192MI)) {
            return;
        }
        this.A09.add(interfaceC12192MI);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        long now = SystemClock.elapsedRealtime();
        if (now - this.A04 > 500) {
            this.A03 = 0;
        }
        if (now - this.A06 > 100) {
            float speed = (Math.abs(((((sensorEvent.values[0] + sensorEvent.values[1]) + sensorEvent.values[2]) - this.A00) - this.A01) - this.A02) / ((float) (now - this.A06))) * 10000.0f;
            if (speed > 800.0f) {
                int i = this.A03 + 1;
                this.A03 = i;
                if (i >= 3 && now - this.A05 > 1000) {
                    this.A05 = now;
                    this.A03 = 0;
                    for (InterfaceC12192MI interfaceC12192MI : this.A09) {
                        interfaceC12192MI.ADZ();
                    }
                }
                this.A04 = now;
            }
            this.A06 = now;
            this.A00 = sensorEvent.values[0];
            this.A01 = sensorEvent.values[1];
            this.A02 = sensorEvent.values[2];
        }
    }
}
