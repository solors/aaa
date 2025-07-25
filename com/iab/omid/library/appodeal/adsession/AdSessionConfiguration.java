package com.iab.omid.library.appodeal.adsession;

import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.utils.C17907g;
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
        C17907g.m64766a(creativeType, "CreativeType is null");
        C17907g.m64766a(impressionType, "ImpressionType is null");
        C17907g.m64766a(owner, "Impression owner is null");
        C17907g.m64768a(owner, creativeType, impressionType);
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
        C17900c.m64789a(jSONObject, "impressionOwner", this.impressionOwner);
        C17900c.m64789a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C17900c.m64789a(jSONObject, "creativeType", this.creativeType);
        C17900c.m64789a(jSONObject, "impressionType", this.impressionType);
        C17900c.m64789a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
