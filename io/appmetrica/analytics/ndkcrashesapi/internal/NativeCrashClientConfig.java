package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class NativeCrashClientConfig {

    /* renamed from: a */
    private final String f95815a;

    /* renamed from: b */
    private final String f95816b;

    public NativeCrashClientConfig(@NotNull String str, @NotNull String str2) {
        this.f95815a = str;
        this.f95816b = str2;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.f95815a;
    }

    @NotNull
    public final String getNativeCrashMetadata() {
        return this.f95816b;
    }
}
