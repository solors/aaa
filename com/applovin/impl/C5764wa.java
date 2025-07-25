package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.C15633C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.applovin.impl.wa */
/* loaded from: classes2.dex */
public final class C5764wa extends AbstractC4267dk {

    /* renamed from: b */
    public static final InterfaceC5765a f11696b = new InterfaceC5765a() { // from class: com.applovin.impl.m70
        @Override // com.applovin.impl.C5764wa.InterfaceC5765a
        /* renamed from: a */
        public final boolean mo93355a(int i, int i2, int i3, int i4, int i5) {
            boolean m93613b;
            m93613b = C5764wa.m93613b(i, i2, i3, i4, i5);
            return m93613b;
        }
    };

    /* renamed from: a */
    private final InterfaceC5765a f11697a;

    /* renamed from: com.applovin.impl.wa$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5765a {
        /* renamed from: a */
        boolean mo93355a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.applovin.impl.wa$b */
    /* loaded from: classes2.dex */
    public static final class C5766b {

        /* renamed from: a */
        private final int f11698a;

        /* renamed from: b */
        private final boolean f11699b;

        /* renamed from: c */
        private final int f11700c;

        public C5766b(int i, boolean z, int i2) {
            this.f11698a = i;
            this.f11699b = z;
            this.f11700c = i2;
        }
    }

    public C5764wa() {
        this(null);
    }

    /* renamed from: a */
    private static int m93627a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static String m93614b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C15633C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: d */
    private static C5700vh m93604d(C4066ah c4066ah, int i) {
        byte[] bArr = new byte[i];
        c4066ah.m100790a(bArr, 0, i);
        int m93609b = m93609b(bArr, 0);
        return new C5700vh(new String(bArr, 0, m93609b, C15633C.ISO88591_NAME), m93616a(bArr, m93609b + 1, i));
    }

    /* renamed from: e */
    private static C5986zn m93603e(C4066ah c4066ah, int i) {
        if (i < 1) {
            return null;
        }
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4066ah.m100790a(bArr, 0, i2);
        int m93608b = m93608b(bArr, 0, m100762w);
        String str = new String(bArr, 0, m93608b, m93614b);
        int m93627a = m93608b + m93627a(m100762w);
        return new C5986zn("TXXX", str, m93615a(bArr, m93627a, m93608b(bArr, m93627a, m100762w), m93614b));
    }

    /* renamed from: f */
    private static C5654up m93602f(C4066ah c4066ah, int i) {
        if (i < 1) {
            return null;
        }
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4066ah.m100790a(bArr, 0, i2);
        int m93608b = m93608b(bArr, 0, m100762w);
        String str = new String(bArr, 0, m93608b, m93614b);
        int m93627a = m93608b + m93627a(m100762w);
        return new C5654up("WXXX", str, m93615a(bArr, m93627a, m93609b(bArr, m93627a), C15633C.ISO88591_NAME));
    }

    /* renamed from: g */
    private static int m93601g(C4066ah c4066ah, int i) {
        byte[] m100787c = c4066ah.m100787c();
        int m100785d = c4066ah.m100785d();
        int i2 = m100785d;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < m100785d + i) {
                if ((m100787c[i2] & 255) == 255 && m100787c[i3] == 0) {
                    System.arraycopy(m100787c, i2 + 2, m100787c, i3, (i - (i2 - m100785d)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    public C5764wa(InterfaceC5765a interfaceC5765a) {
        this.f11697a = interfaceC5765a;
    }

    /* renamed from: a */
    private static byte[] m93616a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return AbstractC5863xp.f12156f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m93613b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: c */
    private static C4585if m93606c(C4066ah c4066ah, int i) {
        int m100799C = c4066ah.m100799C();
        int m100759z = c4066ah.m100759z();
        int m100759z2 = c4066ah.m100759z();
        int m100762w = c4066ah.m100762w();
        int m100762w2 = c4066ah.m100762w();
        C5971zg c5971zg = new C5971zg();
        c5971zg.m92400a(c4066ah);
        int i2 = ((i - 10) * 8) / (m100762w + m100762w2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m92403a = c5971zg.m92403a(m100762w);
            int m92403a2 = c5971zg.m92403a(m100762w2);
            iArr[i3] = m92403a;
            iArr2[i3] = m92403a2;
        }
        return new C4585if(m100799C, m100759z, m100759z2, iArr, iArr2);
    }

    /* renamed from: b */
    private static C4376f3 m93611b(C4066ah c4066ah, int i, int i2, boolean z, int i3, InterfaceC5765a interfaceC5765a) {
        int m100785d = c4066ah.m100785d();
        int m93609b = m93609b(c4066ah.m100787c(), m100785d);
        String str = new String(c4066ah.m100787c(), m100785d, m93609b - m100785d, C15633C.ISO88591_NAME);
        c4066ah.m100780f(m93609b + 1);
        int m100762w = c4066ah.m100762w();
        boolean z2 = (m100762w & 2) != 0;
        boolean z3 = (m100762w & 1) != 0;
        int m100762w2 = c4066ah.m100762w();
        String[] strArr = new String[m100762w2];
        for (int i4 = 0; i4 < m100762w2; i4++) {
            int m100785d2 = c4066ah.m100785d();
            int m93609b2 = m93609b(c4066ah.m100787c(), m100785d2);
            strArr[i4] = new String(c4066ah.m100787c(), m100785d2, m93609b2 - m100785d2, C15633C.ISO88591_NAME);
            c4066ah.m100780f(m93609b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m100785d + i;
        while (c4066ah.m100785d() < i5) {
            AbstractC5837xa m93625a = m93625a(i2, c4066ah, z, i3, interfaceC5765a);
            if (m93625a != null) {
                arrayList.add(m93625a);
            }
        }
        return new C4376f3(str, z2, z3, strArr, (AbstractC5837xa[]) arrayList.toArray(new AbstractC5837xa[0]));
    }

    @Override // com.applovin.impl.AbstractC4267dk
    /* renamed from: a */
    protected C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer) {
        return m93617a(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: a */
    private static C5669v0 m93622a(C4066ah c4066ah, int i, int i2) {
        int m93609b;
        String str;
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c4066ah.m100790a(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, C15633C.ISO88591_NAME));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m93609b = 2;
        } else {
            m93609b = m93609b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, m93609b, C15633C.ISO88591_NAME));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = m93609b + 2;
        int m93608b = m93608b(bArr, i4, m100762w);
        return new C5669v0(str, new String(bArr, i4, m93608b - i4, m93614b), bArr[m93609b + 1] & 255, m93616a(bArr, m93608b + m93627a(m100762w), i3));
    }

    /* renamed from: c */
    private static C5654up m93605c(C4066ah c4066ah, int i, String str) {
        byte[] bArr = new byte[i];
        c4066ah.m100790a(bArr, 0, i);
        return new C5654up(str, null, new String(bArr, 0, m93609b(bArr, 0), C15633C.ISO88591_NAME));
    }

    /* renamed from: a */
    private static C4502h2 m93619a(C4066ah c4066ah, int i, String str) {
        byte[] bArr = new byte[i];
        c4066ah.m100790a(bArr, 0, i);
        return new C4502h2(str, bArr);
    }

    /* renamed from: b */
    private static C5962z9 m93612b(C4066ah c4066ah, int i) {
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4066ah.m100790a(bArr, 0, i2);
        int m93609b = m93609b(bArr, 0);
        String str = new String(bArr, 0, m93609b, C15633C.ISO88591_NAME);
        int i3 = m93609b + 1;
        int m93608b = m93608b(bArr, i3, m100762w);
        String m93615a = m93615a(bArr, i3, m93608b, m93614b);
        int m93627a = m93608b + m93627a(m100762w);
        int m93608b2 = m93608b(bArr, m93627a, m100762w);
        return new C5962z9(str, m93615a, m93615a(bArr, m93627a, m93608b2, m93614b), m93616a(bArr, m93608b2 + m93627a(m100762w), i2));
    }

    /* renamed from: a */
    private static C4302e3 m93620a(C4066ah c4066ah, int i, int i2, boolean z, int i3, InterfaceC5765a interfaceC5765a) {
        int m100785d = c4066ah.m100785d();
        int m93609b = m93609b(c4066ah.m100787c(), m100785d);
        String str = new String(c4066ah.m100787c(), m100785d, m93609b - m100785d, C15633C.ISO88591_NAME);
        c4066ah.m100780f(m93609b + 1);
        int m100775j = c4066ah.m100775j();
        int m100775j2 = c4066ah.m100775j();
        long m100760y = c4066ah.m100760y();
        long j = m100760y == 4294967295L ? -1L : m100760y;
        long m100760y2 = c4066ah.m100760y();
        long j2 = m100760y2 == 4294967295L ? -1L : m100760y2;
        ArrayList arrayList = new ArrayList();
        int i4 = m100785d + i;
        while (c4066ah.m100785d() < i4) {
            AbstractC5837xa m93625a = m93625a(i2, c4066ah, z, i3, interfaceC5765a);
            if (m93625a != null) {
                arrayList.add(m93625a);
            }
        }
        return new C4302e3(str, m100775j, m100775j2, j, j2, (AbstractC5837xa[]) arrayList.toArray(new AbstractC5837xa[0]));
    }

    /* renamed from: b */
    private static C5986zn m93610b(C4066ah c4066ah, int i, String str) {
        if (i < 1) {
            return null;
        }
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c4066ah.m100790a(bArr, 0, i2);
        return new C5986zn(str, null, new String(bArr, 0, m93608b(bArr, 0, m100762w), m93614b));
    }

    /* renamed from: a */
    private static C5597u3 m93623a(C4066ah c4066ah, int i) {
        if (i < 4) {
            return null;
        }
        int m100762w = c4066ah.m100762w();
        String m93614b = m93614b(m100762w);
        byte[] bArr = new byte[3];
        c4066ah.m100790a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c4066ah.m100790a(bArr2, 0, i2);
        int m93608b = m93608b(bArr2, 0, m100762w);
        String str2 = new String(bArr2, 0, m93608b, m93614b);
        int m93627a = m93608b + m93627a(m100762w);
        return new C5597u3(str, str2, m93615a(bArr2, m93627a, m93608b(bArr2, m93627a, m100762w), m93614b));
    }

    /* renamed from: b */
    private static int m93608b(byte[] bArr, int i, int i2) {
        int m93609b = m93609b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return m93609b;
        }
        while (m93609b < bArr.length - 1) {
            if ((m93609b - i) % 2 == 0 && bArr[m93609b + 1] == 0) {
                return m93609b;
            }
            m93609b = m93609b(bArr, m93609b + 1);
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static int m93609b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x018b, code lost:
        if (r13 == 67) goto L98;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.AbstractC5837xa m93625a(int r19, com.applovin.impl.C4066ah r20, boolean r21, int r22, com.applovin.impl.C5764wa.InterfaceC5765a r23) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5764wa.m93625a(int, com.applovin.impl.ah, boolean, int, com.applovin.impl.wa$a):com.applovin.impl.xa");
    }

    /* renamed from: a */
    private static C5766b m93624a(C4066ah c4066ah) {
        int m100759z;
        if (c4066ah.m100797a() < 10) {
            AbstractC5063oc.m96800d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        boolean z = false;
        if (c4066ah.m100759z() != 4801587) {
            AbstractC5063oc.m96800d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(m100759z)));
            return null;
        }
        int m100762w = c4066ah.m100762w();
        c4066ah.m100778g(1);
        int m100762w2 = c4066ah.m100762w();
        int m100763v = c4066ah.m100763v();
        if (m100762w == 2) {
            if ((m100762w2 & 64) != 0) {
                AbstractC5063oc.m96800d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (m100762w == 3) {
            if ((m100762w2 & 64) != 0) {
                int m100775j = c4066ah.m100775j();
                c4066ah.m100778g(m100775j);
                m100763v -= m100775j + 4;
            }
        } else if (m100762w != 4) {
            AbstractC5063oc.m96800d("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + m100762w);
            return null;
        } else {
            if ((m100762w2 & 64) != 0) {
                int m100763v2 = c4066ah.m100763v();
                c4066ah.m100778g(m100763v2 - 4);
                m100763v -= m100763v2;
            }
            if ((m100762w2 & 16) != 0) {
                m100763v -= 10;
            }
        }
        if (m100762w < 4 && (m100762w2 & 128) != 0) {
            z = true;
        }
        return new C5766b(m100762w, z, m100763v);
    }

    /* renamed from: a */
    private static String m93615a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: a */
    private static String m93626a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0084, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0087, code lost:
        r4 = false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m93621a(com.applovin.impl.C4066ah r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m100785d()
        L8:
            int r3 = r18.m100797a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m100775j()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.m100760y()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.m100799C()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m100759z()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m100759z()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m100780f(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.m100780f(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L87
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.m100780f(r2)
            return r6
        L98:
            int r3 = r18.m100797a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.m100780f(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.m100778g(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.m100780f(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.m100780f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5764wa.m93621a(com.applovin.impl.ah, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public C4061af m93617a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C4066ah c4066ah = new C4066ah(bArr, i);
        C5766b m93624a = m93624a(c4066ah);
        if (m93624a == null) {
            return null;
        }
        int m100785d = c4066ah.m100785d();
        int i2 = m93624a.f11698a == 2 ? 6 : 10;
        int i3 = m93624a.f11700c;
        if (m93624a.f11699b) {
            i3 = m93601g(c4066ah, m93624a.f11700c);
        }
        c4066ah.m100782e(m100785d + i3);
        boolean z = false;
        if (!m93621a(c4066ah, m93624a.f11698a, i2, false)) {
            if (m93624a.f11698a != 4 || !m93621a(c4066ah, 4, i2, true)) {
                AbstractC5063oc.m96800d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m93624a.f11698a);
                return null;
            }
            z = true;
        }
        while (c4066ah.m100797a() >= i2) {
            AbstractC5837xa m93625a = m93625a(m93624a.f11698a, c4066ah, z, i2, this.f11697a);
            if (m93625a != null) {
                arrayList.add(m93625a);
            }
        }
        return new C4061af(arrayList);
    }
}
