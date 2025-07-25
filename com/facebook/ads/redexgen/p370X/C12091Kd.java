package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Kd */
/* loaded from: assets/audience_network.dex */
public final class C12091Kd {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C12091Kd> A02 = new ThreadLocal<>();
    public final C12074KM A00 = new C12074KM();

    public static C12074KM A00() {
        return A02().A00;
    }

    public static C12074KM A01(C12090Kc c12090Kc) {
        C12074KM currentStackTraces = new C12074KM(A00());
        currentStackTraces.add(c12090Kc);
        return currentStackTraces;
    }

    public static C12091Kd A02() {
        C12091Kd c12091Kd = A02.get();
        if (c12091Kd == null) {
            C12091Kd c12091Kd2 = new C12091Kd();
            A02.set(c12091Kd2);
            return c12091Kd2;
        }
        return c12091Kd;
    }

    public static void A03(AbstractRunnableC12086KY abstractRunnableC12086KY) {
        C12074KM A05 = abstractRunnableC12086KY.A05();
        if (A05 != null) {
            C12074KM createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(A05);
        }
    }

    public static void A04(AbstractRunnableC12086KY abstractRunnableC12086KY) {
        C12074KM A05 = abstractRunnableC12086KY.A05();
        if (A05 != null) {
            C12074KM c12074km = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c12074km.removeAll(A05);
        }
    }
}
