package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.C18711d;
import com.iab.omid.library.unity3d.utils.C18715g;
import com.ironsource.C21114v8;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f46732a;

    /* renamed from: b */
    private final Float f46733b;

    /* renamed from: c */
    private final boolean f46734c;

    /* renamed from: d */
    private final Position f46735d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f46732a = z;
        this.f46733b = f;
        this.f46734c = z2;
        this.f46735d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C18715g.m61634a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C18715g.m61634a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m61780a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46732a);
            if (this.f46732a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f46733b);
            }
            jSONObject.put("autoPlay", this.f46734c);
            jSONObject.put(C21114v8.C21122h.f54038L, this.f46735d);
        } catch (JSONException e) {
            C18711d.m61643a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f46735d;
    }

    public Float getSkipOffset() {
        return this.f46733b;
    }

    public boolean isAutoPlay() {
        return this.f46734c;
    }

    public boolean isSkippable() {
        return this.f46732a;
    }
}
