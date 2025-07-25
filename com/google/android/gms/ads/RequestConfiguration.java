package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public class RequestConfiguration {
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final List zze;
    private final PublisherPrivacyPersonalizationState zzf;
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    /* loaded from: classes4.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;
        private String zzc = null;
        private final List zzd = new ArrayList();
        private PublisherPrivacyPersonalizationState zze = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
        }

        @NonNull
        public Builder setMaxAdContentRating(String str) {
            if (str != null && !"".equals(str)) {
                if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !"T".equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                    zzo.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                } else {
                    this.zzc = str;
                }
            } else {
                this.zzc = null;
            }
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.zze = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i != -1 && i != 0 && i != 1) {
                zzo.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            } else {
                this.zza = i;
            }
            return this;
        }

        @NonNull
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i != -1 && i != 0 && i != 1) {
                zzo.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            } else {
                this.zzb = i;
            }
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(List<String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    /* loaded from: classes4.dex */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);
        
        private final int zzb;

        PublisherPrivacyPersonalizationState(int i) {
            this.zzb = i;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, zzi zziVar) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = list;
        this.zzf = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.zzd;
        if (str == null) {
            return "";
        }
        return str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.zzf;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}
