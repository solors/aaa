package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.p183IL.C6686VzQ;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.C6873zx;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.adsdk.IL.zx.LZ */
/* loaded from: classes3.dex */
class C6880LZ {

    /* renamed from: IL */
    private static SparseArray<WeakReference<Interpolator>> f14785IL;

    /* renamed from: bg */
    private static final Interpolator f14786bg = new LinearInterpolator();

    C6880LZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0262 A[ADDED_TO_REGION] */
    /* renamed from: IL */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.p183IL.p192iR.C6838bg<T> m90563IL(com.bytedance.adsdk.p183IL.C6832iR r23, android.util.JsonReader r24, float r25, com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN<T> r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.p183IL.p193zx.C6880LZ.m90563IL(com.bytedance.adsdk.IL.iR, android.util.JsonReader, float, com.bytedance.adsdk.IL.zx.bN):com.bytedance.adsdk.IL.iR.bg");
    }

    /* renamed from: bg */
    private static SparseArray<WeakReference<Interpolator>> m90562bg() {
        if (f14785IL == null) {
            f14785IL = new SparseArray<>();
        }
        return f14785IL;
    }

    /* renamed from: bg */
    private static WeakReference<Interpolator> m90561bg(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C6880LZ.class) {
            weakReference = m90562bg().get(i);
        }
        return weakReference;
    }

    /* renamed from: bg */
    private static void m90560bg(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C6880LZ.class) {
            f14785IL.put(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static <T> C6838bg<T> m90557bg(JsonReader jsonReader, C6832iR c6832iR, float f, InterfaceC6891bN<T> interfaceC6891bN, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m90563IL(c6832iR, jsonReader, f, interfaceC6891bN);
        }
        if (z) {
            return m90556bg(c6832iR, jsonReader, f, interfaceC6891bN);
        }
        return m90558bg(jsonReader, f, interfaceC6891bN);
    }

    /* renamed from: bg */
    private static <T> C6838bg<T> m90556bg(C6832iR c6832iR, JsonReader jsonReader, float f, InterfaceC6891bN<T> interfaceC6891bN) throws IOException {
        Interpolator m90559bg;
        jsonReader.beginObject();
        PointF pointF = null;
        T t = null;
        T t2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        c = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    t = interfaceC6891bN.mo90496IL(jsonReader, f);
                    break;
                case 1:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 2:
                    pointF4 = C6875Fy.m90574IL(jsonReader, 1.0f);
                    break;
                case 3:
                    pointF = C6875Fy.m90574IL(jsonReader, 1.0f);
                    break;
                case 4:
                    t2 = interfaceC6891bN.mo90496IL(jsonReader, f);
                    break;
                case 5:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointF3 = C6875Fy.m90574IL(jsonReader, f);
                    break;
                case 7:
                    pointF2 = C6875Fy.m90574IL(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            t = t2;
        } else if (pointF != null && pointF4 != null) {
            m90559bg = m90559bg(pointF, pointF4);
            C6838bg<T> c6838bg = new C6838bg<>(c6832iR, t2, t, m90559bg, f2, null);
            c6838bg.f14682Kg = pointF2;
            c6838bg.f14687WR = pointF3;
            return c6838bg;
        }
        m90559bg = f14786bg;
        C6838bg<T> c6838bg2 = new C6838bg<>(c6832iR, t2, t, m90559bg, f2, null);
        c6838bg2.f14682Kg = pointF2;
        c6838bg2.f14687WR = pointF3;
        return c6838bg2;
    }

    /* renamed from: bg */
    private static Interpolator m90559bg(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = C6868zx.m90604IL(pointF.x, -1.0f, 1.0f);
        pointF.y = C6868zx.m90604IL(pointF.y, -100.0f, 100.0f);
        pointF2.x = C6868zx.m90604IL(pointF2.x, -1.0f, 1.0f);
        float m90604IL = C6868zx.m90604IL(pointF2.y, -100.0f, 100.0f);
        pointF2.y = m90604IL;
        int m90620bg = C6863ldr.m90620bg(pointF.x, pointF.y, pointF2.x, m90604IL);
        WeakReference<Interpolator> m90561bg = C6873zx.m90582bg() ? null : m90561bg(m90620bg);
        Interpolator interpolator = m90561bg != null ? m90561bg.get() : null;
        if (m90561bg == null || interpolator == null) {
            try {
                linearInterpolator = C6686VzQ.m91144bg(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = C6686VzQ.m91144bg(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C6873zx.m90582bg()) {
                try {
                    m90560bg(m90620bg, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* renamed from: bg */
    private static <T> C6838bg<T> m90558bg(JsonReader jsonReader, float f, InterfaceC6891bN<T> interfaceC6891bN) throws IOException {
        return new C6838bg<>(interfaceC6891bN.mo90496IL(jsonReader, f));
    }
}
