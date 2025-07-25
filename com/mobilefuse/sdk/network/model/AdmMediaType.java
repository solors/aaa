package com.mobilefuse.sdk.network.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdmMediaType.kt */
@Metadata
/* loaded from: classes7.dex */
public enum AdmMediaType {
    BANNER("banner"),
    VIDEO("video"),
    NATIVE("native");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String value;

    /* compiled from: AdmMediaType.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AdmMediaType fromValue(@NotNull String value) {
            AdmMediaType[] values;
            Intrinsics.checkNotNullParameter(value, "value");
            for (AdmMediaType admMediaType : AdmMediaType.values()) {
                if (Intrinsics.m17075f(admMediaType.getValue(), value)) {
                    return admMediaType;
                }
            }
            return null;
        }
    }

    AdmMediaType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
