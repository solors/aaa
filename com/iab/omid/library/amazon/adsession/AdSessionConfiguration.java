package com.iab.omid.library.amazon.adsession;

import com.iab.omid.library.amazon.utils.C17769c;
import com.iab.omid.library.amazon.utils.C17776g;
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
        C17776g.m65257a(creativeType, "CreativeType is null");
        C17776g.m65257a(impressionType, "ImpressionType is null");
        C17776g.m65257a(owner, "Impression owner is null");
        C17776g.m65259a(owner, creativeType, impressionType);
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
        C17769c.m65279a(jSONObject, "impressionOwner", this.impressionOwner);
        C17769c.m65279a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C17769c.m65279a(jSONObject, "creativeType", this.creativeType);
        C17769c.m65279a(jSONObject, "impressionType", this.impressionType);
        C17769c.m65279a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
