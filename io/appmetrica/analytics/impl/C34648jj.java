package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.jj */
/* loaded from: classes9.dex */
public final class C34648jj extends AbstractC33797Bg {
    public C34648jj(@NonNull C33887F6 c33887f6) {
        super(c33887f6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC33797Bg, io.appmetrica.analytics.impl.InterfaceC33822Cg
    /* renamed from: a */
    public final boolean mo21502a(@Nullable Boolean bool) {
        if (!this.f92624a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
            return true;
        }
        return false;
    }
}
