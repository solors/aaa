package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Ml */
/* loaded from: classes9.dex */
public final class C34072Ml implements ProtobufConverter {
    @NonNull
    /* renamed from: a */
    public final C33777Al m22424a(@NonNull C34048Ll c34048Ll) {
        C33777Al c33777Al = new C33777Al();
        c33777Al.f92593a = c34048Ll.f93197a;
        return c33777Al;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C33777Al c33777Al = new C33777Al();
        c33777Al.f92593a = ((C34048Ll) obj).f93197a;
        return c33777Al;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C34048Ll(((C33777Al) obj).f92593a);
    }

    @NonNull
    /* renamed from: a */
    public final C34048Ll m22425a(@NonNull C33777Al c33777Al) {
        return new C34048Ll(c33777Al.f92593a);
    }
}
