package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.vd */
/* loaded from: classes9.dex */
public final class C34961vd implements InterfaceC34867rn {

    /* renamed from: a */
    public final String f95516a;

    public C34961vd(@NonNull String str) {
        this.f95516a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new C34814pn(this, false, this.f95516a + " is empty.");
        }
        return new C34814pn(this, true, "");
    }
}
