package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Set;
import kotlin.collections.C37572z0;

/* renamed from: io.appmetrica.analytics.impl.gl */
/* loaded from: classes9.dex */
public abstract class AbstractC34569gl {

    /* renamed from: a */
    public static final Set f94472a;

    /* renamed from: b */
    public static final SystemTimeProvider f94473b;

    /* renamed from: c */
    public static final C34245U3 f94474c;

    static {
        Set m17119j;
        m17119j = C37572z0.m17119j("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);
        f94472a = m17119j;
        f94473b = new SystemTimeProvider();
        f94474c = new C34245U3();
    }

    /* renamed from: a */
    public static final boolean m21647a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m21648a(io.appmetrica.analytics.impl.C34650jl r5, java.util.Collection r6, java.util.Map r7, kotlin.jvm.functions.Functions r8) {
        /*
            r0 = 1
            if (r6 == 0) goto Laf
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto Lb
            goto Laf
        Lb:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L13
            goto Laf
        L13:
            java.util.Iterator r6 = r6.iterator()
        L17:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            switch(r2) {
                case -1367801046: goto L86;
                case 155670667: goto L76;
                case 299713912: goto L66;
                case 530949152: goto L4d;
                case 703740463: goto L3d;
                case 1117383061: goto L2c;
                default: goto L2a;
            }
        L2a:
            goto L98
        L2c:
            java.lang.String r2 = "appmetrica_device_id"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L36
            goto L98
        L36:
            java.lang.String r1 = r5.f94721a
            boolean r1 = m21647a(r1)
            goto L95
        L3d:
            java.lang.String r2 = "appmetrica_report_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L98
        L46:
            java.lang.String r1 = r5.f94730j
            boolean r1 = m21647a(r1)
            goto L95
        L4d:
            java.lang.String r2 = "appmetrica_clids"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L98
        L56:
            io.appmetrica.analytics.impl.U3 r1 = io.appmetrica.analytics.impl.AbstractC34569gl.f94474c
            java.lang.Object r2 = r8.invoke()
            io.appmetrica.analytics.impl.R3 r2 = (io.appmetrica.analytics.impl.C34173R3) r2
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C34245U3.m22216a(r7, r5, r2)
            goto L95
        L66:
            java.lang.String r2 = "appmetrica_device_id_hash"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6f
            goto L98
        L6f:
            java.lang.String r1 = r5.f94722b
            boolean r1 = m21647a(r1)
            goto L95
        L76:
            java.lang.String r2 = "appmetrica_get_ad_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7f
            goto L98
        L7f:
            java.lang.String r1 = r5.f94729i
            boolean r1 = m21647a(r1)
            goto L95
        L86:
            java.lang.String r2 = "appmetrica_uuid"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8f
            goto L98
        L8f:
            java.lang.String r1 = r5.f94724d
            boolean r1 = m21647a(r1)
        L95:
            if (r1 != 0) goto L17
            goto Lae
        L98:
            boolean r1 = r5.f94743w
            if (r1 != 0) goto Lae
            long r1 = r5.f94735o
            io.appmetrica.analytics.impl.Hl r3 = r5.f94718A
            int r3 = r3.f92978a
            long r3 = (long) r3
            long r1 = r1 + r3
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r3 = io.appmetrica.analytics.impl.AbstractC34569gl.f94473b
            long r3 = r3.currentTimeSeconds()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L17
        Lae:
            r0 = 0
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.AbstractC34569gl.m21648a(io.appmetrica.analytics.impl.jl, java.util.Collection, java.util.Map, kotlin.jvm.functions.Function0):boolean");
    }
}
