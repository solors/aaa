package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.p389d.C17953c;
import com.iab.omid.library.bigosg.p389d.C17955e;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45180a;

    /* renamed from: b */
    private final Float f45181b;

    /* renamed from: c */
    private final boolean f45182c;

    /* renamed from: d */
    private final Position f45183d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f45180a = z;
        this.f45181b = f;
        this.f45182c = z2;
        this.f45183d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C17955e.m64570a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C17955e.m64570a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public final JSONObject m64667a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f45180a);
            if (this.f45180a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f45181b);
            }
            jSONObject.put("autoPlay", this.f45182c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f45183d);
        } catch (JSONException e) {
            C17953c.m64575a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f45183d;
    }

    public final Float getSkipOffset() {
        return this.f45181b;
    }

    public final boolean isAutoPlay() {
        return this.f45182c;
    }

    public final boolean isSkippable() {
        return this.f45180a;
    }
}
