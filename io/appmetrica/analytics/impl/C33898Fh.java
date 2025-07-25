package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Fh */
/* loaded from: classes9.dex */
public final class C33898Fh implements InterfaceC34867rn {

    /* renamed from: a */
    public final Map f92864a;

    public C33898Fh(@NonNull Map<String, ?> map) {
        this.f92864a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable String str) {
        if (this.f92864a.containsKey(str)) {
            return new C34814pn(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str));
        }
        return new C34814pn(this, true, "");
    }
}
