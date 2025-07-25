package com.facebook.ads.redexgen.p370X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8N */
/* loaded from: assets/audience_network.dex */
public final class C113658N {
    public static Sensor A00;
    public static Sensor A01;
    public static SensorEventListener A02;
    public static SensorEventListener A03;
    public static SensorManager A04;
    public static Map<String, String> A05;
    public static byte[] A06;
    public static String[] A07 = {"7eGKOt4ISMEYschr9wlyEIztBsl8", "TTJ0SjXobBHAmUaW1tlxfrBvYn82JEz6", "3LUB7Df5Ggct5yxRqYufGNynk2TYWoUK", "1I8xJgaOb9tMETkvkBJNz6jksqJjIngl", "TAh41slKxPoXkVm5KB1gRA20jOShRxma", "aZE0D3Nzia7NPpwyI7jJpGAo9RmAmb1V", "Csh6RZP7AyktK0BvOeX4eGA8IGxaL7YA", "zoHdPltVC2GSlvLv7GuoG1E6B1q8QeZx"};
    public static String[] A08;
    public static final AtomicReference<String> A09;
    public static volatile float[] A0A;
    public static volatile float[] A0B;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-123, 121, UnsignedBytes.MAX_POWER_OF_TWO, -126, -126, -124, -117, -124, -111, -114, -116, -124, -109, -124, -111, 126, -48, -46, -29, -40, -27, -40, -29, -24, -91, -78, -88, -74, -77, -83, -88, 114, -83, -78, -72, -87, -78, -72, 114, -91, -89, -72, -83, -77, -78, 114, -122, -123, -104, -104, -119, -106, -99, -93, -121, -116, -123, -110, -117, -119, -120, -41, -20, -41, -33, -30, -41, -40, -30, -37, -43, -29, -37, -29, -27, -24, -17, -55, -56, -37, -37, -52, -39, -32, -107, -102, -109, -92, -103, -101, -96, -103, -100, -88, -101, -101, -107, -87, -90, -105, -103, -101, -54, -56, -47, -56, -43, -52, -58, -23, -30, -13, -30, -23, -120, -123, -118, 119, -118, Byte.MAX_VALUE, -123, -124, 117, -60, -76, -78, -67, -74, -37, -51, -42, -37, -41, -38, -29, -28, -47, -28, -27, -29, -79, -84, -79, -98, -87, -100, -86, -94, -86, -84, -81, -74, 125, -25, -11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A08(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String valueOf = String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize());
        A09.set(valueOf);
        A05.put(A01(92, 10, 51), valueOf);
    }

    static {
        A03();
        A04 = null;
        A00 = null;
        A01 = null;
        A05 = new ConcurrentHashMap();
        A08 = new String[]{A01(ErrorCode.CODE_NOT_TRACK_STATUS, 1, 2), A01(153, 1, 107), A01(154, 1, 120)};
        A09 = new AtomicReference<>();
    }

    public static String A00() {
        return A09.get();
    }

    public static Map<String, String> A02() {
        HashMap hashMap = new HashMap();
        Map<String, String> currentAnalogInfo = A05;
        hashMap.putAll(currentAnalogInfo);
        A0C(hashMap);
        return hashMap;
    }

    public static /* synthetic */ void A05() {
        A07();
        if (A07[1].charAt(14) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "1AcqPsu2XoXoOErwkGIQ3CIXDthbnRh4";
        strArr[3] = "oXx7ElW6b7VqM4292MU9YfwWEJ2ivE26";
    }

    public static synchronized void A06() {
        synchronized (C113658N.class) {
            if (A04 != null) {
                A04.unregisterListener(A02);
            }
            A02 = null;
        }
    }

    public static synchronized void A07() {
        synchronized (C113658N.class) {
            if (A04 != null) {
                A04.unregisterListener(A03);
            }
            A03 = null;
        }
    }

    public static void A09(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(A01(16, 8, 108))).getMemoryInfo(memoryInfo);
        A05.put(A01(61, 16, 115), String.valueOf(memoryInfo.availMem));
        if (Build.VERSION.SDK_INT >= 16) {
            A05.put(A01(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 12, 58), String.valueOf(memoryInfo.totalMem));
        }
    }

    public static void A0A(C113257j c113257j) {
        try {
            Intent A002 = AbstractC12116L4.A00(c113257j, null, new IntentFilter(A01(24, 37, 65)));
            if (A002 == null) {
                return;
            }
            int intExtra = A002.getIntExtra(A01(109, 5, 122), -1);
            int scale = A002.getIntExtra(A01(123, 5, 78), -1);
            int level = A002.getIntExtra(A01(134, 6, 109), -1);
            boolean z = level == 2 || level == 5;
            float f = 0.0f;
            if (scale > 0) {
                f = (intExtra / scale) * 100.0f;
            }
            A05.put(A01(77, 7, 100), String.valueOf(f));
            Map<String, String> map = A05;
            String A012 = z ? A01(1, 1, 69) : A01(0, 1, 82);
            if (A07[2].charAt(27) != 89) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[6] = "2rh2rYsUsFIhg9PWxqd5qIMJGCLFZ7lY";
            strArr[4] = "Gwhc7bfiWFC7B4lewlWqcogh0J7RP8uO";
            map.put(A01(84, 8, 47), A012);
        } catch (IllegalArgumentException e) {
            c113257j.A07().AA0(A01(102, 7, 96), AbstractC113568E.A1T, new C113578F(e));
        }
    }

    public static synchronized void A0B(C113257j c113257j) {
        synchronized (C113658N.class) {
            A09(c113257j);
            A0A(c113257j);
            if (A04 == null) {
                A04 = (SensorManager) c113257j.getSystemService(A01(128, 6, 101));
                if (A04 == null) {
                    return;
                }
            }
            if (A00 == null) {
                A00 = A04.getDefaultSensor(1);
            }
            if (A01 == null) {
                A01 = A04.getDefaultSensor(4);
            }
            if (A02 == null) {
                A02 = new C113638L();
                if (A00 != null) {
                    A04.registerListener(A02, A00, 3);
                }
            }
            if (A03 == null) {
                A03 = new C113648M();
                if (A01 != null) {
                    A04.registerListener(A03, A01, 3);
                }
            }
        }
    }

    public static void A0C(Map<String, String> map) {
        float[] fArr = A0A;
        float[] fArr2 = A0B;
        if (fArr != null) {
            int min = Math.min(A08.length, fArr.length);
            for (int i = 0; i < min; i++) {
                map.put(A01(2, 14, 28) + A08[i], String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(A08.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                map.put(A01(114, 9, 19) + A08[i2], String.valueOf(fArr2[i2]));
            }
        }
    }
}
