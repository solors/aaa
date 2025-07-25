package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.flow.endcard.C14508i;
import com.fyber.inneractive.sdk.flow.vast.C14544d;
import com.fyber.inneractive.sdk.flow.vast.C14547g;
import com.fyber.inneractive.sdk.response.InterfaceC15390i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.model.vast.b */
/* loaded from: classes4.dex */
public final class C14609b implements InterfaceC15390i {

    /* renamed from: a */
    public String f27688a;

    /* renamed from: b */
    public String f27689b;

    /* renamed from: d */
    public final PriorityQueue f27691d;

    /* renamed from: f */
    public C14622o f27693f;

    /* renamed from: g */
    public final PriorityQueue f27694g;

    /* renamed from: h */
    public final Comparator f27695h;

    /* renamed from: o */
    public C14508i f27702o;

    /* renamed from: e */
    public final ArrayList f27692e = new ArrayList();

    /* renamed from: i */
    public int f27696i = 0;

    /* renamed from: j */
    public int f27697j = 0;

    /* renamed from: k */
    public final ArrayList f27698k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f27699l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f27700m = new ArrayList();

    /* renamed from: n */
    public String f27701n = "";

    /* renamed from: c */
    public final HashMap f27690c = new HashMap();

    public C14609b(C14547g c14547g, C14544d c14544d) {
        this.f27691d = new PriorityQueue(1, c14547g);
        this.f27695h = c14544d;
        this.f27694g = new PriorityQueue(1, c14544d);
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC15390i
    /* renamed from: a */
    public final List mo76574a(EnumC14630w enumC14630w) {
        HashMap hashMap;
        if (enumC14630w == null || (hashMap = this.f27690c) == null) {
            return null;
        }
        return (List) hashMap.get(enumC14630w);
    }

    /* renamed from: a */
    public final void m77758a(EnumC14630w enumC14630w, String str) {
        List list = (List) this.f27690c.get(enumC14630w);
        if (list == null) {
            list = new ArrayList();
            this.f27690c.put(enumC14630w, list);
        }
        list.add(str);
    }
}
