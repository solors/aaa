package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.C18260d;
import com.iab.omid.library.ironsrc.utils.C18264g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45804a;

    /* renamed from: b */
    private final Float f45805b;

    /* renamed from: c */
    private final boolean f45806c;

    /* renamed from: d */
    private final Position f45807d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45804a = z;
        this.f45805b = f;
        this.f45806c = z2;
        this.f45807d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18264g.m63368a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18264g.m63368a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m63515a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45804a);
            if (this.f45804a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45805b);
            }
            jSONObject.put("autoPlay", this.f45806c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45807d);
        } catch (JSONException e) {
            C18260d.m63377a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f45807d;
    }

    public Float getSkipOffset() {
        return this.f45805b;
    }

    public boolean isAutoPlay() {
        return this.f45806c;
    }

    public boolean isSkippable() {
        return this.f45804a;
    }
}
