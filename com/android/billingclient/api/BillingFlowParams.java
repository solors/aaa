package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public class BillingFlowParams {
    @NonNull
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    private boolean zza;
    private String zzb;
    private String zzc;
    private SubscriptionUpdateParams zzd;
    private com.google.android.gms.internal.play_billing.zzaf zze;
    private ArrayList zzf;
    private boolean zzg;

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private ArrayList zzd;
        private boolean zze;
        private SubscriptionUpdateParams.Builder zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }

        @NonNull
        public BillingFlowParams build() {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            com.google.android.gms.internal.play_billing.zzaf zzk;
            ArrayList arrayList2 = this.zzd;
            boolean z3 = true;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            List list = this.zzc;
            if (list != null && !list.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z && z2) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (z) {
                if (!this.zzd.contains(null)) {
                    if (this.zzd.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.zzd.get(0);
                        String type = skuDetails.getType();
                        ArrayList arrayList3 = this.zzd;
                        int size = arrayList3.size();
                        for (int i = 0; i < size; i++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i);
                            if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String zzd = skuDetails.zzd();
                        ArrayList arrayList4 = this.zzd;
                        int size2 = arrayList4.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i2);
                            if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzd.equals(skuDetails3.zzd())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            } else {
                ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.zzc.get(0);
                for (int i3 = 0; i3 < this.zzc.size(); i3++) {
                    ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.zzc.get(i3);
                    if (productDetailsParams2 != null) {
                        if (i3 != 0 && !productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String zza = productDetailsParams.zza().zza();
                for (ProductDetailsParams productDetailsParams3 : this.zzc) {
                    if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams3.zza().zza())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(null);
            if ((!z || ((SkuDetails) this.zzd.get(0)).zzd().isEmpty()) && (!z2 || ((ProductDetailsParams) this.zzc.get(0)).zza().zza().isEmpty())) {
                z3 = false;
            }
            billingFlowParams.zza = z3;
            billingFlowParams.zzb = this.zza;
            billingFlowParams.zzc = this.zzb;
            billingFlowParams.zzd = this.zzf.build();
            ArrayList arrayList5 = this.zzd;
            if (arrayList5 != null) {
                arrayList = new ArrayList(arrayList5);
            } else {
                arrayList = new ArrayList();
            }
            billingFlowParams.zzf = arrayList;
            billingFlowParams.zzg = this.zze;
            List list2 = this.zzc;
            if (list2 != null) {
                zzk = com.google.android.gms.internal.play_billing.zzaf.zzj(list2);
            } else {
                zzk = com.google.android.gms.internal.play_billing.zzaf.zzk();
            }
            billingFlowParams.zze = zzk;
            return billingFlowParams;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z) {
            this.zze = z;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.zzd = arrayList;
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zzf = SubscriptionUpdateParams.zzc(subscriptionUpdateParams);
            return this;
        }

        /* synthetic */ Builder(zzbb zzbbVar) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.zza(newBuilder);
            this.zzf = newBuilder;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static final class ProductDetailsParams {
        private final ProductDetails zza;
        private final String zzb;

        /* compiled from: com.android.billingclient:billing@@6.1.0 */
        /* loaded from: classes2.dex */
        public static class Builder {
            private ProductDetails zza;
            private String zzb;

            private Builder() {
            }

            /* synthetic */ Builder(zzbc zzbcVar) {
            }

            @NonNull
            public ProductDetailsParams build() {
                com.google.android.gms.internal.play_billing.zzx.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                com.google.android.gms.internal.play_billing.zzx.zzc(this.zzb, "offerToken is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull ProductDetails productDetails) {
                this.zza = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    this.zzb = productDetails.getOneTimePurchaseOfferDetails().zza();
                }
                return this;
            }
        }

        /* synthetic */ ProductDetailsParams(Builder builder, zzbd zzbdVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final ProductDetails zza() {
            return this.zza;
        }

        @NonNull
        public final String zzb() {
            return this.zzb;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: classes2.dex */
    public @interface ProrationMode {
        public static final int DEFERRED = 4;
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class SubscriptionUpdateParams {
        private String zza;
        private String zzb;
        private int zzc = 0;
        private int zzd = 0;

        /* compiled from: com.android.billingclient:billing@@6.1.0 */
        /* loaded from: classes2.dex */
        public static class Builder {
            private String zza;
            private String zzb;
            private boolean zzc;
            private int zzd = 0;
            private int zze = 0;

            private Builder() {
            }

            static /* synthetic */ Builder zza(Builder builder) {
                builder.zzc = true;
                return builder;
            }

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z;
                if (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) {
                    z = false;
                } else {
                    z = true;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(this.zzb);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(null);
                subscriptionUpdateParams.zza = this.zza;
                subscriptionUpdateParams.zzc = this.zzd;
                subscriptionUpdateParams.zzd = this.zze;
                subscriptionUpdateParams.zzb = this.zzb;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setOldSkuPurchaseToken(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            @zzd
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setReplaceProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setReplaceSkusProrationMode(int i) {
                this.zzd = i;
                return this;
            }

            @NonNull
            public Builder setSubscriptionReplacementMode(int i) {
                this.zze = i;
                return this;
            }

            /* synthetic */ Builder(zzbe zzbeVar) {
            }
        }

        /* compiled from: com.android.billingclient:billing@@6.1.0 */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        private SubscriptionUpdateParams() {
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        static /* bridge */ /* synthetic */ Builder zzc(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder newBuilder = newBuilder();
            newBuilder.setOldSkuPurchaseToken(subscriptionUpdateParams.zza);
            newBuilder.setReplaceSkusProrationMode(subscriptionUpdateParams.zzc);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.zzd);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.zzb);
            return newBuilder;
        }

        @Deprecated
        final int zza() {
            return this.zzc;
        }

        final int zzb() {
            return this.zzd;
        }

        final String zzd() {
            return this.zza;
        }

        final String zze() {
            return this.zzb;
        }

        /* synthetic */ SubscriptionUpdateParams(zzbf zzbfVar) {
        }
    }

    private BillingFlowParams() {
    }

    /* synthetic */ BillingFlowParams(zzbg zzbgVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Deprecated
    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        return this.zzd.zzb();
    }

    @Nullable
    public final String zzc() {
        return this.zzb;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    @Nullable
    public final String zze() {
        return this.zzd.zzd();
    }

    @Nullable
    public final String zzf() {
        return this.zzd.zze();
    }

    @NonNull
    public final ArrayList zzg() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zzf);
        return arrayList;
    }

    @NonNull
    public final List zzh() {
        return this.zze;
    }

    public final boolean zzp() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq() {
        if (this.zzb == null && this.zzc == null && this.zzd.zze() == null && this.zzd.zza() == 0 && this.zzd.zzb() == 0 && !this.zza && !this.zzg) {
            return false;
        }
        return true;
    }
}
