package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.C14328V;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14368o;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C14491S;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.measurement.C14586e;
import com.fyber.inneractive.sdk.measurement.C14588g;
import com.fyber.inneractive.sdk.model.vast.C14625r;
import com.fyber.inneractive.sdk.model.vast.EnumC14630w;
import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.C14741x;
import com.fyber.inneractive.sdk.network.EnumC14738u;
import com.fyber.inneractive.sdk.player.controller.AbstractC14782q;
import com.fyber.inneractive.sdk.player.controller.InterfaceC14780o;
import com.fyber.inneractive.sdk.player.controller.InterfaceC14781p;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.mediaplayer.C15174o;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.response.C15388g;
import com.fyber.inneractive.sdk.response.InterfaceC15390i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.MediaFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.f */
/* loaded from: classes4.dex */
public abstract class AbstractC15152f implements InterfaceC14781p, InterfaceC14780o {

    /* renamed from: a */
    public AbstractC14782q f29933a;

    /* renamed from: b */
    public C14491S f29934b;

    /* renamed from: c */
    public InneractiveAdRequest f29935c;

    /* renamed from: d */
    public C14586e f29936d;

    /* renamed from: e */
    public C14588g f29937e;

    /* renamed from: l */
    public InterfaceC15179q f29944l;

    /* renamed from: m */
    public int f29945m;

    /* renamed from: n */
    public C14625r f29946n;

    /* renamed from: f */
    public C15178p f29938f = null;

    /* renamed from: g */
    public boolean f29939g = true;

    /* renamed from: h */
    public boolean f29940h = false;

    /* renamed from: i */
    public volatile boolean f29941i = false;

    /* renamed from: j */
    public boolean f29942j = false;

    /* renamed from: k */
    public int f29943k = 0;

    /* renamed from: o */
    public final C14746c f29947o = new C14746c(this);

    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC15152f(android.content.Context r5, com.fyber.inneractive.sdk.config.global.C14388r r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f29938f = r0
            r1 = 1
            r4.f29939g = r1
            r1 = 0
            r4.f29940h = r1
            r4.f29941i = r1
            r4.f29942j = r1
            r4.f29943k = r1
            com.fyber.inneractive.sdk.player.c r2 = new com.fyber.inneractive.sdk.player.c
            r2.<init>(r4)
            r4.f29947o = r2
            if (r6 == 0) goto L32
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.w> r2 = com.fyber.inneractive.sdk.config.global.features.C14376w.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r6.m77927a(r2)     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.config.global.features.w r2 = (com.fyber.inneractive.sdk.config.global.features.C14376w) r2     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "use_fmp_cache_mechanism"
            java.lang.Boolean r2 = r2.mo77930c(r3)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r6 = move-exception
            goto L3a
        L32:
            r2 = r1
        L33:
            com.fyber.inneractive.sdk.player.controller.f r3 = new com.fyber.inneractive.sdk.player.controller.f     // Catch: java.lang.Throwable -> L30
            r3.<init>(r5, r2, r6)     // Catch: java.lang.Throwable -> L30
            r0 = r3
            goto L49
        L3a:
            int r2 = com.fyber.inneractive.sdk.util.IAlog.f30554a
            r3 = 3
            if (r2 > r3) goto L49
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed creating exo player"
            com.fyber.inneractive.sdk.util.IAlog.m76529a(r2, r1)
            r6.printStackTrace()
        L49:
            if (r0 != 0) goto L50
            com.fyber.inneractive.sdk.player.controller.a r0 = new com.fyber.inneractive.sdk.player.controller.a
            r0.<init>(r5)
        L50:
            r4.f29933a = r0
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f28031b
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L5f
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f28031b
            r5.add(r4)
        L5f:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f29933a
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.f28032c
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L6e
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f28032c
            r5.add(r4)
        L6e:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f29933a
            com.fyber.inneractive.sdk.player.c r6 = r4.f29947o
            r5.f28035f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.AbstractC15152f.<init>(android.content.Context, com.fyber.inneractive.sdk.config.global.r):void");
    }

    /* renamed from: a */
    public abstract void mo77104a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: a */
    public final void mo77097a(C15174o c15174o) {
        IAlog.m76529a("IMediaPlayerFlowManager: onPlayerError called with: %s", c15174o.getMessage());
        mo77104a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, c15174o), new JSONObject());
        if (this.f29940h) {
            IAlog.m76529a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            mo77104a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, c15174o), new JSONObject());
        }
    }

    /* renamed from: a */
    public abstract void mo77102a(InterfaceC15390i interfaceC15390i, VideoClickOrigin videoClickOrigin, EnumC14630w... enumC14630wArr);

    @Override // com.fyber.inneractive.sdk.player.controller.InterfaceC14781p
    /* renamed from: c */
    public final void mo77096c(boolean z) {
        C15388g c15388g;
        JSONArray m77925b;
        String str;
        try {
            C14491S c14491s = this.f29934b;
            if (c14491s != null) {
                c15388g = (C15388g) c14491s.f27573b;
            } else {
                c15388g = null;
            }
            EnumC14738u enumC14738u = EnumC14738u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f29935c;
            C14491S c14491s2 = this.f29934b;
            if (c14491s2 == null) {
                m77925b = null;
            } else {
                m77925b = c14491s2.f27574c.m77925b();
            }
            C14740w c14740w = new C14740w(c15388g);
            c14740w.f27931c = enumC14738u;
            c14740w.f27929a = inneractiveAdRequest;
            c14740w.f27932d = m77925b;
            if (this.f29946n != null && c15388g != null) {
                C14741x m77656a = new C14741x().m77656a(String.valueOf(z), "waudio").m77656a(this.f29946n.f27757g, "url").m77656a(this.f29946n.f27755e, MediaFile.BITRATE);
                if (TextUtils.isEmpty(this.f29946n.f27754d)) {
                    str = "na";
                } else {
                    str = this.f29946n.f27754d;
                }
                c14740w.f27934f.put(m77656a.m77656a(str, "mime").m77656a(this.f29946n.f27751a, "delivery").m77656a(Integer.valueOf(this.f29943k), "media_file_index").m77656a(this.f29933a.mo77621d(), "player").f27936a);
            }
            c14740w.m77658a((String) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m77123a(int i, int i2, InterfaceC14327U interfaceC14327U) {
        if (i2 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        C14328V c14328v = interfaceC14327U != null ? ((C14326T) interfaceC14327U).f27125f : null;
        return (c14328v == null || c14328v.f27134h == Skip.DEFAULT || c14328v.f27136j == UnitDisplayType.REWARDED) ? false : true;
    }

    /* renamed from: a */
    public static int m77121a(AbstractC15152f abstractC15152f) {
        AbstractC15386e abstractC15386e;
        C14491S c14491s = abstractC15152f.f29934b;
        if (c14491s == null || (abstractC15386e = c14491s.f27573b) == null) {
            return -1;
        }
        return ((C15388g) abstractC15386e).f30481y;
    }

    /* renamed from: a */
    public static boolean m77122a(C14388r c14388r, EnumC14568m enumC14568m) {
        enumC14568m.getClass();
        if (enumC14568m == EnumC14568m.TRUE_SINGLE_TAP && IAConfigManager.f27060O.f27067E.m77796n() && c14388r != null && c14388r.m77927a(C14368o.class) != null) {
            Boolean mo77930c = ((C14368o) c14388r.m77927a(C14368o.class)).mo77930c("enable_app_info_button");
            if (mo77930c != null ? mo77930c.booleanValue() : true) {
                return true;
            }
        }
        return false;
    }
}
