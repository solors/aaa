package sg.bigo.ads.p883ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.ad.interstitial.multi_img.c */
/* loaded from: classes10.dex */
public enum EnumC43253c {
    FILL_MATCH_SELF(1, 1),
    FILL_MATCH_MAIN_VIEW(2, 2),
    FILL_MATCH_PARENT(3, 3);
    

    /* renamed from: d */
    public final int f113258d;

    /* renamed from: e */
    private final int f113259e;

    EnumC43253c(int i, int i2) {
        this.f113259e = i;
        this.f113258d = i2;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC43253c m5860a(int i) {
        if (i != 2) {
            if (i != 3) {
                return FILL_MATCH_SELF;
            }
            return FILL_MATCH_PARENT;
        }
        return FILL_MATCH_MAIN_VIEW;
    }
}
