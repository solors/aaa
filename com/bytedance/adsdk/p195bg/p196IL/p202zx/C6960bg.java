package com.bytedance.adsdk.p195bg.p196IL.p202zx;

/* renamed from: com.bytedance.adsdk.bg.IL.zx.bg */
/* loaded from: classes3.dex */
public class C6960bg {
    /* renamed from: IL */
    public static boolean m90440IL(char c) {
        if (c < 'A' || c > 'Z') {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: bX */
    public static boolean m90439bX(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static boolean m90438bg(char c) {
        if (c == ' ') {
            return true;
        }
        return false;
    }

    public static boolean eqN(char c) {
        if ('+' != c && '-' != c && '*' != c && '/' != c && '%' != c && '=' != c && '>' != c && '<' != c && '!' != c && '&' != c && '|' != c && '?' != c && ':' != c) {
            return false;
        }
        return true;
    }
}
