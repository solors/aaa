package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.V */
/* loaded from: classes9.dex */
public final class C34265V implements Converter {

    /* renamed from: a */
    public final C35007x7 f93587a;

    /* renamed from: b */
    public final C34828qa f93588b;

    public C34265V() {
        this(new C35007x7(), new C34828qa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34283Vh fromModel(@NonNull C34289W c34289w) {
        C34421b8 c34421b8 = new C34421b8();
        c34421b8.f94018b = this.f93587a.fromModel(c34289w.f93624a);
        C34049Lm mo20948a = this.f93588b.mo20948a(c34289w.f93625b);
        c34421b8.f94017a = StringUtils.getUTF8Bytes((String) mo20948a.f93198a);
        return new C34283Vh(c34421b8, new C34873s3(C34873s3.m20984b(mo20948a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34283Vh c34283Vh = (C34283Vh) obj;
        throw new UnsupportedOperationException();
    }

    public C34265V(C35007x7 c35007x7, C34828qa c34828qa) {
        this.f93587a = c35007x7;
        this.f93588b = c34828qa;
    }

    @NonNull
    /* renamed from: a */
    public final C34289W m22162a(@NonNull C34283Vh c34283Vh) {
        throw new UnsupportedOperationException();
    }
}
