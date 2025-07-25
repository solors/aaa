package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.pgl.ssdk.d */
/* loaded from: classes7.dex */
public class C26622d {

    /* renamed from: com.pgl.ssdk.d$a */
    /* loaded from: classes7.dex */
    public static class C26623a {

        /* renamed from: a */
        private final long f69896a;

        /* renamed from: b */
        private final InterfaceC26651o f69897b;

        public C26623a(long j, InterfaceC26651o interfaceC26651o) {
            this.f69896a = j;
            this.f69897b = interfaceC26651o;
        }

        /* renamed from: a */
        public InterfaceC26651o m40889a() {
            return this.f69897b;
        }

        /* renamed from: b */
        public long m40888b() {
            return this.f69896a;
        }
    }

    /* renamed from: a */
    public static C26658r m40891a(InterfaceC26651o interfaceC26651o) throws IOException, C26655q {
        C26646m<ByteBuffer, Long> m40817a = AbstractC26649n.m40817a(interfaceC26651o);
        if (m40817a != null) {
            ByteBuffer m40831a = m40817a.m40831a();
            long longValue = m40817a.m40829b().longValue();
            m40831a.order(ByteOrder.LITTLE_ENDIAN);
            long m40811c = AbstractC26649n.m40811c(m40831a);
            if (m40811c <= longValue) {
                long m40810d = AbstractC26649n.m40810d(m40831a);
                long j = m40811c + m40810d;
                if (j <= longValue) {
                    return new C26658r(m40811c, m40810d, AbstractC26649n.m40809e(m40831a), longValue, m40831a);
                }
                throw new C26655q("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j + ", EoCD start: " + longValue);
            }
            throw new C26655q("ZIP Central Directory start offset out of range: " + m40811c + ". ZIP End of Central Directory offset: " + longValue);
        }
        throw new C26655q("ZIP End of Central Directory record not found");
    }

    /* renamed from: a */
    public static C26623a m40890a(InterfaceC26651o interfaceC26651o, C26658r c26658r) throws IOException, C26607b {
        long m40786a = c26658r.m40786a();
        long m40784c = c26658r.m40784c() + m40786a;
        long m40782e = c26658r.m40782e();
        if (m40784c != m40782e) {
            throw new C26607b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + m40784c + ", EoCD start: " + m40782e);
        } else if (m40786a >= 32) {
            ByteBuffer mo40805a = interfaceC26651o.mo40805a(m40786a - 24, 24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            mo40805a.order(byteOrder);
            if (mo40805a.getLong(8) == 2334950737559900225L && mo40805a.getLong(16) == 3617552046287187010L) {
                long j = mo40805a.getLong(0);
                if (j < mo40805a.capacity() || j > 2147483639) {
                    throw new C26607b("APK Signing Block size out of range: ".concat(String.valueOf(j)));
                }
                long j2 = (int) (8 + j);
                long j3 = m40786a - j2;
                if (j3 >= 0) {
                    ByteBuffer mo40805a2 = interfaceC26651o.mo40805a(j3, 8);
                    mo40805a2.order(byteOrder);
                    long j4 = mo40805a2.getLong(0);
                    if (j4 == j) {
                        return new C26623a(j3, interfaceC26651o.mo40804a(j3, j2));
                    }
                    throw new C26607b("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j);
                }
                throw new C26607b("APK Signing Block offset out of range: ".concat(String.valueOf(j3)));
            }
            throw new C26607b("No APK Signing Block before ZIP Central Directory");
        } else {
            throw new C26607b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(m40786a)));
        }
    }
}
