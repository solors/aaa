package com.google.android.material.color;

/* loaded from: classes5.dex */
final class Hct {

    /* renamed from: a */
    private float f37251a;

    /* renamed from: b */
    private float f37252b;

    /* renamed from: c */
    private float f37253c;

    private Hct(float f, float f2, float f3) {
        m71649d(m71651b(f, f2, f3));
    }

    /* renamed from: a */
    private static Cam16 m71652a(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        Cam16 cam16 = null;
        float f7 = 1000.0f;
        while (Math.abs(f6 - f4) > 0.01f) {
            float f8 = ((f4 - f6) / 2.0f) + f6;
            int i = Cam16.m71710c(f8, f2, f).getInt();
            float lstarFromInt = ColorUtils.lstarFromInt(i);
            float abs = Math.abs(f3 - lstarFromInt);
            if (abs < 0.2f) {
                Cam16 fromInt = Cam16.fromInt(i);
                float m71712a = fromInt.m71712a(Cam16.m71710c(fromInt.getJ(), fromInt.getChroma(), f));
                if (m71712a <= 1.0f && m71712a <= f5) {
                    cam16 = fromInt;
                    f7 = abs;
                    f5 = m71712a;
                }
            }
            if (f7 == 0.0f && f5 < 1.0E-9f) {
                break;
            } else if (lstarFromInt < f3) {
                f6 = f8;
            } else {
                f4 = f8;
            }
        }
        return cam16;
    }

    /* renamed from: b */
    private static int m71651b(float f, float f2, float f3) {
        return m71650c(f, f2, f3, ViewingConditions.DEFAULT);
    }

    /* renamed from: c */
    static int m71650c(float f, float f2, float f3, ViewingConditions viewingConditions) {
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            float sanitizeDegrees = MathUtils.sanitizeDegrees(f);
            Cam16 cam16 = null;
            boolean z = true;
            float f4 = 0.0f;
            float f5 = f2;
            while (Math.abs(f4 - f2) >= 0.4f) {
                Cam16 m71652a = m71652a(sanitizeDegrees, f5, f3);
                if (z) {
                    if (m71652a != null) {
                        return m71652a.m71708e(viewingConditions);
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                    z = false;
                } else {
                    if (m71652a == null) {
                        f2 = f5;
                    } else {
                        f4 = f5;
                        cam16 = m71652a;
                    }
                    f5 = ((f2 - f4) / 2.0f) + f4;
                }
            }
            if (cam16 == null) {
                return ColorUtils.intFromLstar(f3);
            }
            return cam16.m71708e(viewingConditions);
        }
        return ColorUtils.intFromLstar(f3);
    }

    /* renamed from: d */
    private void m71649d(int i) {
        Cam16 fromInt = Cam16.fromInt(i);
        float lstarFromInt = ColorUtils.lstarFromInt(i);
        this.f37251a = fromInt.getHue();
        this.f37252b = fromInt.getChroma();
        this.f37253c = lstarFromInt;
    }

    public static Hct from(float f, float f2, float f3) {
        return new Hct(f, f2, f3);
    }

    public static Hct fromInt(int i) {
        Cam16 fromInt = Cam16.fromInt(i);
        return new Hct(fromInt.getHue(), fromInt.getChroma(), ColorUtils.lstarFromInt(i));
    }

    public float getChroma() {
        return this.f37252b;
    }

    public float getHue() {
        return this.f37251a;
    }

    public float getTone() {
        return this.f37253c;
    }

    public void setChroma(float f) {
        m71649d(m71651b(this.f37251a, f, this.f37253c));
    }

    public void setHue(float f) {
        m71649d(m71651b(MathUtils.sanitizeDegrees(f), this.f37252b, this.f37253c));
    }

    public void setTone(float f) {
        m71649d(m71651b(this.f37251a, this.f37252b, f));
    }

    public int toInt() {
        return m71651b(this.f37251a, this.f37252b, this.f37253c);
    }
}
