package sg.bigo.ads.api;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public class NativeBannerAdRequest extends BannerAdRequest {

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, NativeBannerAdRequest> {
        private List<AdSize> mAdSizes;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public NativeBannerAdRequest createAdRequest() {
            return new NativeBannerAdRequest(this.mSlotId, this.mAdSizes);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    NativeBannerAdRequest(String str, List<AdSize> list) {
        super(str, list, null);
    }

    @Override // sg.bigo.ads.api.BannerAdRequest, sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return 0;
    }
}
