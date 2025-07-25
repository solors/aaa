package com.google.gson.internal;

/* loaded from: classes5.dex */
public final class JavaVersion {

    /* renamed from: a */
    private static final int f43947a = m66225a();

    private JavaVersion() {
    }

    /* renamed from: a */
    private static int m66225a() {
        return m66223c(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m66224b(String str) {
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

    /* renamed from: c */
    static int m66223c(String str) {
        int m66222d = m66222d(str);
        if (m66222d == -1) {
            m66222d = m66224b(str);
        }
        if (m66222d == -1) {
            return 6;
        }
        return m66222d;
    }

    /* renamed from: d */
    private static int m66222d(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt == 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int getMajorJavaVersion() {
        return f43947a;
    }

    public static boolean isJava9OrLater() {
        if (f43947a >= 9) {
            return true;
        }
        return false;
    }
}
