package com.p551my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25822i6;
import com.p551my.target.C25863k6;
import com.p551my.target.common.models.Disclaimer;
import com.p551my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.nativeads.banners.NativePromoBanner */
/* loaded from: classes7.dex */
public class NativePromoBanner extends NativeBanner {
    @Nullable
    private String category;
    private final boolean hasVideo;
    @Nullable
    private final ImageData image;
    @NonNull
    private final ArrayList<NativePromoCard> nativePromoCards;
    @Nullable
    private String subCategory;

    /* renamed from: com.my.target.nativeads.banners.NativePromoBanner$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder {
        @Nullable
        private ImageData adChoicesIcon;
        @Nullable
        private String advertisingLabel;
        @Nullable
        private String ageRestrictions;
        @Nullable
        private String bundleId;
        @Nullable
        private String ctaText;
        @Nullable
        private String description;
        @Nullable
        private String disclaimer;
        @Nullable
        private Disclaimer disclaimerInfo;
        @Nullable
        private String domain;
        boolean hasAdChoices;
        private boolean hasVideo;
        @Nullable
        private ImageData icon;
        @Nullable
        private ImageData image;
        @NonNull
        private String navigationType = "web";
        private float rating;
        @Nullable
        private String storeType;
        @Nullable
        private String title;
        private int votes;

        private Builder() {
        }

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        @NonNull
        public NativePromoBanner build() {
            return new NativePromoBanner(this.title, this.ctaText, this.domain, this.advertisingLabel, this.icon, this.rating, this.ageRestrictions, this.disclaimer, this.disclaimerInfo, this.votes, this.navigationType, this.storeType, this.hasVideo, this.description, this.image, this.hasAdChoices, this.adChoicesIcon, this.bundleId);
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.adChoicesIcon = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.advertisingLabel = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.ageRestrictions = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.bundleId = str;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.ctaText = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.description = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.disclaimer = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.disclaimerInfo = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.domain = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z) {
            this.hasAdChoices = z;
            return this;
        }

        @NonNull
        public Builder setHasVideo(boolean z) {
            this.hasVideo = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.icon = imageData;
            return this;
        }

        @NonNull
        public Builder setImage(@Nullable ImageData imageData) {
            this.image = imageData;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            if ("web".equals(str) || "store".equals(str)) {
                this.navigationType = str;
            }
            return this;
        }

        @NonNull
        public Builder setRating(float f) {
            this.rating = f;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.storeType = str;
            return this;
        }

        @NonNull
        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        @NonNull
        public Builder setVotes(int i) {
            this.votes = i;
            return this;
        }
    }

    private NativePromoBanner(@NonNull C25822i6 c25822i6) {
        super(c25822i6);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = c25822i6.getVideoBanner() != null;
        String category = c25822i6.getCategory();
        this.category = TextUtils.isEmpty(category) ? null : category;
        String subCategory = c25822i6.getSubCategory();
        this.subCategory = TextUtils.isEmpty(subCategory) ? null : subCategory;
        this.image = c25822i6.getImage();
        processCards(c25822i6);
    }

    @NonNull
    public static NativePromoBanner newBanner(@NonNull C25822i6 c25822i6) {
        return new NativePromoBanner(c25822i6);
    }

    private void processCards(@NonNull C25822i6 c25822i6) {
        if (!this.hasVideo) {
            List<C25863k6> nativeAdCards = c25822i6.getNativeAdCards();
            if (!nativeAdCards.isEmpty()) {
                for (C25863k6 c25863k6 : nativeAdCards) {
                    this.nativePromoCards.add(NativePromoCard.newCard(c25863k6));
                }
            }
        }
    }

    @NonNull
    public ArrayList<NativePromoCard> getCards() {
        return this.nativePromoCards;
    }

    @Nullable
    public String getCategory() {
        return this.category;
    }

    @Nullable
    public ImageData getImage() {
        return this.image;
    }

    @Nullable
    public String getSubCategory() {
        return this.subCategory;
    }

    public boolean hasVideo() {
        return this.hasVideo;
    }

    @Override // com.p551my.target.nativeads.banners.NativeBanner
    @NonNull
    public String toString() {
        return "NativePromoBanner{hasVideo=" + this.hasVideo + ", image=" + this.image + ", nativePromoCards=" + this.nativePromoCards + ", category='" + this.category + "', subCategory='" + this.subCategory + "', navigationType='" + this.navigationType + "', storeType='" + this.storeType + "', rating=" + this.rating + ", votes=" + this.votes + ", hasAdChoices=" + this.hasAdChoices + ", title='" + this.title + "', ctaText='" + this.ctaText + "', description='" + this.description + "', disclaimer='" + this.disclaimer + "', disclaimerInfo='" + this.disclaimerInfo + "', ageRestrictions='" + this.ageRestrictions + "', domain='" + this.domain + "', advertisingLabel='" + this.advertisingLabel + "', bundleId='" + this.bundleId + "', icon=" + this.icon + ", adChoicesIcon=" + this.adChoicesIcon + '}';
    }

    public NativePromoBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ImageData imageData, float f, @Nullable String str5, @Nullable String str6, @Nullable Disclaimer disclaimer, int i, @NonNull String str7, @Nullable String str8, boolean z, @Nullable String str9, @Nullable ImageData imageData2, boolean z2, @Nullable ImageData imageData3, @Nullable String str10) {
        super(str, str2, str9, str3, str4, imageData, f, str5, str6, disclaimer, i, str7, str8, z2, imageData3, str10);
        this.nativePromoCards = new ArrayList<>();
        this.hasVideo = z;
        this.image = imageData2;
    }
}
