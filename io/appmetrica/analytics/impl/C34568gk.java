package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gk */
/* loaded from: classes9.dex */
public final class C34568gk implements InterfaceC34394a8 {

    /* renamed from: a */
    public final C34836qi f94470a;

    /* renamed from: b */
    public final C34256Ue f94471b;

    public C34568gk() {
        this(new C34836qi(), new C34256Ue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final List<C34283Vh> fromModel(@NonNull C34541fk c34541fk) {
        C34904t8 c34904t8 = new C34904t8();
        c34904t8.f95385a = 2;
        c34904t8.f95387c = new C34826q8();
        C34283Vh fromModel = this.f94470a.fromModel(c34541fk.f94388b);
        c34904t8.f95387c.f95219b = (C34799p8) fromModel.f93615a;
        C34283Vh fromModel2 = this.f94471b.fromModel(c34541fk.f94387a);
        c34904t8.f95387c.f95218a = (C34718m8) fromModel2.f93615a;
        return Collections.singletonList(new C34283Vh(c34904t8, new C34873s3(C34873s3.m20984b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    public C34568gk(C34836qi c34836qi, C34256Ue c34256Ue) {
        this.f94470a = c34836qi;
        this.f94471b = c34256Ue;
    }

    @NonNull
    /* renamed from: a */
    public final C34541fk m21649a(@NonNull List<C34283Vh> list) {
        throw new UnsupportedOperationException();
    }
}
