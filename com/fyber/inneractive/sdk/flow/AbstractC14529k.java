package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.config.AbstractC14333a;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC14327U;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14575a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14576b;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14577c;
import com.fyber.inneractive.sdk.metrics.C14602d;
import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.fyber.inneractive.sdk.network.timeouts.content.C14733a;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.response.EnumC15382a;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.flow.k */
/* loaded from: classes4.dex */
public abstract class AbstractC14529k implements InterfaceC14577c, InterfaceC14576b {

    /* renamed from: a */
    public InneractiveAdRequest f27516a;

    /* renamed from: b */
    public AbstractC15386e f27517b;

    /* renamed from: c */
    public AbstractC14552x f27518c;

    /* renamed from: d */
    public InterfaceC14575a f27519d;

    /* renamed from: e */
    public InterfaceC14576b f27520e;

    /* renamed from: f */
    public C14326T f27521f;

    /* renamed from: g */
    public C14388r f27522g;

    /* renamed from: j */
    public C14733a f27525j;

    /* renamed from: h */
    public boolean f27523h = false;

    /* renamed from: i */
    public int f27524i = 0;

    /* renamed from: l */
    public final RunnableC14528j f27527l = new RunnableC14528j(this);

    /* renamed from: k */
    public C14498d f27526k = new C14498d(this);

    /* renamed from: a */
    public final void m77835a(InneractiveAdRequest inneractiveAdRequest, AbstractC15386e abstractC15386e, C14388r c14388r, InterfaceC14575a interfaceC14575a, InterfaceC14576b interfaceC14576b) {
        String lowerCase;
        this.f27516a = inneractiveAdRequest;
        this.f27517b = abstractC15386e;
        this.f27519d = interfaceC14575a;
        this.f27520e = interfaceC14576b;
        this.f27526k = new C14498d(this);
        this.f27522g = c14388r;
        UnitDisplayType unitDisplayType = abstractC15386e.f30472p;
        if (unitDisplayType != UnitDisplayType.INTERSTITIAL && unitDisplayType != UnitDisplayType.REWARDED) {
            lowerCase = UnitDisplayType.BANNER.name().toLowerCase(Locale.US);
        } else {
            lowerCase = unitDisplayType.name().toLowerCase(Locale.US);
        }
        this.f27525j = new C14733a(lowerCase, EnumC15382a.m76585a(abstractC15386e.f30463g) == EnumC15382a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) abstractC15386e.f30455K, abstractC15386e.f30448D, IAConfigManager.f27060O.f27088l, this.f27522g);
        if (this.f27516a == null) {
            this.f27521f = AbstractC14333a.m77984a(abstractC15386e.f30471o);
        }
        try {
            m77830h();
        } catch (Throwable th) {
            IAlog.m76524f("Failed to start ContentLoader", IAlog.m76531a(this));
            AbstractC14743z.m77653a(th, inneractiveAdRequest, abstractC15386e);
            this.f27526k.m77865a();
            m77834a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, EnumC14527i.CONTENT_LOADER_START_FAILED));
        }
    }

    /* renamed from: b */
    public final void m77833b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        AbstractC15465p.f30611a.execute(new RunnableC14499e(new C14524f(this.f27517b, this.f27516a, mo77820d(), this.f27522g.m77925b()), inneractiveInfrastructureError));
    }

    /* renamed from: c */
    public InneractiveInfrastructureError mo77821c() {
        String str;
        EnumC14527i enumC14527i = EnumC14527i.WEBVIEW_LOAD_TIMEOUT;
        AbstractC15386e abstractC15386e = this.f27517b;
        if (abstractC15386e != null && EnumC15382a.m76585a(abstractC15386e.f30463g) == EnumC15382a.RETURNED_ADTYPE_VAST) {
            str = "video";
        } else {
            str = "display";
        }
        if ("video".equalsIgnoreCase(str)) {
            enumC14527i = EnumC14527i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, enumC14527i);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14577c
    public abstract void cancel();

    /* renamed from: d */
    public abstract String mo77820d();

    /* renamed from: e */
    public final InterfaceC14327U m77832e() {
        InneractiveAdRequest inneractiveAdRequest = this.f27516a;
        if (inneractiveAdRequest == null) {
            return this.f27521f;
        }
        return inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* renamed from: f */
    public final void m77831f() {
        String str;
        this.f27526k.m77865a();
        InneractiveAdRequest inneractiveAdRequest = this.f27516a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f27434b;
        } else {
            AbstractC15386e abstractC15386e = this.f27517b;
            if (abstractC15386e == null || (str = abstractC15386e.f30446B) == null) {
                str = null;
            }
        }
        C14602d.f27666d.m77771a(str).mo77761i();
        AbstractC14552x abstractC14552x = this.f27518c;
        if (abstractC14552x != null) {
            abstractC14552x.mo77810a(str);
        }
        InterfaceC14575a interfaceC14575a = this.f27519d;
        if (interfaceC14575a != null) {
            interfaceC14575a.mo77789a(this.f27516a);
        }
    }

    /* renamed from: g */
    public abstract void mo77819g();

    /* renamed from: h */
    public final void m77830h() {
        int i;
        int i2;
        int i3 = this.f27524i;
        this.f27524i = i3 + 1;
        C14733a c14733a = this.f27525j;
        if (c14733a != null) {
            if (c14733a.f27912g) {
                i3 = c14733a.f27906a - i3;
            }
            if (i3 == c14733a.f27906a) {
                i2 = c14733a.f27913h;
            } else {
                i2 = 0;
            }
            i = (c14733a.f27907b * i3) + c14733a.f27909d + i2;
        } else {
            i = 0;
        }
        IAlog.m76529a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.m76531a(this), Integer.valueOf(i), Integer.valueOf(this.f27524i - 1));
        C14498d c14498d = this.f27526k;
        if (c14498d.f27445a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            c14498d.f27445a = new Handler(handlerThread.getLooper());
        }
        c14498d.f27445a.postDelayed(c14498d.f27448d, i);
        mo77819g();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC14576b
    /* renamed from: b */
    public final void mo77786b() {
        int i;
        String m76531a = IAlog.m76531a(this);
        Integer valueOf = Integer.valueOf(this.f27524i - 1);
        int i2 = this.f27524i - 1;
        C14733a c14733a = this.f27525j;
        if (c14733a != null) {
            if (c14733a.f27912g) {
                i2 = c14733a.f27906a - i2;
            }
            i = (c14733a.f27907b * i2) + c14733a.f27909d + (i2 == c14733a.f27906a ? c14733a.f27913h : 0);
        } else {
            i = 0;
        }
        IAlog.m76529a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", m76531a, valueOf, Integer.valueOf(i));
        InterfaceC14576b interfaceC14576b = this.f27520e;
        if (interfaceC14576b != null) {
            interfaceC14576b.mo77786b();
        }
        m77830h();
    }

    /* renamed from: a */
    public void mo77787a() {
        int i;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String m76531a = IAlog.m76531a(this);
        Integer valueOf = Integer.valueOf(this.f27524i - 1);
        int i2 = this.f27524i - 1;
        C14733a c14733a = this.f27525j;
        if (c14733a != null) {
            if (c14733a.f27912g) {
                i2 = c14733a.f27906a - i2;
            }
            i = (c14733a.f27907b * i2) + c14733a.f27909d + (i2 == c14733a.f27906a ? c14733a.f27913h : 0);
        } else {
            i = 0;
        }
        IAlog.m76529a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", m76531a, valueOf, Integer.valueOf(i));
        InterfaceC14576b interfaceC14576b = this.f27520e;
        if (interfaceC14576b != null) {
            interfaceC14576b.mo77787a();
        }
        C14733a c14733a2 = this.f27525j;
        if (this.f27524i <= (c14733a2 != null ? c14733a2.f27906a : 0)) {
            inneractiveInfrastructureError = mo77821c();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, EnumC14527i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        m77833b(inneractiveInfrastructureError);
        m77834a(inneractiveInfrastructureError);
    }

    /* renamed from: a */
    public final void m77834a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.m76529a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.m76531a(this), inneractiveInfrastructureError.getErrorCode().toString());
        C14498d c14498d = this.f27526k;
        c14498d.getClass();
        IAlog.m76529a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.m76531a(c14498d));
        Handler handler = c14498d.f27445a;
        if (handler != null) {
            handler.removeCallbacks(c14498d.f27448d);
        }
        C14733a c14733a = this.f27525j;
        boolean z = this.f27524i <= (c14733a != null ? c14733a.f27906a : 0);
        IAlog.m76529a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.m76531a(this), Boolean.valueOf(z));
        if (z) {
            AbstractC14552x abstractC14552x = this.f27518c;
            if (abstractC14552x != null) {
                abstractC14552x.mo77811a();
                this.f27518c = null;
            }
            C14733a c14733a2 = this.f27525j;
            int i = c14733a2 != null ? c14733a2.f27910e : 0;
            IAlog.m76529a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.m76531a(this), Integer.valueOf(i));
            AbstractC15465p.f30612b.postDelayed(this.f27527l, i);
            return;
        }
        InterfaceC14575a interfaceC14575a = this.f27519d;
        if (interfaceC14575a != null) {
            interfaceC14575a.mo77788a(inneractiveInfrastructureError);
        }
        cancel();
        InneractiveAdRequest inneractiveAdRequest = this.f27516a;
        AbstractC15386e abstractC15386e = this.f27517b;
        C14388r c14388r = this.f27522g;
        AbstractC14495a.m77866a(inneractiveAdRequest, inneractiveInfrastructureError, this.f27518c, abstractC15386e, c14388r != null ? c14388r.m77925b() : null);
    }
}
