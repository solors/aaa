package com.mobilefuse.sdk.identity.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtendedUidListener.kt */
@Metadata
/* loaded from: classes7.dex */
public interface ExtendedUidListener {
    void onChanged(@Nullable String str, @NotNull ExtendedUidProvider extendedUidProvider, boolean z);
}
