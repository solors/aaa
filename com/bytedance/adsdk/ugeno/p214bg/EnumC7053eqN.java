package com.bytedance.adsdk.ugeno.p214bg;

/* renamed from: com.bytedance.adsdk.ugeno.bg.eqN */
/* loaded from: classes3.dex */
public enum EnumC7053eqN {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", "float"),
    TRANSLATE_Y("translateY", "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", "float"),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA("opacity", "alpha", "float"),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", "float");
    

    /* renamed from: Lq */
    private final String f15138Lq;

    /* renamed from: vb */
    private final String f15139vb;
    private final String xxp;

    EnumC7053eqN(String str, String str2, String str3) {
        this.f15138Lq = str;
        this.f15139vb = str2;
        this.xxp = str3;
    }

    /* renamed from: IL */
    public String m90183IL() {
        return this.f15139vb;
    }

    /* renamed from: bX */
    public String m90182bX() {
        return this.xxp;
    }

    /* renamed from: bg */
    public String m90181bg() {
        return this.f15138Lq;
    }

    /* renamed from: bg */
    public static EnumC7053eqN m90180bg(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    c = 0;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c = 1;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = 2;
                    break;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    c = 3;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 4;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 5;
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c = 6;
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c = 7;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = '\b';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = '\t';
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c = '\n';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c = 11;
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TRANSLATE_X;
            case 1:
                return TRANSLATE_Y;
            case 2:
                return ALPHA;
            case 3:
                return RIPPLE;
            case 4:
                return SCALE_X;
            case 5:
                return SCALE_Y;
            case 6:
                return SCALE;
            case 7:
                return TRANSLATE;
            case '\b':
                return BACKGROUND_COLOR;
            case '\t':
                return BORDER_RADIUS;
            case '\n':
                return ROTATE_X;
            case 11:
                return ROTATE_Y;
            case '\f':
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
