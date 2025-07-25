package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Pe */
/* loaded from: classes9.dex */
public final class C34137Pe extends C34774oa {
    public C34137Pe(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C34774oa
    /* renamed from: a */
    public final int mo21159b(@Nullable C34289W c34289w) {
        if (c34289w == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(c34289w.f93625b) + 12;
    }
}
