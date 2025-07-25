package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.Hf */
/* loaded from: classes9.dex */
public class C33946Hf {

    /* renamed from: a */
    public final InterfaceC34037La f92962a;

    /* renamed from: b */
    public final InterfaceC33821Cf f92963b;

    /* renamed from: c */
    public final InterfaceC33989Ja f92964c;

    public C33946Hf(InterfaceC34037La interfaceC34037La, InterfaceC33821Cf interfaceC33821Cf, InterfaceC33989Ja interfaceC33989Ja) {
        this.f92962a = interfaceC34037La;
        this.f92963b = interfaceC33821Cf;
        this.f92964c = interfaceC33989Ja;
    }

    /* renamed from: a */
    public final void m22560a(@Nullable C33896Ff c33896Ff) {
        if (this.f92962a.mo20712a(c33896Ff)) {
            this.f92963b.mo21789a(c33896Ff);
            this.f92964c.mo21714a();
        }
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final InterfaceC33821Cf m22559b() {
        return this.f92963b;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC33989Ja m22558c() {
        return this.f92964c;
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final InterfaceC34037La m22561a() {
        return this.f92962a;
    }
}
