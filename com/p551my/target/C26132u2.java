package com.p551my.target;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.my.target.u2 */
/* loaded from: classes7.dex */
public class C26132u2 extends AbstractC26019q {

    /* renamed from: b */
    public final HashMap f67984b;

    public C26132u2() {
        HashMap hashMap = new HashMap();
        this.f67984b = hashMap;
        hashMap.put(InstreamAdBreakType.PREROLL, C25837j3.m43725b(InstreamAdBreakType.PREROLL));
        hashMap.put(InstreamAdBreakType.PAUSEROLL, C25837j3.m43725b(InstreamAdBreakType.PAUSEROLL));
        hashMap.put(InstreamAdBreakType.MIDROLL, C25837j3.m43725b(InstreamAdBreakType.MIDROLL));
        hashMap.put(InstreamAdBreakType.POSTROLL, C25837j3.m43725b(InstreamAdBreakType.POSTROLL));
    }

    /* renamed from: e */
    public static C26132u2 m42793e() {
        return new C26132u2();
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        int i = 0;
        for (C25837j3 c25837j3 : this.f67984b.values()) {
            i += c25837j3.mo42296a();
        }
        return i;
    }

    /* renamed from: c */
    public ArrayList m42795c() {
        return new ArrayList(this.f67984b.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m42794d() {
        /*
            r3 = this;
            java.util.HashMap r0 = r3.f67984b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            com.my.target.j3 r1 = (com.p551my.target.C25837j3) r1
            int r2 = r1.mo42296a()
            if (r2 > 0) goto L22
            boolean r1 = r1.m43718i()
            if (r1 == 0) goto La
        L22:
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C26132u2.m42794d():boolean");
    }

    /* renamed from: a */
    public C25837j3 m42796a(String str) {
        return (C25837j3) this.f67984b.get(str);
    }
}
