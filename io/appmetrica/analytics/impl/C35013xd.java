package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.xd */
/* loaded from: classes9.dex */
public final class C35013xd implements InterfaceC34867rn {

    /* renamed from: a */
    public final String f95602a;

    public C35013xd(@NonNull String str) {
        this.f95602a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable Object obj) {
        if (obj == null) {
            return new C34814pn(this, false, this.f95602a + " is null.");
        }
        return new C34814pn(this, true, "");
    }

    @NonNull
    /* renamed from: a */
    public final String m20779a() {
        return this.f95602a;
    }
}
