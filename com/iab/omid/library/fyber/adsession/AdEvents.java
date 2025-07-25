package com.iab.omid.library.fyber.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.iab.omid.library.fyber.utils.C18139g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C18099a adSession;

    private AdEvents(C18099a c18099a) {
        this.adSession = c18099a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C18099a c18099a = (C18099a) adSession;
        C18139g.m63849a(adSession, "AdSession is null");
        C18139g.m63841g(c18099a);
        C18139g.m63846b(c18099a);
        AdEvents adEvents = new AdEvents(c18099a);
        c18099a.getAdSessionStatePublisher().m63912a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18139g.m63846b(this.adSession);
        C18139g.m63843e(this.adSession);
        if (!this.adSession.m64019f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m64019f()) {
            this.adSession.m64014k();
        }
    }

    public void loaded() {
        C18139g.m63850a(this.adSession);
        C18139g.m63843e(this.adSession);
        this.adSession.m64013l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18139g.m63849a(vastProperties, "VastProperties is null");
        C18139g.m63850a(this.adSession);
        C18139g.m63843e(this.adSession);
        this.adSession.m64025a(vastProperties.m64012a());
    }
}
