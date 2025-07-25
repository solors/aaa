package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.p047a.p048a.p071o.Validator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class RequestId implements Parcelable {
    public static final Parcelable.Creator<RequestId> CREATOR = new Parcelable.Creator<RequestId>() { // from class: com.amazon.device.iap.model.RequestId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId[] newArray(int i) {
            return new RequestId[i];
        }
    };
    private static final String ENCODED_ID = "encodedId";
    private final String encodedId;

    public static RequestId fromString(String str) {
        return new RequestId(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null && RequestId.class == obj.getClass()) {
            return this.encodedId.equals(((RequestId) obj).encodedId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.encodedId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ENCODED_ID, this.encodedId);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return this.encodedId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.encodedId);
    }

    private RequestId(Parcel parcel) {
        this.encodedId = parcel.readString();
    }

    public RequestId() {
        this.encodedId = UUID.randomUUID().toString();
    }

    private RequestId(String str) {
        Validator.m102807a((Object) str, ENCODED_ID);
        this.encodedId = str;
    }
}
