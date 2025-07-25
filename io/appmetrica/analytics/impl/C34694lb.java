package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.lb */
/* loaded from: classes9.dex */
public final class C34694lb implements InterfaceC34867rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable String str) {
        if (str == null) {
            return new C34814pn(this, false, "key is null");
        }
        if (str.startsWith("appmetrica")) {
            return new C34814pn(this, false, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return new C34814pn(this, false, "key length more then 200 characters");
        }
        return new C34814pn(this, true, "");
    }
}
