package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.V4 */
/* loaded from: classes9.dex */
public abstract class AbstractC34270V4 extends AbstractC34953v5 {
    public AbstractC34270V4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, C34152Q5> componentLoader, @NonNull C34650jl c34650jl, @NonNull BaseRequestConfig.BaseRequestArguments<C33835D4, Object> baseRequestArguments) {
        super(componentLoader, c34650jl, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34953v5
    /* renamed from: a */
    public final void mo20885a(@NonNull Object obj) {
        C33835D4 c33835d4 = (C33835D4) obj;
        synchronized (this) {
            super.mo20885a((Object) c33835d4);
        }
    }

    /* renamed from: a */
    public final synchronized void m22159a(@NonNull C33835D4 c33835d4) {
        super.mo20885a((Object) c33835d4);
    }
}
