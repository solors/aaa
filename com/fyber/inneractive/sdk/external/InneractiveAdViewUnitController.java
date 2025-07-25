package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C14320M;
import com.fyber.inneractive.sdk.config.C14326T;
import com.fyber.inneractive.sdk.config.C14328V;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.AbstractC14466b;
import com.fyber.inneractive.sdk.factories.AbstractC14472h;
import com.fyber.inneractive.sdk.factories.InterfaceC14465a;
import com.fyber.inneractive.sdk.factories.InterfaceC14471g;
import com.fyber.inneractive.sdk.flow.AbstractC14474A;
import com.fyber.inneractive.sdk.flow.AbstractC14490Q;
import com.fyber.inneractive.sdk.flow.C14479F;
import com.fyber.inneractive.sdk.flow.InterfaceC14478E;
import com.fyber.inneractive.sdk.flow.InterfaceC14480G;
import com.fyber.inneractive.sdk.flow.InterfaceC14489P;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14578d;
import com.fyber.inneractive.sdk.interfaces.InterfaceC14580f;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class InneractiveAdViewUnitController extends AbstractC14490Q implements InterfaceC14478E, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a */
    public final HashSet f27352a;

    /* renamed from: b */
    public boolean f27353b;

    /* renamed from: c */
    public ViewGroup f27354c;

    /* renamed from: d */
    public final int f27355d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.f27353b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f27355d = 0;
        this.f27352a = new HashSet();
    }

    /* renamed from: a */
    public final void m77894a() {
        this.f27353b = true;
        Iterator it = new HashSet(this.f27352a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f27352a.clear();
        this.f27354c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        InterfaceC14578d interfaceC14578d;
        IAlog.m76529a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m76524f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m76529a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f27352a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof InterfaceC14578d) {
                InterfaceC14578d interfaceC14578d2 = (InterfaceC14578d) inneractiveAdRenderer;
                if (interfaceC14578d2.mo76640b(viewGroup)) {
                    interfaceC14578d2.mo76638l();
                    IAlog.m76529a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), interfaceC14578d2);
                    return;
                }
            }
        }
        this.f27354c = viewGroup;
        Iterator it2 = AbstractC14466b.f27378a.f27379a.iterator();
        while (true) {
            if (it2.hasNext()) {
                InterfaceC14465a interfaceC14465a = (InterfaceC14465a) it2.next();
                if (interfaceC14465a.mo76437a(adSpot)) {
                    interfaceC14578d = interfaceC14465a.mo76438a();
                    break;
                }
            } else {
                interfaceC14578d = null;
                break;
            }
        }
        int i = this.f27355d;
        if (i != 0) {
            interfaceC14578d.mo76643a(i);
        }
        if (interfaceC14578d != null) {
            ((AbstractC14474A) interfaceC14578d).initialize(adSpot);
            selectContentController();
            interfaceC14578d.mo76642a(viewGroup);
            this.f27352a.add(interfaceC14578d);
            IAlog.m76529a("%sPPPP bindView created renderer %s", logPrefix(), interfaceC14578d);
            return;
        }
        IAlog.m76524f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14490Q
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.f27352a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14490Q, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            m77894a();
        } else {
            AbstractC15465p.f30612b.post(new RunnableC14463f(this));
        }
    }

    public int getAdContentHeight() {
        int mo76637n;
        Iterator it = this.f27352a.iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof InterfaceC14578d) && (mo76637n = ((InterfaceC14578d) inneractiveAdRenderer).mo76637n()) > 0) {
                return mo76637n;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int mo76639d;
        Iterator it = this.f27352a.iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof InterfaceC14578d) && (mo76639d = ((InterfaceC14578d) inneractiveAdRenderer).mo76639d()) > 0) {
                return mo76639d;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public InterfaceC14580f getFullscreenRenderer() {
        InterfaceC14580f interfaceC14580f;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC15471s.m76459a(this.mAdSpot);
        Iterator it = AbstractC14472h.f27382a.f27383a.iterator();
        while (true) {
            if (it.hasNext()) {
                InterfaceC14471g interfaceC14471g = (InterfaceC14471g) it.next();
                if (interfaceC14471g.mo76440a(inneractiveAdSpot)) {
                    interfaceC14580f = interfaceC14471g.mo76439b(inneractiveAdSpot);
                    break;
                }
            } else {
                interfaceC14580f = null;
                break;
            }
        }
        this.f27352a.add(interfaceC14580f);
        return interfaceC14580f;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14490Q, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC14478E
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f27352a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof InterfaceC14578d) {
                ((InterfaceC14578d) inneractiveAdRenderer).mo76636p();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC14478E
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC14578d interfaceC14578d;
        Iterator it = new HashSet(this.f27352a).iterator();
        while (true) {
            if (it.hasNext()) {
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof InterfaceC14578d) {
                    interfaceC14578d = (InterfaceC14578d) inneractiveAdRenderer;
                    if (interfaceC14578d.mo76641a(inneractiveAdSpot.getAdContent())) {
                        break;
                    }
                }
            } else {
                interfaceC14578d = null;
                break;
            }
        }
        if (interfaceC14578d != null) {
            interfaceC14578d.mo76642a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C14479F) {
                int i = IAlog.f30554a;
                IAlog.m76526d("%s %s", "AD_REFRESH", ((C14479F) inneractiveAdSpot).f27407h.f27534d.mo77671b());
            }
        } catch (Exception unused) {
        }
        IAlog.m76529a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.m76529a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC15471s.m76459a(this.mAdSpot);
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof InterfaceC14489P)) {
            ((InterfaceC14489P) inneractiveAdSpot).mo77867a(this);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14490Q
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C14326T c14326t = (C14326T) inneractiveAdSpot.getAdContent().f27575d;
        if (c14326t.f27124e != null) {
            return false;
        }
        C14320M c14320m = c14326t.f27122c;
        if (c14320m != null) {
            if (UnitDisplayType.BANNER.equals(c14320m.f27111b) || UnitDisplayType.MRECT.equals(c14320m.f27111b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(c14320m.f27111b)) {
                if (inneractiveAdSpot.getCurrentProcessedRequest() == null || !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen()) {
                    return false;
                }
                return true;
            }
        }
        C14328V c14328v = c14326t.f27125f;
        if (c14328v == null || (!UnitDisplayType.LANDSCAPE.equals(c14328v.f27136j) && !UnitDisplayType.SQUARE.equals(c14328v.f27136j) && !UnitDisplayType.MRECT.equals(c14328v.f27136j))) {
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC14490Q
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(InterfaceC14580f interfaceC14580f) {
        WeakReference<InterfaceC14480G> weakReference;
        IAlog.m76529a("%sremoving full screen ad renderer %s", logPrefix(), interfaceC14580f);
        HashSet hashSet = this.f27352a;
        if (hashSet != null) {
            hashSet.remove(interfaceC14580f);
        }
        if (!this.f27353b) {
            Iterator it = new HashSet(this.f27352a).iterator();
            while (it.hasNext()) {
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof InterfaceC14578d) {
                    ((InterfaceC14578d) inneractiveAdRenderer).mo76635q();
                    if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f27354c != view) {
            IAlog.m76524f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f27354c, view);
        } else {
            this.f27354c = null;
        }
        IAlog.m76529a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m76529a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f27352a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof InterfaceC14578d) {
                InterfaceC14578d interfaceC14578d = (InterfaceC14578d) inneractiveAdRenderer;
                if (interfaceC14578d.mo76640b(view)) {
                    IAlog.m76529a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    interfaceC14578d.mo76634s();
                    this.f27352a.remove(interfaceC14578d);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m76529a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f27355d = i;
            return;
        }
        IAlog.m76529a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
        this.f27355d = 30;
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f27355d = -1;
        }
    }
}
