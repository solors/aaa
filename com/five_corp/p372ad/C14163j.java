package com.five_corp.p372ad;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.media_config.C13838a;
import com.five_corp.p372ad.internal.soundstate.AbstractC14074f;
import com.five_corp.p372ad.internal.soundstate.AbstractC14075g;
import com.five_corp.p372ad.internal.soundstate.C14072d;
import com.five_corp.p372ad.internal.soundstate.C14073e;
import com.five_corp.p372ad.internal.util.C14119g;
import java.util.List;

/* renamed from: com.five_corp.ad.j */
/* loaded from: classes4.dex */
public final class C14163j extends FiveAd {

    /* renamed from: b */
    public static final String f26834b = C14163j.class.toString();

    /* renamed from: c */
    public static final Object f26835c = new Object();

    /* renamed from: d */
    public static C14163j f26836d = null;

    /* renamed from: a */
    public final C13614i f26837a;

    public C14163j(C13614i c13614i) {
        this.f26837a = c13614i;
    }

    public static void initialize(Context context, FiveAdConfig fiveAdConfig) {
        if (fiveAdConfig.appId != null) {
            synchronized (f26835c) {
                C14163j c14163j = f26836d;
                if (c14163j == null) {
                    C13614i c13614i = new C13614i(context, fiveAdConfig, new C13836a());
                    C14119g m78528b = c13614i.m78528b();
                    if (!m78528b.f26746a) {
                        c13614i.f25093d.m78143a(m78528b.f26747b);
                    }
                    f26836d = new C14163j(c13614i);
                } else if (!c14163j.f26837a.f25098i.equals(fiveAdConfig)) {
                    throw new IllegalArgumentException("config should be same as previous one.");
                }
            }
            if (f26836d.f26837a.f25093d.m78144a()) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (Activity.class.isAssignableFrom(Class.forName(stackTrace[i].getClassName()))) {
                            break;
                        }
                        i++;
                    } else {
                        C13838a c13838a = f26836d.f26837a.f25099j.m78402b().f25563b;
                        if (c13838a != null && !c13838a.f25843b.isEmpty()) {
                            return;
                        }
                    }
                }
                f26836d.f26837a.f25108s.m78268a(1);
                return;
            }
            return;
        }
        String str = f26834b;
        if (Log.isLoggable(str, 6)) {
            Log.e(str, "FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
        } else {
            System.err.println("FiveAdConfig.appId must be a non-null value. We will raise an error if detect invalid fiveAdConfigs as soon.");
        }
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (f26835c) {
            if (f26836d != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void m78038a(String str) {
    }

    /* renamed from: b */
    public void m78037b() {
        this.f26837a.f25089E.set(true);
    }

    @Override // com.five_corp.p372ad.FiveAd
    public final void enableSound(boolean z) {
        int i;
        C14073e c14073e = this.f26837a.f25106q;
        synchronized (c14073e.f26253a) {
            C14072d c14072d = c14073e.f26254b;
            if (z) {
                i = 2;
            } else {
                i = 3;
            }
            c14073e.f26254b = new C14072d(i, c14072d.f26252b);
        }
    }

    @Override // com.five_corp.p372ad.FiveAd
    public final boolean isSoundEnabled() {
        C14072d m78130a = this.f26837a.f25106q.m78130a();
        return AbstractC14074f.m78127a(AbstractC14075g.m78126a(m78130a.f26251a, m78130a.f26252b));
    }

    /* renamed from: a */
    public static C14163j m78039a() {
        C14163j c14163j;
        synchronized (f26835c) {
            c14163j = f26836d;
            if (c14163j == null) {
                throw new IllegalStateException("call initialize() first.");
            }
        }
        return c14163j;
    }

    @Override // com.five_corp.p372ad.FiveAd
    public final void setMediaUserAttributes(List list) {
    }
}
