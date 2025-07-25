package sg.bigo.ads.p883ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.d */
/* loaded from: classes10.dex */
public enum EnumC43254d {
    NONE(0, 3, 20, 0, 1.0f, 1.0f),
    LTR(1, 1, 20, 12, 1.0f, 1.0f),
    CENTER(2, 2, 30, 12, 0.8f, 0.9f),
    FULL(3, 3, 20, 0, 1.0f, 1.0f),
    TILE(Integer.MIN_VALUE, Integer.MIN_VALUE, 20, 12, 1.0f, 1.0f);
    

    /* renamed from: f */
    public final int f113266f;

    /* renamed from: g */
    final float f113267g;

    /* renamed from: h */
    final float f113268h;

    /* renamed from: i */
    public final int f113269i;

    /* renamed from: j */
    public final int f113270j;

    /* renamed from: k */
    private final int f113271k;

    EnumC43254d(int i, int i2, int i3, int i4, float f, float f2) {
        this.f113271k = i;
        this.f113270j = i2;
        this.f113269i = i3;
        this.f113266f = i4;
        this.f113267g = f;
        this.f113268h = f2;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC43254d m5859a(int i) {
        if (i != Integer.MIN_VALUE) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return NONE;
                    }
                    return FULL;
                }
                return CENTER;
            }
            return LTR;
        }
        return TILE;
    }
}
