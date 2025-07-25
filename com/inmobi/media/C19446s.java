package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.s */
/* loaded from: classes6.dex */
public final class C19446s {

    /* renamed from: a */
    public final AdEvents f48636a;

    /* renamed from: b */
    public final MediaEvents f48637b;

    public C19446s(AdSession adSession, String str) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        if (Intrinsics.m17075f(str, "native_video_ad")) {
            this.f48637b = MediaEvents.createMediaEvents(adSession);
            this.f48636a = AdEvents.createAdEvents(adSession);
            return;
        }
        this.f48636a = AdEvents.createAdEvents(adSession);
    }
}
