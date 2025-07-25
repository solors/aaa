package com.taurusx.tax.p594e;

import android.os.Build;

/* renamed from: com.taurusx.tax.e.u0 */
/* loaded from: classes7.dex */
public enum EnumC28381u0 {
    BASE(1),
    BASE_1_1(2),
    CUPCAKE(3),
    DONUT(4),
    ECLAIR(5),
    ECLAIR_0_1(6),
    ECLAIR_MR1(7),
    FROYO(8),
    GINGERBREAD(9),
    GINGERBREAD_MR1(10),
    HONEYCOMB(11),
    HONEYCOMB_MR1(12),
    HONEYCOMB_MR2(13),
    ICE_CREAM_SANDWICH(14),
    ICE_CREAM_SANDWICH_MR1(15),
    JELLY_BEAN(16),
    JELLY_BEAN_MR1(17),
    JELLY_BEAN_MR2(18),
    CUR_DEVELOPMENT(10000);
    

    /* renamed from: a */
    public int f73654a;

    EnumC28381u0(int i) {
        this.f73654a = i;
    }

    public static EnumC28381u0 currentApiLevel() {
        EnumC28381u0[] values;
        int i = Build.VERSION.SDK_INT;
        for (EnumC28381u0 enumC28381u0 : values()) {
            if (enumC28381u0.getApiLevel() == i) {
                return enumC28381u0;
            }
        }
        return CUR_DEVELOPMENT;
    }

    public int getApiLevel() {
        return this.f73654a;
    }

    public boolean isAtLeast(EnumC28381u0 enumC28381u0) {
        if (getApiLevel() >= enumC28381u0.getApiLevel()) {
            return true;
        }
        return false;
    }

    public boolean isAtMost(EnumC28381u0 enumC28381u0) {
        if (getApiLevel() <= enumC28381u0.getApiLevel()) {
            return true;
        }
        return false;
    }

    public boolean isBelow(EnumC28381u0 enumC28381u0) {
        if (getApiLevel() < enumC28381u0.getApiLevel()) {
            return true;
        }
        return false;
    }
}
