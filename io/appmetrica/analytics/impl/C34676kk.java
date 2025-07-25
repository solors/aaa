package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kk */
/* loaded from: classes9.dex */
public final class C34676kk implements InterfaceC34394a8 {

    /* renamed from: a */
    public final C34836qi f94793a;

    public C34676kk() {
        this(new C34836qi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final List<C34283Vh> fromModel(@NonNull C34649jk c34649jk) {
        C34904t8 c34904t8 = new C34904t8();
        c34904t8.f95385a = 1;
        c34904t8.f95386b = new C34878s8();
        C34283Vh fromModel = this.f94793a.fromModel(c34649jk.f94716a);
        c34904t8.f95386b.f95325a = (C34799p8) fromModel.f93615a;
        C34873s3 c34873s3 = new C34873s3(C34873s3.m20984b(fromModel));
        fromModel.f93616b.getBytesTruncated();
        return Collections.singletonList(new C34283Vh(c34904t8, c34873s3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    public C34676kk(C34836qi c34836qi) {
        this.f94793a = c34836qi;
    }

    @NonNull
    /* renamed from: a */
    public final C34649jk m21481a(@NonNull List<C34283Vh> list) {
        throw new UnsupportedOperationException();
    }
}
