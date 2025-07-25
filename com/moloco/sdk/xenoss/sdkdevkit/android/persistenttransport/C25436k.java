package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.annotation.VisibleForTesting;
import androidx.work.Data;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k */
/* loaded from: classes7.dex */
public final class C25436k {
    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* renamed from: a */
    public static final Data m44570a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Tuples[] tuplesArr = {C38513v.m14532a("url", str)};
            Data.Builder builder = new Data.Builder();
            Tuples tuples = tuplesArr[0];
            builder.put((String) tuples.m17630c(), tuples.m17629d());
            Data build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "dataBuilder.build()");
            return build;
        } catch (Exception e) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, "PersistentHttpRequest", e.getMessage() + ". Url: " + str, null, false, 12, null);
            return null;
        }
    }
}
