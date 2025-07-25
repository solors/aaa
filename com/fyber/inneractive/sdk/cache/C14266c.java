package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.AbstractC15459m;

/* renamed from: com.fyber.inneractive.sdk.cache.c */
/* loaded from: classes4.dex */
public final class C14266c implements InterfaceC14264a {

    /* renamed from: a */
    public final String f26966a;

    public C14266c(String str) {
        this.f26966a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final Object mo77939a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: b */
    public final String mo77938b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: c */
    public final String mo77937c() {
        return String.valueOf(("fmp.endcard_" + this.f26966a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: d */
    public final boolean mo77936d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final void mo77940a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            AbstractC15459m.f30607a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("fmp.endcard.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final String mo77941a() {
        return this.f26966a;
    }
}
