package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.da */
/* loaded from: classes9.dex */
public final class C34477da implements ProtobufConverter {

    /* renamed from: a */
    public final AbstractC33968Id f94199a;

    public C34477da() {
        this(new C34310Wk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34995wl fromModel(@NonNull C33760A4 c33760a4) {
        C34995wl c34995wl = new C34995wl();
        c34995wl.f95570b = c33760a4.f92556b;
        c34995wl.f95569a = c33760a4.f92555a;
        c34995wl.f95571c = c33760a4.f92557c;
        c34995wl.f95572d = c33760a4.f92558d;
        c34995wl.f95573e = c33760a4.f92559e;
        c34995wl.f95574f = this.f94199a.m22545a(c33760a4.f92560f);
        return c34995wl;
    }

    public C34477da(C34310Wk c34310Wk) {
        this.f94199a = c34310Wk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C33760A4 toModel(@NonNull C34995wl c34995wl) {
        C35030y4 c35030y4 = new C35030y4();
        c35030y4.f95635d = c34995wl.f95572d;
        c35030y4.f95634c = c34995wl.f95571c;
        c35030y4.f95633b = c34995wl.f95570b;
        c35030y4.f95632a = c34995wl.f95569a;
        c35030y4.f95636e = c34995wl.f95573e;
        c35030y4.f95637f = this.f94199a.m22546a(c34995wl.f95574f);
        return new C33760A4(c35030y4);
    }
}
