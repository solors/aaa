package com.iab.omid.library.inmobi.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.iab.omid.library.inmobi.utils.C18207g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C18169a adSession;

    private AdEvents(C18169a c18169a) {
        this.adSession = c18169a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C18169a c18169a = (C18169a) adSession;
        C18207g.m63605a(adSession, "AdSession is null");
        C18207g.m63597g(c18169a);
        C18207g.m63602b(c18169a);
        AdEvents adEvents = new AdEvents(c18169a);
        c18169a.getAdSessionStatePublisher().m63666a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18207g.m63602b(this.adSession);
        C18207g.m63599e(this.adSession);
        if (!this.adSession.m63766f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m63766f()) {
            this.adSession.m63761k();
        }
    }

    public void loaded() {
        C18207g.m63606a(this.adSession);
        C18207g.m63599e(this.adSession);
        this.adSession.m63760l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18207g.m63605a(vastProperties, "VastProperties is null");
        C18207g.m63606a(this.adSession);
        C18207g.m63599e(this.adSession);
        this.adSession.m63772a(vastProperties.m63759a());
    }
}
