package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2i;

import com.iab.omid.library.xiaomi.adsession.media.Position;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32612cioccoiococ;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2i.coi222o222 */
/* loaded from: classes8.dex */
public final class C32486coi222o222 {
    private final boolean c2oc2i;
    private final Position cioccoiococ;
    private final Float coi222o222;
    private final boolean coo2iico;

    private C32486coi222o222(boolean z, Float f, boolean z2, Position position) {
        this.coo2iico = z;
        this.coi222o222 = f;
        this.c2oc2i = z2;
        this.cioccoiococ = position;
    }

    public static C32486coi222o222 coo2iico(float f, boolean z, Position position) {
        C32610cii2c2.coo2iico(position, "Position is null");
        return new C32486coi222o222(true, Float.valueOf(f), z, position);
    }

    public Float c2oc2i() {
        return this.coi222o222;
    }

    public boolean c2oc2o() {
        return this.coo2iico;
    }

    public boolean cioccoiococ() {
        return this.c2oc2i;
    }

    public Position coi222o222() {
        return this.cioccoiococ;
    }

    public static C32486coi222o222 coo2iico(boolean z, Position position) {
        C32610cii2c2.coo2iico(position, "Position is null");
        return new C32486coi222o222(false, null, z, position);
    }

    public JSONObject coo2iico() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.coo2iico);
            if (this.coo2iico) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.coi222o222);
            }
            jSONObject.put("autoPlay", this.c2oc2i);
            jSONObject.put(C21114v8.C21122h.f54038L, this.cioccoiococ);
        } catch (JSONException e) {
            C32612cioccoiococ.coo2iico("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
