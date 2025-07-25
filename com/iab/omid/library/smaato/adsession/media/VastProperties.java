package com.iab.omid.library.smaato.adsession.media;

import com.iab.omid.library.smaato.utils.C18595d;
import com.iab.omid.library.smaato.utils.C18599g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46468a;

    /* renamed from: b */
    private final Float f46469b;

    /* renamed from: c */
    private final boolean f46470c;

    /* renamed from: d */
    private final Position f46471d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46468a = z;
        this.f46469b = f;
        this.f46470c = z2;
        this.f46471d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18599g.m62108a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18599g.m62108a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m62271a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46468a);
            if (this.f46468a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46469b);
            }
            jSONObject.put("autoPlay", this.f46470c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46471d);
        } catch (JSONException e) {
            C18595d.m62118a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46471d;
    }

    public Float getSkipOffset() {
        return this.f46469b;
    }

    public boolean isAutoPlay() {
        return this.f46470c;
    }

    public boolean isSkippable() {
        return this.f46468a;
    }
}
