package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.features.C14376w;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C14494V;
import com.fyber.inneractive.sdk.model.vast.EnumC14616i;
import com.fyber.inneractive.sdk.network.InterfaceC14672F;
import com.fyber.inneractive.sdk.player.p376ui.C15184b;
import com.fyber.inneractive.sdk.player.p376ui.C15185c;
import com.fyber.inneractive.sdk.util.EnumC15447g;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.endcard.b */
/* loaded from: classes4.dex */
public abstract class AbstractC14501b implements InterfaceC14510k {

    /* renamed from: a */
    public final String f27453a = IAlog.m76531a(this);

    /* renamed from: b */
    public final C14494V f27454b;

    /* renamed from: c */
    public InterfaceC14510k f27455c;

    /* renamed from: d */
    public int f27456d;

    public AbstractC14501b(C14494V c14494v) {
        this.f27454b = c14494v;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC14510k
    /* renamed from: a */
    public final void mo77843a() {
        InterfaceC14510k interfaceC14510k = this.f27455c;
        if (interfaceC14510k != null) {
            interfaceC14510k.mo77843a();
        }
    }

    /* renamed from: a */
    public abstract void mo77850a(ViewGroup viewGroup, C15184b c15184b);

    /* renamed from: a */
    public abstract void mo77837a(InterfaceC14672F interfaceC14672F);

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC14510k
    /* renamed from: b */
    public final View mo77838b() {
        return m77861f().mo77838b();
    }

    /* renamed from: c */
    public abstract InterfaceC14510k mo77836c();

    /* renamed from: d */
    public C15185c mo77847d() {
        C14376w c14376w = this.f27454b.f27441g;
        C15185c c15185c = new C15185c();
        c15185c.f30029b = mo77839j();
        c15185c.f30035h = mo77845h();
        boolean m77862b = m77862b(c14376w);
        Integer valueOf = Integer.valueOf(m77863a(c14376w));
        if (m77862b) {
            c15185c.f30033f = valueOf;
        }
        return c15185c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC14510k
    public void destroy() {
        mo77859e();
        InterfaceC14510k interfaceC14510k = this.f27455c;
        if (interfaceC14510k != null) {
            interfaceC14510k.destroy();
            this.f27455c = null;
        }
    }

    /* renamed from: e */
    public void mo77859e() {
        mo77843a();
    }

    /* renamed from: f */
    public final InterfaceC14510k m77861f() {
        if (this.f27455c == null) {
            this.f27455c = mo77836c();
        }
        return this.f27455c;
    }

    /* renamed from: g */
    public abstract EnumC15447g mo77846g();

    /* renamed from: h */
    public abstract EnumC14616i mo77845h();

    /* renamed from: i */
    public boolean mo77844i() {
        return false;
    }

    /* renamed from: j */
    public abstract boolean mo77839j();

    /* renamed from: k */
    public void mo77858k() {
        IAlog.m76528b("%s loading success for %s", mo77845h(), this.f27453a);
    }

    /* renamed from: b */
    public static boolean m77862b(C14376w c14376w) {
        if (c14376w != null) {
            Boolean mo77930c = c14376w.mo77930c("shouldEnableEndCardAutoClick");
            return mo77930c != null ? mo77930c.booleanValue() : false;
        }
        return false;
    }

    /* renamed from: a */
    public void mo77849a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.m76530a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), mo77845h(), this.f27453a);
    }

    /* renamed from: a */
    public static int m77863a(C14376w c14376w) {
        if (c14376w != null) {
            Integer mo77934a = c14376w.mo77934a("autoClickDelay");
            int intValue = mo77934a != null ? mo77934a.intValue() : 3;
            if (intValue < 0 || intValue > 10) {
                return 3;
            }
            return intValue;
        }
        return 3;
    }
}
