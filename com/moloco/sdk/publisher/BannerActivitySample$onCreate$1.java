package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Standard;

@Metadata
/* loaded from: classes7.dex */
public final class BannerActivitySample$onCreate$1 extends Lambda implements Function2<Banner, MolocoAdError.AdCreateError, Unit> {
    final /* synthetic */ BannerActivitySample this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerActivitySample$onCreate$1(BannerActivitySample bannerActivitySample) {
        super(2);
        this.this$0 = bannerActivitySample;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Banner banner, MolocoAdError.AdCreateError adCreateError) {
        invoke2(banner, adCreateError);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Banner banner, @Nullable MolocoAdError.AdCreateError adCreateError) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        if (banner != null) {
            this.this$0.banner = banner;
            frameLayout = this.this$0.bannerContainer;
            frameLayout.addView(banner);
            banner.setAdShowListener(new BannerAdShowListener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1.1
                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdClicked(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdHidden(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
                    Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }
            });
            banner.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1.2
                @Override // com.moloco.sdk.publisher.AdLoad.Listener
                public void onAdLoadFailed(@NotNull MolocoAdError molocoAdError) {
                    Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdLoad.Listener
                public void onAdLoadSuccess(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }
            });
            banner.isLoaded();
            banner.load("an_another_bid_response", null);
            frameLayout2 = this.this$0.bannerContainer;
            frameLayout2.removeView(banner);
            banner.load("", null);
            banner.load("some_other_bid_response", null);
            frameLayout3 = this.this$0.bannerContainer;
            frameLayout3.addView(banner);
            return;
        }
        this.this$0.finish();
    }
}
