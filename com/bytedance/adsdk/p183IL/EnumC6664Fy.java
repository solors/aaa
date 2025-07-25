package com.bytedance.adsdk.p183IL;

/* renamed from: com.bytedance.adsdk.IL.Fy */
/* loaded from: classes3.dex */
public enum EnumC6664Fy {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.IL.Fy$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C66651 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f14135bg;

        static {
            int[] iArr = new int[EnumC6664Fy.values().length];
            f14135bg = iArr;
            try {
                iArr[EnumC6664Fy.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14135bg[EnumC6664Fy.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14135bg[EnumC6664Fy.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: bg */
    public boolean m91210bg(int i, boolean z, int i2) {
        int i3 = C66651.f14135bg[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if ((!z || i >= 28) && i2 <= 4 && i > 25) {
            return false;
        }
        return true;
    }
}
