package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C15633C;
import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.id3.ApicFrame;
import com.monetization.ads.exo.metadata.id3.ChapterFrame;
import com.monetization.ads.exo.metadata.id3.ChapterTocFrame;
import com.monetization.ads.exo.metadata.id3.CommentFrame;
import com.monetization.ads.exo.metadata.id3.GeobFrame;
import com.monetization.ads.exo.metadata.id3.Id3Frame;
import com.monetization.ads.exo.metadata.id3.MlltFrame;
import com.monetization.ads.exo.metadata.id3.PrivFrame;
import com.monetization.ads.exo.metadata.id3.TextInformationFrame;
import com.monetization.ads.exo.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class xf0 extends cu1 {

    /* renamed from: b */
    public static final InterfaceC31817a f87670b = new InterfaceC31817a() { // from class: com.yandex.mobile.ads.impl.s03
        @Override // com.yandex.mobile.ads.impl.xf0.InterfaceC31817a
        /* renamed from: a */
        public final boolean mo27517a(int i, int i2, int i3, int i4, int i5) {
            boolean m27528b;
            m27528b = xf0.m27528b(i, i2, i3, i4, i5);
            return m27528b;
        }
    };
    @Nullable

    /* renamed from: a */
    private final InterfaceC31817a f87671a;

    /* renamed from: com.yandex.mobile.ads.impl.xf0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31817a {
        /* renamed from: a */
        boolean mo27517a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.yandex.mobile.ads.impl.xf0$b */
    /* loaded from: classes8.dex */
    public static final class C31818b {

        /* renamed from: a */
        private final int f87672a;

        /* renamed from: b */
        private final boolean f87673b;

        /* renamed from: c */
        private final int f87674c;

        public C31818b(int i, int i2, boolean z) {
            this.f87672a = i;
            this.f87673b = z;
            this.f87674c = i2;
        }
    }

    public xf0(@Nullable InterfaceC31817a interfaceC31817a) {
        this.f87671a = interfaceC31817a;
    }

    /* renamed from: a */
    private static int m27540a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static String m27529b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C15633C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: d */
    private static PrivFrame m27521d(int i, cc1 cc1Var) throws UnsupportedEncodingException {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        cc1Var.m35294a(bArr, 0, i);
        int m27525b = m27525b(0, bArr);
        String str = new String(bArr, 0, m27525b, C15633C.ISO88591_NAME);
        int i2 = m27525b + 1;
        if (i <= i2) {
            copyOfRange = y32.f88015f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new PrivFrame(str, copyOfRange);
    }

    @Nullable
    /* renamed from: e */
    private static TextInformationFrame m27520e(int i, cc1 cc1Var) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        cc1Var.m35294a(bArr, 0, i2);
        int m27530a = m27530a(bArr, 0, m35270t);
        String str = new String(bArr, 0, m27530a, m27529b);
        int m27540a = m27530a + m27540a(m35270t);
        return new TextInformationFrame("TXXX", str, m27537a(m27540a, m27530a(bArr, m27540a, m35270t), m27529b, bArr));
    }

    @Nullable
    /* renamed from: f */
    private static UrlLinkFrame m27519f(int i, cc1 cc1Var) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        cc1Var.m35294a(bArr, 0, i2);
        int m27530a = m27530a(bArr, 0, m35270t);
        String str = new String(bArr, 0, m27530a, m27529b);
        int m27540a = m27530a + m27540a(m35270t);
        return new UrlLinkFrame("WXXX", str, m27537a(m27540a, m27525b(m27540a, bArr), C15633C.ISO88591_NAME, bArr));
    }

    /* renamed from: g */
    private static int m27518g(int i, cc1 cc1Var) {
        byte[] m35291c = cc1Var.m35291c();
        int m35289d = cc1Var.m35289d();
        int i2 = m35289d;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < m35289d + i) {
                if ((m35291c[i2] & 255) == 255 && m35291c[i3] == 0) {
                    System.arraycopy(m35291c, i2 + 2, m35291c, i3, (i - (i2 - m35289d)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m27528b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: c */
    private static MlltFrame m27522c(int i, cc1 cc1Var) {
        int m35264z = cc1Var.m35264z();
        int m35267w = cc1Var.m35267w();
        int m35267w2 = cc1Var.m35267w();
        int m35270t = cc1Var.m35270t();
        int m35270t2 = cc1Var.m35270t();
        bc1 bc1Var = new bc1();
        bc1Var.m35505a(cc1Var.m35287e(), cc1Var.m35291c());
        bc1Var.m35499c(cc1Var.m35289d() * 8);
        int i2 = ((i - 10) * 8) / (m35270t + m35270t2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m35502b = bc1Var.m35502b(m35270t);
            int m35502b2 = bc1Var.m35502b(m35270t2);
            iArr[i3] = m35502b;
            iArr2[i3] = m35502b2;
        }
        return new MlltFrame(m35264z, m35267w, m35267w2, iArr, iArr2);
    }

    @Override // com.yandex.mobile.ads.impl.cu1
    @Nullable
    /* renamed from: a */
    protected final Metadata mo26258a(gx0 gx0Var, ByteBuffer byteBuffer) {
        return m27533a(byteBuffer.limit(), byteBuffer.array());
    }

    /* renamed from: a */
    private static ApicFrame m27538a(int i, int i2, cc1 cc1Var) throws UnsupportedEncodingException {
        int m27525b;
        String concat;
        byte[] copyOfRange;
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        cc1Var.m35294a(bArr, 0, i3);
        if (i2 == 2) {
            String str = "image/" + C30784lf.m32278b(new String(bArr, 0, 3, C15633C.ISO88591_NAME));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            concat = str;
            m27525b = 2;
        } else {
            m27525b = m27525b(0, bArr);
            String m32278b = C30784lf.m32278b(new String(bArr, 0, m27525b, C15633C.ISO88591_NAME));
            concat = m32278b.indexOf(47) == -1 ? "image/".concat(m32278b) : m32278b;
        }
        int i4 = bArr[m27525b + 1] & 255;
        int i5 = m27525b + 2;
        int m27530a = m27530a(bArr, i5, m35270t);
        String str2 = new String(bArr, i5, m27530a - i5, m27529b);
        int m27540a = m27530a + m27540a(m35270t);
        if (i3 <= m27540a) {
            copyOfRange = y32.f88015f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m27540a, i3);
        }
        return new ApicFrame(concat, str2, i4, copyOfRange);
    }

    /* renamed from: b */
    private static ChapterTocFrame m27524b(cc1 cc1Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC31817a interfaceC31817a) throws UnsupportedEncodingException {
        int m35289d = cc1Var.m35289d();
        int m27525b = m27525b(m35289d, cc1Var.m35291c());
        String str = new String(cc1Var.m35291c(), m35289d, m27525b - m35289d, C15633C.ISO88591_NAME);
        cc1Var.m35286e(m27525b + 1);
        int m35270t = cc1Var.m35270t();
        boolean z2 = (m35270t & 2) != 0;
        boolean z3 = (m35270t & 1) != 0;
        int m35270t2 = cc1Var.m35270t();
        String[] strArr = new String[m35270t2];
        for (int i4 = 0; i4 < m35270t2; i4++) {
            int m35289d2 = cc1Var.m35289d();
            int m27525b2 = m27525b(m35289d2, cc1Var.m35291c());
            strArr[i4] = new String(cc1Var.m35291c(), m35289d2, m27525b2 - m35289d2, C15633C.ISO88591_NAME);
            cc1Var.m35286e(m27525b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m35289d + i;
        while (cc1Var.m35289d() < i5) {
            Id3Frame m27534a = m27534a(i2, cc1Var, z, i3, interfaceC31817a);
            if (m27534a != null) {
                arrayList.add(m27534a);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: a */
    private static ChapterFrame m27531a(cc1 cc1Var, int i, int i2, boolean z, int i3, @Nullable InterfaceC31817a interfaceC31817a) throws UnsupportedEncodingException {
        int m35289d = cc1Var.m35289d();
        int m27525b = m27525b(m35289d, cc1Var.m35291c());
        String str = new String(cc1Var.m35291c(), m35289d, m27525b - m35289d, C15633C.ISO88591_NAME);
        cc1Var.m35286e(m27525b + 1);
        int m35282h = cc1Var.m35282h();
        int m35282h2 = cc1Var.m35282h();
        long m35268v = cc1Var.m35268v();
        long j = m35268v == 4294967295L ? -1L : m35268v;
        long m35268v2 = cc1Var.m35268v();
        long j2 = m35268v2 == 4294967295L ? -1L : m35268v2;
        ArrayList arrayList = new ArrayList();
        int i4 = m35289d + i;
        while (cc1Var.m35289d() < i4) {
            Id3Frame m27534a = m27534a(i2, cc1Var, z, i3, interfaceC31817a);
            if (m27534a != null) {
                arrayList.add(m27534a);
            }
        }
        return new ChapterFrame(str, m35282h, m35282h2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: b */
    private static GeobFrame m27527b(int i, cc1 cc1Var) throws UnsupportedEncodingException {
        byte[] copyOfRange;
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        cc1Var.m35294a(bArr, 0, i2);
        int m27525b = m27525b(0, bArr);
        String str = new String(bArr, 0, m27525b, C15633C.ISO88591_NAME);
        int i3 = m27525b + 1;
        int m27530a = m27530a(bArr, i3, m35270t);
        String m27537a = m27537a(i3, m27530a, m27529b, bArr);
        int m27540a = m27530a + m27540a(m35270t);
        int m27530a2 = m27530a(bArr, m27540a, m35270t);
        String m27537a2 = m27537a(m27540a, m27530a2, m27529b, bArr);
        int m27540a2 = m27530a2 + m27540a(m35270t);
        if (i2 <= m27540a2) {
            copyOfRange = y32.f88015f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m27540a2, i2);
        }
        return new GeobFrame(str, m27537a, m27537a2, copyOfRange);
    }

    @Nullable
    /* renamed from: a */
    private static CommentFrame m27536a(int i, cc1 cc1Var) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        byte[] bArr = new byte[3];
        cc1Var.m35294a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        cc1Var.m35294a(bArr2, 0, i2);
        int m27530a = m27530a(bArr2, 0, m35270t);
        String str2 = new String(bArr2, 0, m27530a, m27529b);
        int m27540a = m27530a + m27540a(m35270t);
        return new CommentFrame(str, str2, m27537a(m27540a, m27530a(bArr2, m27540a, m35270t), m27529b, bArr2));
    }

    /* renamed from: b */
    private static UrlLinkFrame m27526b(int i, cc1 cc1Var, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        cc1Var.m35294a(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m27525b(0, bArr), C15633C.ISO88591_NAME));
    }

    /* renamed from: b */
    private static int m27525b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0195, code lost:
        if (r14 == 67) goto L108;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.monetization.ads.exo.metadata.id3.Id3Frame m27534a(int r19, com.yandex.mobile.ads.impl.cc1 r20, boolean r21, int r22, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.xf0.InterfaceC31817a r23) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xf0.m27534a(int, com.yandex.mobile.ads.impl.cc1, boolean, int, com.yandex.mobile.ads.impl.xf0$a):com.monetization.ads.exo.metadata.id3.Id3Frame");
    }

    /* renamed from: a */
    private static String m27537a(int i, int i2, String str, byte[] bArr) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    @Nullable
    /* renamed from: a */
    private static TextInformationFrame m27535a(int i, cc1 cc1Var, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m35270t = cc1Var.m35270t();
        String m27529b = m27529b(m35270t);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        cc1Var.m35294a(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, m27530a(bArr, 0, m35270t), m27529b));
    }

    /* renamed from: a */
    private static String m27539a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: a */
    private static int m27530a(byte[] bArr, int i, int i2) {
        int m27525b = m27525b(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return m27525b;
        }
        while (m27525b < bArr.length - 1) {
            if ((m27525b - i) % 2 == 0 && bArr[m27525b + 1] == 0) {
                return m27525b;
            }
            m27525b = m27525b(m27525b + 1, bArr);
        }
        return bArr.length;
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
    private static boolean m27532a(com.yandex.mobile.ads.impl.cc1 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m35289d()
        L8:
            int r3 = r18.m35299a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m35282h()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.m35268v()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.m35264z()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m35267w()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m35267w()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m35286e(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.m35286e(r2)
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
            r1.m35286e(r2)
            return r6
        L98:
            int r3 = r18.m35299a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.m35286e(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.m35284f(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.m35286e(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.m35286e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xf0.m27532a(com.yandex.mobile.ads.impl.cc1, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009c  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.monetization.ads.exo.metadata.Metadata m27533a(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xf0.m27533a(int, byte[]):com.monetization.ads.exo.metadata.Metadata");
    }
}
