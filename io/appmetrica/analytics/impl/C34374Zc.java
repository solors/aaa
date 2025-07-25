package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.Zc */
/* loaded from: classes9.dex */
public final class C34374Zc {

    /* renamed from: a */
    public final Context f93877a;

    /* renamed from: b */
    public final InterfaceC33965Ia f93878b;

    /* renamed from: c */
    public final C34931u9 f93879c;

    /* renamed from: d */
    public final C34231Td f93880d;

    /* renamed from: e */
    public final C34787on f93881e;

    /* renamed from: f */
    public volatile IdentifiersResult f93882f;

    public C34374Zc(Context context, InterfaceC33965Ia interfaceC33965Ia) {
        this(context, interfaceC33965Ia, AbstractC34399ad.m21996a(context), new C34231Td(context), new C34787on());
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult m22041a() {
        /*
            r5 = this;
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f93882f
            if (r0 == 0) goto L18
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = r0.status
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK
            if (r1 != r2) goto L18
            io.appmetrica.analytics.impl.on r1 = r5.f93881e
            java.lang.String r2 = r0.f95711id
            r1.getClass()
            boolean r1 = io.appmetrica.analytics.impl.C34787on.m21188a(r2)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            io.appmetrica.analytics.impl.u9 r2 = r5.f93879c     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r3 = r2.f95458a     // Catch: java.lang.Throwable -> L79
            r3.lock()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.W9 r2 = r2.f95459b     // Catch: java.lang.Throwable -> L79
            r2.m22133a()     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.internal.IdentifiersResult r0 = r5.f93882f     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L3d
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = r0.status     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            if (r2 != r3) goto L3d
            io.appmetrica.analytics.impl.on r2 = r5.f93881e     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r0.f95711id     // Catch: java.lang.Throwable -> L79
            r2.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r2 = io.appmetrica.analytics.impl.C34787on.m21188a(r3)     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L3d
            goto L79
        L3d:
            io.appmetrica.analytics.impl.Td r2 = r5.f93880d     // Catch: java.lang.Throwable -> L79
            android.content.Context r2 = r2.f93532a     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = "uuid.dat"
            java.io.File r2 = io.appmetrica.analytics.coreutils.internal.p726io.FileUtils.getFileFromSdkStorage(r2, r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = io.appmetrica.analytics.impl.AbstractC33941Ha.m22569a(r2)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.on r3 = r5.f93881e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C34787on.m21188a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 != 0) goto L64
            io.appmetrica.analytics.impl.Ia r2 = r5.f93878b     // Catch: java.lang.Throwable -> L79
            android.content.Context r3 = r5.f93877a     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r2.mo21315a(r3)     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.impl.Td r3 = r5.f93880d     // Catch: java.lang.Throwable -> L79
            java.lang.String r2 = r3.m22230a(r2)     // Catch: java.lang.Throwable -> L79
        L64:
            io.appmetrica.analytics.impl.on r3 = r5.f93881e     // Catch: java.lang.Throwable -> L79
            r3.getClass()     // Catch: java.lang.Throwable -> L79
            boolean r3 = io.appmetrica.analytics.impl.C34787on.m21188a(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L79
            io.appmetrica.analytics.internal.IdentifiersResult r3 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L79
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r4 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK     // Catch: java.lang.Throwable -> L79
            r3.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L79
            r5.f93882f = r3     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = r3
        L79:
            io.appmetrica.analytics.impl.u9 r2 = r5.f93879c
            io.appmetrica.analytics.impl.W9 r3 = r2.f95459b
            r3.m22131b()
            java.util.concurrent.locks.ReentrantLock r2 = r2.f95458a
            r2.unlock()
            if (r0 == 0) goto L88
            goto L91
        L88:
            io.appmetrica.analytics.internal.IdentifiersResult r0 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r2 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r3 = "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)"
            r0.<init>(r1, r2, r3)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34374Zc.m22041a():io.appmetrica.analytics.internal.IdentifiersResult");
    }

    public C34374Zc(Context context, InterfaceC33965Ia interfaceC33965Ia, C34931u9 c34931u9, C34231Td c34231Td, C34787on c34787on) {
        this.f93877a = context;
        this.f93878b = interfaceC33965Ia;
        this.f93879c = c34931u9;
        this.f93880d = c34231Td;
        this.f93881e = c34787on;
        try {
            c34931u9.m20919a();
            c34231Td.m22231a();
            c34931u9.m20918b();
        } catch (Throwable unused) {
            this.f93879c.m20918b();
        }
    }
}
