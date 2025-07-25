package com.applovin.impl;

/* renamed from: com.applovin.impl.c3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4160c3 {
    /* renamed from: a */
    public static void m100276a(long j, C4066ah c4066ah, InterfaceC5209qo[] interfaceC5209qoArr) {
        while (true) {
            if (c4066ah.m100797a() <= 1) {
                return;
            }
            int m100275a = m100275a(c4066ah);
            int m100275a2 = m100275a(c4066ah);
            int m100785d = c4066ah.m100785d() + m100275a2;
            if (m100275a2 == -1 || m100275a2 > c4066ah.m100797a()) {
                AbstractC5063oc.m96800d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m100785d = c4066ah.m100783e();
            } else if (m100275a == 4 && m100275a2 >= 8) {
                int m100762w = c4066ah.m100762w();
                int m100799C = c4066ah.m100799C();
                int m100775j = m100799C == 49 ? c4066ah.m100775j() : 0;
                int m100762w2 = c4066ah.m100762w();
                if (m100799C == 47) {
                    c4066ah.m100778g(1);
                }
                boolean z = m100762w == 181 && (m100799C == 49 || m100799C == 47) && m100762w2 == 3;
                if (m100799C == 49) {
                    z &= m100775j == 1195456820;
                }
                if (z) {
                    m100274b(j, c4066ah, interfaceC5209qoArr);
                }
            }
            c4066ah.m100780f(m100785d);
        }
    }

    /* renamed from: b */
    public static void m100274b(long j, C4066ah c4066ah, InterfaceC5209qo[] interfaceC5209qoArr) {
        int m100762w = c4066ah.m100762w();
        if ((m100762w & 64) != 0) {
            c4066ah.m100778g(1);
            int i = (m100762w & 31) * 3;
            int m100785d = c4066ah.m100785d();
            for (InterfaceC5209qo interfaceC5209qo : interfaceC5209qoArr) {
                c4066ah.m100780f(m100785d);
                interfaceC5209qo.m96253a(c4066ah, i);
                if (j != -9223372036854775807L) {
                    interfaceC5209qo.mo96254a(j, 1, i, 0, null);
                }
            }
        }
    }

    /* renamed from: a */
    private static int m100275a(C4066ah c4066ah) {
        int i = 0;
        while (c4066ah.m100797a() != 0) {
            int m100762w = c4066ah.m100762w();
            i += m100762w;
            if (m100762w != 255) {
                return i;
            }
        }
        return -1;
    }
}
