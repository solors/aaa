package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C19136V6;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.V6 */
/* loaded from: classes6.dex */
public final class C19136V6 extends AbstractC19503w0 {

    /* renamed from: P */
    public static final /* synthetic */ int f47856P = 0;

    /* renamed from: M */
    public WeakReference f47857M;

    /* renamed from: N */
    public boolean f47858N;

    /* renamed from: O */
    public int f47859O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19136V6(Context context, C18971J placement, AbstractC19335k0 abstractC19335k0) {
        super(context, placement, abstractC19335k0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullExpressionValue("V6", "TAG");
        placement.m61003l();
        m59782a(context, placement, abstractC19335k0);
    }

    /* renamed from: C0 */
    public final void m60635C0() {
        try {
            super.mo59673g();
        } catch (Exception e) {
            InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
            if (interfaceC18850A4 != null) {
                ((C18864B4) interfaceC18850A4).m61255b("V6", AbstractC18886Cc.m61171a(e, AbstractC18851A5.m61272a("V6", "TAG", "SDK encountered unexpected error in destroying native ad unit; ")));
            }
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    /* renamed from: D0 */
    public final void m60634D0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61259a("V6", "renderAdPostInternetCheck");
        }
        mo59656k0();
        try {
            if (m59647o0()) {
                InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                if (interfaceC18850A42 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A42).m61255b("V6", "render ad is blocked");
                    return;
                }
                return;
            }
            C19531y0 m59640s = m59640s();
            m59640s.getClass();
            m59640s.f48917g = SystemClock.elapsedRealtime();
            m59685d0();
        } catch (IllegalStateException e) {
            InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
            if (interfaceC18850A43 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A43).m61258a("V6", "Exception while loading ad.", e);
            }
            m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: J */
    public final byte mo59809J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC18985K
    /* renamed from: a */
    public final void mo59788a(int i, GestureDetector$OnGestureListenerC19100S9 renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC18985K
    /* renamed from: b */
    public final void mo59728b() {
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: c0 */
    public final void mo59692c0() {
        if (m59793Z()) {
            InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
            if (interfaceC18850A4 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A4).m61255b("V6", "Ad unit is already destroyed! Returning ...");
                return;
            }
            return;
        }
        AbstractC19335k0 m59642r = m59642r();
        if (mo59674f0()) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A42).m61255b("V6", "Some of the dependency libraries for InMobiNative not found");
            }
            if (m59642r != null) {
                m59642r.mo60155a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
        } else if (1 != m59802Q() && 2 != m59802Q()) {
            InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
            if (interfaceC18850A43 != null) {
                StringBuilder m61272a = AbstractC18851A5.m61272a("V6", "TAG", "Fetching a Native ad for placement id: ");
                m61272a.append(m59810I());
                ((C18864B4) interfaceC18850A43).m61259a("V6", m61272a.toString());
            }
            if (4 == m59802Q()) {
                if (!m59796W()) {
                    InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                    if (interfaceC18850A44 != null) {
                        Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                        ((C18864B4) interfaceC18850A44).m61259a("V6", "An ad is ready with the ad unit. Signaling ad load success ...");
                    }
                    if (m59642r != null) {
                        Context m59638t = m59638t();
                        InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
                        if (interfaceC18850A45 != null) {
                            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                            ((C18864B4) interfaceC18850A45).m61254c("V6", "setContainerContext");
                        }
                        InterfaceC19432r m59658k = m59658k();
                        if (m59658k instanceof C19020M6) {
                            ((C19020M6) m59658k).m60901a(m59638t);
                        }
                        InterfaceC18850A4 interfaceC18850A46 = this.f48769j;
                        if (interfaceC18850A46 != null) {
                            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                            ((C18864B4) interfaceC18850A46).m61259a("V6", "callback - onFetchSuccess");
                        }
                        InterfaceC18850A4 interfaceC18850A47 = this.f48769j;
                        if (interfaceC18850A47 != null) {
                            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                            ((C18864B4) interfaceC18850A47).m61259a("V6", "callback - onLoadSuccess");
                        }
                        m59680e(m59642r);
                        m59675f(m59642r);
                        return;
                    }
                    return;
                }
                InterfaceC18850A4 interfaceC18850A48 = this.f48769j;
                if (interfaceC18850A48 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A48).m61255b("V6", "ad is expired - destroy");
                }
                m60635C0();
            }
            m59679e0();
            super.mo59692c0();
        } else {
            InterfaceC18850A4 interfaceC18850A49 = this.f48769j;
            if (interfaceC18850A49 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A49).m61255b("V6", "An ad load is already in progress");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: j0 */
    public final void mo59659j0() {
        if (m59645p0()) {
            InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
            if (interfaceC18850A4 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A4).m61259a("V6", "renderAd without internet check");
            }
            m60634D0();
            return;
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A42).m61259a("V6", "renderAd");
        }
        m59738a(new C19110T6(this), new C19123U6(this));
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: o */
    public final HashMap mo59648o() {
        HashMap hashMap = new HashMap();
        hashMap.put("a-parentViewWidth", String.valueOf(AbstractC19338k3.m60127d().f48459a));
        hashMap.put("a-productVersion", "NS-1.0.0-20160411");
        hashMap.put("trackerType", "url_ping");
        return hashMap;
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: q */
    public final String mo59644q() {
        return "native";
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: r0 */
    public final void mo59641r0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "signalSuccess");
        }
        C19474u m59634v = m59634v();
        int hashCode = hashCode();
        C19538y7 c19538y7 = new C19538y7(this);
        m59634v.getClass();
        C19474u.m59893a(hashCode, c19538y7);
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: a */
    public final void mo59783a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.mo59783a(context);
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "setContainerContext");
        }
        InterfaceC19432r m59658k = m59658k();
        if (m59658k instanceof C19020M6) {
            ((C19020M6) m59658k).m60901a(context);
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: b */
    public final void mo59718b(AbstractC19335k0 abstractC19335k0) {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "handleAdScreenDisplayed");
        }
        if (m59802Q() == 4) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A42).m61253d("V6", "AdUnit " + this + " state change - RENDERED");
            }
            m59691d((byte) 6);
        } else if (m59802Q() == 6) {
            this.f47859O++;
        }
        InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
        if (interfaceC18850A43 != null) {
            ((C18864B4) interfaceC18850A43).m61259a("InMobi", "Successfully displayed fullscreen for placement id: " + m59810I());
        }
        if (this.f47859O == 0) {
            if (abstractC19335k0 != null) {
                InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                if (interfaceC18850A44 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A44).m61259a("V6", "callback - onAdDisplayed");
                }
                m59688d(abstractC19335k0);
                return;
            }
            InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
            if (interfaceC18850A45 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A45).m61255b("V6", "listener is null. cannot give AdDisplayed callback");
            }
        }
    }

    /* renamed from: a */
    public final View m60633a(View view, ViewGroup parent, int i) {
        View view2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "getAdView");
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!C19017M3.f47463a.m60918a()) {
                m60635C0();
                InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                if (interfaceC18850A42 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A42).m61255b("V6", "dropping because of GDPR");
                }
                return null;
            } else if (m59796W()) {
                InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
                if (interfaceC18850A43 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A43).m61259a("V6", "Ad has expired.");
                }
                m60635C0();
                return null;
            } else if (m59802Q() != 4 && m59802Q() != 6) {
                InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                if (interfaceC18850A44 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A44).m61255b("V6", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                }
                AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
                if (interfaceC18850A45 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A45).m61255b("V6", "Ad Load is not complete");
                }
                WeakReference weakReference = this.f47857M;
                if (weakReference == null || (view2 = (View) weakReference.get()) == null) {
                    return null;
                }
                View view3 = new View(C18954Ha.m61068d());
                view3.setLayoutParams(view2.getLayoutParams());
                return view3;
            } else {
                C19020M6 m59812G = m59812G();
                if (m59812G != null) {
                    boolean z = this.f47858N;
                    InterfaceC18850A4 interfaceC18850A46 = m59812G.f47498j;
                    if (interfaceC18850A46 != null) {
                        String TAG = m59812G.f47500l;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        ((C18864B4) interfaceC18850A46).m61254c(TAG, "showOnLockScreen - " + z);
                    }
                    m59812G.f47472C = z;
                    m59812G.f47470A = i;
                    final AbstractC19347kc viewableAd = m59812G.getViewableAd();
                    r4 = viewableAd != null ? viewableAd.mo59998a(view, parent, true) : null;
                    this.f47857M = new WeakReference(r4);
                    Handler m59815D = m59815D();
                    if (m59815D != null) {
                        m59815D.post(new Runnable() { // from class: o3.h2
                            {
                                C19136V6.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C19136V6.m60632a(C19136V6.this, viewableAd);
                            }
                        });
                    }
                }
                return r4;
            }
        }
        InterfaceC18850A4 interfaceC18850A47 = this.f48769j;
        if (interfaceC18850A47 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A47).m61255b("V6", "getPrimaryView called on background thread");
        }
        m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (short) 2150);
        return null;
    }

    /* renamed from: a */
    public static final void m60632a(C19136V6 this$0, AbstractC19347kc abstractC19347kc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61259a("V6", "start tracking for impression");
        }
        if (abstractC19347kc != null) {
            abstractC19347kc.mo59996a((HashMap) null);
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: a */
    public final void mo59767a(C19223c0 adSet) {
        Intrinsics.checkNotNullParameter(adSet, "adSet");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "handleAdFetchSuccessful");
        }
        if (m59802Q() == 1) {
            m59681e(adSet);
        }
        if (!Intrinsics.m17075f("html", m59814E()) && !Intrinsics.m17075f("htmlUrl", m59814E()) && !Intrinsics.m17075f("unknown", m59814E())) {
            super.mo59767a(adSet);
            return;
        }
        m59774a(m59810I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 57);
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A42).m61255b("V6", "invalid markup. fetch failed");
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: a */
    public final void mo59761a(AbstractC19335k0 abstractC19335k0) {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "handleAdScreenDismissed");
        }
        if (m59802Q() == 6) {
            int i = this.f47859O;
            if (i > 0) {
                this.f47859O = i - 1;
            } else {
                InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                if (interfaceC18850A42 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A42).m61253d("V6", "AdUnit " + this + " state - READY");
                }
                m59691d((byte) 4);
            }
        }
        InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
        if (interfaceC18850A43 != null) {
            ((C18864B4) interfaceC18850A43).m61259a("InMobi", "Successfully dismissed fullscreen for placement id: " + m59810I());
        }
        if (this.f47859O == 0 && m59802Q() == 4) {
            if (abstractC19335k0 != null) {
                InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                if (interfaceC18850A44 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A44).m61259a("V6", "callback - onAdDismissed");
                }
                abstractC19335k0.mo59837b();
            } else {
                InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
                if (interfaceC18850A45 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A45).m61255b("V6", "Listener was garbage collected. Unable to give callback");
                }
            }
            InterfaceC18850A4 interfaceC18850A46 = this.f48769j;
            if (interfaceC18850A46 != null) {
                ((C18864B4) interfaceC18850A46).m61260a();
            }
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: a */
    public final void mo59773a(C18971J placement, boolean z) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "handleAssetAvailabilityChanged");
        }
        super.mo59773a(placement, z);
        if (!z) {
            if (Intrinsics.m17075f(m59810I(), placement)) {
                if (2 == m59802Q() || 4 == m59802Q()) {
                    m59691d((byte) 0);
                    InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                    if (interfaceC18850A42 != null) {
                        Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                        ((C18864B4) interfaceC18850A42).m61253d("V6", "AdUnit " + this + " state - CREATED");
                    }
                    AbstractC19335k0 m59642r = m59642r();
                    if (m59642r != null) {
                        m59642r.mo60155a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                    }
                }
            }
        } else if (!Intrinsics.m17075f(m59810I(), placement) || 2 != m59802Q() || m59642r() == null || m59638t() == null) {
        } else {
            if (m59729a0()) {
                m59693c(true);
                m59678f();
                return;
            }
            mo59641r0();
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: a */
    public final void mo59734a(boolean z, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "onDidParseAfterFetch");
        }
        super.mo59734a(z, status);
        if (m59802Q() == 2) {
            AbstractC19335k0 m59642r = m59642r();
            if (m59642r != null) {
                InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                if (interfaceC18850A42 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A42).m61259a("V6", "callback - onFetchSuccess");
                }
                m59680e(m59642r);
                return;
            }
            return;
        }
        InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
        if (interfaceC18850A43 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A43).m61255b("V6", "invalid state - ignore parse callback");
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC19291gc
    /* renamed from: a */
    public final void mo59763a(C19292h ad2, boolean z, short s) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            Intrinsics.checkNotNullExpressionValue("V6", "TAG");
            ((C18864B4) interfaceC18850A4).m61254c("V6", "onVastProcessCompleted");
        }
        try {
            if (!z) {
                InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
                if (interfaceC18850A42 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A42).m61255b("V6", "VAST processing failed - " + ((int) s));
                }
                m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
                return;
            }
            try {
                super.mo59763a(ad2, z, s);
            } catch (IllegalStateException e) {
                InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
                if (interfaceC18850A43 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A43).m61255b("V6", "Exception while onVastProcessCompleted : " + e.getMessage());
                }
            }
            C19292h m59652m = m59652m();
            if (m59652m == null) {
                InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                if (interfaceC18850A44 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A44).m61255b("V6", "current ad is null. failing");
                }
                m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
                return;
            }
            if (m59799T() == 0) {
                if (!m59652m.m60319G()) {
                    InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
                    if (interfaceC18850A45 != null) {
                        Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                        ((C18864B4) interfaceC18850A45).m61254c("V6", "start OMID session for HTML ad");
                    }
                    m59733a(true, (GestureDetector$OnGestureListenerC19100S9) null);
                }
            } else {
                InterfaceC18850A4 interfaceC18850A46 = this.f48769j;
                if (interfaceC18850A46 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A46).m61254c("V6", "start OMID session for current AD");
                }
                m59766a(m59652m);
            }
            if (m59652m.m60319G()) {
                m59709b(true);
                InterfaceC18850A4 interfaceC18850A47 = this.f48769j;
                if (interfaceC18850A47 != null) {
                    Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                    ((C18864B4) interfaceC18850A47).m61254c("V6", "handleInterActive");
                }
                m59797V();
            }
        } catch (Exception e2) {
            InterfaceC18850A4 interfaceC18850A48 = this.f48769j;
            if (interfaceC18850A48 != null) {
                Intrinsics.checkNotNullExpressionValue("V6", "TAG");
                ((C18864B4) interfaceC18850A48).m61258a("V6", "Exception while loading ad.", e2);
            }
            m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 13);
        }
    }
}
