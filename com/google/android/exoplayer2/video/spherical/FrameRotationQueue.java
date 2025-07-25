package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;

/* loaded from: classes4.dex */
final class FrameRotationQueue {

    /* renamed from: a */
    private final float[] f36394a = new float[16];

    /* renamed from: b */
    private final float[] f36395b = new float[16];

    /* renamed from: c */
    private final TimedValueQueue<float[]> f36396c = new TimedValueQueue<>();

    /* renamed from: d */
    private boolean f36397d;

    /* renamed from: a */
    private static void m72362a(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            GlUtil.setToIdentity(fArr);
        }
    }

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        GlUtil.setToIdentity(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
        float[] pollFloor = this.f36396c.pollFloor(j);
        if (pollFloor == null) {
            return false;
        }
        m72362a(this.f36395b, pollFloor);
        if (!this.f36397d) {
            computeRecenterMatrix(this.f36394a, this.f36395b);
            this.f36397d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f36394a, 0, this.f36395b, 0);
        return true;
    }

    public void reset() {
        this.f36396c.clear();
        this.f36397d = false;
    }

    public void setRotation(long j, float[] fArr) {
        this.f36396c.add(j, fArr);
    }
}
