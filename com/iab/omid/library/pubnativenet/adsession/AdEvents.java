package com.iab.omid.library.pubnativenet.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.adsession.media.VastProperties;
import com.iab.omid.library.pubnativenet.utils.C18536g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C18496a adSession;

    private AdEvents(C18496a c18496a) {
        this.adSession = c18496a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C18496a c18496a = (C18496a) adSession;
        C18536g.m62361a(adSession, "AdSession is null");
        C18536g.m62353g(c18496a);
        C18536g.m62358b(c18496a);
        AdEvents adEvents = new AdEvents(c18496a);
        c18496a.getAdSessionStatePublisher().m62424a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18536g.m62358b(this.adSession);
        C18536g.m62355e(this.adSession);
        if (!this.adSession.m62531f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m62531f()) {
            this.adSession.m62526k();
        }
    }

    public void loaded() {
        C18536g.m62362a(this.adSession);
        C18536g.m62355e(this.adSession);
        this.adSession.m62525l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18536g.m62361a(vastProperties, "VastProperties is null");
        C18536g.m62362a(this.adSession);
        C18536g.m62355e(this.adSession);
        this.adSession.m62537a(vastProperties.m62524a());
    }
}
