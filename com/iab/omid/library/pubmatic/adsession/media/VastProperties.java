package com.iab.omid.library.pubmatic.adsession.media;

import com.iab.omid.library.pubmatic.utils.C18462d;
import com.iab.omid.library.pubmatic.utils.C18466g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46198a;

    /* renamed from: b */
    private final Float f46199b;

    /* renamed from: c */
    private final boolean f46200c;

    /* renamed from: d */
    private final Position f46201d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46198a = z;
        this.f46199b = f;
        this.f46200c = z2;
        this.f46201d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18466g.m62614a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18466g.m62614a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m62777a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46198a);
            if (this.f46198a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46199b);
            }
            jSONObject.put("autoPlay", this.f46200c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46201d);
        } catch (JSONException e) {
            C18462d.m62624a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46201d;
    }

    public Float getSkipOffset() {
        return this.f46199b;
    }

    public boolean isAutoPlay() {
        return this.f46200c;
    }

    public boolean isSkippable() {
        return this.f46198a;
    }
}
