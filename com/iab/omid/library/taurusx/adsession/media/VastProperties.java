package com.iab.omid.library.taurusx.adsession.media;

import com.iab.omid.library.taurusx.utils.C18654d;
import com.iab.omid.library.taurusx.utils.C18658g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46604a;

    /* renamed from: b */
    private final Float f46605b;

    /* renamed from: c */
    private final boolean f46606c;

    /* renamed from: d */
    private final Position f46607d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46604a = z;
        this.f46605b = f;
        this.f46606c = z2;
        this.f46607d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18658g.m61868a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18658g.m61868a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m62015a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46604a);
            if (this.f46604a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46605b);
            }
            jSONObject.put("autoPlay", this.f46606c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46607d);
        } catch (JSONException e) {
            C18654d.m61877a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46607d;
    }

    public Float getSkipOffset() {
        return this.f46605b;
    }

    public boolean isAutoPlay() {
        return this.f46606c;
    }

    public boolean isSkippable() {
        return this.f46604a;
    }
}
