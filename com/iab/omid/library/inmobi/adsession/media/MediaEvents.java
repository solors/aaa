package com.iab.omid.library.inmobi.adsession.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.internal.C18187i;
import com.iab.omid.library.inmobi.utils.C18200c;
import com.iab.omid.library.inmobi.utils.C18207g;
import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MediaEvents {
    private final C18169a adSession;

    private MediaEvents(C18169a c18169a) {
        this.adSession = c18169a;
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
        C18169a c18169a = (C18169a) adSession;
        C18207g.m63605a(adSession, "AdSession is null");
        C18207g.m63598f(c18169a);
        C18207g.m63601c(c18169a);
        C18207g.m63602b(c18169a);
        C18207g.m63596h(c18169a);
        MediaEvents mediaEvents = new MediaEvents(c18169a);
        c18169a.getAdSessionStatePublisher().m63662a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C18207g.m63605a(interactionType, "InteractionType is null");
        C18207g.m63606a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m63659a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("bufferFinish");
    }

    public void bufferStart() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("bufferStart");
    }

    public void complete() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("complete");
    }

    public void firstQuartile() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("firstQuartile");
    }

    public void midpoint() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("midpoint");
    }

    public void pause() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C18207g.m63605a(playerState, "PlayerState is null");
        C18207g.m63606a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m63659a("playerStateChange", jSONObject);
    }

    public void resume() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("resume");
    }

    public void skipped() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C18207g.m63606a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "duration", Float.valueOf(f));
        C18200c.m63627a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C18200c.m63627a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18187i.m63679c().m63680b()));
        this.adSession.getAdSessionStatePublisher().m63659a("start", jSONObject);
    }

    public void thirdQuartile() {
        C18207g.m63606a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m63661a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C18207g.m63606a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18200c.m63627a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C18200c.m63627a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C18187i.m63679c().m63680b()));
        this.adSession.getAdSessionStatePublisher().m63659a("volumeChange", jSONObject);
    }
}
