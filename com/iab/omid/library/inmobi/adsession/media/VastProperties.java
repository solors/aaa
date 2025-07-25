package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.utils.C18203d;
import com.iab.omid.library.inmobi.utils.C18207g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45674a;

    /* renamed from: b */
    private final Float f45675b;

    /* renamed from: c */
    private final boolean f45676c;

    /* renamed from: d */
    private final Position f45677d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45674a = z;
        this.f45675b = f;
        this.f45676c = z2;
        this.f45677d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18207g.m63605a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18207g.m63605a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m63759a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45674a);
            if (this.f45674a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45675b);
            }
            jSONObject.put("autoPlay", this.f45676c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45677d);
        } catch (JSONException e) {
            C18203d.m63615a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45677d;
    }

    public Float getSkipOffset() {
        return this.f45675b;
    }

    public boolean isAutoPlay() {
        return this.f45676c;
    }

    public boolean isSkippable() {
        return this.f45674a;
    }
}
