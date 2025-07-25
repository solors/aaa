package com.iab.omid.library.corpmailru.adsession;

import com.iab.omid.library.corpmailru.p395d.C18062b;
import com.iab.omid.library.corpmailru.p395d.C18066e;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C18066e.m64120a(creativeType, "CreativeType is null");
        C18066e.m64120a(impressionType, "ImpressionType is null");
        C18066e.m64120a(owner, "Impression owner is null");
        C18066e.m64122a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        if (Owner.NATIVE == this.impressionOwner) {
            return true;
        }
        return false;
    }

    public boolean isNativeMediaEventsOwner() {
        if (Owner.NATIVE == this.mediaEventsOwner) {
            return true;
        }
        return false;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        C18062b.m64135a(jSONObject, "impressionOwner", this.impressionOwner);
        C18062b.m64135a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C18062b.m64135a(jSONObject, "creativeType", this.creativeType);
        C18062b.m64135a(jSONObject, "impressionType", this.impressionType);
        C18062b.m64135a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
