package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class NativeCrashServiceConfig {

    /* renamed from: a */
    private final String f95817a;

    public NativeCrashServiceConfig(@NotNull String str) {
        this.f95817a = str;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.f95817a;
    }
}
