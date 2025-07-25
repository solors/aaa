package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.p387b.C17943f;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17955e;
import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MediaEvents {
    private final C17933a adSession;

    private MediaEvents(C17933a c17933a) {
        this.adSession = c17933a;
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
        C17933a c17933a = (C17933a) adSession;
        C17955e.m64570a(adSession, "AdSession is null");
        C17955e.m64562g(c17933a);
        C17955e.m64571a(c17933a);
        C17955e.m64567b(c17933a);
        C17955e.m64564e(c17933a);
        MediaEvents mediaEvents = new MediaEvents(c17933a);
        c17933a.getAdSessionStatePublisher().m64549a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C17955e.m64570a(interactionType, "InteractionType is null");
        C17955e.m64566c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m64546a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("bufferFinish");
    }

    public final void bufferStart() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("bufferStart");
    }

    public final void complete() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("complete");
    }

    public final void firstQuartile() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("firstQuartile");
    }

    public final void loaded(VastProperties vastProperties) {
        C17955e.m64570a(vastProperties, "VastProperties is null");
        C17955e.m64567b(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64546a(C21114v8.C21122h.f54087r, vastProperties.m64667a());
    }

    public final void midpoint() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("midpoint");
    }

    public final void pause() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("pause");
    }

    public final void playerStateChange(PlayerState playerState) {
        C17955e.m64570a(playerState, "PlayerState is null");
        C17955e.m64566c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m64546a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("resume");
    }

    public final void skipped() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C17955e.m64566c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "duration", Float.valueOf(f));
        C17951b.m64585a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C17951b.m64585a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C17943f.m64617a().m64611d()));
        this.adSession.getAdSessionStatePublisher().m64546a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C17955e.m64566c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64548a("thirdQuartile");
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C17955e.m64566c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C17951b.m64585a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C17951b.m64585a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C17943f.m64617a().m64611d()));
        this.adSession.getAdSessionStatePublisher().m64546a("volumeChange", jSONObject);
    }
}
