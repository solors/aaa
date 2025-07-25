package com.p551my.target;

import android.util.LruCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.v6 */
/* loaded from: classes7.dex */
public class C26165v6 extends AbstractC26019q {

    /* renamed from: c */
    public static final LruCache f68057c = new LruCache(10);

    /* renamed from: b */
    public final ArrayList f68058b = new ArrayList();

    /* renamed from: d */
    public static LruCache m42709d() {
        return f68057c;
    }

    /* renamed from: f */
    public static C26165v6 m42707f() {
        return new C26165v6();
    }

    /* renamed from: a */
    public void m42711a(C25822i6 c25822i6) {
        this.f68058b.add(c25822i6);
        f68057c.put(c25822i6.getId(), c25822i6.getId());
    }

    /* renamed from: c */
    public List m42710c() {
        return new ArrayList(this.f68058b);
    }

    /* renamed from: e */
    public C25822i6 m42708e() {
        if (this.f68058b.size() > 0) {
            return (C25822i6) this.f68058b.get(0);
        }
        return null;
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        return this.f68058b.size();
    }
}
