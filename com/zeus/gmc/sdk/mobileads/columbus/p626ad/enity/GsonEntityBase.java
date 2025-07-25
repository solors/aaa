package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.GsonEntityBase */
/* loaded from: classes8.dex */
public abstract class GsonEntityBase implements IGsonEntity {
    protected abstract String getTag();

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IEntity
    public final String serialize() {
        return C32459ciii2coi2.coo2iico(this, getTag());
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IGsonEntity
    public final JSONObject toJson() {
        try {
            return new JSONObject(serialize());
        } catch (JSONException e) {
            throw new RuntimeException("should NEVER happen, " + getTag() + ": " + serialize(), e);
        }
    }

    public final String toString() {
        return serialize();
    }
}
