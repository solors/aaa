package com.iab.omid.library.smaato.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.smaato.adsession.media.VastProperties;
import com.iab.omid.library.smaato.utils.C18599g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C18559a adSession;

    private AdEvents(C18559a c18559a) {
        this.adSession = c18559a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C18559a c18559a = (C18559a) adSession;
        C18599g.m62108a(adSession, "AdSession is null");
        C18599g.m62100g(c18559a);
        C18599g.m62105b(c18559a);
        AdEvents adEvents = new AdEvents(c18559a);
        c18559a.getAdSessionStatePublisher().m62171a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18599g.m62105b(this.adSession);
        C18599g.m62102e(this.adSession);
        if (!this.adSession.m62278f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m62278f()) {
            this.adSession.m62273k();
        }
    }

    public void loaded() {
        C18599g.m62109a(this.adSession);
        C18599g.m62102e(this.adSession);
        this.adSession.m62272l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18599g.m62108a(vastProperties, "VastProperties is null");
        C18599g.m62109a(this.adSession);
        C18599g.m62102e(this.adSession);
        this.adSession.m62284a(vastProperties.m62271a());
    }
}
