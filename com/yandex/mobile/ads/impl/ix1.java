package com.yandex.mobile.ads.impl;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C31840xt;
import com.yandex.mobile.ads.impl.kx1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ix1 extends eu1 {

    /* renamed from: r */
    private static final Pattern f80666r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m */
    private final boolean f80667m;
    @Nullable

    /* renamed from: n */
    private final jx1 f80668n;

    /* renamed from: o */
    private LinkedHashMap f80669o;

    /* renamed from: p */
    private float f80670p = -3.4028235E38f;

    /* renamed from: q */
    private float f80671q = -3.4028235E38f;

    public ix1(@Nullable List<byte[]> list) {
        if (list != null && !list.isEmpty()) {
            this.f80667m = true;
            String m27071a = y32.m27071a(list.get(0));
            C30937nf.m31567a(m27071a.startsWith("Format:"));
            this.f80668n = (jx1) C30937nf.m31570a(jx1.m32712a(m27071a));
            m33101a(new cc1(list.get(1)));
            return;
        }
        this.f80667m = false;
        this.f80668n = null;
    }

    /* renamed from: a */
    private static int m33102a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            } else {
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    @Override // com.yandex.mobile.ads.impl.eu1
    /* renamed from: a */
    protected final oy1 mo26966a(byte[] bArr, int i, boolean z) {
        cc1 cc1Var;
        jx1 jx1Var;
        long j;
        int i2;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        int i6;
        ix1 ix1Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cc1 cc1Var2 = new cc1(i, bArr);
        if (!ix1Var.f80667m) {
            ix1Var.m33101a(cc1Var2);
        }
        jx1 jx1Var2 = ix1Var.f80667m ? ix1Var.f80668n : null;
        while (true) {
            String m35280j = cc1Var2.m35280j();
            if (m35280j != null) {
                if (m35280j.startsWith("Format:")) {
                    jx1Var2 = jx1.m32712a(m35280j);
                } else {
                    if (m35280j.startsWith("Dialogue:")) {
                        if (jx1Var2 == null) {
                            gq0.m33792d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(m35280j));
                        } else if (m35280j.startsWith("Dialogue:")) {
                            String[] split = m35280j.substring(9).split(",", jx1Var2.f81192e);
                            if (split.length != jx1Var2.f81192e) {
                                gq0.m33792d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(m35280j));
                            } else {
                                long m33100a = m33100a(split[jx1Var2.f81188a]);
                                if (m33100a == -9223372036854775807L) {
                                    gq0.m33792d("SsaDecoder", "Skipping invalid timing: ".concat(m35280j));
                                } else {
                                    long m33100a2 = m33100a(split[jx1Var2.f81189b]);
                                    if (m33100a2 == -9223372036854775807L) {
                                        gq0.m33792d("SsaDecoder", "Skipping invalid timing: ".concat(m35280j));
                                    } else {
                                        LinkedHashMap linkedHashMap = ix1Var.f80669o;
                                        kx1 kx1Var = (linkedHashMap == null || (i6 = jx1Var2.f81190c) == -1) ? null : (kx1) linkedHashMap.get(split[i6].trim());
                                        String str = split[jx1Var2.f81191d];
                                        kx1.C30756b m32404a = kx1.C30756b.m32404a(str);
                                        String replace = kx1.C30756b.m32402c(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f = ix1Var.f80670p;
                                        float f2 = ix1Var.f80671q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        C31840xt.C31841a m27244a = new C31840xt.C31841a().m27244a(spannableString);
                                        if (kx1Var != null) {
                                            cc1Var = cc1Var2;
                                            if (kx1Var.f81606c != null) {
                                                jx1Var = jx1Var2;
                                                j = m33100a2;
                                                spannableString.setSpan(new ForegroundColorSpan(kx1Var.f81606c.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                jx1Var = jx1Var2;
                                                j = m33100a2;
                                            }
                                            if (kx1Var.f81613j == 3 && kx1Var.f81607d != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(kx1Var.f81607d.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f3 = kx1Var.f81608e;
                                            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                m27244a.m27240b(1, f3 / f2);
                                            }
                                            boolean z2 = kx1Var.f81609f;
                                            if (z2 && kx1Var.f81610g) {
                                                i4 = 33;
                                                i5 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i4 = 33;
                                                i5 = 0;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (kx1Var.f81610g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (kx1Var.f81611h) {
                                                spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i4);
                                            }
                                            if (kx1Var.f81612i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i4);
                                            }
                                        } else {
                                            cc1Var = cc1Var2;
                                            jx1Var = jx1Var2;
                                            j = m33100a2;
                                        }
                                        int i7 = m32404a.f81629a;
                                        if (i7 != -1) {
                                            i2 = i7;
                                        } else {
                                            i2 = kx1Var != null ? kx1Var.f81605b : -1;
                                        }
                                        switch (i2) {
                                            case 0:
                                            default:
                                                zo0.m26074a("Unknown alignment: ", i2, "SsaDecoder");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        C31840xt.C31841a m27239b = m27244a.m27239b(alignment);
                                        int i8 = Integer.MIN_VALUE;
                                        switch (i2) {
                                            case 0:
                                            default:
                                                zo0.m26074a("Unknown alignment: ", i2, "SsaDecoder");
                                            case -1:
                                                i3 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i3 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i3 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i3 = 2;
                                                break;
                                        }
                                        C31840xt.C31841a m27241b = m27239b.m27241b(i3);
                                        switch (i2) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                zo0.m26074a("Unknown alignment: ", i2, "SsaDecoder");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i8 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i8 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i8 = 0;
                                                break;
                                        }
                                        m27241b.m27249a(i8);
                                        PointF pointF = m32404a.f81630b;
                                        if (pointF != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
                                            m27244a.m27242b(pointF.x / f);
                                            m27244a.m27248a(0, m32404a.f81630b.y / f2);
                                        } else {
                                            int m27237c = m27244a.m27237c();
                                            float f4 = 0.95f;
                                            m27244a.m27242b(m27237c != 0 ? m27237c != 1 ? m27237c != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f);
                                            int m27243b = m27244a.m27243b();
                                            if (m27243b == 0) {
                                                f4 = 0.05f;
                                            } else if (m27243b == 1) {
                                                f4 = 0.5f;
                                            } else if (m27243b != 2) {
                                                f4 = -3.4028235E38f;
                                            }
                                            m27244a.m27248a(0, f4);
                                        }
                                        C31840xt m27251a = m27244a.m27251a();
                                        int m33102a = m33102a(j, arrayList2, arrayList);
                                        for (int m33102a2 = m33102a(m33100a, arrayList2, arrayList); m33102a2 < m33102a; m33102a2++) {
                                            ((List) arrayList.get(m33102a2)).add(m27251a);
                                        }
                                        ix1Var = this;
                                        cc1Var2 = cc1Var;
                                        jx1Var2 = jx1Var;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    cc1Var = cc1Var2;
                    jx1Var = jx1Var2;
                    ix1Var = this;
                    cc1Var2 = cc1Var;
                    jx1Var2 = jx1Var;
                }
            } else {
                return new lx1(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0010 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m33101a(com.yandex.mobile.ads.impl.cc1 r7) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.m35280j()
            if (r0 == 0) goto Ld1
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L67
        L10:
            java.lang.String r0 = r7.m35280j()
            if (r0 == 0) goto L0
            int r1 = r7.m35299a()
            if (r1 == 0) goto L22
            int r1 = r7.m35283g()
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 == r3) goto L2d
            goto L10
        L2d:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = com.yandex.mobile.ads.impl.C30784lf.m32278b(r1)
            r1.getClass()
            java.lang.String r3 = "playresx"
            boolean r3 = r1.equals(r3)
            r4 = 1
            if (r3 != 0) goto L5a
            java.lang.String r3 = "playresy"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4d
            goto L10
        L4d:
            r0 = r0[r4]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.f80671q = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L5a:
            r0 = r0[r4]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.f80670p = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L67:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaDecoder"
            if (r1 == 0) goto Lba
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L77:
            java.lang.String r4 = r7.m35280j()
            if (r4 == 0) goto Lb6
            int r5 = r7.m35299a()
            if (r5 == 0) goto L89
            int r5 = r7.m35283g()
            if (r5 == r2) goto Lb6
        L89:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L96
            com.yandex.mobile.ads.impl.kx1$a r1 = com.yandex.mobile.ads.impl.kx1.C30755a.m32405a(r4)
            goto L77
        L96:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L77
            if (r1 != 0) goto Laa
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.yandex.mobile.ads.impl.gq0.m33792d(r3, r4)
            goto L77
        Laa:
            com.yandex.mobile.ads.impl.kx1 r4 = com.yandex.mobile.ads.impl.kx1.m32407a(r4, r1)
            if (r4 == 0) goto L77
            java.lang.String r5 = r4.f81604a
            r0.put(r5, r4)
            goto L77
        Lb6:
            r6.f80669o = r0
            goto L0
        Lba:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Lc9
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.yandex.mobile.ads.impl.gq0.m33793c(r3, r0)
            goto L0
        Lc9:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ix1.m33101a(com.yandex.mobile.ads.impl.cc1):void");
    }

    /* renamed from: a */
    private static long m33100a(String str) {
        Matcher matcher = f80666r.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            int i = y32.f88010a;
            return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
        }
        return -9223372036854775807L;
    }
}
