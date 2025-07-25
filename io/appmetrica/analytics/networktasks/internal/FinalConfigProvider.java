package io.appmetrica.analytics.networktasks.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class FinalConfigProvider<T> implements ConfigProvider<T> {

    /* renamed from: a */
    private final Object f95875a;

    public FinalConfigProvider(@NotNull T t) {
        this.f95875a = t;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    public T getConfig() {
        return (T) this.f95875a;
    }
}
