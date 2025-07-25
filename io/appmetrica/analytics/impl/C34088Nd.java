package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Nd */
/* loaded from: classes9.dex */
public final class C34088Nd implements Converter {

    /* renamed from: a */
    public final C34906ta f93275a;

    public C34088Nd() {
        this(new C34906ta(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34283Vh fromModel(@NonNull Map<String, String> map) {
        C34049Lm mo20948a = this.f93275a.mo20948a(map);
        C34664k8 c34664k8 = new C34664k8();
        c34664k8.f94778b = ((C33810C4) mo20948a.f93199b).f92670b;
        Map map2 = (Map) mo20948a.f93198a;
        if (map2 != null) {
            c34664k8.f94777a = new C34637j8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c34664k8.f94777a[i] = new C34637j8();
                c34664k8.f94777a[i].f94686a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c34664k8.f94777a[i].f94687b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC34899t3 interfaceC34899t3 = mo20948a.f93199b;
        int i2 = ((C33810C4) interfaceC34899t3).f95318a;
        return new C34283Vh(c34664k8, interfaceC34899t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34283Vh c34283Vh = (C34283Vh) obj;
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C34088Nd(@NonNull C34906ta c34906ta) {
        this.f93275a = c34906ta;
    }

    @NonNull
    /* renamed from: a */
    public final Map<String, String> m22394a(@NonNull C34283Vh c34283Vh) {
        throw new UnsupportedOperationException();
    }
}
