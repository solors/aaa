package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.utils.C17903d;
import com.iab.omid.library.appodeal.utils.C17907g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45040a;

    /* renamed from: b */
    private final Float f45041b;

    /* renamed from: c */
    private final boolean f45042c;

    /* renamed from: d */
    private final Position f45043d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45040a = z;
        this.f45041b = f;
        this.f45042c = z2;
        this.f45043d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C17907g.m64766a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C17907g.m64766a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m64929a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45040a);
            if (this.f45040a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45041b);
            }
            jSONObject.put("autoPlay", this.f45042c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45043d);
        } catch (JSONException e) {
            C17903d.m64776a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45043d;
    }

    public Float getSkipOffset() {
        return this.f45041b;
    }

    public boolean isAutoPlay() {
        return this.f45042c;
    }

    public boolean isSkippable() {
        return this.f45040a;
    }
}
