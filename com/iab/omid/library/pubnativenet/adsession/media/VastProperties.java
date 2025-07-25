package com.iab.omid.library.pubnativenet.adsession.media;

import com.iab.omid.library.pubnativenet.utils.C18532d;
import com.iab.omid.library.pubnativenet.utils.C18536g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46333a;

    /* renamed from: b */
    private final Float f46334b;

    /* renamed from: c */
    private final boolean f46335c;

    /* renamed from: d */
    private final Position f46336d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46333a = z;
        this.f46334b = f;
        this.f46335c = z2;
        this.f46336d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18536g.m62361a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18536g.m62361a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m62524a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46333a);
            if (this.f46333a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46334b);
            }
            jSONObject.put("autoPlay", this.f46335c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46336d);
        } catch (JSONException e) {
            C18532d.m62371a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46336d;
    }

    public Float getSkipOffset() {
        return this.f46334b;
    }

    public boolean isAutoPlay() {
        return this.f46335c;
    }

    public boolean isSkippable() {
        return this.f46333a;
    }
}
