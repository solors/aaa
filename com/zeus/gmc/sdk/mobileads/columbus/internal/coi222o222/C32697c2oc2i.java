package com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222;

import com.iab.omid.library.xiaomi.adsession.CreativeType;
import com.iab.omid.library.xiaomi.adsession.ImpressionType;
import com.iab.omid.library.xiaomi.adsession.Owner;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.c2oc2i */
/* loaded from: classes8.dex */
public class C32697c2oc2i {
    private final boolean c2oc2i;
    private final ImpressionType c2oc2o;
    private final CreativeType cioccoiococ;
    private final Owner coi222o222;
    private final Owner coo2iico;

    private C32697c2oc2i(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.cioccoiococ = creativeType;
        this.c2oc2o = impressionType;
        this.coo2iico = owner;
        if (owner2 == null) {
            this.coi222o222 = Owner.NONE;
        } else {
            this.coi222o222 = owner2;
        }
        this.c2oc2i = z;
    }

    public static C32697c2oc2i coo2iico(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C32610cii2c2.coo2iico(creativeType, "CreativeType is null");
        C32610cii2c2.coo2iico(impressionType, "ImpressionType is null");
        C32610cii2c2.coo2iico(owner, "Impression owner is null");
        C32610cii2c2.coo2iico(owner, creativeType, impressionType);
        return new C32697c2oc2i(creativeType, impressionType, owner, owner2, z);
    }

    public JSONObject c2oc2i() {
        JSONObject jSONObject = new JSONObject();
        C32604c2oc2i.coo2iico(jSONObject, "impressionOwner", this.coo2iico);
        C32604c2oc2i.coo2iico(jSONObject, "mediaEventsOwner", this.coi222o222);
        C32604c2oc2i.coo2iico(jSONObject, "creativeType", this.cioccoiococ);
        C32604c2oc2i.coo2iico(jSONObject, "impressionType", this.c2oc2o);
        C32604c2oc2i.coo2iico(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c2oc2i));
        return jSONObject;
    }

    public boolean coi222o222() {
        if (Owner.NATIVE == this.coi222o222) {
            return true;
        }
        return false;
    }

    public boolean coo2iico() {
        return Owner.NATIVE == this.coo2iico;
    }
}
