package com.chartboost.sdk.internal.Networking;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class EndpointRepositoryImplKt {
    @NotNull
    public static final EndpointRepository endpointRepository(@Nullable Context context) {
        throw new IllegalStateException("Function is not available".toString());
    }

    public static /* synthetic */ EndpointRepository endpointRepository$default(Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return endpointRepository(context);
    }
}
