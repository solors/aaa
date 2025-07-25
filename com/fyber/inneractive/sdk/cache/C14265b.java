package com.fyber.inneractive.sdk.cache;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC15430V;
import com.fyber.inneractive.sdk.util.AbstractC15459m;

/* renamed from: com.fyber.inneractive.sdk.cache.b */
/* loaded from: classes4.dex */
public final class C14265b implements InterfaceC14264a {

    /* renamed from: a */
    public final String f26965a;

    public C14265b(String str) {
        this.f26965a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final void mo77940a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AbstractC15459m.f30607a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt.dynamic.icon.data", AbstractC15430V.m76515a(bitmap)).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: b */
    public final String mo77938b() {
        return "dt.dynamic.icon.last.modified";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: c */
    public final String mo77937c() {
        return String.valueOf(("dt.dynamic.icon_" + this.f26965a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: d */
    public final boolean mo77936d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final Object mo77939a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AbstractC15430V.m76514a(str);
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC14264a
    /* renamed from: a */
    public final String mo77941a() {
        return this.f26965a;
    }
}
