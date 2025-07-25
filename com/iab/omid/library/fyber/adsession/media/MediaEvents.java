package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18117i;
import com.iab.omid.library.fyber.utils.C18132c;
import com.iab.omid.library.fyber.utils.C18139g;
import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MediaEvents {
    private final C18099a adSession;

    private MediaEvents(C18099a c18099a) {
        this.adSession = c18099a;
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
        C18099a c18099a = (C18099a) adSession;
        C18139g.m63849a(adSession, "AdSession is null");
        C18139g.m63842f(c18099a);
        C18139g.m63845c(c18099a);
        C18139g.m63846b(c18099a);
        C18139g.m63840h(c18099a);
        MediaEvents mediaEvents = new MediaEvents(c18099a);
        c18099a.getAdSessionStatePublisher().m63908a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C18139g.m63849a(interactionType, "InteractionType is null");
        C18139g.m63850a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m63905a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("bufferFinish");
    }

    public void bufferStart() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("bufferStart");
    }

    public void complete() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("complete");
    }

    public void firstQuartile() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("firstQuartile");
    }

    public void midpoint() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("midpoint");
    }

    public void pause() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C18139g.m63849a(playerState, "PlayerState is null");
        C18139g.m63850a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m63905a("playerStateChange", jSONObject);
    }

    public void resume() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("resume");
    }

    public void skipped() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C18139g.m63850a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "duration", Float.valueOf(f));
        C18132c.m63872a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C18132c.m63872a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18117i.m63931c().m63932b()));
        this.adSession.getAdSessionStatePublisher().m63905a("start", jSONObject);
    }

    public void thirdQuartile() {
        C18139g.m63850a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63907a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C18139g.m63850a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18132c.m63872a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C18132c.m63872a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18117i.m63931c().m63932b()));
        this.adSession.getAdSessionStatePublisher().m63905a("volumeChange", jSONObject);
    }
}
