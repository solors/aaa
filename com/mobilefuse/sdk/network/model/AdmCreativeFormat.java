package com.mobilefuse.sdk.network.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdmCreativeFormat.kt */
@Metadata
/* loaded from: classes7.dex */
public enum AdmCreativeFormat {
    TRANSPARENT_INTERSTITIAL("instl_transparent", true),
    OMNI_BREAKOUT("omni_breakout", true);
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isTransparent;
    @NotNull
    private final String value;

    /* compiled from: AdmCreativeFormat.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AdmCreativeFormat fromValue(@NotNull String value) {
            AdmCreativeFormat[] values;
            Intrinsics.checkNotNullParameter(value, "value");
            for (AdmCreativeFormat admCreativeFormat : AdmCreativeFormat.values()) {
                if (Intrinsics.m17075f(admCreativeFormat.getValue(), value)) {
                    return admCreativeFormat;
                }
            }
            return null;
        }
    }

    AdmCreativeFormat(String str, boolean z) {
        this.value = str;
        this.isTransparent = z;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final boolean isTransparent() {
        return this.isTransparent;
    }
}
