package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UniversalRequestWorkerData.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UniversalRequestWorkerData {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    @NotNull
    private final String universalRequestId;

    /* compiled from: UniversalRequestWorkerData.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UniversalRequestWorkerData(@NotNull String universalRequestId) {
        Intrinsics.checkNotNullParameter(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    @NotNull
    public final Data invoke() {
        Data build = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .p…tId)\n            .build()");
        return build;
    }
}
