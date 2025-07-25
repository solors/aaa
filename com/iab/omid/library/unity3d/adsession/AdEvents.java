package com.iab.omid.library.unity3d.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.media.VastProperties;
import com.iab.omid.library.unity3d.utils.C18715g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C18678a adSession;

    private AdEvents(C18678a c18678a) {
        this.adSession = c18678a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C18678a c18678a = (C18678a) adSession;
        C18715g.m61634a(adSession, "AdSession is null");
        C18715g.m61626g(c18678a);
        C18715g.m61631b(c18678a);
        AdEvents adEvents = new AdEvents(c18678a);
        c18678a.getAdSessionStatePublisher().m61694a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18715g.m61631b(this.adSession);
        C18715g.m61628e(this.adSession);
        if (!this.adSession.m61787f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m61787f()) {
            this.adSession.m61782k();
        }
    }

    public void loaded() {
        C18715g.m61635a(this.adSession);
        C18715g.m61628e(this.adSession);
        this.adSession.m61781l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18715g.m61634a(vastProperties, "VastProperties is null");
        C18715g.m61635a(this.adSession);
        C18715g.m61628e(this.adSession);
        this.adSession.m61795a(vastProperties.m61780a());
    }
}
