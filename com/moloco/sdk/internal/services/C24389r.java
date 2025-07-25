package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.r */
/* loaded from: classes7.dex */
public final class C24389r {
    @NotNull

    /* renamed from: a */
    public final String f63123a;
    @NotNull

    /* renamed from: b */
    public final String f63124b;
    @NotNull

    /* renamed from: c */
    public final String f63125c;

    public C24389r(@NotNull String applicationName, @NotNull String packageName, @NotNull String version) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f63123a = applicationName;
        this.f63124b = packageName;
        this.f63125c = version;
    }

    @NotNull
    /* renamed from: a */
    public final String m46502a() {
        return this.f63124b;
    }

    @NotNull
    /* renamed from: b */
    public final String m46501b() {
        return this.f63125c;
    }
}
