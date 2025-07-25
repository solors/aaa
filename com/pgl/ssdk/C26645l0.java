package com.pgl.ssdk;

/* renamed from: com.pgl.ssdk.l0 */
/* loaded from: classes7.dex */
public class C26645l0 {

    /* renamed from: a */
    public static int f69920a = -1;

    /* renamed from: a */
    public static void m40833a(int i) {
        f69920a = i;
    }

    /* renamed from: b */
    public static String m40832b() {
        int i = f69920a;
        if (i != 0) {
            if (i != 1) {
                return "";
            }
            return "https://ssdk-va.pangle.io/ssdk/sd/token";
        }
        return "https://ssdk-sg.pangle.io/ssdk/sd/token";
    }

    /* renamed from: a */
    public static String m40834a() {
        int i = f69920a;
        return i != 0 ? i != 1 ? "" : "https://ssdk-va.pangle.io/ssdk/v2/r" : "https://ssdk-sg.pangle.io/ssdk/v2/r";
    }
}
