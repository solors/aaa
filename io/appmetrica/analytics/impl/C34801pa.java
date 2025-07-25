package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.pa */
/* loaded from: classes9.dex */
public final class C34801pa extends C34774oa {
    public C34801pa(int i, int i2) {
        this(i, new C34828qa(i2));
    }

    /* renamed from: a */
    public final int m21160a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C34774oa
    /* renamed from: b */
    public final int mo21159b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    @VisibleForTesting
    public C34801pa(int i, @NonNull C34828qa c34828qa) {
        super(i, c34828qa);
    }
}
