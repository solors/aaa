package com.facebook.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InternalSettings.kt */
@Metadata
/* loaded from: classes4.dex */
public final class InternalSettings {
    @NotNull
    public static final InternalSettings INSTANCE = new InternalSettings();
    @NotNull
    private static final String UNITY_PREFIX = "Unity.";
    @Nullable
    private static volatile String customUserAgent;

    private InternalSettings() {
    }

    @Nullable
    public static final String getCustomUserAgent() {
        return customUserAgent;
    }

    public static final boolean isUnityApp() {
        boolean m16624M;
        String str = customUserAgent;
        Boolean bool = null;
        if (str != null) {
            m16624M = StringsJVM.m16624M(str, UNITY_PREFIX, false, 2, null);
            bool = Boolean.valueOf(m16624M);
        }
        return Intrinsics.m17075f(bool, Boolean.TRUE);
    }

    public static final void setCustomUserAgent(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        customUserAgent = value;
    }

    public static /* synthetic */ void isUnityApp$annotations() {
    }
}
