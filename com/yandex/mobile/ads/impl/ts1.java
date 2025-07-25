package com.yandex.mobile.ads.impl;

import com.monetization.ads.exo.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class ts1 {

    /* renamed from: d */
    private static final bx1 f85839d = bx1.m35422a(':');

    /* renamed from: e */
    private static final bx1 f85840e = bx1.m35422a('*');

    /* renamed from: a */
    private final ArrayList f85841a = new ArrayList();

    /* renamed from: b */
    private int f85842b = 0;

    /* renamed from: c */
    private int f85843c;

    /* renamed from: com.yandex.mobile.ads.impl.ts1$a */
    /* loaded from: classes8.dex */
    private static final class C31485a {

        /* renamed from: a */
        public final long f85844a;

        /* renamed from: b */
        public final int f85845b;

        public C31485a(int i, long j) {
            this.f85844a = j;
            this.f85845b = i;
        }
    }

    /* renamed from: a */
    public final void m29048a(o50 o50Var, of1 of1Var, ArrayList arrayList) throws IOException {
        char c;
        int i = this.f85842b;
        if (i == 0) {
            long j = 0;
            long mo27618b = o50Var.mo27618b();
            if (mo27618b != -1 && mo27618b >= 8) {
                j = mo27618b - 8;
            }
            of1Var.f83478a = j;
            this.f85842b = 1;
        } else if (i == 1) {
            cc1 cc1Var = new cc1(8);
            o50Var.mo27616b(cc1Var.m35291c(), 0, 8);
            this.f85843c = cc1Var.m35279k() + 8;
            if (cc1Var.m35282h() != 1397048916) {
                of1Var.f83478a = 0L;
                return;
            }
            of1Var.f83478a = o50Var.mo27622a() - (this.f85843c - 12);
            this.f85842b = 2;
        } else {
            char c2 = 2820;
            short s = 2819;
            short s2 = 2817;
            short s3 = 2816;
            if (i == 2) {
                long mo27618b2 = o50Var.mo27618b();
                int i2 = this.f85843c - 20;
                cc1 cc1Var2 = new cc1(i2);
                o50Var.mo27616b(cc1Var2.m35291c(), 0, i2);
                int i3 = 0;
                while (i3 < i2 / 12) {
                    cc1Var2.m35284f(2);
                    short m35277m = cc1Var2.m35277m();
                    if (m35277m != 2192 && m35277m != s3 && m35277m != s2 && m35277m != s) {
                        if (m35277m != 2820) {
                            cc1Var2.m35284f(8);
                            i3++;
                            s = 2819;
                            s2 = 2817;
                            s3 = 2816;
                        }
                    }
                    this.f85841a.add(new C31485a(cc1Var2.m35279k(), (mo27618b2 - this.f85843c) - cc1Var2.m35279k()));
                    i3++;
                    s = 2819;
                    s2 = 2817;
                    s3 = 2816;
                }
                if (this.f85841a.isEmpty()) {
                    of1Var.f83478a = 0L;
                    return;
                }
                this.f85842b = 3;
                of1Var.f83478a = ((C31485a) this.f85841a.get(0)).f85844a;
            } else if (i == 3) {
                long mo27622a = o50Var.mo27622a();
                int mo27618b3 = (int) ((o50Var.mo27618b() - o50Var.mo27622a()) - this.f85843c);
                cc1 cc1Var3 = new cc1(mo27618b3);
                o50Var.mo27616b(cc1Var3.m35291c(), 0, mo27618b3);
                int i4 = 0;
                while (i4 < this.f85841a.size()) {
                    C31485a c31485a = (C31485a) this.f85841a.get(i4);
                    cc1Var3.m35286e((int) (c31485a.f85844a - mo27622a));
                    cc1Var3.m35284f(4);
                    int m35279k = cc1Var3.m35279k();
                    Charset charset = C30572in.f80564c;
                    String m35297a = cc1Var3.m35297a(m35279k, charset);
                    m35297a.hashCode();
                    char c3 = 65535;
                    switch (m35297a.hashCode()) {
                        case -1711564334:
                            if (m35297a.equals("SlowMotion_Data")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1332107749:
                            if (m35297a.equals("Super_SlowMotion_Edit_Data")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -1251387154:
                            if (m35297a.equals("Super_SlowMotion_Data")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -830665521:
                            if (m35297a.equals("Super_SlowMotion_Deflickering_On")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 1760745220:
                            if (m35297a.equals("Super_SlowMotion_BGM")) {
                                c3 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            c = 2192;
                            break;
                        case 1:
                            c = 2819;
                            break;
                        case 2:
                            c = 2816;
                            break;
                        case 3:
                            c = c2;
                            break;
                        case 4:
                            c = 2817;
                            break;
                        default:
                            throw gc1.m33885a("Invalid SEF name", (Exception) null);
                    }
                    int i5 = c31485a.f85845b - (m35279k + 8);
                    if (c == 2192) {
                        ArrayList arrayList2 = new ArrayList();
                        List<String> m35420a = f85840e.m35420a(cc1Var3.m35297a(i5, charset));
                        for (int i6 = 0; i6 < m35420a.size(); i6++) {
                            List<String> m35420a2 = f85839d.m35420a(m35420a.get(i6));
                            if (m35420a2.size() == 3) {
                                try {
                                    arrayList2.add(new SlowMotionData.Segment(1 << (Integer.parseInt(m35420a2.get(2)) - 1), Long.parseLong(m35420a2.get(0)), Long.parseLong(m35420a2.get(1))));
                                } catch (NumberFormatException e) {
                                    throw gc1.m33885a((String) null, (Exception) e);
                                }
                            } else {
                                throw gc1.m33885a((String) null, (Exception) null);
                            }
                        }
                        arrayList.add(new SlowMotionData(arrayList2));
                    } else if (c != 2816 && c != 2817 && c != 2819 && c != c2) {
                        throw new IllegalStateException();
                    }
                    i4++;
                    c2 = 2820;
                }
                of1Var.f83478a = 0L;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    public final void m29049a() {
        this.f85841a.clear();
        this.f85842b = 0;
    }
}
