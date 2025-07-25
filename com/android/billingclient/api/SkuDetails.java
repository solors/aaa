package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public class SkuDetails {
    private final String zza;
    private final JSONObject zzb;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            if (!TextUtils.isEmpty(jSONObject.optString("type"))) {
                return;
            }
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetails)) {
            return false;
        }
        return TextUtils.equals(this.zza, ((SkuDetails) obj).zza);
    }

    @NonNull
    public String getDescription() {
        return this.zzb.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.zzb.optString(KiwiConstants.f2729p);
    }

    @NonNull
    public String getIconUrl() {
        return this.zzb.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.zzb.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.zzb.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.zzb.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.zzb.optString("introductoryPricePeriod");
    }

    @NonNull
    public String getOriginalJson() {
        return this.zza;
    }

    @NonNull
    public String getOriginalPrice() {
        if (this.zzb.has("original_price")) {
            return this.zzb.optString("original_price");
        }
        return getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        if (this.zzb.has("original_price_micros")) {
            return this.zzb.optLong("original_price_micros");
        }
        return getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.zzb.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.zzb.optLong("price_amount_micros");
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.zzb.optString("price_currency_code");
    }

    @NonNull
    public String getSku() {
        return this.zzb.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.zzb.optString(KiwiConstants.f2728o);
    }

    @NonNull
    public String getTitle() {
        return this.zzb.optString("title");
    }

    @NonNull
    public String getType() {
        return this.zzb.optString("type");
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.zza));
    }

    public int zza() {
        return this.zzb.optInt(CampaignEx.JSON_KEY_OFFER_TYPE);
    }

    @NonNull
    public String zzb() {
        return this.zzb.optString("offer_id");
    }

    @NonNull
    public String zzc() {
        String optString = this.zzb.optString("offerIdToken");
        if (optString.isEmpty()) {
            return this.zzb.optString("offer_id_token");
        }
        return optString;
    }

    @NonNull
    public final String zzd() {
        return this.zzb.optString("packageName");
    }

    @NonNull
    public String zze() {
        return this.zzb.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzf() {
        return this.zzb.optString("skuDetailsToken");
    }
}
