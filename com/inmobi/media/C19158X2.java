package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.CrashConfig;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38513v;

/* renamed from: com.inmobi.media.X2 */
/* loaded from: classes6.dex */
public final class C19158X2 implements InterfaceC19132V2 {

    /* renamed from: a */
    public volatile CrashConfig f47950a;

    /* renamed from: b */
    public final C18866B6 f47951b;

    /* renamed from: c */
    public final List f47952c;

    public C19158X2(Context context, CrashConfig crashConfig, C18866B6 eventBus) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.f47950a = crashConfig;
        this.f47951b = eventBus;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(synchronizedList, "synchronizedList(...)");
        this.f47952c = synchronizedList;
        if (this.f47950a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new C18946H2(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f47950a.getANRConfig().getAppExitReason().getEnabled() && C19212b3.f48088a.m60476E()) {
            synchronizedList.add(new C18930G0(context, this, this.f47950a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f47950a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
        }
        if (this.f47950a.getANRConfig().getWatchdog().getEnabled()) {
            synchronizedList.add(new C19208b(this.f47950a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    /* renamed from: a */
    public final void m60566a(C19082R4 incidentEvent) {
        int i;
        Map m17291g;
        Intrinsics.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C18944H0) && this.f47950a.getANRConfig().getAppExitReason().getEnabled()) {
            i = ErrorCode.CODE_NOT_TRACK_STATUS;
        } else if ((incidentEvent instanceof C18960I2) && this.f47950a.getCrashConfig().getEnabled()) {
            i = 150;
        } else if ((incidentEvent instanceof C19529xc) && this.f47950a.getANRConfig().getWatchdog().getEnabled()) {
            i = ErrorCode.CODE_INIT_UNKNOWN_ERROR;
        } else {
            return;
        }
        C18866B6 c18866b6 = this.f47951b;
        String str = incidentEvent.f48921a;
        m17291g = MapsJVM.m17291g(C38513v.m14532a("data", incidentEvent));
        c18866b6.m61246b(new C18945H1(i, str, m17291g));
    }
}
