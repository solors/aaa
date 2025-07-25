package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes2.dex */
public final class UserChoiceDetails {
    private final String zza;
    private final JSONObject zzb;
    private final List zzc;

    /* compiled from: com.android.billingclient:billing@@6.1.0 */
    /* loaded from: classes2.dex */
    public static class Product {
        private final String zza;
        private final String zzb;
        @Nullable
        private final String zzc;

        /* synthetic */ Product(JSONObject jSONObject, zzcq zzcqVar) {
            this.zza = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.zzb = jSONObject.optString(C21114v8.C21122h.f54077m);
            String optString = jSONObject.optString("offerToken");
            this.zzc = true == optString.isEmpty() ? null : optString;
        }

        public boolean equals(@Nullable Object obj) {
            String str;
            String offerToken;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            if (this.zza.equals(product.getId()) && this.zzb.equals(product.getType()) && ((str = this.zzc) == (offerToken = product.getOfferToken()) || (str != null && str.equals(offerToken)))) {
                return true;
            }
            return false;
        }

        @NonNull
        public String getId() {
            return this.zza;
        }

        @Nullable
        public String getOfferToken() {
            return this.zzc;
        }

        @NonNull
        public String getType() {
            return this.zzb;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.zza, this.zzb, this.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserChoiceDetails(String str) throws JSONException {
        this.zza = str;
        JSONObject jSONObject = new JSONObject(str);
        this.zzb = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject, null));
                }
            }
        }
        this.zzc = arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.zzb.optString("externalTransactionToken");
    }

    @Nullable
    public String getOriginalExternalTransactionId() {
        String optString = this.zzb.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.zzc;
    }
}
