package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.applovin.impl.ji */
/* loaded from: classes2.dex */
public abstract class AbstractC4655ji {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.ji$a */
    /* loaded from: classes2.dex */
    public static class C4656a {

        /* renamed from: a */
        private final UUID f7215a;

        /* renamed from: b */
        private final int f7216b;

        /* renamed from: c */
        private final byte[] f7217c;

        public C4656a(UUID uuid, int i, byte[] bArr) {
            this.f7215a = uuid;
            this.f7216b = i;
            this.f7217c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m98171a(UUID uuid, byte[] bArr) {
        return m98170a(uuid, null, bArr);
    }

    /* renamed from: b */
    private static C4656a m98167b(byte[] bArr) {
        C4066ah c4066ah = new C4066ah(bArr);
        if (c4066ah.m100783e() < 32) {
            return null;
        }
        c4066ah.m100780f(0);
        if (c4066ah.m100775j() != c4066ah.m100797a() + 4 || c4066ah.m100775j() != 1886614376) {
            return null;
        }
        int m98351c = AbstractC4620j1.m98351c(c4066ah.m100775j());
        if (m98351c > 1) {
            AbstractC5063oc.m96800d("PsshAtomUtil", "Unsupported pssh version: " + m98351c);
            return null;
        }
        UUID uuid = new UUID(c4066ah.m100766s(), c4066ah.m100766s());
        if (m98351c == 1) {
            c4066ah.m100778g(c4066ah.m100801A() * 16);
        }
        int m100801A = c4066ah.m100801A();
        if (m100801A != c4066ah.m100797a()) {
            return null;
        }
        byte[] bArr2 = new byte[m100801A];
        c4066ah.m100790a(bArr2, 0, m100801A);
        return new C4656a(uuid, m98351c, bArr2);
    }

    /* renamed from: c */
    public static UUID m98166c(byte[] bArr) {
        C4656a m98167b = m98167b(bArr);
        if (m98167b != null) {
            return m98167b.f7215a;
        }
        return null;
    }

    /* renamed from: d */
    public static int m98165d(byte[] bArr) {
        C4656a m98167b = m98167b(bArr);
        if (m98167b != null) {
            return m98167b.f7216b;
        }
        return -1;
    }

    /* renamed from: a */
    public static byte[] m98170a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: a */
    public static boolean m98169a(byte[] bArr) {
        return m98167b(bArr) != null;
    }

    /* renamed from: a */
    public static byte[] m98168a(byte[] bArr, UUID uuid) {
        C4656a m98167b = m98167b(bArr);
        if (m98167b == null) {
            return null;
        }
        if (uuid.equals(m98167b.f7215a)) {
            return m98167b.f7217c;
        }
        AbstractC5063oc.m96800d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m98167b.f7215a + ".");
        return null;
    }
}
