package sg.bigo.ads.api;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes10.dex */
public class SplashAdRequest extends AbstractC43532b {
    @DrawableRes

    /* renamed from: h */
    public final int f114020h;

    /* renamed from: i */
    public final String f114021i;

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, SplashAdRequest> {
        @DrawableRes
        private int mAppLogoResId;
        private String mAppName;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        @NonNull
        public Builder withAppLogo(@DrawableRes int i) {
            this.mAppLogoResId = i;
            return this;
        }

        @NonNull
        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, @DrawableRes int i, String str2, String str3) {
        super(str, str3);
        this.f114020h = i;
        this.f114021i = str2;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: d */
    public final Map<String, Object> mo5460d() {
        return null;
    }
}
