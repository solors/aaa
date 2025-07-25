package com.iab.omid.library.bytedance2.adsession;

import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.iab.omid.library.bytedance2.utils.C18019g;

/* loaded from: classes6.dex */
public final class AdEvents {
    private final C17981a adSession;

    private AdEvents(C17981a c17981a) {
        this.adSession = c17981a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C17981a c17981a = (C17981a) adSession;
        C18019g.m64308a(adSession, "AdSession is null");
        C18019g.m64300g(c17981a);
        C18019g.m64305b(c17981a);
        AdEvents adEvents = new AdEvents(c17981a);
        c17981a.getAdSessionStatePublisher().m64369a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C18019g.m64305b(this.adSession);
        C18019g.m64302e(this.adSession);
        if (!this.adSession.m64469f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m64469f()) {
            this.adSession.m64464k();
        }
    }

    public void loaded() {
        C18019g.m64309a(this.adSession);
        C18019g.m64302e(this.adSession);
        this.adSession.m64463l();
    }

    public void loaded(@NonNull VastProperties vastProperties) {
        C18019g.m64308a(vastProperties, "VastProperties is null");
        C18019g.m64309a(this.adSession);
        C18019g.m64302e(this.adSession);
        this.adSession.m64475a(vastProperties.m64462a());
    }
}
