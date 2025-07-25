package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.Dm */
/* loaded from: classes9.dex */
public class C33853Dm implements InterfaceC34867rn {

    /* renamed from: a */
    public final InterfaceC34867rn f92747a;

    public C33853Dm(@NonNull InterfaceC34867rn interfaceC34867rn) {
        this.f92747a = interfaceC34867rn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable Object obj) {
        C34814pn mo20778a = this.f92747a.mo20778a(obj);
        if (mo20778a.f95187a) {
            return mo20778a;
        }
        throw new ValidationException(mo20778a.f95188b);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final InterfaceC34867rn m22692a() {
        return this.f92747a;
    }
}
