package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class InLine {
    public static final String ADVERTISER = "Advertiser";
    public static final String AD_SERVING_ID = "AdServingId";
    public static final String AD_SYSTEM = "AdSystem";
    public static final String AD_TITLE = "AdTitle";
    public static final String AD_VERIFICATIONS = "AdVerifications";
    public static final String CATEGORY = "Category";
    public static final String CREATIVES = "Creatives";
    public static final String DESCRIPTION = "Description";
    public static final String ERROR = "Error";
    public static final String EXTENSIONS = "Extensions";
    public static final String IMPRESSION = "Impression";
    public static final String NAME = "InLine";
    public static final String VIEWABLE_IMPRESSION = "ViewableImpression";
    @Nullable
    public final String adServingId;
    @Nullable
    public final AdSystem adSystem;
    @Nullable
    public final String adTitle;
    @NonNull
    public final List<Verification> adVerifications;
    @Nullable
    public final Advertiser advertiser;
    @NonNull
    public final List<Category> categories;
    @NonNull
    public final List<Creative> creatives;
    @Nullable
    public final String description;
    @NonNull
    public final List<String> errors;
    @NonNull
    public final List<Extension> extensions;
    @NonNull
    public final List<VastBeacon> impressions;
    @Nullable
    public final ViewableImpression viewableImpression;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String adServingId;
        @Nullable
        private AdSystem adSystem;
        @Nullable
        private String adTitle;
        @Nullable
        private List<Verification> adVerifications;
        @Nullable
        private Advertiser advertiser;
        @Nullable
        private List<Category> categories;
        @Nullable
        private List<Creative> creatives;
        @Nullable
        private String description;
        @Nullable
        private List<String> errors;
        @Nullable
        private List<Extension> extensions;
        @Nullable
        private List<VastBeacon> impressions;
        @Nullable
        private ViewableImpression viewableImpression;

        @NonNull
        public InLine build() {
            ArrayList arrayList = new ArrayList();
            List<Verification> list = this.adVerifications;
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(this.adVerifications);
            }
            List<Extension> list2 = this.extensions;
            if (list2 != null && !list2.isEmpty()) {
                for (Extension extension : this.extensions) {
                    Objects.onNotNull(extension.adVerifications, new C27733b(arrayList));
                }
            }
            this.impressions = VastModels.toImmutableList(this.impressions);
            this.creatives = VastModels.toImmutableList(this.creatives);
            this.adVerifications = VastModels.toImmutableList(arrayList);
            this.categories = VastModels.toImmutableList(this.categories);
            this.errors = VastModels.toImmutableList(this.errors);
            List<Extension> immutableList = VastModels.toImmutableList(this.extensions);
            this.extensions = immutableList;
            return new InLine(this.impressions, this.creatives, this.adVerifications, this.categories, this.errors, this.adSystem, this.adTitle, this.adServingId, this.description, this.advertiser, this.viewableImpression, immutableList);
        }

        @NonNull
        public Builder setAdServingId(@Nullable String str) {
            this.adServingId = str;
            return this;
        }

        @NonNull
        public Builder setAdSystem(@Nullable AdSystem adSystem) {
            this.adSystem = adSystem;
            return this;
        }

        @NonNull
        public Builder setAdTitle(@Nullable String str) {
            this.adTitle = str;
            return this;
        }

        @NonNull
        public Builder setAdVerifications(@Nullable List<Verification> list) {
            this.adVerifications = list;
            return this;
        }

        @NonNull
        public Builder setAdvertiser(@Nullable Advertiser advertiser) {
            this.advertiser = advertiser;
            return this;
        }

        @NonNull
        public Builder setCategories(@Nullable List<Category> list) {
            this.categories = list;
            return this;
        }

        @NonNull
        public Builder setCreatives(@Nullable List<Creative> list) {
            this.creatives = list;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.description = str;
            return this;
        }

        @NonNull
        public Builder setErrors(@Nullable List<String> list) {
            this.errors = list;
            return this;
        }

        @NonNull
        public Builder setExtensions(@Nullable List<Extension> list) {
            this.extensions = list;
            return this;
        }

        @NonNull
        public Builder setImpressions(@Nullable List<VastBeacon> list) {
            this.impressions = list;
            return this;
        }

        @NonNull
        public Builder setViewableImpression(@Nullable ViewableImpression viewableImpression) {
            this.viewableImpression = viewableImpression;
            return this;
        }
    }

    public InLine(@NonNull List<VastBeacon> list, @NonNull List<Creative> list2, @NonNull List<Verification> list3, @NonNull List<Category> list4, @NonNull List<String> list5, @Nullable AdSystem adSystem, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Advertiser advertiser, @Nullable ViewableImpression viewableImpression, @NonNull List<Extension> list6) {
        this.adSystem = adSystem;
        this.adTitle = str;
        this.adServingId = str2;
        this.impressions = list;
        this.categories = list4;
        this.description = str3;
        this.advertiser = advertiser;
        this.errors = list5;
        this.viewableImpression = viewableImpression;
        this.creatives = list2;
        this.adVerifications = list3;
        this.extensions = list6;
    }
}
