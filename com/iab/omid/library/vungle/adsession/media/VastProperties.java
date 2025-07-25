package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.C18773d;
import com.iab.omid.library.vungle.utils.C18777g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46859a;

    /* renamed from: b */
    private final Float f46860b;

    /* renamed from: c */
    private final boolean f46861c;

    /* renamed from: d */
    private final Position f46862d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46859a = z;
        this.f46860b = f;
        this.f46861c = z2;
        this.f46862d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18777g.m61386a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18777g.m61386a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m61549a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46859a);
            if (this.f46859a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46860b);
            }
            jSONObject.put("autoPlay", this.f46861c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46862d);
        } catch (JSONException e) {
            C18773d.m61396a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46862d;
    }

    public Float getSkipOffset() {
        return this.f46860b;
    }

    public boolean isAutoPlay() {
        return this.f46861c;
    }

    public boolean isSkippable() {
        return this.f46859a;
    }
}
