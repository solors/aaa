package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoSamplesKt$MolocoCreateBanner$1 extends Lambda implements Function2<Banner, MolocoAdError.AdCreateError, Unit> {
    final /* synthetic */ FrameLayout $frameLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MolocoSamplesKt$MolocoCreateBanner$1(FrameLayout frameLayout) {
        super(2);
        this.$frameLayout = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Banner banner, MolocoAdError.AdCreateError adCreateError) {
        invoke2(banner, adCreateError);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Banner banner, @Nullable MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            this.$frameLayout.addView(banner);
            banner.destroy();
            this.$frameLayout.removeView(banner);
        }
    }
}
