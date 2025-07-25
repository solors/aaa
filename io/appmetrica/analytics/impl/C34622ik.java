package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ik */
/* loaded from: classes9.dex */
public final class C34622ik implements InterfaceC34394a8 {

    /* renamed from: a */
    public final C34256Ue f94637a;

    /* renamed from: b */
    public final C34989wf f94638b;

    public C34622ik() {
        this(new C34256Ue(), new C34989wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final List<C34283Vh> fromModel(@NonNull C34595hk c34595hk) {
        C34283Vh c34283Vh;
        C34904t8 c34904t8 = new C34904t8();
        c34904t8.f95385a = 3;
        c34904t8.f95388d = new C34852r8();
        C34283Vh fromModel = this.f94637a.fromModel(c34595hk.f94552a);
        c34904t8.f95388d.f95269a = (C34718m8) fromModel.f93615a;
        C34138Pf c34138Pf = c34595hk.f94553b;
        if (c34138Pf != null) {
            c34283Vh = this.f94638b.fromModel(c34138Pf);
            c34904t8.f95388d.f95270b = (C34772o8) c34283Vh.f93615a;
        } else {
            c34283Vh = null;
        }
        return Collections.singletonList(new C34283Vh(c34904t8, new C34873s3(C34873s3.m20984b(fromModel, c34283Vh))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    public C34622ik(C34256Ue c34256Ue, C34989wf c34989wf) {
        this.f94637a = c34256Ue;
        this.f94638b = c34989wf;
    }

    @NonNull
    /* renamed from: a */
    public final C34595hk m21534a(@NonNull List<C34283Vh> list) {
        throw new UnsupportedOperationException();
    }
}
