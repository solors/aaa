package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.C18015d;
import com.iab.omid.library.bytedance2.utils.C18019g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45296a;

    /* renamed from: b */
    private final Float f45297b;

    /* renamed from: c */
    private final boolean f45298c;

    /* renamed from: d */
    private final Position f45299d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45296a = z;
        this.f45297b = f;
        this.f45298c = z2;
        this.f45299d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18019g.m64308a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18019g.m64308a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m64462a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45296a);
            if (this.f45296a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45297b);
            }
            jSONObject.put("autoPlay", this.f45298c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45299d);
        } catch (JSONException e) {
            C18015d.m64318a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45299d;
    }

    public Float getSkipOffset() {
        return this.f45297b;
    }

    public boolean isAutoPlay() {
        return this.f45298c;
    }

    public boolean isSkippable() {
        return this.f45296a;
    }
}
