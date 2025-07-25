package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ye */
/* loaded from: classes9.dex */
public final class C34352Ye implements Converter {

    /* renamed from: a */
    public final C34801pa f93839a;

    public C34352Ye() {
        this(new C34801pa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34283Vh fromModel(@NonNull List<String> list) {
        C34049Lm mo20948a = this.f93839a.mo20948a((List<Object>) list);
        List list2 = (List) mo20948a.f93198a;
        C34745n8[] c34745n8Arr = new C34745n8[0];
        if (list2 != null) {
            c34745n8Arr = new C34745n8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C34745n8 c34745n8 = new C34745n8();
                c34745n8Arr[i] = c34745n8;
                c34745n8.f94993a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        mo20948a.f93199b.getBytesTruncated();
        return new C34283Vh(c34745n8Arr, mo20948a.f93199b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34283Vh c34283Vh = (C34283Vh) obj;
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C34352Ye(@NonNull C34801pa c34801pa) {
        this.f93839a = c34801pa;
    }

    @NonNull
    /* renamed from: a */
    public final List<String> m22065a(@NonNull C34283Vh c34283Vh) {
        throw new UnsupportedOperationException();
    }
}
