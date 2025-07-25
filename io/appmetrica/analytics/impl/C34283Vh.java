package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.Vh */
/* loaded from: classes9.dex */
public final class C34283Vh implements InterfaceC34899t3 {
    @NonNull

    /* renamed from: a */
    public final Object f93615a;
    @NonNull

    /* renamed from: b */
    public final InterfaceC34899t3 f93616b;

    public C34283Vh(@NonNull Object obj, @NonNull InterfaceC34899t3 interfaceC34899t3) {
        this.f93615a = obj;
        this.f93616b = interfaceC34899t3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34899t3
    public final int getBytesTruncated() {
        return this.f93616b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.f93615a + ", metaInfo=" + this.f93616b + '}';
    }
}
