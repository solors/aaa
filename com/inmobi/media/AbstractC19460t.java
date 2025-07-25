package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.t */
/* loaded from: classes6.dex */
public abstract class AbstractC19460t {
    public void onAdClicked(Object obj, @NotNull Map<Object, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public void onAdFetchSuccessful(Object obj, @NotNull AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public void onAdLoadFailed(Object obj, @NotNull InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(AbstractC19460t.class.getSimpleName(), "getSimpleName(...)");
    }

    public void onAdLoadSucceeded(Object obj, @NotNull AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public void onImraidLog(Object obj, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public void onAdImpression(Object obj) {
    }

    public void onRequestPayloadCreated(@Nullable byte[] bArr) {
    }
}
