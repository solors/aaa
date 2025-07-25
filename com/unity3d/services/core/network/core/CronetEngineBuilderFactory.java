package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;

/* compiled from: CronetEngineBuilderFactory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CronetEngineBuilderFactory {
    @NotNull
    public final CronetEngine.Builder createCronetEngineBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CronetEngine.Builder(context);
    }
}
