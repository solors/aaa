package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.p395d.C18064c;
import com.iab.omid.library.corpmailru.p395d.C18066e;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45430a;

    /* renamed from: b */
    private final Float f45431b;

    /* renamed from: c */
    private final boolean f45432c;

    /* renamed from: d */
    private final Position f45433d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45430a = z;
        this.f45431b = f;
        this.f45432c = z2;
        this.f45433d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18066e.m64120a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18066e.m64120a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m64212a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45430a);
            if (this.f45430a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45431b);
            }
            jSONObject.put("autoPlay", this.f45432c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45433d);
        } catch (JSONException e) {
            C18064c.m64125a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45433d;
    }

    public Float getSkipOffset() {
        return this.f45431b;
    }

    public boolean isAutoPlay() {
        return this.f45432c;
    }

    public boolean isSkippable() {
        return this.f45430a;
    }
}
