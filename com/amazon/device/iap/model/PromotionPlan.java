package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PromotionPlan implements Parcelable {
    public static final Parcelable.Creator<PromotionPlan> CREATOR = new Parcelable.Creator<PromotionPlan>() { // from class: com.amazon.device.iap.model.PromotionPlan.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PromotionPlan createFromParcel(Parcel parcel) {
            return new PromotionPlan(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PromotionPlan[] newArray(int i) {
            return new PromotionPlan[i];
        }
    };
    private final String promotionPrice;
    private final int promotionPriceCycles;
    private final String promotionPricePeriod;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionPlan)) {
            return false;
        }
        PromotionPlan promotionPlan = (PromotionPlan) obj;
        if (getPromotionPriceCycles() == promotionPlan.getPromotionPriceCycles() && getPromotionPrice() != null && getPromotionPrice().equals(promotionPlan.getPromotionPrice()) && getPromotionPricePeriod() != null && getPromotionPricePeriod().equals(promotionPlan.getPromotionPricePeriod())) {
            return true;
        }
        return false;
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public int getPromotionPriceCycles() {
        return this.promotionPriceCycles;
    }

    public String getPromotionPricePeriod() {
        return this.promotionPricePeriod;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KiwiConstants.f2733t, getPromotionPricePeriod());
        jSONObject.put(KiwiConstants.f2735v, getPromotionPrice());
        jSONObject.put(KiwiConstants.f2734u, getPromotionPriceCycles());
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promotionPricePeriod);
        parcel.writeString(this.promotionPrice);
        parcel.writeInt(this.promotionPriceCycles);
    }

    public PromotionPlan(String str, String str2, int i) {
        this.promotionPricePeriod = str;
        this.promotionPrice = str2;
        this.promotionPriceCycles = i;
    }

    private PromotionPlan(Parcel parcel) {
        this.promotionPricePeriod = parcel.readString();
        this.promotionPrice = parcel.readString();
        this.promotionPriceCycles = parcel.readInt();
    }
}
