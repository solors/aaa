package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.z8 */
/* loaded from: classes2.dex */
public final class C5960z8 {

    /* renamed from: a */
    public final int f12520a;

    /* renamed from: b */
    public final int f12521b;

    /* renamed from: c */
    public final int f12522c;

    /* renamed from: d */
    public final int f12523d;

    /* renamed from: e */
    public final int f12524e;

    /* renamed from: f */
    public final int f12525f;

    /* renamed from: g */
    public final int f12526g;

    /* renamed from: h */
    public final int f12527h;

    /* renamed from: i */
    public final int f12528i;

    /* renamed from: j */
    public final long f12529j;

    /* renamed from: k */
    public final C5961a f12530k;

    /* renamed from: l */
    private final C4061af f12531l;

    /* renamed from: com.applovin.impl.z8$a */
    /* loaded from: classes2.dex */
    public static class C5961a {

        /* renamed from: a */
        public final long[] f12532a;

        /* renamed from: b */
        public final long[] f12533b;

        public C5961a(long[] jArr, long[] jArr2) {
            this.f12532a = jArr;
            this.f12533b = jArr2;
        }
    }

    private C5960z8(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C5961a c5961a, C4061af c4061af) {
        this.f12520a = i;
        this.f12521b = i2;
        this.f12522c = i3;
        this.f12523d = i4;
        this.f12524e = i5;
        this.f12525f = m92460b(i5);
        this.f12526g = i6;
        this.f12527h = i7;
        this.f12528i = m92468a(i7);
        this.f12529j = j;
        this.f12530k = c5961a;
        this.f12531l = c4061af;
    }

    /* renamed from: a */
    private static int m92468a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m92460b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private static C4061af m92463a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] m92984b = AbstractC5863xp.m92984b(str, "=");
            if (m92984b.length != 2) {
                AbstractC5063oc.m96800d("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new C4285dr(m92984b[0], m92984b[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4061af(arrayList);
    }

    /* renamed from: b */
    public C5960z8 m92459b(List list) {
        return new C5960z8(this.f12520a, this.f12521b, this.f12522c, this.f12523d, this.f12524e, this.f12526g, this.f12527h, this.f12529j, this.f12530k, m92466a(m92463a(list, Collections.emptyList())));
    }

    /* renamed from: b */
    public long m92461b() {
        long j = this.f12529j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f12524e;
    }

    /* renamed from: a */
    public C5960z8 m92464a(List list) {
        return new C5960z8(this.f12520a, this.f12521b, this.f12522c, this.f12523d, this.f12524e, this.f12526g, this.f12527h, this.f12529j, this.f12530k, m92466a(m92463a(Collections.emptyList(), list)));
    }

    public C5960z8(byte[] bArr, int i) {
        C5971zg c5971zg = new C5971zg(bArr);
        c5971zg.m92392c(i * 8);
        this.f12520a = c5971zg.m92403a(16);
        this.f12521b = c5971zg.m92403a(16);
        this.f12522c = c5971zg.m92403a(24);
        this.f12523d = c5971zg.m92403a(24);
        int m92403a = c5971zg.m92403a(20);
        this.f12524e = m92403a;
        this.f12525f = m92460b(m92403a);
        this.f12526g = c5971zg.m92403a(3) + 1;
        int m92403a2 = c5971zg.m92403a(5) + 1;
        this.f12527h = m92403a2;
        this.f12528i = m92468a(m92403a2);
        this.f12529j = c5971zg.m92395b(36);
        this.f12530k = null;
        this.f12531l = null;
    }

    /* renamed from: a */
    public long m92469a() {
        long j;
        long j2;
        int i = this.f12523d;
        if (i > 0) {
            j = (i + this.f12522c) / 2;
            j2 = 1;
        } else {
            int i2 = this.f12520a;
            j = ((((i2 != this.f12521b || i2 <= 0) ? 4096L : i2) * this.f12526g) * this.f12527h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: a */
    public C4310e9 m92462a(byte[] bArr, C4061af c4061af) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i = this.f12523d;
        if (i <= 0) {
            i = -1;
        }
        return new C4310e9.C4312b().m99606f("audio/flac").m99601i(i).m99617c(this.f12526g).m99591n(this.f12524e).m99623a(Collections.singletonList(bArr)).m99628a(m92466a(c4061af)).m99632a();
    }

    /* renamed from: a */
    public C4061af m92466a(C4061af c4061af) {
        C4061af c4061af2 = this.f12531l;
        return c4061af2 == null ? c4061af : c4061af2.m100809a(c4061af);
    }

    /* renamed from: a */
    public long m92467a(long j) {
        return AbstractC5863xp.m92990b((j * this.f12524e) / 1000000, 0L, this.f12529j - 1);
    }

    /* renamed from: a */
    public C5960z8 m92465a(C5961a c5961a) {
        return new C5960z8(this.f12520a, this.f12521b, this.f12522c, this.f12523d, this.f12524e, this.f12526g, this.f12527h, this.f12529j, c5961a, this.f12531l);
    }
}
