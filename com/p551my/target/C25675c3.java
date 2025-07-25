package com.p551my.target;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.my.target.c3 */
/* loaded from: classes7.dex */
public class C25675c3 extends AbstractC26019q {

    /* renamed from: b */
    public final HashMap f66683b;

    public C25675c3() {
        HashMap hashMap = new HashMap();
        this.f66683b = hashMap;
        hashMap.put(InstreamAdBreakType.PREROLL, C25771g5.m43871a(InstreamAdBreakType.PREROLL));
        hashMap.put(InstreamAdBreakType.PAUSEROLL, C25771g5.m43871a(InstreamAdBreakType.PAUSEROLL));
        hashMap.put(InstreamAdBreakType.MIDROLL, C25771g5.m43871a(InstreamAdBreakType.MIDROLL));
        hashMap.put(InstreamAdBreakType.POSTROLL, C25771g5.m43871a(InstreamAdBreakType.POSTROLL));
    }

    /* renamed from: e */
    public static C25675c3 m44107e() {
        return new C25675c3();
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        int i = 0;
        for (C25771g5 c25771g5 : this.f66683b.values()) {
            i += c25771g5.mo42296a();
        }
        return i;
    }

    /* renamed from: c */
    public ArrayList m44109c() {
        return new ArrayList(this.f66683b.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m44108d() {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f66683b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.my.target.g5 r1 = (com.p551my.target.C25771g5) r1
            int r2 = r1.mo42296a()
            if (r2 > 0) goto L22
            boolean r1 = r1.m43862i()
            if (r1 == 0) goto La
        L22:
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25675c3.m44108d():boolean");
    }

    /* renamed from: a */
    public C25771g5 m44110a(String str) {
        return (C25771g5) this.f66683b.get(str);
    }
}
