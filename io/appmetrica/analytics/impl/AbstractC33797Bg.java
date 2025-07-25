package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Bg */
/* loaded from: classes9.dex */
public abstract class AbstractC33797Bg implements InterfaceC33822Cg {
    @NonNull

    /* renamed from: a */
    protected final DataSendingRestrictionController f92624a;

    public AbstractC33797Bg(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f92624a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33822Cg
    /* renamed from: a */
    public boolean mo21502a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
