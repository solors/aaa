package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.A3 */
/* loaded from: classes9.dex */
public final class C33759A3 implements InterfaceC34394a8 {

    /* renamed from: a */
    public final C33784B3 f92554a;

    public C33759A3() {
        this(new C33784B3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final List<C34283Vh> fromModel(@NonNull C35055z3 c35055z3) {
        C34904t8 c34904t8 = new C34904t8();
        c34904t8.f95389e = new C34448c8();
        C34283Vh fromModel = this.f92554a.fromModel(c35055z3.f95678b);
        c34904t8.f95389e.f94082a = (C34475d8) fromModel.f93615a;
        c34904t8.f95385a = c35055z3.f95677a;
        return Collections.singletonList(new C34283Vh(c34904t8, new C34873s3(C34873s3.m20984b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    public C33759A3(C33784B3 c33784b3) {
        this.f92554a = c33784b3;
    }

    @NonNull
    /* renamed from: a */
    public final C35055z3 m22784a(@NonNull List<C34283Vh> list) {
        throw new UnsupportedOperationException();
    }
}
