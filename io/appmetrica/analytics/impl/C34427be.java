package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.be */
/* loaded from: classes9.dex */
public final class C34427be implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34343Y5[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        C34343Y5[] c34343y5Arr = new C34343Y5[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c34343y5Arr[i2] = new C34343Y5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C34343Y5 c34343y5 = c34343y5Arr[i];
            Charset charset = Charsets.UTF_8;
            c34343y5.f93805a = entry.getKey().getBytes(charset);
            c34343y5Arr[i].f93806b = entry.getValue().getBytes(charset);
            i++;
        }
        return c34343y5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C34343Y5[] c34343y5Arr = (C34343Y5[]) obj;
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m21932a(@NotNull C34343Y5[] c34343y5Arr) {
        throw new UnsupportedOperationException();
    }
}
