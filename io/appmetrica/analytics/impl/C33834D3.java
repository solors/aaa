package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.D3 */
/* loaded from: classes9.dex */
public final class C33834D3 implements Converter {

    /* renamed from: a */
    public final C34801pa f92688a;

    public C33834D3() {
        this(new C34801pa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34283Vh fromModel(@NonNull List<String> list) {
        C34049Lm mo20948a = this.f92688a.mo20948a((List<Object>) list);
        C34502e8 c34502e8 = new C34502e8();
        c34502e8.f94245a = StringUtils.getUTF8Bytes((List) mo20948a.f93198a);
        InterfaceC34899t3 interfaceC34899t3 = mo20948a.f93199b;
        int i = ((C33810C4) interfaceC34899t3).f95318a;
        return new C34283Vh(c34502e8, interfaceC34899t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34283Vh c34283Vh = (C34283Vh) obj;
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C33834D3(@NonNull C34801pa c34801pa) {
        this.f92688a = c34801pa;
    }

    @NonNull
    /* renamed from: a */
    public final List<String> m22724a(@NonNull C34283Vh c34283Vh) {
        throw new UnsupportedOperationException();
    }
}
