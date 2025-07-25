package com.taurusx.tax.p583c.p590f.p591d;

import com.taurusx.tax.C28162a;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.taurusx.tax.c.f.d.d */
/* loaded from: classes7.dex */
public class C28298d {

    /* renamed from: a */
    public static String f73506a = C28162a.f73047a.m23824a(new byte[]{-27, 1, -48, 16, -44, 1, -31, 26, -43}, new byte[]{-79, 115});

    /* renamed from: com.taurusx.tax.c.f.d.d$a */
    /* loaded from: classes7.dex */
    public static class C28299a {

        /* renamed from: a */
        public long f73507a;

        /* renamed from: b */
        public int f73508b;

        public C28299a(String str, String str2, String str3) {
            Integer.parseInt(str, 16);
            this.f73507a = Long.parseLong(str2, 16);
            this.f73508b = Integer.parseInt(str3, 16);
        }

        /* renamed from: a */
        public static C28299a m38270a(String[] strArr) {
            String str = strArr[1];
            String str2 = strArr[2];
            String str3 = strArr[3];
            String str4 = strArr[4];
            String str5 = strArr[5];
            String str6 = strArr[6];
            String str7 = strArr[7];
            String str8 = strArr[8];
            String str9 = strArr[9];
            String str10 = strArr[10];
            String str11 = strArr[11];
            String str12 = strArr[12];
            String str13 = strArr[13];
            String str14 = strArr[14];
            return new C28299a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public static boolean m38272a() {
        int i;
        boolean z = false;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(C28162a.f73047a.m23824a(new byte[]{-121, 41, -38, 54, -53, 118, -58, 60, -36, 118, -36, 58, -40}, new byte[]{-88, 89}))), 1000);
            try {
                bufferedReader2.readLine();
                ArrayList arrayList = new ArrayList();
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(C28299a.m38270a(readLine.split(C28162a.f73047a.m23824a(new byte[]{-17, -46, -104}, new byte[]{-77, -123}))));
                }
                bufferedReader2.close();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C28299a c28299a = (C28299a) it.next();
                        if (c28299a.f73507a == 0) {
                            i = c28299a.f73508b;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C28299a c28299a2 = (C28299a) it2.next();
                        if (c28299a2.f73507a != 0 && c28299a2.f73508b == i) {
                            z = true;
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
            bufferedReader = bufferedReader2;
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedReader.close();
        } catch (Exception unused4) {
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b3, code lost:
        if (java.lang.Integer.decode(r1.substring(com.taurusx.tax.p583c.p590f.p591d.C28298d.f73506a.length() + 1).trim()).intValue() <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
        r2.close();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m38271b() {
        /*
            r0 = 0
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r5 = 17
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 84
            r5[r0] = r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r7 = -67
            r8 = 1
            r5[r8] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r7 = 9
            r9 = 2
            r5[r9] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 3
            r11 = -94
            r5[r10] = r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 4
            r11 = 24
            r5[r10] = r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 5
            r11 = -30
            r5[r10] = r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 6
            r11 = 8
            r5[r10] = r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 7
            r12 = -88
            r5[r10] = r12     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = 23
            r5[r11] = r10     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r10 = -85
            r5[r7] = r10     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r7 = 10
            r5[r7] = r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 11
            r7 = -66
            r5[r6] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 12
            r7 = 15
            r5[r6] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 13
            r10 = -84
            r5[r6] = r10     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 14
            r5[r6] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = -72
            r5[r7] = r6     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r6 = 16
            r5[r6] = r11     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            byte[] r6 = new byte[r9]     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r7 = 123(0x7b, float:1.72E-43)
            r6[r0] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r7 = -51
            r6[r8] = r7     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            h2.a r7 = com.taurusx.tax.C28162a.f73047a     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            java.lang.String r5 = r7.m23824a(r5, r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
            r4 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc3
        L78:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            if (r1 == 0) goto Lbc
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            java.lang.String r4 = com.taurusx.tax.p583c.p590f.p591d.C28298d.f73506a     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            if (r3 <= r4) goto L78
            java.lang.String r3 = com.taurusx.tax.p583c.p590f.p591d.C28298d.f73506a     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            java.lang.String r3 = r1.substring(r0, r3)     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            java.lang.String r4 = com.taurusx.tax.p583c.p590f.p591d.C28298d.f73506a     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            if (r3 == 0) goto L78
            java.lang.String r3 = com.taurusx.tax.p583c.p590f.p591d.C28298d.f73506a     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            int r3 = r3 + r8
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            java.lang.Integer r1 = java.lang.Integer.decode(r1)     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Lb9 java.lang.Exception -> Lbc
            if (r1 <= 0) goto Lbc
            r2.close()     // Catch: java.lang.Exception -> Lb8
        Lb8:
            return r8
        Lb9:
            r0 = move-exception
            r1 = r2
            goto Lbf
        Lbc:
            r1 = r2
            goto Lc3
        Lbe:
            r0 = move-exception
        Lbf:
            r1.close()     // Catch: java.lang.Exception -> Lc2
        Lc2:
            throw r0
        Lc3:
            r1.close()     // Catch: java.lang.Exception -> Lc6
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28298d.m38271b():boolean");
    }
}
