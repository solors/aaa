package com.iab.omid.library.bigosg.adsession;

import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17955e;
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
        C17955e.m64570a(creativeType, "CreativeType is null");
        C17955e.m64570a(impressionType, "ImpressionType is null");
        C17955e.m64570a(owner, "Impression owner is null");
        C17955e.m64572a(owner, creativeType, impressionType);
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

    public boolean isNativeVideoEventsOwner() {
        return isNativeMediaEventsOwner();
    }

    public JSONObject toJsonObject() {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "impressionOwner", this.impressionOwner);
        if (this.creativeType != null && this.impressionType != null) {
            C17951b.m64585a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
            C17951b.m64585a(jSONObject, "creativeType", this.creativeType);
            str = "impressionType";
            obj = this.impressionType;
        } else {
            str = "videoEventsOwner";
            obj = this.mediaEventsOwner;
        }
        C17951b.m64585a(jSONObject, str, obj);
        C17951b.m64585a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }

    @Deprecated
    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2) {
        return createAdSessionConfiguration(owner, owner2, true);
    }

    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2, boolean z) {
        C17955e.m64570a(owner, "Impression owner is null");
        C17955e.m64572a(owner, (CreativeType) null, (ImpressionType) null);
        return new AdSessionConfiguration(null, null, owner, owner2, z);
    }
}
