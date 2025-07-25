package com.iab.omid.library.taurusx.adsession;

import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.utils.C18658g;
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
        C18658g.m61868a(creativeType, "CreativeType is null");
        C18658g.m61868a(impressionType, "ImpressionType is null");
        C18658g.m61868a(owner, "Impression owner is null");
        C18658g.m61870a(owner, creativeType, impressionType);
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
        C18651c.m61889a(jSONObject, "impressionOwner", this.impressionOwner);
        C18651c.m61889a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C18651c.m61889a(jSONObject, "creativeType", this.creativeType);
        C18651c.m61889a(jSONObject, "impressionType", this.impressionType);
        C18651c.m61889a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
