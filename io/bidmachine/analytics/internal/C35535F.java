package io.bidmachine.analytics.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: io.bidmachine.analytics.internal.F */
/* loaded from: classes9.dex */
public final class C35535F {

    /* renamed from: d */
    private static final C35536a f96302d = new C35536a(null);

    /* renamed from: a */
    private final int f96303a;

    /* renamed from: b */
    private final Map f96304b;

    /* renamed from: c */
    private final Object f96305c;

    /* renamed from: io.bidmachine.analytics.internal.F$a */
    /* loaded from: classes9.dex */
    private static final class C35536a {
        private C35536a() {
        }

        public /* synthetic */ C35536a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C35535F(int i) {
        this.f96303a = i;
        this.f96304b = new LinkedHashMap();
        this.f96305c = new Object();
    }

    /* renamed from: a */
    private final C35538H m20392a() {
        int i = this.f96303a;
        return new C35538H(i / 2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m20389b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f96305c
            monitor-enter(r0)
            r1 = 0
            nd.q$a r2 = p804nd.Result.f101870c     // Catch: java.lang.Throwable -> L21
            java.util.Map r2 = r3.f96304b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L21
            io.bidmachine.analytics.internal.H r4 = (io.bidmachine.analytics.internal.C35538H) r4     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1b
            java.lang.Long r4 = r4.m20386a()     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L21
            goto L1c
        L1b:
            r4 = r1
        L1c:
            java.lang.Object r4 = p804nd.Result.m14549b(r4)     // Catch: java.lang.Throwable -> L21
            goto L2c
        L21:
            r4 = move-exception
            nd.q$a r2 = p804nd.Result.f101870c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = p804nd.C38508r.m14540a(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = p804nd.Result.m14549b(r4)     // Catch: java.lang.Throwable -> L38
        L2c:
            monitor-exit(r0)
            boolean r0 = p804nd.Result.m14544g(r4)
            if (r0 == 0) goto L34
            goto L35
        L34:
            r1 = r4
        L35:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L38:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.C35535F.m20389b(java.lang.String):java.lang.String");
    }

    public /* synthetic */ C35535F(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2097152 : i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream m20391a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f96305c
            monitor-enter(r0)
            r1 = 0
            nd.q$a r2 = p804nd.Result.f101870c     // Catch: java.lang.Throwable -> L20
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L20
            java.util.Map r3 = r4.f96304b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r3.remove(r5)     // Catch: java.lang.Throwable -> L20
            io.bidmachine.analytics.internal.H r5 = (io.bidmachine.analytics.internal.C35538H) r5     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L17
            byte[] r5 = io.bidmachine.analytics.internal.AbstractC35539I.m20384a(r5)     // Catch: java.lang.Throwable -> L20
            goto L18
        L17:
            r5 = r1
        L18:
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = p804nd.Result.m14549b(r2)     // Catch: java.lang.Throwable -> L20
            goto L2b
        L20:
            r5 = move-exception
            nd.q$a r2 = p804nd.Result.f101870c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = p804nd.C38508r.m14540a(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = p804nd.Result.m14549b(r5)     // Catch: java.lang.Throwable -> L37
        L2b:
            monitor-exit(r0)
            boolean r0 = p804nd.Result.m14544g(r5)
            if (r0 == 0) goto L33
            goto L34
        L33:
            r1 = r5
        L34:
            java.io.InputStream r1 = (java.io.InputStream) r1
            return r1
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.C35535F.m20391a(java.lang.String):java.io.InputStream");
    }

    /* renamed from: a */
    public final void m20390a(String str, String str2) {
        synchronized (this.f96305c) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                Map map = this.f96304b;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = m20392a();
                    map.put(str, obj);
                }
                ((C35538H) obj).m20385a(str2);
                Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                Result.m14549b(C38508r.m14540a(th));
            }
        }
    }
}
