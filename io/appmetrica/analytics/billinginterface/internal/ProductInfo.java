package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    @Nullable
    public final Period introductoryPricePeriod;
    @NonNull
    public final String priceCurrency;
    public final long priceMicros;
    @NonNull
    public final String purchaseOriginalJson;
    public final long purchaseTime;
    @NonNull
    public final String purchaseToken;
    public final int quantity;
    @NonNull
    public final String signature;
    @NonNull
    public final String sku;
    @Nullable
    public final Period subscriptionPeriod;
    @NonNull
    public final ProductType type;

    public ProductInfo(@NonNull ProductType productType, @NonNull String str, int i, long j, @NonNull String str2, long j2, @Nullable Period period, int i2, @Nullable Period period2, @NonNull String str3, @NonNull String str4, long j3, boolean z, @NonNull String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i;
        this.priceMicros = j;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j2;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i2;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j3;
        this.autoRenewing = z;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (!this.signature.equals(productInfo.signature) || !this.purchaseToken.equals(productInfo.purchaseToken)) {
            return false;
        }
        return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
    }

    public int hashCode() {
        int i;
        int hashCode = this.sku.hashCode();
        long j = this.priceMicros;
        int hashCode2 = this.priceCurrency.hashCode();
        long j2 = this.introductoryPriceMicros;
        int hashCode3 = (((hashCode2 + ((((((hashCode + (this.type.hashCode() * 31)) * 31) + this.quantity) * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Period period = this.introductoryPricePeriod;
        int i2 = 0;
        if (period != null) {
            i = period.hashCode();
        } else {
            i = 0;
        }
        int i3 = (((hashCode3 + i) * 31) + this.introductoryPriceCycles) * 31;
        Period period2 = this.subscriptionPeriod;
        if (period2 != null) {
            i2 = period2.hashCode();
        }
        int hashCode4 = this.signature.hashCode();
        int hashCode5 = this.purchaseToken.hashCode();
        long j3 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((((hashCode5 + ((hashCode4 + ((i3 + i2) * 31)) * 31)) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    @NonNull
    public String toString() {
        return "ProductInfo{type=" + this.type + ", sku='" + this.sku + "', quantity=" + this.quantity + ", priceMicros=" + this.priceMicros + ", priceCurrency='" + this.priceCurrency + "', introductoryPriceMicros=" + this.introductoryPriceMicros + ", introductoryPricePeriod=" + this.introductoryPricePeriod + ", introductoryPriceCycles=" + this.introductoryPriceCycles + ", subscriptionPeriod=" + this.subscriptionPeriod + ", signature='" + this.signature + "', purchaseToken='" + this.purchaseToken + "', purchaseTime=" + this.purchaseTime + ", autoRenewing=" + this.autoRenewing + ", purchaseOriginalJson='" + this.purchaseOriginalJson + "'}";
    }
}
