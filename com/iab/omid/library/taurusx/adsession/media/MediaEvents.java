package com.iab.omid.library.taurusx.adsession.media;

import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18638h;
import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.utils.C18658g;
import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MediaEvents {
    private final C18621a adSession;

    private MediaEvents(C18621a c18621a) {
        this.adSession = c18621a;
    }

    private void confirmValidDuration(float f) {
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    private void confirmValidVolume(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C18621a c18621a = (C18621a) adSession;
        C18658g.m61868a(adSession, "AdSession is null");
        C18658g.m61861f(c18621a);
        C18658g.m61864c(c18621a);
        C18658g.m61865b(c18621a);
        C18658g.m61859h(c18621a);
        MediaEvents mediaEvents = new MediaEvents(c18621a);
        c18621a.getAdSessionStatePublisher().m61924a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C18658g.m61868a(interactionType, "InteractionType is null");
        C18658g.m61869a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m61921a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("bufferFinish");
    }

    public void bufferStart() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("bufferStart");
    }

    public void complete() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("complete");
    }

    public void firstQuartile() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("firstQuartile");
    }

    public void midpoint() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("midpoint");
    }

    public void pause() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C18658g.m61868a(playerState, "PlayerState is null");
        C18658g.m61869a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m61921a("playerStateChange", jSONObject);
    }

    public void resume() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("resume");
    }

    public void skipped() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C18658g.m61869a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "duration", Float.valueOf(f));
        C18651c.m61889a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C18651c.m61889a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18638h.m61941c().m61942b()));
        this.adSession.getAdSessionStatePublisher().m61921a("start", jSONObject);
    }

    public void thirdQuartile() {
        C18658g.m61869a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m61923a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C18658g.m61869a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18651c.m61889a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C18651c.m61889a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18638h.m61941c().m61942b()));
        this.adSession.getAdSessionStatePublisher().m61921a("volumeChange", jSONObject);
    }
}
