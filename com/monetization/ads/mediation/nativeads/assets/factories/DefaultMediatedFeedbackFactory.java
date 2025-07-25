package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class DefaultMediatedFeedbackFactory {
    @NotNull
    public final MediatedNativeAdImage makeFeedback(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediatedNativeAdImage.Builder height = new MediatedNativeAdImage.Builder("default_mediation_feedback_url").setWidth(68).setHeight(68);
        try {
            height.setDrawable(context.getDrawable(i));
        } catch (Throwable unused) {
        }
        return height.build();
    }
}
