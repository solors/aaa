package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.AbstractC29537l2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.core.C43557d;
import sg.bigo.ads.p883ad.banner.C42836a;

/* loaded from: classes10.dex */
public class BannerAdRequest extends AbstractC43532b<BannerAdRequest> {
    @NonNull

    /* renamed from: h */
    private final List<AdSize> f114002h;

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.f114002h = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.f114002h.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: a */
    public final /* synthetic */ BannerAdRequest mo5468a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(this.f114037a, new ArrayList(this.f114002h), this.f114038b);
        bannerAdRequest.m5466a(this.f114043g.f114044a);
        bannerAdRequest.f114039c = this.f114039c;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: b */
    public final C43557d mo5464b() {
        C43557d mo5464b = super.mo5464b();
        if (mo5464b != null) {
            return mo5464b;
        }
        if (this.f114002h.isEmpty()) {
            return new C43557d(1001, AbstractC29537l2.CONFIGURATION_ERROR, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public int mo5358c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: d */
    public final Map<String, Object> mo5460d() {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_size", C42836a.m6518a(this.f114002h));
        return hashMap;
    }
}
