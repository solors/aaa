package com.unity3d.ads.core.configuration;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidManifestIntPropertyReader.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidManifestIntPropertyReader {
    @NotNull
    private final Context context;

    public AndroidManifestIntPropertyReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Nullable
    public final Integer getPropertyByName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            return Integer.valueOf(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getInt(propertyName));
        } catch (Exception unused) {
            return null;
        }
    }
}
