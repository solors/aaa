package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.utils.C18135d;
import com.iab.omid.library.fyber.utils.C18139g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45539a;

    /* renamed from: b */
    private final Float f45540b;

    /* renamed from: c */
    private final boolean f45541c;

    /* renamed from: d */
    private final Position f45542d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45539a = z;
        this.f45540b = f;
        this.f45541c = z2;
        this.f45542d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18139g.m63849a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18139g.m63849a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m64012a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45539a);
            if (this.f45539a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45540b);
            }
            jSONObject.put("autoPlay", this.f45541c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45542d);
        } catch (JSONException e) {
            C18135d.m63859a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45542d;
    }

    public Float getSkipOffset() {
        return this.f45540b;
    }

    public boolean isAutoPlay() {
        return this.f45541c;
    }

    public boolean isSkippable() {
        return this.f45539a;
    }
}
