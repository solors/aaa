package com.iab.omid.library.bigosg.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import com.iab.omid.library.bigosg.p389d.C17955e;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C17933a adSession;

    private AdEvents(C17933a c17933a) {
        this.adSession = c17933a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C17933a c17933a = (C17933a) adSession;
        C17955e.m64570a(adSession, "AdSession is null");
        C17955e.m64565d(c17933a);
        C17955e.m64567b(c17933a);
        AdEvents adEvents = new AdEvents(c17933a);
        c17933a.getAdSessionStatePublisher().m64553a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C17955e.m64567b(this.adSession);
        C17955e.m64563f(this.adSession);
        if (!this.adSession.m64674e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m64674e()) {
            this.adSession.m64680b();
        }
    }

    public final void loaded() {
        C17955e.m64566c(this.adSession);
        C17955e.m64563f(this.adSession);
        this.adSession.m64678c();
    }

    public final void loaded(@NonNull VastProperties vastProperties) {
        C17955e.m64566c(this.adSession);
        C17955e.m64563f(this.adSession);
        this.adSession.m64681a(vastProperties.m64667a());
    }
}
