package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14876l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.google.android.exoplayer2.C15633C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n */
/* loaded from: classes4.dex */
public final class C15005n {

    /* renamed from: b */
    public static final int f29441b = AbstractC15133z.m77158a("ID3");

    /* renamed from: a */
    public final C14876l f29442a;

    public C15005n() {
        this.f29442a = null;
    }

    /* renamed from: a */
    public static int m77331a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    public static String m77321b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C15633C.ISO88591_NAME : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: c */
    public static C15008q m77316c(int i, C15121n c15121n) {
        byte[] bArr;
        byte[] bArr2 = new byte[i];
        c15121n.m77205a(bArr2, 0, i);
        int m77318b = m77318b(0, bArr2);
        String str = new String(bArr2, 0, m77318b, C15633C.ISO88591_NAME);
        int i2 = m77318b + 1;
        if (i2 < i) {
            bArr = Arrays.copyOfRange(bArr2, i2, i);
        } else {
            bArr = new byte[0];
        }
        return new C15008q(str, bArr);
    }

    /* renamed from: d */
    public static C15010s m77315d(int i, C15121n c15121n) {
        String str;
        if (i < 1) {
            return null;
        }
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c15121n.m77205a(bArr, 0, i2);
        int m77322a = m77322a(bArr, 0, m77192j);
        String str2 = new String(bArr, 0, m77322a, m77321b);
        int m77331a = m77331a(m77192j) + m77322a;
        if (m77331a < i2) {
            str = new String(bArr, m77331a, m77322a(bArr, m77331a, m77192j) - m77331a, m77321b);
        } else {
            str = "";
        }
        return new C15010s("TXXX", str2, str);
    }

    /* renamed from: e */
    public static C15012u m77314e(int i, C15121n c15121n) {
        String str;
        if (i < 1) {
            return null;
        }
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c15121n.m77205a(bArr, 0, i2);
        int m77322a = m77322a(bArr, 0, m77192j);
        String str2 = new String(bArr, 0, m77322a, m77321b);
        int m77331a = m77331a(m77192j) + m77322a;
        if (m77331a < i2) {
            str = new String(bArr, m77331a, m77318b(m77331a, bArr) - m77331a, C15633C.ISO88591_NAME);
        } else {
            str = "";
        }
        return new C15012u("WXXX", str2, str);
    }

    /* renamed from: f */
    public static int m77313f(int i, C15121n c15121n) {
        byte[] bArr = c15121n.f29804a;
        int i2 = c15121n.f29805b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < i) {
                if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                    System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    /* renamed from: b */
    public static C14999h m77317b(C15121n c15121n, int i, int i2, boolean z, int i3, C14876l c14876l) {
        int i4 = c15121n.f29805b;
        int m77318b = m77318b(i4, c15121n.f29804a);
        String str = new String(c15121n.f29804a, i4, m77318b - i4, C15633C.ISO88591_NAME);
        c15121n.m77197e(m77318b + 1);
        int m77192j = c15121n.m77192j();
        boolean z2 = (m77192j & 2) != 0;
        boolean z3 = (m77192j & 1) != 0;
        int m77192j2 = c15121n.m77192j();
        String[] strArr = new String[m77192j2];
        for (int i5 = 0; i5 < m77192j2; i5++) {
            int i6 = c15121n.f29805b;
            int m77318b2 = m77318b(i6, c15121n.f29804a);
            strArr[i5] = new String(c15121n.f29804a, i6, m77318b2 - i6, C15633C.ISO88591_NAME);
            c15121n.m77197e(m77318b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c15121n.f29805b < i7) {
            AbstractC15006o m77327a = m77327a(i2, c15121n, z, i3, c14876l);
            if (m77327a != null) {
                arrayList.add(m77327a);
            }
        }
        AbstractC15006o[] abstractC15006oArr = new AbstractC15006o[arrayList.size()];
        arrayList.toArray(abstractC15006oArr);
        return new C14999h(str, z2, z3, strArr, abstractC15006oArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.C14991b m77326a(int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15005n.m77326a(int, byte[]):com.fyber.inneractive.sdk.player.exoplayer2.metadata.b");
    }

    public C15005n(C14876l c14876l) {
        this.f29442a = c14876l;
    }

    /* renamed from: b */
    public static C15012u m77319b(int i, C15121n c15121n, String str) {
        byte[] bArr = new byte[i];
        c15121n.m77205a(bArr, 0, i);
        return new C15012u(str, null, new String(bArr, 0, m77318b(0, bArr), C15633C.ISO88591_NAME));
    }

    /* renamed from: b */
    public static C15003l m77320b(int i, C15121n c15121n) {
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c15121n.m77205a(bArr, 0, i2);
        int m77318b = m77318b(0, bArr);
        String str = new String(bArr, 0, m77318b, C15633C.ISO88591_NAME);
        int i3 = m77318b + 1;
        int m77322a = m77322a(bArr, i3, m77192j);
        String str2 = new String(bArr, i3, m77322a - i3, m77321b);
        int m77331a = m77331a(m77192j) + m77322a;
        int m77322a2 = m77322a(bArr, m77331a, m77192j);
        return new C15003l(str, str2, new String(bArr, m77331a, m77322a2 - m77331a, m77321b), Arrays.copyOfRange(bArr, m77331a(m77192j) + m77322a2, i2));
    }

    /* renamed from: a */
    public static C14997f m77323a(C15121n c15121n, int i, int i2, boolean z, int i3, C14876l c14876l) {
        int i4 = c15121n.f29805b;
        int m77318b = m77318b(i4, c15121n.f29804a);
        String str = new String(c15121n.f29804a, i4, m77318b - i4, C15633C.ISO88591_NAME);
        c15121n.m77197e(m77318b + 1);
        int m77204b = c15121n.m77204b();
        int m77204b2 = c15121n.m77204b();
        long m77191k = c15121n.m77191k();
        long j = m77191k == 4294967295L ? -1L : m77191k;
        long m77191k2 = c15121n.m77191k();
        long j2 = m77191k2 == 4294967295L ? -1L : m77191k2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c15121n.f29805b < i5) {
            AbstractC15006o m77327a = m77327a(i2, c15121n, z, i3, c14876l);
            if (m77327a != null) {
                arrayList.add(m77327a);
            }
        }
        AbstractC15006o[] abstractC15006oArr = new AbstractC15006o[arrayList.size()];
        arrayList.toArray(abstractC15006oArr);
        return new C14997f(str, m77204b, m77204b2, j, j2, abstractC15006oArr);
    }

    /* renamed from: b */
    public static int m77318b(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        r4 = false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m77324a(com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15005n.m77324a(com.fyber.inneractive.sdk.player.exoplayer2.util.n, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0192, code lost:
        if (r12 == 67) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4 A[Catch: all -> 0x0135, UnsupportedEncodingException -> 0x0213, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0213, blocks: (B:162:0x01f4, B:152:0x01c0, B:159:0x01d0, B:160:0x01e1), top: B:171:0x0119 }] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC15006o m77327a(int r20, com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n r21, boolean r22, int r23, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14876l r24) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15005n.m77327a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o");
    }

    /* renamed from: a */
    public static C15010s m77328a(int i, C15121n c15121n, String str) {
        if (i < 1) {
            return null;
        }
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c15121n.m77205a(bArr, 0, i2);
        return new C15010s(str, null, new String(bArr, 0, m77322a(bArr, 0, m77192j), m77321b));
    }

    /* renamed from: a */
    public static C14993b m77325a(C15121n c15121n, int i, int i2) {
        int m77318b;
        String concat;
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c15121n.m77205a(bArr, 0, i3);
        if (i2 == 2) {
            concat = "image/" + new String(bArr, 0, 3, C15633C.ISO88591_NAME).toLowerCase(Locale.US);
            if (concat.equals("image/jpg")) {
                concat = "image/jpeg";
            }
            m77318b = 2;
        } else {
            m77318b = m77318b(0, bArr);
            String lowerCase = new String(bArr, 0, m77318b, C15633C.ISO88591_NAME).toLowerCase(Locale.US);
            concat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i4 = m77318b + 2;
        int m77322a = m77322a(bArr, i4, m77192j);
        return new C14993b(concat, new String(bArr, i4, m77322a - i4, m77321b), bArr[m77318b + 1] & 255, Arrays.copyOfRange(bArr, m77331a(m77192j) + m77322a, i3));
    }

    /* renamed from: a */
    public static C15001j m77329a(int i, C15121n c15121n) {
        if (i < 4) {
            return null;
        }
        int m77192j = c15121n.m77192j();
        String m77321b = m77321b(m77192j);
        byte[] bArr = new byte[3];
        c15121n.m77205a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c15121n.m77205a(bArr2, 0, i2);
        int m77322a = m77322a(bArr2, 0, m77192j);
        String str2 = new String(bArr2, 0, m77322a, m77321b);
        int m77331a = m77331a(m77192j) + m77322a;
        return new C15001j(str, str2, m77331a < i2 ? new String(bArr2, m77331a, m77322a(bArr2, m77331a, m77192j) - m77331a, m77321b) : "");
    }

    /* renamed from: a */
    public static String m77330a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: a */
    public static int m77322a(byte[] bArr, int i, int i2) {
        int m77318b = m77318b(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return m77318b;
        }
        while (m77318b < bArr.length - 1) {
            if (m77318b % 2 == 0 && bArr[m77318b + 1] == 0) {
                return m77318b;
            }
            m77318b = m77318b(m77318b + 1, bArr);
        }
        return bArr.length;
    }
}
