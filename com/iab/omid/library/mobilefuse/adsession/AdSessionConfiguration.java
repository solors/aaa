package com.iab.omid.library.mobilefuse.adsession;

import com.iab.omid.library.mobilefuse.utils.C18389c;
import com.iab.omid.library.mobilefuse.utils.C18396g;
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
        C18396g.m62867a(creativeType, "CreativeType is null");
        C18396g.m62867a(impressionType, "ImpressionType is null");
        C18396g.m62867a(owner, "Impression owner is null");
        C18396g.m62869a(owner, creativeType, impressionType);
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
        C18389c.m62890a(jSONObject, "impressionOwner", this.impressionOwner);
        C18389c.m62890a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C18389c.m62890a(jSONObject, "creativeType", this.creativeType);
        C18389c.m62890a(jSONObject, "impressionType", this.impressionType);
        C18389c.m62890a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
