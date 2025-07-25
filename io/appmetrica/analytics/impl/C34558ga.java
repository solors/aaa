package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.collections.C37563v;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ga */
/* loaded from: classes9.dex */
public final class C34558ga implements InterfaceC34036L9 {

    /* renamed from: a */
    public final C33914G8 f94450a = new C33914G8();

    @NotNull
    /* renamed from: a */
    public final C34422b9[] m21662a(@Nullable byte[] bArr) {
        int i = 0;
        if (bArr != null) {
            Map<String, byte[]> model = this.f94450a.toModel(bArr);
            C34422b9[] c34422b9Arr = new C34422b9[model.size()];
            for (Object obj : model.entrySet()) {
                int i2 = i + 1;
                if (i < 0) {
                    C37563v.m17156w();
                }
                Map.Entry entry = (Map.Entry) obj;
                C34422b9 c34422b9 = new C34422b9();
                c34422b9.f94020a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
                c34422b9.f94021b = (byte[]) entry.getValue();
                c34422b9Arr[i] = c34422b9;
                i = i2;
            }
            return c34422b9Arr;
        }
        return new C34422b9[0];
    }
}
