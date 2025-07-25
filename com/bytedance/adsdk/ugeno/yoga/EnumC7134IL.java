package com.bytedance.adsdk.ugeno.yoga;

import com.meevii.abtest.util.FlowDomainConstant;

/* renamed from: com.bytedance.adsdk.ugeno.yoga.IL */
/* loaded from: classes3.dex */
public enum EnumC7134IL {
    AUTO(0, "auto"),
    FLEX_START(1, "flex_start"),
    CENTER(2, "center"),
    FLEX_END(3, "flex_end"),
    STRETCH(4, "stretch"),
    BASELINE(5, FlowDomainConstant.BASELINE),
    SPACE_BETWEEN(6, "space_between"),
    SPACE_AROUND(7, "space_around");
    

    /* renamed from: WR */
    private final int f15331WR;

    /* renamed from: eo */
    private final String f15332eo;

    EnumC7134IL(int i, String str) {
        this.f15331WR = i;
        this.f15332eo = str;
    }

    /* renamed from: bg */
    public int m89946bg() {
        return this.f15331WR;
    }

    /* renamed from: bg */
    public static EnumC7134IL m89945bg(int i) {
        switch (i) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: bg */
    public static EnumC7134IL m89944bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals(FlowDomainConstant.BASELINE)) {
                    c = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 4;
                    break;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 5;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 6;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return STRETCH;
            case 1:
                return BASELINE;
            case 2:
                return CENTER;
            case 3:
                return SPACE_AROUND;
            case 4:
                return AUTO;
            case 5:
                return FLEX_START;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
