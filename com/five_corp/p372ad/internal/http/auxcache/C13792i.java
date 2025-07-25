package com.five_corp.p372ad.internal.http.auxcache;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.p372ad.CreativeType;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.C13783a;
import com.five_corp.p372ad.internal.http.connection.AbstractC13803c;
import com.five_corp.p372ad.internal.http.connection.C13802b;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.storage.C14080e;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.http.auxcache.i */
/* loaded from: classes4.dex */
public final class C13792i {

    /* renamed from: b */
    public Handler f25674b;

    /* renamed from: c */
    public final C13836a f25675c;

    /* renamed from: d */
    public final C14080e f25676d;

    /* renamed from: e */
    public final AbstractC13803c f25677e;

    /* renamed from: a */
    public final HandlerThread f25673a = new HandlerThread("AuxiliaryResourceCacheDownloadManager");

    /* renamed from: f */
    public final int f25678f = 3;

    /* renamed from: g */
    public Object f25679g = null;

    /* renamed from: h */
    public boolean f25680h = false;

    /* renamed from: i */
    public final ArrayList f25681i = new ArrayList();

    /* renamed from: j */
    public final C13795l f25682j = C13795l.m78366b();

    /* renamed from: k */
    public final C13795l f25683k = C13795l.m78365c();

    /* renamed from: l */
    public final C13795l f25684l = C13795l.m78364d();

    public C13792i(C13836a c13836a, C14080e c14080e, C13802b c13802b) {
        this.f25675c = c13836a;
        this.f25676d = c14080e;
        this.f25677e = c13802b;
    }

    /* renamed from: a */
    public static C13794k m78372a(C13792i c13792i, C13783a c13783a) {
        c13792i.getClass();
        C13760i c13760i = (C13760i) c13783a.f25655b.get();
        C13627a c13627a = c13760i != null ? c13760i.f25591b : (C13627a) c13783a.f25654a.get();
        if (c13627a != null) {
            ArrayList arrayList = new ArrayList();
            for (C13691u c13691u : c13627a.f25178H) {
                if (!c13691u.equals(c13627a.f25197o) || c13627a.f25184b != CreativeType.MOVIE) {
                    arrayList.add(c13691u);
                }
            }
            if (!arrayList.isEmpty()) {
                return new C13794k(c13627a.f25185c, c13783a, c13792i.f25676d, arrayList, c13792i.f25675c);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x003e, code lost:
        r1 = r0.f25690f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0040, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0043, code lost:
        if (r0.f25695k == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0045, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0047, code lost:
        r3 = r0.f25691g;
        r0.f25695k = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x004c, code lost:
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x004e, code lost:
        r3.m78359a();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m78373a(com.five_corp.p372ad.internal.http.auxcache.C13792i r5) {
        /*
            r0 = 0
            r5.f25679g = r0
            boolean r1 = r5.f25680h
            r2 = 1
            if (r1 == 0) goto L55
            com.five_corp.ad.internal.http.auxcache.l r1 = r5.f25684l
            java.util.ArrayDeque r1 = r1.f25708b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L55
            java.util.ArrayList r5 = r5.f25681i
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            com.five_corp.ad.internal.http.auxcache.j r0 = (com.five_corp.p372ad.internal.http.auxcache.C13793j) r0
            java.util.ArrayList r1 = r0.f25687c
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()
            com.five_corp.ad.internal.http.auxcache.k r3 = (com.five_corp.p372ad.internal.http.auxcache.C13794k) r3
            com.five_corp.ad.internal.http.a r3 = r3.f25697a
            int r3 = r3.f25656c
            r4 = 3
            if (r3 != r4) goto L2a
            goto L18
        L3e:
            java.lang.Object r1 = r0.f25690f
            monitor-enter(r1)
            boolean r3 = r0.f25695k     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            goto L18
        L47:
            com.five_corp.ad.internal.http.client.a r3 = r0.f25691g     // Catch: java.lang.Throwable -> L52
            r0.f25695k = r2     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L18
            r3.m78359a()
            goto L18
        L52:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L52
            throw r5
        L55:
            boolean r1 = r5.f25680h
            if (r1 == 0) goto L5a
            goto L6e
        L5a:
            r5.f25680h = r2
            com.five_corp.ad.internal.http.auxcache.l r1 = r5.f25682j
            r1.m78363e()
            com.five_corp.ad.internal.http.auxcache.l r1 = r5.f25683k
            r1.m78363e()
            com.five_corp.ad.internal.http.auxcache.l r1 = r5.f25684l
            r1.m78363e()
            r5.m78371a(r0)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.http.auxcache.C13792i.m78373a(com.five_corp.ad.internal.http.auxcache.i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0095, code lost:
        r11 = r10.f25676d.m78117a(r2);
        r9 = new com.five_corp.p372ad.internal.http.auxcache.C13793j(r2, r11, r6, r10.f25677e, r10);
        r3 = r9.f25690f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00a8, code lost:
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00ab, code lost:
        if (r9.f25691g == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ad, code lost:
        r0 = new com.five_corp.p372ad.internal.C14068s(com.five_corp.p372ad.internal.EnumC14106t.f26386I2, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00b5, code lost:
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00b6, code lost:
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00b8, code lost:
        r9.m78368e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00bc, code lost:
        r11 = r11.m78410b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c2, code lost:
        if (r11.f26746a != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00c4, code lost:
        r9.m78368e(r11.f26747b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ca, code lost:
        r11 = ((java.lang.Integer) r11.f26748c).intValue();
        r0 = new com.five_corp.p372ad.internal.http.client.C13798a(r2, r9, r9.f25688d);
        r2 = r9.f25690f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00db, code lost:
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00dc, code lost:
        r9.f25691g = r0;
        r9.f25693i = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e0, code lost:
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00e1, code lost:
        r0.m78356b(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00e4, code lost:
        r10.f25681i.add(r9);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m78371a(com.five_corp.p372ad.internal.http.auxcache.C13793j r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.http.auxcache.C13792i.m78371a(com.five_corp.ad.internal.http.auxcache.j):void");
    }
}
