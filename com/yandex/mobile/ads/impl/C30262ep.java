package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30484hp;
import com.yandex.mobile.ads.impl.sp0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ep */
/* loaded from: classes8.dex */
public final class C30262ep implements InterfaceC30107cp, sp0.InterfaceC31386a {
    @NotNull

    /* renamed from: j */
    private static final Object f78737j = new Object();
    @NotNull

    /* renamed from: b */
    private final a22 f78738b;
    @NotNull

    /* renamed from: c */
    private final a22 f78739c;
    @Nullable

    /* renamed from: d */
    private String f78740d;
    @Nullable

    /* renamed from: e */
    private String f78741e;

    /* renamed from: f */
    private boolean f78742f;
    @Nullable

    /* renamed from: g */
    private String f78743g;
    @Nullable

    /* renamed from: h */
    private String f78744h;
    @Nullable

    /* renamed from: i */
    private String f78745i;

    public C30262ep(@NotNull C30330fp cmpV1, @NotNull C30407gp cmpV2, @NotNull sp0 preferences) {
        Intrinsics.checkNotNullParameter(cmpV1, "cmpV1");
        Intrinsics.checkNotNullParameter(cmpV2, "cmpV2");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f78738b = cmpV1;
        this.f78739c = cmpV2;
        for (EnumC29955ap enumC29955ap : EnumC29955ap.values()) {
            m34478a(preferences, enumC29955ap);
        }
        preferences.mo29096a(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30107cp
    @Nullable
    /* renamed from: a */
    public final String mo34480a() {
        String str;
        synchronized (f78737j) {
            str = this.f78741e;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30107cp
    @Nullable
    /* renamed from: b */
    public final String mo34477b() {
        String str;
        synchronized (f78737j) {
            str = this.f78740d;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30107cp
    @Nullable
    /* renamed from: c */
    public final String mo34476c() {
        String str;
        synchronized (f78737j) {
            str = this.f78743g;
        }
        return str;
    }

    @Nullable
    /* renamed from: d */
    public final String m34475d() {
        String str;
        synchronized (f78737j) {
            str = this.f78745i;
        }
        return str;
    }

    /* renamed from: e */
    public final boolean m34474e() {
        boolean z;
        synchronized (f78737j) {
            z = this.f78742f;
        }
        return z;
    }

    @Nullable
    /* renamed from: f */
    public final String m34473f() {
        String str;
        synchronized (f78737j) {
            str = this.f78744h;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.sp0.InterfaceC31386a
    /* renamed from: a */
    public final void mo29570a(@NotNull sp0 localStorage, @NotNull String key) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (f78737j) {
            AbstractC30484hp mo33807a = this.f78739c.mo33807a(localStorage, key);
            if (mo33807a == null) {
                mo33807a = this.f78738b.mo33807a(localStorage, key);
            }
            if (mo33807a != null) {
                m34479a(mo33807a);
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    private final void m34478a(sp0 sp0Var, EnumC29955ap enumC29955ap) {
        AbstractC30484hp mo33808a = this.f78739c.mo33808a(sp0Var, enumC29955ap);
        if (mo33808a == null) {
            mo33808a = this.f78738b.mo33808a(sp0Var, enumC29955ap);
        }
        m34479a(mo33808a);
    }

    /* renamed from: a */
    private final void m34479a(AbstractC30484hp abstractC30484hp) {
        if (abstractC30484hp instanceof AbstractC30484hp.C30486b) {
            this.f78742f = ((AbstractC30484hp.C30486b) abstractC30484hp).m33494a();
        } else if (abstractC30484hp instanceof AbstractC30484hp.C30487c) {
            this.f78740d = ((AbstractC30484hp.C30487c) abstractC30484hp).m33493a();
        } else if (abstractC30484hp instanceof AbstractC30484hp.C30488d) {
            this.f78741e = ((AbstractC30484hp.C30488d) abstractC30484hp).m33492a();
        } else if (abstractC30484hp instanceof AbstractC30484hp.C30489e) {
            this.f78743g = ((AbstractC30484hp.C30489e) abstractC30484hp).m33491a();
        } else if (abstractC30484hp instanceof AbstractC30484hp.C30490f) {
            this.f78744h = ((AbstractC30484hp.C30490f) abstractC30484hp).m33490a();
        } else if (abstractC30484hp instanceof AbstractC30484hp.C30485a) {
            this.f78745i = ((AbstractC30484hp.C30485a) abstractC30484hp).m33495a();
        }
    }
}
