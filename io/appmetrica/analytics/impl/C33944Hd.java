package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.Hd */
/* loaded from: classes9.dex */
public final class C33944Hd implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Integer fromModel(@Nullable Boolean bool) {
        int i;
        if (bool == null) {
            i = -1;
        } else if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            i = 1;
        } else if (!Intrinsics.m17075f(bool, Boolean.FALSE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object toModel(Object obj) {
        return m22565a(((Number) obj).intValue());
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m22565a(int i) {
        if (i != -1) {
            if (i == 0) {
                return Boolean.FALSE;
            }
            if (i == 1) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
