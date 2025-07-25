package com.bytedance.adsdk.ugeno.yoga;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.iR */
/* loaded from: classes3.dex */
public enum EnumC7153iR {
    FLEX_START(0, "flex_start"),
    CENTER(1, "center"),
    FLEX_END(2, "flex_end"),
    SPACE_BETWEEN(3, "space_between"),
    SPACE_AROUND(4, "space_around"),
    SPACE_EVENLY(5, "space_evenly");
    

    /* renamed from: Kg */
    private final String f15391Kg;

    /* renamed from: iR */
    private final int f15392iR;

    EnumC7153iR(int i, String str) {
        this.f15392iR = i;
        this.f15391Kg = str;
    }

    /* renamed from: bg */
    public int m89855bg() {
        return this.f15392iR;
    }

    /* renamed from: bg */
    public static EnumC7153iR m89854bg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return SPACE_EVENLY;
                            }
                            throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
                        }
                        return SPACE_AROUND;
                    }
                    return SPACE_BETWEEN;
                }
                return FLEX_END;
            }
            return CENTER;
        }
        return FLEX_START;
    }

    /* renamed from: bg */
    public static EnumC7153iR m89853bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 1;
                    break;
                }
                break;
            case -814425728:
                if (str.equals("space_evenly")) {
                    c = 2;
                    break;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 3;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 4;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return CENTER;
            case 1:
                return SPACE_AROUND;
            case 2:
                return SPACE_EVENLY;
            case 3:
                return FLEX_START;
            case 4:
                return SPACE_BETWEEN;
            case 5:
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
