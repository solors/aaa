package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C19420q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.q1 */
/* loaded from: classes6.dex */
public class C19420q1 extends AbstractC19503w0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: M */
    public final String f48587M;

    /* renamed from: N */
    public final String f48588N;

    /* renamed from: O */
    public boolean f48589O;

    /* renamed from: P */
    public int f48590P;

    /* renamed from: Q */
    public final C19434r1 f48591Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19420q1(@NotNull Context context, @NotNull C18971J placement, @Nullable AbstractC19335k0 abstractC19335k0) {
        super(context, placement, abstractC19335k0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String TAG = C19420q1.class.getSimpleName();
        this.f48587M = TAG;
        this.f48588N = "InMobi";
        this.f48591Q = new C19434r1();
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        placement.m61003l();
        m59782a(context, placement, abstractC19335k0);
    }

    /* renamed from: c */
    public static final void m59942c(C19420q1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
        if (interfaceC18850A4 != null) {
            String TAG = this$0.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61259a(TAG, "start loading html ad");
        }
        this$0.m59639s0();
    }

    /* renamed from: e */
    public static final void m59937e(C19420q1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.m59802Q() == 6) {
                this$0.f48590P++;
                this$0.m59691d((byte) 7);
                InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
                if (interfaceC18850A4 != null) {
                    String TAG = this$0.f48587M;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C18864B4) interfaceC18850A4).m61253d(TAG, "AdUnit " + this$0 + " state - ACTIVE");
                }
                InterfaceC18850A4 interfaceC18850A42 = this$0.f48769j;
                if (interfaceC18850A42 != null) {
                    ((C18864B4) interfaceC18850A42).m61254c(this$0.f48588N, "Successfully displayed banner ad for placement Id : " + this$0.m59810I());
                }
                AbstractC19335k0 m59642r = this$0.m59642r();
                if (m59642r != null) {
                    this$0.m59688d(m59642r);
                }
            } else if (this$0.m59802Q() == 7) {
                this$0.f48590P++;
            }
        } catch (Exception e) {
            InterfaceC18850A4 interfaceC18850A43 = this$0.f48769j;
            if (interfaceC18850A43 != null) {
                String str = this$0.f48587M;
                ((C18864B4) interfaceC18850A43).m61255b(str, AbstractC18886Cc.m61171a(e, AbstractC18851A5.m61272a(str, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    /* renamed from: f */
    public static final void m59935f(C19420q1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.m59802Q() == 4) {
                this$0.m59691d((byte) 6);
                InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
                if (interfaceC18850A4 != null) {
                    String TAG = this$0.f48587M;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C18864B4) interfaceC18850A4).m61253d(TAG, "AdUnit " + this$0 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            InterfaceC18850A4 interfaceC18850A42 = this$0.f48769j;
            if (interfaceC18850A42 != null) {
                String str = this$0.f48587M;
                ((C18864B4) interfaceC18850A42).m61255b(str, AbstractC18886Cc.m61171a(e, AbstractC18851A5.m61272a(str, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    /* renamed from: g */
    public static final void m59934g(C19420q1 this$0) {
        LinkedList<C19292h> m60415f;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m59707b0()) {
            this$0.m59784a(System.currentTimeMillis());
            C19223c0 m59628y = this$0.m59628y();
            if (m59628y != null && (m60415f = m59628y.m60415f()) != null) {
                int i = 0;
                for (Object obj : m60415f) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C37563v.m17156w();
                    }
                    C19292h c19292h = (C19292h) obj;
                    this$0.m59818B().add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        this$0.m59639s0();
    }

    /* renamed from: C0 */
    public boolean mo59954C0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "canProceedToLoad ", this));
        }
        if (mo59674f0()) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                String TAG = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A42).m61255b(TAG, "Some of the dependency libraries for Banner not found");
            }
            m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        } else if (1 != m59802Q() && 2 != m59802Q()) {
            if (7 == m59802Q()) {
                m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
                InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
                if (interfaceC18850A43 != null) {
                    String str2 = this.f48587M;
                    StringBuilder m61272a = AbstractC18851A5.m61272a(str2, "TAG", AbstractC18997Kb.f47408j);
                    m61272a.append(m59810I().m61003l());
                    ((C18864B4) interfaceC18850A43).m61255b(str2, m61272a.toString());
                }
                return false;
            }
            InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
            if (interfaceC18850A44 != null) {
                String str3 = this.f48588N;
                ((C18864B4) interfaceC18850A44).m61254c(str3, "Fetching a Banner ad for placement id: " + m59810I());
            }
            m59679e0();
            return true;
        } else {
            AbstractC19187Z5.m60514a((byte) 1, this.f48588N, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
            if (interfaceC18850A45 != null) {
                String TAG2 = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) interfaceC18850A45).m61255b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == m59802Q()) {
                m59735a((short) 2008);
            } else {
                m59735a((short) 2011);
            }
            return false;
        }
    }

    /* renamed from: D0 */
    public final boolean m59953D0() {
        if (m59802Q() == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    public final void m59952E0() {
        AbstractC19347kc viewableAd;
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "onPause ", this));
        }
        byte m59802Q = m59802Q();
        if (m59802Q == 4 || m59802Q == 6 || m59802Q == 7) {
            InterfaceC19432r m59658k = m59658k();
            Context m59638t = m59638t();
            if (m59658k != null && m59638t != null && (viewableAd = m59658k.getViewableAd()) != null) {
                viewableAd.mo60000a(m59638t, (byte) 1);
            }
        }
    }

    /* renamed from: F0 */
    public final void m59951F0() {
        AbstractC19347kc viewableAd;
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "onResume ", this));
        }
        byte m59802Q = m59802Q();
        if (m59802Q == 4 || m59802Q == 6 || m59802Q == 7) {
            InterfaceC19432r m59658k = m59658k();
            Context m59638t = m59638t();
            if (m59658k != null && m59638t != null && (viewableAd = m59658k.getViewableAd()) != null) {
                viewableAd.mo60000a(m59638t, (byte) 0);
            }
        }
    }

    /* renamed from: G0 */
    public final void m59950G0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context m59638t = m59638t();
        if (m59638t != null) {
            C18954Ha.m61082a(m59638t, this);
        }
    }

    /* renamed from: H0 */
    public final void m59949H0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String TAG = this.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61259a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (m59647o0()) {
                return;
            }
            C19531y0 m59640s = m59640s();
            m59640s.getClass();
            m59640s.f48917g = SystemClock.elapsedRealtime();
            m59685d0();
            Handler m59815D = m59815D();
            if (m59815D != null) {
                m59815D.post(new Runnable() { // from class: o3.e6
                    {
                        C19420q1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19420q1.m59934g(C19420q1.this);
                    }
                });
            }
        } catch (IllegalStateException e) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                String TAG2 = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) interfaceC18850A42).m61258a(TAG2, "Exception while loading ad.", e);
            }
            m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    /* renamed from: I0 */
    public final void m59948I0() {
        Activity activity;
        Application application;
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context m59638t = m59638t();
        if (m59638t instanceof Activity) {
            activity = (Activity) m59638t;
        } else {
            activity = null;
        }
        if (activity != null && (application = activity.getApplication()) != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: J */
    public final byte mo59809J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: c0 */
    public void mo59692c0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "load ", this));
        }
        if (mo59954C0()) {
            super.mo59692c0();
        }
    }

    /* renamed from: d */
    public final void m59939d(boolean z) {
        InterfaceC18850A4 interfaceC18850A4;
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A42).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "load ", this));
        }
        if (z && (interfaceC18850A4 = this.f48769j) != null) {
            String str2 = this.f48588N;
            ((C18864B4) interfaceC18850A4).m61254c(str2, "Initiating Banner refresh for placement id: " + m59810I());
        }
        this.f48589O = z;
        mo59692c0();
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: f0 */
    public boolean mo59674f0() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "missingPrerequisitesForAd ", this));
            return false;
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.AbstractC19126U9
    /* renamed from: i */
    public void mo59663i(@NotNull GestureDetector$OnGestureListenerC19100S9 renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.mo59663i(renderView);
        Handler m59815D = m59815D();
        if (m59815D != null) {
            m59815D.post(new Runnable() { // from class: o3.d6
                {
                    C19420q1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19420q1.m59935f(C19420q1.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    @UiThread
    /* renamed from: j0 */
    public void mo59659j0() {
        if (m59645p0()) {
            InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
            if (interfaceC18850A4 != null) {
                String TAG = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A4).m61259a(TAG, "renderAd without internet check");
            }
            m59949H0();
            return;
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            String TAG2 = this.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C18864B4) interfaceC18850A42).m61259a(TAG2, "renderAd");
        }
        m59738a(new C19392o1(this), new C19406p1(this));
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: l */
    public final void mo59654l(GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9) {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.mo59654l(gestureDetector$OnGestureListenerC19100S9);
        if (m59707b0() && this.f48766g.indexOf(gestureDetector$OnGestureListenerC19100S9) > 0 && m59802Q() == 6) {
            m59727b((byte) 1);
            GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S92 = (GestureDetector$OnGestureListenerC19100S9) this.f48766g.get(m59820A());
            if (gestureDetector$OnGestureListenerC19100S92 != null) {
                gestureDetector$OnGestureListenerC19100S92.m60707a(true);
            }
        } else if (m59802Q() == 2) {
            m59727b((byte) 1);
            m59691d((byte) 4);
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                String TAG = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A42).m61253d(TAG, "AdUnit " + this + " state - READY");
            }
            C19531y0 m59640s = m59640s();
            m59640s.getClass();
            m59640s.f48919i = SystemClock.elapsedRealtime();
            m59635u0();
            m59625z0();
            InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
            if (interfaceC18850A43 != null) {
                String str2 = this.f48588N;
                ((C18864B4) interfaceC18850A43).m61254c(str2, "Successfully loaded Banner ad markup in the WebView for placement id: " + m59810I());
            }
            AbstractC19335k0 m59642r = m59642r();
            if (m59642r != null) {
                m59675f(m59642r);
            } else {
                InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
                if (interfaceC18850A44 != null) {
                    String TAG2 = this.f48587M;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    ((C18864B4) interfaceC18850A44).m61255b(TAG2, "AdUnit listener is null");
                }
            }
            m59664i();
        } else {
            InterfaceC18850A4 interfaceC18850A45 = this.f48769j;
            if (interfaceC18850A45 != null) {
                String str3 = this.f48587M;
                StringBuilder m61272a = AbstractC18851A5.m61272a(str3, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ");
                m61272a.append((int) m59802Q());
                ((C18864B4) interfaceC18850A45).m61259a(str3, m61272a.toString());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: o */
    public final HashMap mo59648o() {
        String str;
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str2 = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str2, AbstractC19378n1.m60015a(str2, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap hashMap = new HashMap();
        if (this.f48589O) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("u-rt", str);
        hashMap.put("mk-ad-slot", m59810I().m61021a());
        return hashMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context m59638t = m59638t();
        if (Intrinsics.m17075f(m59638t, activity)) {
            Intrinsics.m17073h(m59638t, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) m59638t).getApplication().unregisterActivityLifecycleCallbacks(this);
            mo59673g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityStarted ", this));
        }
        if (Intrinsics.m17075f(m59638t(), activity)) {
            m59951F0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onActivityStopped ", this));
        }
        if (Intrinsics.m17075f(m59638t(), activity)) {
            m59952E0();
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    @NotNull
    /* renamed from: q */
    public String mo59644q() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC19503w0
    @Nullable
    /* renamed from: w */
    public GestureDetector$OnGestureListenerC19100S9 mo59632w() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "htmlAdContainer getter ", this));
        }
        GestureDetector$OnGestureListenerC19100S9 mo59632w = super.mo59632w();
        if (m59810I().m60999p() && mo59632w != null) {
            mo59632w.mo59919e();
        }
        return mo59632w;
    }

    @Override // com.inmobi.media.AbstractC19503w0
    @UiThread
    /* renamed from: a */
    public void mo59734a(boolean z, @NotNull InMobiAdRequestStatus status) {
        AbstractC19335k0 m59642r;
        Intrinsics.checkNotNullParameter(status, "status");
        super.mo59734a(z, status);
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            String str2 = this.f48588N;
            ((C18864B4) interfaceC18850A42).m61254c(str2, "Banner ad fetch successful for placement id: " + m59810I());
        }
        if (m59802Q() != 2 || (m59642r = m59642r()) == null) {
            return;
        }
        m59680e(m59642r);
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC18985K
    /* renamed from: b */
    public void mo59728b() {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "closeAll ", this));
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: b */
    public final void mo59721b(GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9, short s) {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.mo59721b(gestureDetector$OnGestureListenerC19100S9, s);
        if (m59707b0()) {
            int indexOf = this.f48766g.indexOf(gestureDetector$OnGestureListenerC19100S9);
            AbstractC19503w0.m59755a(this, indexOf, false, 2, null);
            if (indexOf > 0 && m59802Q() == 6) {
                m59727b((byte) 1);
                GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S92 = (GestureDetector$OnGestureListenerC19100S9) this.f48766g.get(m59820A());
                if (gestureDetector$OnGestureListenerC19100S92 != null) {
                    gestureDetector$OnGestureListenerC19100S92.m60707a(false);
                }
            }
        }
        if (m59802Q() == 2) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                String str2 = this.f48588N;
                ((C18864B4) interfaceC18850A42).m61254c(str2, "Failed to load the Banner markup in the WebView for placement id: " + m59810I());
            }
            m59723b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0
    /* renamed from: g */
    public void mo59673g() {
        this.f48591Q.f48607a = false;
        super.mo59673g();
    }

    @Override // com.inmobi.media.AbstractC19126U9
    /* renamed from: d */
    public synchronized void mo59941d(@NotNull GestureDetector$OnGestureListenerC19100S9 renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "onAdScreenDismissed ", this));
        }
        super.mo59941d(renderView);
        Handler m59815D = m59815D();
        if (m59815D != null) {
            m59815D.post(new Runnable() { // from class: o3.c6
                {
                    C19420q1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19420q1.m59940d(C19420q1.this);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m59945a(C19420q1 this$0, GestureDetector$OnGestureListenerC19100S9 renderView, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(renderView, "$renderView");
        int indexOf = this$0.f48766g.indexOf(renderView);
        try {
            AbstractC19335k0 m59642r = this$0.m59642r();
            InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
            if (interfaceC18850A4 != null) {
                String TAG = this$0.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A4).m61254c(TAG, "callback onShowNextPodAd");
            }
            if (m59642r != null) {
                m59642r.mo59846a(i, indexOf, renderView);
            }
        } catch (Exception unused) {
            this$0.m59725b(indexOf, false);
            this$0.m59677f(indexOf);
        }
    }

    /* renamed from: d */
    public static final void m59940d(C19420q1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.m59802Q() == 7) {
                int i = this$0.f48590P - 1;
                this$0.f48590P = i;
                if (i == 0) {
                    this$0.m59691d((byte) 6);
                    AbstractC19335k0 m59642r = this$0.m59642r();
                    if (m59642r != null) {
                        m59642r.mo59837b();
                    }
                }
            }
        } catch (Exception e) {
            InterfaceC18850A4 interfaceC18850A4 = this$0.f48769j;
            if (interfaceC18850A4 != null) {
                String str = this$0.f48587M;
                ((C18864B4) interfaceC18850A4).m61255b(str, AbstractC18886Cc.m61171a(e, AbstractC18851A5.m61272a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.AbstractC19126U9
    /* renamed from: e */
    public synchronized void mo59938e(@NotNull GestureDetector$OnGestureListenerC19100S9 renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "onAdScreenDisplayed ", this));
        }
        super.mo59938e(renderView);
        Handler m59815D = m59815D();
        if (m59815D != null) {
            m59815D.post(new Runnable() { // from class: o3.b6
                {
                    C19420q1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19420q1.m59937e(C19420q1.this);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC18985K
    @WorkerThread
    /* renamed from: a */
    public void mo59788a(int i, @NotNull GestureDetector$OnGestureListenerC19100S9 renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61259a(str, AbstractC19378n1.m60015a(str, "TAG", "loadPodAd ", this));
        }
        if (m59818B().contains(Integer.valueOf(i)) && i > this.f48766g.indexOf(renderView)) {
            m59672g(i);
            Handler m59815D = m59815D();
            if (m59815D != null) {
                m59815D.post(new Runnable() { // from class: o3.a6
                    {
                        C19420q1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19420q1.m59942c(C19420q1.this);
                    }
                });
                return;
            }
            return;
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
        if (interfaceC18850A42 != null) {
            String TAG = this.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A42).m61259a(TAG, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f48766g;
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = (GestureDetector$OnGestureListenerC19100S9) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetector$OnGestureListenerC19100S9 != null) {
            gestureDetector$OnGestureListenerC19100S9.m60707a(false);
        }
    }

    /* renamed from: e */
    public final void m59936e(@Nullable String str) {
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String str2 = this.f48587M;
            ((C18864B4) interfaceC18850A4).m61254c(str2, AbstractC19378n1.m60015a(str2, "TAG", "setAdSize ", this));
        }
        C18971J m59810I = m59810I();
        Intrinsics.m17074g(str);
        m59810I.m61018a(str);
    }

    @Override // com.inmobi.media.AbstractC19503w0, com.inmobi.media.InterfaceC18985K
    @WorkerThread
    /* renamed from: a */
    public void mo59787a(final int i, @NotNull final GestureDetector$OnGestureListenerC19100S9 renderView, @Nullable Context context) {
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        InterfaceC18850A4 interfaceC18850A4 = this.f48769j;
        if (interfaceC18850A4 != null) {
            String TAG = this.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61259a(TAG, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!m59707b0()) {
            InterfaceC18850A4 interfaceC18850A42 = this.f48769j;
            if (interfaceC18850A42 != null) {
                String TAG2 = this.f48587M;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) interfaceC18850A42).m61255b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f48766g;
            GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S92 = (GestureDetector$OnGestureListenerC19100S9) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetector$OnGestureListenerC19100S92 != null) {
                gestureDetector$OnGestureListenerC19100S92.m60703b(false);
                return;
            }
            return;
        }
        InterfaceC18850A4 interfaceC18850A43 = this.f48769j;
        if (interfaceC18850A43 != null) {
            String str = this.f48587M;
            ((C18864B4) interfaceC18850A43).m61254c(str, AbstractC19378n1.m60015a(str, "TAG", "isInValidShowPodIndex ", this));
        }
        if (m59818B().contains(Integer.valueOf(i)) && i > this.f48766g.indexOf(renderView) && this.f48766g.get(i) != null && ((gestureDetector$OnGestureListenerC19100S9 = (GestureDetector$OnGestureListenerC19100S9) this.f48766g.get(i)) == null || gestureDetector$OnGestureListenerC19100S9.f47773p0)) {
            super.mo59787a(i, renderView, context);
            Handler m59815D = m59815D();
            if (m59815D != null) {
                m59815D.post(new Runnable() { // from class: o3.z5
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19420q1.m59945a(C19420q1.this, renderView, i);
                    }
                });
                return;
            }
            return;
        }
        InterfaceC18850A4 interfaceC18850A44 = this.f48769j;
        if (interfaceC18850A44 != null) {
            String TAG3 = this.f48587M;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((C18864B4) interfaceC18850A44).m61255b(TAG3, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.f48766g;
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S93 = (GestureDetector$OnGestureListenerC19100S9) arrayList2.get(arrayList2.indexOf(renderView));
        if (gestureDetector$OnGestureListenerC19100S93 != null) {
            gestureDetector$OnGestureListenerC19100S93.m60703b(false);
        }
    }

    @Override // com.inmobi.media.AbstractC19126U9
    /* renamed from: a */
    public void mo59947a(@NotNull EnumC19294h1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC19335k0 m59642r = m59642r();
        if (m59642r != null) {
            m59642r.mo60157a(audioStatusInternal);
        }
        C19434r1 c19434r1 = this.f48591Q;
        c19434r1.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c19434r1.f48607a && audioStatusInternal == EnumC19294h1.f48279e) {
            c19434r1.f48607a = true;
            C19507w4 c19507w4 = C19507w4.f48817c;
            c19507w4.f48786a = System.currentTimeMillis();
            c19507w4.f48787b++;
        }
    }

    @Override // com.inmobi.media.AbstractC19126U9
    /* renamed from: a */
    public void mo59944a(boolean z) {
        C19507w4 c19507w4 = C19507w4.f48817c;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = m59823a.f48820a.getInt("user_mute_count", 0);
        m59823a.m59620a("user_mute_count", z ? Math.max(0, i - 1) : i + 1);
    }
}
