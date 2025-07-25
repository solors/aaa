package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Ek */
/* loaded from: classes9.dex */
public final class C33876Ek implements InterfaceC34220T2 {

    /* renamed from: a */
    public final Context f92800a;

    public C33876Ek(@NotNull Context context) {
        this.f92800a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34220T2, io.appmetrica.analytics.impl.InterfaceC34785ol
    /* renamed from: a */
    public final void mo20741a(@NotNull C34650jl c34650jl) {
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p724io.SslSocketFactoryProvider
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @NotNull
    /* renamed from: a */
    public final Context m22669a() {
        return this.f92800a;
    }
}
