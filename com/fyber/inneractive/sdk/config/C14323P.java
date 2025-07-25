package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.AbstractC15438b0;
import com.fyber.inneractive.sdk.util.InterfaceC15436a0;
import com.maticoo.sdk.utils.event.Event;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.P */
/* loaded from: classes4.dex */
public final class C14323P implements InterfaceC15436a0 {

    /* renamed from: a */
    public Set f27116a = null;

    @Override // com.fyber.inneractive.sdk.util.InterfaceC15436a0
    /* renamed from: a */
    public final JSONObject mo76509a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set<Track> set = this.f27116a;
        if (set != null) {
            for (Track track : set) {
                jSONArray.put(track);
            }
        }
        AbstractC15438b0.m76508a(jSONObject, Event.DEFAULT_TYPE, jSONArray);
        return jSONObject;
    }
}
