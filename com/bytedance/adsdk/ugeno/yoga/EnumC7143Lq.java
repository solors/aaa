package com.bytedance.adsdk.ugeno.yoga;

import com.facebook.appevents.codeless.internal.Constants;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.Lq */
/* loaded from: classes3.dex */
public enum EnumC7143Lq {
    STATIC(0, "static"),
    RELATIVE(1, Constants.PATH_TYPE_RELATIVE),
    ABSOLUTE(2, Constants.PATH_TYPE_ABSOLUTE);
    
    private final int eqN;

    /* renamed from: zx */
    private final String f15366zx;

    EnumC7143Lq(int i, String str) {
        this.eqN = i;
        this.f15366zx = str;
    }

    /* renamed from: bg */
    public int m89902bg() {
        return this.eqN;
    }

    /* renamed from: bg */
    public static EnumC7143Lq m89901bg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return ABSOLUTE;
                }
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
            }
            return RELATIVE;
        }
        return STATIC;
    }

    /* renamed from: bg */
    public static EnumC7143Lq m89900bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    c = 0;
                    break;
                }
                break;
            case -554435892:
                if (str.equals(Constants.PATH_TYPE_RELATIVE)) {
                    c = 1;
                    break;
                }
                break;
            case 1728122231:
                if (str.equals(Constants.PATH_TYPE_ABSOLUTE)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return STATIC;
            case 1:
                return RELATIVE;
            case 2:
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
