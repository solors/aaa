package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.internal.C17999i;
import com.iab.omid.library.bytedance2.utils.C18012c;
import com.iab.omid.library.bytedance2.utils.C18019g;
import com.ironsource.C21114v8;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class MediaEvents {
    private final C17981a adSession;

    private MediaEvents(C17981a c17981a) {
        this.adSession = c17981a;
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
        C17981a c17981a = (C17981a) adSession;
        C18019g.m64308a(adSession, "AdSession is null");
        C18019g.m64301f(c17981a);
        C18019g.m64304c(c17981a);
        C18019g.m64305b(c17981a);
        C18019g.m64299h(c17981a);
        MediaEvents mediaEvents = new MediaEvents(c17981a);
        c17981a.getAdSessionStatePublisher().m64365a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C18019g.m64308a(interactionType, "InteractionType is null");
        C18019g.m64309a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m64362a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("bufferFinish");
    }

    public void bufferStart() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("bufferStart");
    }

    public void complete() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("complete");
    }

    public void firstQuartile() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("firstQuartile");
    }

    public void midpoint() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("midpoint");
    }

    public void pause() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C18019g.m64308a(playerState, "PlayerState is null");
        C18019g.m64309a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m64362a("playerStateChange", jSONObject);
    }

    public void resume() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("resume");
    }

    public void skipped() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C18019g.m64309a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "duration", Float.valueOf(f));
        C18012c.m64330a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C18012c.m64330a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C17999i.m64382c().m64383b()));
        this.adSession.getAdSessionStatePublisher().m64362a("start", jSONObject);
    }

    public void thirdQuartile() {
        C18019g.m64309a(this.adSession);
        this.adSession.getAdSessionStatePublisher().m64364a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C18019g.m64309a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C18012c.m64330a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C18012c.m64330a(jSONObject, C21114v8.C21123i.f54121P, Float.valueOf(C17999i.m64382c().m64383b()));
        this.adSession.getAdSessionStatePublisher().m64362a("volumeChange", jSONObject);
    }
}
