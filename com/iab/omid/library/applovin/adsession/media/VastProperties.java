package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.C17833d;
import com.iab.omid.library.applovin.utils.C17837g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f44911a;

    /* renamed from: b */
    private final Float f44912b;

    /* renamed from: c */
    private final boolean f44913c;

    /* renamed from: d */
    private final Position f44914d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f44911a = z;
        this.f44912b = f;
        this.f44913c = z2;
        this.f44914d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C17837g.m65016a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C17837g.m65016a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m65170a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f44911a);
            if (this.f44911a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f44912b);
            }
            jSONObject.put("autoPlay", this.f44913c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f44914d);
        } catch (JSONException e) {
            C17833d.m65026a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f44914d;
    }

    public Float getSkipOffset() {
        return this.f44912b;
    }

    public boolean isAutoPlay() {
        return this.f44913c;
    }

    public boolean isSkippable() {
        return this.f44911a;
    }
}
