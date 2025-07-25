package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Ic */
/* loaded from: classes9.dex */
public final class C33967Ic extends AbstractC34029L2 {

    /* renamed from: b */
    public final String f93020b;

    public C33967Ic(@NotNull String str, @NotNull InterfaceC35046yk interfaceC35046yk) {
        super(interfaceC35046yk);
        this.f93020b = str;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34029L2
    @NotNull
    /* renamed from: a */
    public final String mo20916a(@NotNull String str) {
        return str + '-' + this.f93020b;
    }
}
