package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.ldr */
/* loaded from: classes3.dex */
public enum EnumC7154ldr {
    COLUMN(0, "column"),
    COLUMN_REVERSE(1, "column_reverse"),
    ROW(2, "row"),
    ROW_REVERSE(3, "row_reverse");
    
    private final String ldr;

    /* renamed from: zx */
    private final int f15397zx;

    EnumC7154ldr(int i, String str) {
        this.f15397zx = i;
        this.ldr = str;
    }

    /* renamed from: bg */
    public int m89852bg() {
        return this.f15397zx;
    }

    /* renamed from: bg */
    public static EnumC7154ldr m89851bg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return ROW_REVERSE;
                    }
                    throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
                }
                return ROW;
            }
            return COLUMN_REVERSE;
        }
        return COLUMN;
    }

    /* renamed from: bg */
    public static EnumC7154ldr m89850bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 1;
                    break;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c = 2;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return COLUMN_REVERSE;
            case 1:
                return COLUMN;
            case 2:
                return ROW_REVERSE;
            case 3:
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
