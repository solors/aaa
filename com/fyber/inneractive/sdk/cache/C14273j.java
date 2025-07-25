package com.fyber.inneractive.sdk.cache;

/* renamed from: com.fyber.inneractive.sdk.cache.j */
/* loaded from: classes4.dex */
public final class C14273j implements InterfaceC14264a {

    /* renamed from: a */
    public final String f26976a;

    /* renamed from: b */
    public final String f26977b;

    public C14273j(String str) {
        this.f26976a = str;
        this.f26977b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final Object mo77939a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: b */
    public final String mo77938b() {
        return this.f26977b;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: c */
    public final String mo77937c() {
        return this.f26977b;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: d */
    public final boolean mo77936d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo77940a(Object obj) {
        String str = (String) obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final String mo77941a() {
        return this.f26976a;
    }
}
