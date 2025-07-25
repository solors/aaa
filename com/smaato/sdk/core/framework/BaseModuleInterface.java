package com.smaato.sdk.core.framework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.p569di.DiRegistry;

/* loaded from: classes7.dex */
public interface BaseModuleInterface {
    @NonNull
    String moduleDiName();

    @Nullable
    DiRegistry moduleDiRegistry();

    @NonNull
    String version();
}
