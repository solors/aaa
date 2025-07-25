package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.utils.C17772d;
import com.iab.omid.library.amazon.utils.C17776g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f44782a;

    /* renamed from: b */
    private final Float f44783b;

    /* renamed from: c */
    private final boolean f44784c;

    /* renamed from: d */
    private final Position f44785d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f44782a = z;
        this.f44783b = f;
        this.f44784c = z2;
        this.f44785d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C17776g.m65257a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C17776g.m65257a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m65411a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f44782a);
            if (this.f44782a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f44783b);
            }
            jSONObject.put("autoPlay", this.f44784c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f44785d);
        } catch (JSONException e) {
            C17772d.m65267a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f44785d;
    }

    public Float getSkipOffset() {
        return this.f44783b;
    }

    public boolean isAutoPlay() {
        return this.f44784c;
    }

    public boolean isSkippable() {
        return this.f44782a;
    }
}
