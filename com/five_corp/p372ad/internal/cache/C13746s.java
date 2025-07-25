package com.five_corp.p372ad.internal.cache;

import com.five_corp.p372ad.internal.C13702b;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.C13676g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.five_corp.ad.internal.cache.s */
/* loaded from: classes4.dex */
public final class C13746s implements InterfaceC13744q {

    /* renamed from: a */
    public final /* synthetic */ List f25543a;

    /* renamed from: b */
    public final /* synthetic */ Collection f25544b;

    /* renamed from: c */
    public final /* synthetic */ C13749v f25545c;

    public C13746s(C13749v c13749v, ArrayList arrayList, List list) {
        this.f25545c = c13749v;
        this.f25543a = arrayList;
        this.f25544b = list;
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13744q
    /* renamed from: a */
    public final C13750w mo78401a(C13750w c13750w) {
        ArrayList arrayList = new ArrayList(c13750w.f25562a.f25425a);
        HashMap hashMap = new HashMap(c13750w.f25562a.f25426b);
        this.f25543a.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13627a c13627a = (C13627a) it.next();
            if (this.f25544b.contains(c13627a.f25187e)) {
                this.f25543a.add(c13627a);
            }
        }
        arrayList.removeAll(this.f25543a);
        for (C13676g c13676g : this.f25544b) {
            hashMap.remove(c13676g);
        }
        C13702b c13702b = new C13702b(arrayList, hashMap, c13750w.f25562a.f25427c);
        C13838a c13838a = c13750w.f25563b;
        this.f25545c.f25559f.getClass();
        return new C13750w(c13702b, c13838a, System.currentTimeMillis());
    }
}
