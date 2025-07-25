package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.gm */
/* loaded from: classes9.dex */
public final class C34570gm implements InterfaceC34025Km {

    /* renamed from: a */
    public final InterfaceC34025Km f94475a;

    /* renamed from: b */
    public final Object f94476b;

    public C34570gm(@NonNull InterfaceC34025Km interfaceC34025Km, @Nullable Object obj) {
        this.f94475a = interfaceC34025Km;
        this.f94476b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34025Km
    @Nullable
    /* renamed from: a */
    public final Object mo21063a(@Nullable Object obj) {
        if (obj != this.f94475a.mo21063a(obj)) {
            return this.f94476b;
        }
        return obj;
    }
}
