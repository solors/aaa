package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.ud */
/* loaded from: classes9.dex */
public final class C34935ud implements InterfaceC34867rn {

    /* renamed from: a */
    public final String f95462a;

    public C34935ud(@NonNull String str) {
        this.f95462a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable Collection<Object> collection) {
        if (AbstractC34679kn.m21470a((Collection) collection)) {
            return new C34814pn(this, false, this.f95462a + " is null or empty.");
        }
        return new C34814pn(this, true, "");
    }
}
