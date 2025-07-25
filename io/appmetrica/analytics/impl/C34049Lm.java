package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Lm */
/* loaded from: classes9.dex */
public final class C34049Lm implements InterfaceC34899t3 {
    @Nullable

    /* renamed from: a */
    public final Object f93198a;
    @NonNull

    /* renamed from: b */
    public final InterfaceC34899t3 f93199b;

    public C34049Lm(@Nullable Object obj, @NonNull InterfaceC34899t3 interfaceC34899t3) {
        this.f93198a = obj;
        this.f93199b = interfaceC34899t3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34899t3
    public final int getBytesTruncated() {
        return this.f93199b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f93198a + ", metaInfo=" + this.f93199b + '}';
    }
}
