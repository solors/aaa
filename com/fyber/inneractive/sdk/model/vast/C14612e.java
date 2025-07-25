package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.model.vast.e */
/* loaded from: classes4.dex */
public final class C14612e {

    /* renamed from: a */
    public final String f27712a;

    /* renamed from: b */
    public final String f27713b;

    /* renamed from: c */
    public int f27714c;

    /* renamed from: d */
    public final int f27715d;

    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C14612e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f27712a = r7
            r6.f27713b = r8
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            r0 = 3
            r1 = -1
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 != 0) goto L9a
            java.lang.String r7 = "-"
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L1c
            goto L9a
        L1c:
            java.lang.String r7 = "%"
            boolean r5 = r8.endsWith(r7)
            if (r5 == 0) goto L56
            boolean r7 = r8.endsWith(r7)
            if (r7 != 0) goto L2b
            goto L56
        L2b:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.NumberFormatException -> L48
            if (r7 == 0) goto L33
            r7 = r1
            goto L40
        L33:
            int r7 = r8.length()     // Catch: java.lang.NumberFormatException -> L48
            int r7 = r7 - r3
            java.lang.String r7 = r8.substring(r4, r7)     // Catch: java.lang.NumberFormatException -> L48
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L48
        L40:
            if (r7 < 0) goto L56
            r5 = 100
            if (r7 > r5) goto L56
            r7 = r3
            goto L9b
        L48:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r7
            java.lang.String r7 = "ProgressTrackingEvent: failed isPercentageOffsetValid with %s"
            com.fyber.inneractive.sdk.util.IAlog.m76524f(r7, r5)
        L56:
            java.lang.String r7 = ":"
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L9a
            java.util.ArrayList r7 = m77755a(r8)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L9a
            java.lang.Object r8 = r7.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r8 = r7.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r8 = r7.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < 0) goto L9a
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 < 0) goto L9a
            r7 = r2
            goto L9b
        L9a:
            r7 = r4
        L9b:
            r6.f27715d = r7
            if (r7 != r2) goto Ld9
            java.lang.String r7 = r6.f27713b
            if (r7 == 0) goto Ld9
            java.util.ArrayList r7 = m77755a(r7)
            java.lang.Object r8 = r7.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 * 3600
            java.lang.Object r1 = r7.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r1 * 60
            int r1 = r1 + r8
            java.lang.Object r8 = r7.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r1
            int r8 = r8 * 1000
            java.lang.Object r7 = r7.get(r0)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r1 = r7 + r8
        Ld9:
            r6.f27714c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.model.vast.C14612e.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static ArrayList m77755a(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String[] split = str.split(":");
        if (split.length != 3) {
            return arrayList;
        }
        String str3 = split[0];
        String str4 = split[1];
        String[] split2 = split[2].split("\\.");
        String str5 = split2[0];
        if (split2.length > 1) {
            str2 = split2[1];
        } else {
            str2 = "000";
        }
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(str3)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str4)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str5)));
            arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            return arrayList;
        } catch (NumberFormatException e) {
            IAlog.m76524f("ProgressTrackingEvent: failed convertOffsetToTimeList with %s", e.getMessage());
            return new ArrayList();
        }
    }
}
