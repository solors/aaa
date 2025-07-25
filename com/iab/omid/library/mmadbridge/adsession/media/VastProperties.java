package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.C18322d;
import com.iab.omid.library.mmadbridge.utils.C18326g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45928a;

    /* renamed from: b */
    private final Float f45929b;

    /* renamed from: c */
    private final boolean f45930c;

    /* renamed from: d */
    private final Position f45931d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45928a = z;
        this.f45929b = f;
        this.f45930c = z2;
        this.f45931d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18326g.m63120a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18326g.m63120a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m63283a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45928a);
            if (this.f45928a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45929b);
            }
            jSONObject.put("autoPlay", this.f45930c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45931d);
        } catch (JSONException e) {
            C18322d.m63130a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45931d;
    }

    public Float getSkipOffset() {
        return this.f45929b;
    }

    public boolean isAutoPlay() {
        return this.f45930c;
    }

    public boolean isSkippable() {
        return this.f45928a;
    }
}
