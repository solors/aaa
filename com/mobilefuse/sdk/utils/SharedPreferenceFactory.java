package com.mobilefuse.sdk.utils;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.utils.SharedPreferenceFactoryKt */
/* loaded from: classes7.dex */
public final class SharedPreferenceFactory {
    @NotNull
    public static final Functions<SharedPreferences> createLazySharedPrefs(@NotNull String prefsName) {
        Intrinsics.checkNotNullParameter(prefsName, "prefsName");
        C37609n0 c37609n0 = new C37609n0();
        c37609n0.f99327b = null;
        return new SharedPreferenceFactoryKt$createLazySharedPrefs$1(c37609n0, prefsName);
    }
}
