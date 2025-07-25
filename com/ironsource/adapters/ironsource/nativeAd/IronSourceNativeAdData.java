package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.C19768dg;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {
    @Nullable
    private final String advertiser;
    @Nullable
    private final String body;
    @Nullable
    private final String callToAction;
    @Nullable
    private final NativeAdDataInterface.Image icon;
    @Nullable
    private final String title;

    public IronSourceNativeAdData(@NotNull C19768dg nativeAdData) {
        Intrinsics.checkNotNullParameter(nativeAdData, "nativeAdData");
        this.title = nativeAdData.m58928n();
        this.advertiser = nativeAdData.m58934h();
        this.body = nativeAdData.m58933i();
        this.callToAction = nativeAdData.m58932j();
        this.icon = new NativeAdDataInterface.Image(nativeAdData.m58931k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        return this.title;
    }
}
