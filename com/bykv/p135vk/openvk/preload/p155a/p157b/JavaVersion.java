package com.bykv.p135vk.openvk.preload.p155a.p157b;

/* renamed from: com.bykv.vk.openvk.preload.a.b.d */
/* loaded from: classes3.dex */
public final class JavaVersion {

    /* renamed from: a */
    private static final int f13774a;

    static {
        String property = System.getProperty("java.version");
        int m91587a = m91587a(property);
        if (m91587a == -1) {
            m91587a = m91585b(property);
        }
        if (m91587a == -1) {
            m91587a = 6;
        }
        f13774a = m91587a;
    }

    /* renamed from: a */
    private static int m91587a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static int m91585b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m91588a() {
        return f13774a;
    }

    /* renamed from: b */
    public static boolean m91586b() {
        return f13774a >= 9;
    }
}
