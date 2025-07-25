package com.five_corp.p372ad.internal.cache;

import com.five_corp.p372ad.internal.C13702b;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.p373ad.C13627a;
import com.five_corp.p372ad.internal.p373ad.C13676g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.five_corp.ad.internal.cache.t */
/* loaded from: classes4.dex */
public final class C13747t implements InterfaceC13744q {

    /* renamed from: a */
    public final /* synthetic */ List f25546a;

    /* renamed from: b */
    public final /* synthetic */ List f25547b;

    /* renamed from: c */
    public final /* synthetic */ List f25548c;

    /* renamed from: d */
    public final /* synthetic */ Map f25549d;

    /* renamed from: e */
    public final /* synthetic */ Map f25550e;

    /* renamed from: f */
    public final /* synthetic */ C13838a f25551f;

    /* renamed from: g */
    public final /* synthetic */ C13749v f25552g;

    public C13747t(C13749v c13749v, ArrayList arrayList, ArrayList arrayList2, List list, HashMap hashMap, HashMap hashMap2, C13838a c13838a) {
        this.f25552g = c13749v;
        this.f25546a = arrayList;
        this.f25547b = arrayList2;
        this.f25548c = list;
        this.f25549d = hashMap;
        this.f25550e = hashMap2;
        this.f25551f = c13838a;
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13744q
    /* renamed from: a */
    public final C13750w mo78401a(C13750w c13750w) {
        ArrayList arrayList = new ArrayList(c13750w.f25562a.f25425a);
        HashMap hashMap = new HashMap(c13750w.f25562a.f25426b);
        this.f25546a.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13627a c13627a = (C13627a) it.next();
            if (this.f25547b.contains(c13627a.f25187e)) {
                this.f25546a.add(c13627a);
            }
        }
        arrayList.removeAll(this.f25546a);
        arrayList.addAll(this.f25548c);
        hashMap.putAll(this.f25549d);
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hashSet.add(((C13627a) it2.next()).f25187e);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13676g c13676g : hashMap.keySet()) {
            if (!hashSet.contains(c13676g)) {
                arrayList2.add(c13676g);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            hashMap.remove((C13676g) it3.next());
        }
        C13702b c13702b = new C13702b(arrayList, hashMap, this.f25550e);
        C13838a c13838a = this.f25551f;
        this.f25552g.f25559f.getClass();
        return new C13750w(c13702b, c13838a, System.currentTimeMillis());
    }
}
