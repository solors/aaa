package com.yandex.varioqub.analyticadapter.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes8.dex */
public final class ConfigData {

    /* renamed from: a */
    private final String f89328a;

    /* renamed from: b */
    private final String f89329b;

    /* renamed from: c */
    private final long f89330c;

    public ConfigData(@NotNull String str, @NotNull String str2, long j) {
        this.f89328a = str;
        this.f89329b = str2;
        this.f89330c = j;
    }

    public final long getConfigLoadTimestamp() {
        return this.f89330c;
    }

    @NotNull
    public final String getNewConfigVersion() {
        return this.f89329b;
    }

    @NotNull
    public final String getOldConfigVersion() {
        return this.f89328a;
    }
}
