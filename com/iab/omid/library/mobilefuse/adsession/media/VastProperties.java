package com.iab.omid.library.mobilefuse.adsession.media;

import com.iab.omid.library.mobilefuse.utils.C18392d;
import com.iab.omid.library.mobilefuse.utils.C18396g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46063a;

    /* renamed from: b */
    private final Float f46064b;

    /* renamed from: c */
    private final boolean f46065c;

    /* renamed from: d */
    private final Position f46066d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46063a = z;
        this.f46064b = f;
        this.f46065c = z2;
        this.f46066d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18396g.m62867a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18396g.m62867a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m63030a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46063a);
            if (this.f46063a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46064b);
            }
            jSONObject.put("autoPlay", this.f46065c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46066d);
        } catch (JSONException e) {
            C18392d.m62877a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46066d;
    }

    public Float getSkipOffset() {
        return this.f46064b;
    }

    public boolean isAutoPlay() {
        return this.f46065c;
    }

    public boolean isSkippable() {
        return this.f46063a;
    }
}
