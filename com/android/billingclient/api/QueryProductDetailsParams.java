package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final class QueryProductDetailsParams {
    private final com.google.android.gms.internal.play_billing.zzaf zza;

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private com.google.android.gms.internal.play_billing.zzaf zza;

        private Builder() {
        }

        /* synthetic */ Builder(zzch zzchVar) {
        }

        @NonNull
        public QueryProductDetailsParams build() {
            return new QueryProductDetailsParams(this, null);
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (Product product : list) {
                    if (!"play_pass_subs".equals(product.zzb())) {
                        hashSet.add(product.zzb());
                    }
                }
                if (hashSet.size() <= 1) {
                    this.zza = com.google.android.gms.internal.play_billing.zzaf.zzj(list);
                    return this;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class Product {
        private final String zza;
        private final String zzb;

        /* compiled from: com.android.billingclient:billing@@6.1.0 */
        /* loaded from: classes2.dex */
        public static class Builder {
            private String zza;
            private String zzb;

            private Builder() {
            }

            /* synthetic */ Builder(zzci zzciVar) {
            }

            @NonNull
            public Product build() {
                if (!"first_party".equals(this.zzb)) {
                    if (this.zza != null) {
                        if (this.zzb != null) {
                            return new Product(this, null);
                        }
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.zzb = str;
                return this;
            }
        }

        /* synthetic */ Product(Builder builder, zzcj zzcjVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final String zza() {
            return this.zza;
        }

        @NonNull
        public final String zzb() {
            return this.zzb;
        }
    }

    /* synthetic */ QueryProductDetailsParams(Builder builder, zzck zzckVar) {
        this.zza = builder.zza;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzaf zza() {
        return this.zza;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.zza.get(0)).zzb();
    }
}
