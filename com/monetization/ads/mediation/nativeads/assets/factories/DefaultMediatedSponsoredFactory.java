package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class DefaultMediatedSponsoredFactory {
    @NotNull
    public final String makeSponsored(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String string = context.getString(i);
            Intrinsics.m17074g(string);
            return string;
        } catch (Throwable unused) {
            return "Advertisement";
        }
    }
}
