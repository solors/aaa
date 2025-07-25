package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.xxp */
/* loaded from: classes3.dex */
public enum EnumC7155xxp {
    NO_WRAP(0, "nowrap"),
    WRAP(1, "wrap"),
    WRAP_REVERSE(2, "wrap_reverse");
    
    private final int eqN;

    /* renamed from: zx */
    private final String f15401zx;

    EnumC7155xxp(int i, String str) {
        this.eqN = i;
        this.f15401zx = str;
    }

    /* renamed from: bg */
    public int m89849bg() {
        return this.eqN;
    }

    /* renamed from: bg */
    public static EnumC7155xxp m89848bg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return WRAP_REVERSE;
                }
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
            }
            return WRAP;
        }
        return NO_WRAP;
    }

    /* renamed from: bg */
    public static EnumC7155xxp m89847bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    c = 0;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 1;
                    break;
                }
                break;
            case 491642861:
                if (str.equals("wrap_reverse")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NO_WRAP;
            case 1:
                return WRAP;
            case 2:
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
