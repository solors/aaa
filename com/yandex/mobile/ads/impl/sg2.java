package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sg2 implements NativeAdAssets {
    @NotNull

    /* renamed from: a */
    private final C30578is f85249a;

    public sg2(@NotNull C30578is assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f85249a = assets;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sg2) && Intrinsics.m17075f(this.f85249a, ((sg2) obj).f85249a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getAge() {
        return this.f85249a.m33146a();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getBody() {
        return this.f85249a.m33145b();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getCallToAction() {
        return this.f85249a.m33144c();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getDomain() {
        return this.f85249a.m33143d();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getFavicon() {
        C30745ks m33142e = this.f85249a.m33142e();
        if (m33142e != null) {
            return new ug2(m33142e);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getIcon() {
        C30745ks m33140g = this.f85249a.m33140g();
        if (m33140g != null) {
            return new ug2(m33140g);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdImage getImage() {
        C30745ks m33139h = this.f85249a.m33139h();
        if (m33139h != null) {
            return new ug2(m33139h);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final NativeAdMedia getMedia() {
        C31062os m33138i = this.f85249a.m33138i();
        if (m33138i != null) {
            return new xg2(m33138i);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getPrice() {
        return this.f85249a.m33137j();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final Float getRating() {
        return this.f85249a.m33136k();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getReviewCount() {
        return this.f85249a.m33135l();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getSponsored() {
        return this.f85249a.m33134m();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getTitle() {
        return this.f85249a.m33133n();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    @Nullable
    public final String getWarning() {
        return this.f85249a.m33132o();
    }

    public final int hashCode() {
        return this.f85249a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final boolean isFeedbackAvailable() {
        return this.f85249a.m33141f();
    }

    @NotNull
    public final String toString() {
        C30578is c30578is = this.f85249a;
        return "YandexNativeAdAssetsAdapter(assets=" + c30578is + ")";
    }
}
