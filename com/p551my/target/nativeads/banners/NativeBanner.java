package com.p551my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25669c;
import com.p551my.target.C25822i6;
import com.p551my.target.common.models.Disclaimer;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativeBanner */
/* loaded from: classes7.dex */
public class NativeBanner {
    @Nullable
    ImageData adChoicesIcon;
    @Nullable
    String advertisingLabel;
    @Nullable
    String ageRestrictions;
    @Nullable
    String bundleId;
    @Nullable
    String ctaText;
    @Nullable
    String description;
    @Nullable
    String disclaimer;
    @Nullable
    Disclaimer disclaimerInfo;
    @Nullable
    String domain;
    boolean hasAdChoices;
    @Nullable
    ImageData icon;
    @NonNull
    String navigationType;
    float rating;
    @Nullable
    String storeType;
    @Nullable
    String title;
    int votes;

    /* renamed from: com.my.target.nativeads.banners.NativeBanner$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NonNull
        private final NativeBanner banner = new NativeBanner();

        private Builder() {
        }

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        public NativeBanner build() {
            return this.banner;
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.banner.adChoicesIcon = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.banner.advertisingLabel = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.banner.ageRestrictions = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.banner.bundleId = str;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.banner.ctaText = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.banner.description = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.banner.disclaimer = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.banner.disclaimerInfo = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.banner.domain = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z) {
            this.banner.hasAdChoices = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.banner.icon = imageData;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            if ("web".equals(str) || "store".equals(str)) {
                this.banner.navigationType = str;
            }
            return this;
        }

        @NonNull
        public Builder setRating(float f) {
            this.banner.rating = f;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.banner.storeType = str;
            return this;
        }

        @NonNull
        public Builder setTitle(String str) {
            this.banner.title = str;
            return this;
        }

        @NonNull
        public Builder setVotes(int i) {
            this.banner.votes = i;
            return this;
        }
    }

    public NativeBanner() {
        this.navigationType = "web";
    }

    @NonNull
    public static NativeBanner newBanner(@NonNull C25822i6 c25822i6) {
        return new NativeBanner(c25822i6);
    }

    @Nullable
    public ImageData getAdChoicesIcon() {
        return this.adChoicesIcon;
    }

    @Nullable
    public String getAdvertisingLabel() {
        return this.advertisingLabel;
    }

    @Nullable
    public String getAgeRestrictions() {
        return this.ageRestrictions;
    }

    @Nullable
    public String getBundleId() {
        return this.bundleId;
    }

    @Nullable
    public String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    @Deprecated
    public String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public Disclaimer getDisclaimerInfo() {
        return this.disclaimerInfo;
    }

    @Nullable
    public String getDomain() {
        return this.domain;
    }

    @Nullable
    public ImageData getIcon() {
        return this.icon;
    }

    @NonNull
    public String getNavigationType() {
        return this.navigationType;
    }

    public float getRating() {
        return this.rating;
    }

    @Nullable
    public String getStoreType() {
        return this.storeType;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
    }

    public boolean hasAdChoices() {
        return this.hasAdChoices;
    }

    @NonNull
    public String toString() {
        return "NativeBanner{navigationType='" + this.navigationType + "', storeType='" + this.storeType + "', rating=" + this.rating + ", votes=" + this.votes + ", hasAdChoices=" + this.hasAdChoices + ", title='" + this.title + "', ctaText='" + this.ctaText + "', description='" + this.description + "', disclaimer='" + this.disclaimer + "', disclaimerInfo=" + this.disclaimerInfo + ", ageRestrictions='" + this.ageRestrictions + "', domain='" + this.domain + "', advertisingLabel='" + this.advertisingLabel + "', bundleId='" + this.bundleId + "', icon=" + this.icon + ", adChoicesIcon=" + this.adChoicesIcon + '}';
    }

    public NativeBanner(@NonNull C25822i6 c25822i6) {
        this.navigationType = "web";
        this.navigationType = c25822i6.getNavigationType();
        this.storeType = c25822i6.getStoreType();
        this.rating = c25822i6.getRating();
        this.votes = c25822i6.getVotes();
        String title = c25822i6.getTitle();
        this.title = TextUtils.isEmpty(title) ? null : title;
        String ctaText = c25822i6.getCtaText();
        this.ctaText = TextUtils.isEmpty(ctaText) ? null : ctaText;
        String description = c25822i6.getDescription();
        this.description = TextUtils.isEmpty(description) ? null : description;
        String disclaimer = c25822i6.getDisclaimer();
        this.disclaimer = !TextUtils.isEmpty(disclaimer) ? disclaimer : null;
        this.disclaimerInfo = !TextUtils.isEmpty(disclaimer) ? new Disclaimer(c25822i6.getDisclaimerType(), disclaimer) : null;
        String ageRestrictions = c25822i6.getAgeRestrictions();
        this.ageRestrictions = TextUtils.isEmpty(ageRestrictions) ? null : ageRestrictions;
        String domain = c25822i6.getDomain();
        this.domain = TextUtils.isEmpty(domain) ? null : domain;
        String advertisingLabel = c25822i6.getAdvertisingLabel();
        this.advertisingLabel = TextUtils.isEmpty(advertisingLabel) ? null : advertisingLabel;
        this.icon = c25822i6.getIcon();
        String bundleId = c25822i6.getBundleId();
        this.bundleId = TextUtils.isEmpty(bundleId) ? null : bundleId;
        C25669c adChoices = c25822i6.getAdChoices();
        if (adChoices == null) {
            this.hasAdChoices = false;
            this.adChoicesIcon = null;
            return;
        }
        this.hasAdChoices = true;
        this.adChoicesIcon = adChoices.m44130c();
    }

    public NativeBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable ImageData imageData, float f, @Nullable String str6, @Nullable String str7, @Nullable Disclaimer disclaimer, int i, @NonNull String str8, @Nullable String str9, boolean z, @Nullable ImageData imageData2, @Nullable String str10) {
        this.title = str;
        this.ctaText = str2;
        this.description = str3;
        this.domain = str4;
        this.advertisingLabel = str5;
        this.icon = imageData;
        this.rating = f;
        this.ageRestrictions = str6;
        this.disclaimer = str7;
        this.disclaimerInfo = disclaimer;
        this.votes = i;
        this.navigationType = str8;
        this.storeType = str9;
        this.hasAdChoices = z;
        this.adChoicesIcon = imageData2;
        this.bundleId = str10;
    }
}
