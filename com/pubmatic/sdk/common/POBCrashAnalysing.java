package com.pubmatic.sdk.common;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBCrashAnalysing.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBCrashAnalysing {
    void initialize(@NotNull Context context);

    void invalidate();
}
