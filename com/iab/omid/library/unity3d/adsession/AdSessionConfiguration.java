package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.utils.C18715g;
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
        C18715g.m61634a(creativeType, "CreativeType is null");
        C18715g.m61634a(impressionType, "ImpressionType is null");
        C18715g.m61634a(owner, "Impression owner is null");
        C18715g.m61636a(owner, creativeType, impressionType);
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
        C18708c.m61655a(jSONObject, "impressionOwner", this.impressionOwner);
        C18708c.m61655a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C18708c.m61655a(jSONObject, "creativeType", this.creativeType);
        C18708c.m61655a(jSONObject, "impressionType", this.impressionType);
        C18708c.m61655a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
