package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.openwrap.core.POBImpression;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBALMAXRequestFactory.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBALMAXRequestFactory {
    @NotNull
    public static final POBALMAXRequestFactory INSTANCE = new POBALMAXRequestFactory();

    private POBALMAXRequestFactory() {
    }

    @Nullable
    public static final POBRequest getRequest(@NotNull POBAdFormat placementType, @NotNull POBImpression impression) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impression, "impression");
        return POBRequest.createInstance("NA", 0, placementType, impression);
    }
}
