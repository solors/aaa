package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Y */
/* loaded from: classes9.dex */
public final class C34337Y implements ProtobufConverter {

    /* renamed from: a */
    public final C34241U f93785a;

    /* renamed from: b */
    public final C34689l6 f93786b;

    public C34337Y() {
        this(new C34241U(new C34996wm()), new C34689l6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34319X5 fromModel(@NonNull C34313X c34313x) {
        C34319X5 c34319x5 = new C34319X5();
        c34319x5.f93709a = this.f93785a.fromModel(c34313x.f93663a);
        String str = c34313x.f93664b;
        if (str != null) {
            c34319x5.f93710b = str;
        }
        c34319x5.f93711c = this.f93786b.m22545a(c34313x.f93665c);
        return c34319x5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34319X5 c34319x5 = (C34319X5) obj;
        throw new UnsupportedOperationException();
    }

    public C34337Y(C34241U c34241u, C34689l6 c34689l6) {
        this.f93785a = c34241u;
        this.f93786b = c34689l6;
    }

    @NonNull
    /* renamed from: a */
    public final C34313X m22088a(@NonNull C34319X5 c34319x5) {
        throw new UnsupportedOperationException();
    }
}
