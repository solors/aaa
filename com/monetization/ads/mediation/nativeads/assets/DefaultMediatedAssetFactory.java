package com.monetization.ads.mediation.nativeads.assets;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedFeedbackFactory;
import com.monetization.ads.mediation.nativeads.assets.factories.DefaultMediatedSponsoredFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class DefaultMediatedAssetFactory implements MediatedAssetFactory {
    @NotNull

    /* renamed from: a */
    private final Context f66543a;
    @NotNull

    /* renamed from: b */
    private final DefaultMediatedSponsoredFactory f66544b;
    @NotNull

    /* renamed from: c */
    private final DefaultMediatedFeedbackFactory f66545c;

    public DefaultMediatedAssetFactory(@NotNull Context context, @NotNull DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, @NotNull DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultMediatedSponsoredFactory, "defaultMediatedSponsoredFactory");
        Intrinsics.checkNotNullParameter(defaultMediatedFeedbackFactory, "defaultMediatedFeedbackFactory");
        this.f66543a = context;
        this.f66544b = defaultMediatedSponsoredFactory;
        this.f66545c = defaultMediatedFeedbackFactory;
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public MediatedNativeAdImage makeFeedback(int i) {
        return this.f66545c.makeFeedback(this.f66543a, i);
    }

    @Override // com.monetization.ads.mediation.nativeads.assets.MediatedAssetFactory
    @NotNull
    public String makeSponsored(int i) {
        return this.f66544b.makeSponsored(this.f66543a, i);
    }

    public /* synthetic */ DefaultMediatedAssetFactory(Context context, DefaultMediatedSponsoredFactory defaultMediatedSponsoredFactory, DefaultMediatedFeedbackFactory defaultMediatedFeedbackFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new DefaultMediatedSponsoredFactory() : defaultMediatedSponsoredFactory, (i & 4) != 0 ? new DefaultMediatedFeedbackFactory() : defaultMediatedFeedbackFactory);
    }
}
