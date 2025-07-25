package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.annotation.UiThread;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C19490v1;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.inmobi.media.v1 */
/* loaded from: classes6.dex */
public final class C19490v1 extends AbstractC18997Kb {
    @NotNull

    /* renamed from: o */
    private final String f48733o = "InMobi";

    /* renamed from: p */
    private final String f48734p = C19490v1.class.getSimpleName();
    @Nullable

    /* renamed from: q */
    private C19420q1 f48735q;
    @Nullable

    /* renamed from: r */
    private C19420q1 f48736r;
    @Nullable

    /* renamed from: s */
    private C19420q1 f48737s;
    @Nullable

    /* renamed from: t */
    private C19420q1 f48738t;

    /* renamed from: I */
    private final boolean m59850I() {
        Byte b;
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 != null) {
            b = Byte.valueOf(c19420q1.m59802Q());
        } else {
            b = null;
        }
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String TAG = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p).m61254c(TAG, "shouldUseForegroundUnit " + this + " state - " + b);
        }
        if ((b != null && b.byteValue() == 4) || ((b != null && b.byteValue() == 7) || (b != null && b.byteValue() == 6))) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final int m59858A() {
        AdConfig m59661j;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "defaultRefreshInterval ", this));
        }
        AbstractC19503w0 mo59831j = mo59831j();
        if (mo59831j != null && (m59661j = mo59831j.m59661j()) != null) {
            return m59661j.getDefaultRefreshInterval();
        }
        return -1;
    }

    /* renamed from: B */
    public final boolean m59857B() {
        String TAG = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.m17075f(this.f48737s, this.f48735q);
        String TAG2 = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Intrinsics.m17075f(this.f48738t, this.f48735q);
        String TAG3 = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        Intrinsics.m17075f(this.f48737s, this.f48736r);
        String TAG4 = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Intrinsics.m17075f(this.f48738t, this.f48736r);
        String TAG5 = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null) {
            c19420q1.m59953D0();
        }
        C19420q1 c19420q12 = this.f48735q;
        if (c19420q12 != null) {
            c19420q12.m59802Q();
        }
        Objects.toString(this.f48735q);
        String TAG6 = this.f48734p;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        C19420q1 c19420q13 = this.f48736r;
        if (c19420q13 != null) {
            c19420q13.m59953D0();
        }
        C19420q1 c19420q14 = this.f48736r;
        if (c19420q14 != null) {
            c19420q14.m59802Q();
        }
        Objects.toString(this.f48736r);
        C19420q1 c19420q15 = this.f48737s;
        if (c19420q15 != null) {
            return c19420q15.m59953D0();
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m59856C() {
        C19292h m59652m;
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 != null && (m59652m = c19420q1.m59652m()) != null) {
            return Intrinsics.m17075f(m59652m.m60291p(), "audio");
        }
        return false;
    }

    /* renamed from: D */
    public boolean m59855D() {
        if (this.f48735q != null && this.f48736r != null) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void m59854E() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "pause ", this));
        }
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 != null) {
            c19420q1.m59952E0();
        }
    }

    /* renamed from: F */
    public final void m59853F() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null) {
            c19420q1.m59950G0();
        }
        C19420q1 c19420q12 = this.f48736r;
        if (c19420q12 != null) {
            c19420q12.m59950G0();
        }
    }

    /* renamed from: G */
    public final void m59852G() throws IllegalStateException {
        C19420q1 c19420q1;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "render ", this));
        }
        C19420q1 c19420q12 = this.f48738t;
        if (c19420q12 != null) {
            if (m60958a(this.f48733o, c19420q12.m59810I().toString())) {
                if (m60937v() && (c19420q1 = this.f48738t) != null) {
                    c19420q1.m59683e((byte) 1);
                }
                m60971a((byte) 8);
                c19420q12.mo59659j0();
                return;
            }
            return;
        }
        throw new IllegalStateException(AbstractC18997Kb.f47411m.toString());
    }

    /* renamed from: H */
    public final void m59851H() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "resume ", this));
        }
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 != null) {
            c19420q1.m59951F0();
        }
    }

    /* renamed from: J */
    public final void m59849J() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "swapAdUnits ", this));
        }
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 == null) {
            this.f48737s = this.f48735q;
            this.f48738t = this.f48736r;
        } else if (Intrinsics.m17075f(c19420q1, this.f48735q)) {
            this.f48737s = this.f48736r;
            this.f48738t = this.f48735q;
        } else if (Intrinsics.m17075f(c19420q1, this.f48736r)) {
            this.f48737s = this.f48735q;
            this.f48738t = this.f48736r;
        }
    }

    /* renamed from: K */
    public final void m59848K() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null) {
            c19420q1.m59948I0();
        }
        C19420q1 c19420q12 = this.f48736r;
        if (c19420q12 != null) {
            c19420q12.m59948I0();
        }
    }

    /* renamed from: a */
    public final void m59844a(@NotNull Context context, @NotNull C19456s9 pubSettings, @NotNull String adSize, @NotNull String logType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(logType, "logType");
        Intrinsics.checkNotNullExpressionValue(this.f48734p, "TAG");
        C18943H c18943h = new C18943H("banner");
        Intrinsics.checkNotNullParameter(context, "context");
        C18971J m61101a = c18943h.m61091d(context instanceof Activity ? "activity" : "others").m61100a(pubSettings.f48663a).m61092c(pubSettings.f48664b).m61097a(pubSettings.f48665c).m61098a(adSize).m61096a(pubSettings.f48666d).m61090e(pubSettings.f48667e).m61094b(pubSettings.f48668f).m61101a();
        String str = pubSettings.f48667e;
        if (str != null) {
            InterfaceC18850A4 m60943p = m60943p();
            if (m60943p != null) {
                ((C18864B4) m60943p).m61260a();
            }
            m60969a(C18911E9.m61129a(logType, str, false));
        }
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null && this.f48736r != null) {
            c19420q1.m59782a(context, m61101a, this);
            C19420q1 c19420q12 = this.f48736r;
            if (c19420q12 != null) {
                c19420q12.m59782a(context, m61101a, this);
            }
        } else {
            this.f48735q = new C19420q1(context, m61101a, this);
            C19420q1 c19420q13 = new C19420q1(context, m61101a, this);
            this.f48736r = c19420q13;
            this.f48738t = this.f48735q;
            this.f48737s = c19420q13;
        }
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            C19420q1 c19420q14 = this.f48735q;
            if (c19420q14 != null) {
                c19420q14.m59775a(m60943p2);
            }
            C19420q1 c19420q15 = this.f48736r;
            if (c19420q15 != null) {
                c19420q15.m59775a(m60943p2);
            }
            InterfaceC18850A4 m60943p3 = m60943p();
            if (m60943p3 != null) {
                String TAG = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) m60943p3).m61259a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            EnumC19096S5 enumC19096S5 = C18911E9.f47212a;
            C19420q1 c19420q16 = this.f48735q;
            Intrinsics.m17074g(c19420q16);
            C18911E9.m61131a(c19420q16, m60943p());
            InterfaceC18850A4 m60943p4 = m60943p();
            if (m60943p4 != null) {
                String TAG2 = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((C18864B4) m60943p4).m61259a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            C19420q1 c19420q17 = this.f48736r;
            Intrinsics.m17074g(c19420q17);
            C18911E9.m61131a(c19420q17, m60943p());
        }
        WatermarkData m60939t = m60939t();
        if (m60939t != null) {
            C19420q1 c19420q18 = this.f48735q;
            if (c19420q18 != null) {
                c19420q18.m59777a(m60939t);
            }
            C19420q1 c19420q19 = this.f48736r;
            if (c19420q19 != null) {
                c19420q19.m59777a(m60939t);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: b */
    public void mo59835b(@NotNull final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "onAdFetchSuccess ", this));
        }
        m60949d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C19420q1 c19420q1 = this.f48738t;
        if ((c19420q1 != null ? c19420q1.m59652m() : null) == null) {
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String TAG = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) m60943p2).m61255b(TAG, "backgroundAdUnit ad object is null");
            }
            mo60155a((AbstractC19503w0) null, inMobiAdRequestStatus);
            m59833b((short) 2189);
            return;
        }
        InterfaceC18850A4 m60943p3 = m60943p();
        if (m60943p3 != null) {
            String TAG2 = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C18864B4) m60943p3).m61259a(TAG2, "Ad fetch successful, calling loadAd()");
        }
        super.mo59835b(info);
        m60940s().post(new Runnable() { // from class: o3.m6
            {
                C19490v1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19490v1.m59839a(C19490v1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: c */
    public void mo59832c(@NotNull final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "onAdLoadSucceeded ", this));
        }
        super.mo59832c(info);
        m60971a((byte) 0);
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String TAG = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p2).m61259a(TAG, "Ad load successful, providing callback");
        }
        m60940s().post(new Runnable() { // from class: o3.o6
            {
                C19490v1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19490v1.m59834b(C19490v1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    @Nullable
    /* renamed from: j */
    public AbstractC19503w0 mo59831j() {
        if (m59850I()) {
            return this.f48737s;
        }
        return this.f48738t;
    }

    /* renamed from: x */
    public final boolean m59830x() {
        C19420q1 c19420q1;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "canProceedForSuccess ", this));
        }
        if (this.f48737s != null && (c19420q1 = this.f48738t) != null) {
            c19420q1.m59802Q();
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m59828y() {
        C19420q1 c19420q1;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "canScheduleRefresh ", this));
        }
        C19420q1 c19420q12 = this.f48738t;
        if (c19420q12 == null) {
            return false;
        }
        Byte valueOf = Byte.valueOf(c19420q12.m59802Q());
        if ((valueOf == null || valueOf.byteValue() != 4) && ((valueOf == null || valueOf.byteValue() != 1) && ((valueOf == null || valueOf.byteValue() != 2) && ((c19420q1 = this.f48737s) == null || c19420q1.m59802Q() != 7)))) {
            return true;
        }
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String TAG = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p2).m61259a(TAG, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    /* renamed from: z */
    public final void m59826z() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "clear ", this));
        }
        m59848K();
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null) {
            c19420q1.mo59673g();
        }
        this.f48735q = null;
        C19420q1 c19420q12 = this.f48736r;
        if (c19420q12 != null) {
            c19420q12.mo59673g();
        }
        this.f48736r = null;
        m60969a((InterfaceC18850A4) null);
        this.f48737s = null;
        this.f48738t = null;
        m60959a((Boolean) null);
    }

    /* renamed from: b */
    public static final void m59834b(C19490v1 this$0, AdMetaInfo info) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(info, "$info");
        InterfaceC18850A4 m60943p = this$0.m60943p();
        if (m60943p != null) {
            String TAG = this$0.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p).m61259a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks m60947l = this$0.m60947l();
        if (m60947l != null) {
            m60947l.onAdLoadSucceeded(info);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this$0.m59833b((short) 2184);
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: b */
    public void mo59837b() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "onAdDismissed ", this));
        }
        m60971a((byte) 0);
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String TAG = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p2).m61253d(TAG, "AdManager state - CREATED");
        }
        super.mo59837b();
    }

    /* renamed from: b */
    private final void m59836b(RelativeLayout relativeLayout) {
        C18971J m59810I;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "displayInternal ", this));
        }
        C19420q1 c19420q1 = this.f48737s;
        if (c19420q1 == null) {
            return;
        }
        InterfaceC19432r m59658k = c19420q1.m59658k();
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = m59658k instanceof GestureDetector$OnGestureListenerC19100S9 ? (GestureDetector$OnGestureListenerC19100S9) m59658k : null;
        if (gestureDetector$OnGestureListenerC19100S9 == null) {
            return;
        }
        AbstractC19347kc viewableAd = gestureDetector$OnGestureListenerC19100S9.getViewableAd();
        C19420q1 c19420q12 = this.f48737s;
        if (c19420q12 != null && (m59810I = c19420q12.m59810I()) != null && m59810I.m60999p()) {
            gestureDetector$OnGestureListenerC19100S9.mo59919e();
        }
        View mo60045d = viewableAd.mo60045d();
        viewableAd.mo59996a(new HashMap());
        ViewParent parent = gestureDetector$OnGestureListenerC19100S9.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            relativeLayout.addView(mo60045d, layoutParams);
            return;
        }
        viewGroup.removeAllViews();
        viewGroup.addView(mo60045d, layoutParams);
    }

    /* renamed from: a */
    public static final void m59839a(C19490v1 this$0, AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(info, "$info");
        InterfaceC18850A4 m60943p = this$0.m60943p();
        if (m60943p != null) {
            String TAG = this$0.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p).m61259a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks m60947l = this$0.m60947l();
        if (m60947l != null) {
            m60947l.onAdFetchSuccessful(info);
            return;
        }
        InterfaceC18850A4 m60943p2 = this$0.m60943p();
        if (m60943p2 != null) {
            String TAG2 = this$0.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C18864B4) m60943p2).m61255b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC19335k0
    @UiThread
    /* renamed from: a */
    public void mo59846a(int i, final int i2, @Nullable GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9) {
        ViewParent parent;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "onShowNextPodAd ", this));
        }
        super.mo59846a(i, i2, gestureDetector$OnGestureListenerC19100S9);
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String TAG = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) m60943p2).m61259a(TAG, "on Show next pod ad index: " + i);
        }
        if (gestureDetector$OnGestureListenerC19100S9 != null) {
            try {
                parent = gestureDetector$OnGestureListenerC19100S9.getParent();
            } catch (Exception unused) {
                C19420q1 c19420q1 = this.f48737s;
                if (c19420q1 != null) {
                    c19420q1.m59677f(i2);
                }
                C19420q1 c19420q12 = this.f48737s;
                if (c19420q12 != null) {
                    c19420q12.m59725b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C19420q1 c19420q13 = this.f48737s;
            if (c19420q13 != null) {
                c19420q13.m59725b(i2, true);
            }
            m59836b(inMobiBanner);
            m60940s().post(new Runnable() { // from class: o3.n6
                {
                    C19490v1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19490v1.m59840a(C19490v1.this, i2);
                }
            });
            return;
        }
        C19420q1 c19420q14 = this.f48737s;
        if (c19420q14 != null) {
            c19420q14.m59677f(i2);
        }
        C19420q1 c19420q15 = this.f48737s;
        if (c19420q15 != null) {
            c19420q15.m59725b(i2, false);
        }
    }

    /* renamed from: b */
    public final void m59833b(short s) {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "submitAdLoadFailed ", this));
        }
        AbstractC19503w0 mo59831j = mo59831j();
        if (mo59831j != null) {
            mo59831j.m59710b(s);
        }
    }

    /* renamed from: a */
    public static final void m59840a(C19490v1 this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C19420q1 c19420q1 = this$0.f48737s;
        if (c19420q1 != null) {
            c19420q1.m59785a(i, false);
        }
    }

    @UiThread
    /* renamed from: a */
    public final void m59841a(@NotNull PublisherCallbacks callbacks, @NotNull String adSize, boolean z) {
        C19420q1 c19420q1;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "load 1 ", this));
        }
        if (Intrinsics.m17075f(m60938u(), Boolean.FALSE)) {
            m60951b(this.f48738t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C19420q1 c19420q12 = this.f48738t;
            if (c19420q12 != null) {
                c19420q12.m59735a((short) 2006);
            }
            AbstractC19187Z5.m60514a((byte) 1, this.f48733o, "Cannot call load() API after calling load(byte[])");
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String TAG = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) m60943p2).m61255b(TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        m60959a(Boolean.TRUE);
        if (m60947l() == null) {
            m60955b(callbacks);
        }
        C19420q1 c19420q13 = this.f48738t;
        if (c19420q13 == null || !m60957a(this.f48733o, String.valueOf(c19420q13.m59810I()), callbacks) || (c19420q1 = this.f48738t) == null || !c19420q1.m59683e(m60944o())) {
            return;
        }
        InterfaceC18850A4 m60943p3 = m60943p();
        if (m60943p3 != null) {
            String TAG2 = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((C18864B4) m60943p3).m61253d(TAG2, "AdManager state - LOADING");
        }
        m60971a((byte) 1);
        m60949d(null);
        C19420q1 c19420q14 = this.f48738t;
        Intrinsics.m17074g(c19420q14);
        c19420q14.m59936e(adSize);
        C19420q1 c19420q15 = this.f48738t;
        Intrinsics.m17074g(c19420q15);
        c19420q15.m59939d(z);
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: a */
    public void mo59838a(@Nullable byte[] bArr, @NotNull PublisherCallbacks callbacks) {
        C19420q1 c19420q1;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "load 2 ", this));
        }
        if (Intrinsics.m17075f(m60938u(), Boolean.TRUE)) {
            AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String TAG = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) m60943p2).m61255b(TAG, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        m60959a(Boolean.FALSE);
        m60971a((byte) 1);
        m60955b(callbacks);
        if (this.f48738t != null) {
            C19420q1 c19420q12 = this.f48737s;
            if ((c19420q12 == null || !c19420q12.m59794Y()) && (c19420q1 = this.f48738t) != null && c19420q1.m59683e((byte) 1)) {
                InterfaceC18850A4 m60943p3 = m60943p();
                if (m60943p3 != null) {
                    String TAG2 = this.f48734p;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    ((C18864B4) m60943p3).m61259a(TAG2, "timer started - load banner");
                }
                C19420q1 c19420q13 = this.f48738t;
                if (c19420q13 != null) {
                    c19420q13.m59679e0();
                }
                C19420q1 c19420q14 = this.f48738t;
                if (c19420q14 != null) {
                    c19420q14.mo59730a(bArr);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m59843a(@NotNull RelativeLayout banner) {
        C18971J m59810I;
        Intrinsics.checkNotNullParameter(banner, "banner");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61259a(str, AbstractC19476u1.m59880a(str, "TAG", "displayAd ", this));
        }
        C19420q1 c19420q1 = this.f48737s;
        InterfaceC19432r m59658k = c19420q1 != null ? c19420q1.m59658k() : null;
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = m59658k instanceof GestureDetector$OnGestureListenerC19100S9 ? (GestureDetector$OnGestureListenerC19100S9) m59658k : null;
        if (gestureDetector$OnGestureListenerC19100S9 == null) {
            return;
        }
        AbstractC19347kc viewableAd = gestureDetector$OnGestureListenerC19100S9.getViewableAd();
        C19420q1 c19420q12 = this.f48737s;
        if (c19420q12 != null && (m59810I = c19420q12.m59810I()) != null && m59810I.m60999p()) {
            gestureDetector$OnGestureListenerC19100S9.mo59919e();
        }
        ViewParent parent = gestureDetector$OnGestureListenerC19100S9.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View mo60045d = viewableAd.mo60045d();
        viewableAd.mo59996a(new HashMap());
        C19420q1 c19420q13 = this.f48738t;
        if (c19420q13 != null) {
            c19420q13.m59952E0();
        }
        if (viewGroup == null) {
            banner.addView(mo60045d, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(mo60045d, layoutParams);
        }
        C19420q1 c19420q14 = this.f48738t;
        if (c19420q14 != null) {
            c19420q14.mo59673g();
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: a */
    public void mo59842a(@NotNull WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.mo59842a(watermarkData);
        C19420q1 c19420q1 = this.f48735q;
        if (c19420q1 != null) {
            c19420q1.m59777a(watermarkData);
        }
        C19420q1 c19420q12 = this.f48736r;
        if (c19420q12 != null) {
            c19420q12.m59777a(watermarkData);
        }
    }

    /* renamed from: a */
    public final int m59847a(int i, int i2) {
        AdConfig m59661j;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "getRefreshInterval ", this));
        }
        C19420q1 c19420q1 = this.f48738t;
        return (c19420q1 == null || (m59661j = c19420q1.m59661j()) == null) ? i2 : i < m59661j.getMinimumRefreshInterval() ? m59661j.getMinimumRefreshInterval() : i;
    }

    /* renamed from: a */
    public final boolean m59845a(long j) {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = this.f48734p;
            ((C18864B4) m60943p).m61254c(str, AbstractC19476u1.m59880a(str, "TAG", "checkForRefreshRate ", this));
        }
        C19420q1 c19420q1 = this.f48738t;
        if (c19420q1 == null) {
            return false;
        }
        AdConfig m59661j = c19420q1.m59661j();
        Intrinsics.m17074g(m59661j);
        int minimumRefreshInterval = m59661j.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j < minimumRefreshInterval * 1000) {
            mo60262a((short) 2175);
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String TAG = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) m60943p2).m61255b(TAG, "Early refresh request");
            }
            C19420q1 c19420q12 = this.f48738t;
            InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST);
            m60951b(c19420q12, inMobiAdRequestStatus.setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
            String TAG2 = this.f48734p;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
            sb2.append(minimumRefreshInterval);
            sb2.append(" seconds (AdPlacement Id = ");
            C19420q1 c19420q13 = this.f48738t;
            sb2.append(c19420q13 != null ? c19420q13.m59810I() : null);
            sb2.append(')');
            AbstractC19187Z5.m60514a((byte) 1, TAG2, sb2.toString());
            InterfaceC18850A4 m60943p3 = m60943p();
            if (m60943p3 != null) {
                String TAG3 = this.f48734p;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                StringBuilder sb3 = new StringBuilder("Ad cannot be refreshed before ");
                sb3.append(minimumRefreshInterval);
                sb3.append(" seconds (AdPlacement Id = ");
                C19420q1 c19420q14 = this.f48738t;
                sb3.append(c19420q14 != null ? c19420q14.m59810I() : null);
                sb3.append(')');
                ((C18864B4) m60943p3).m61255b(TAG3, sb3.toString());
            }
            return false;
        }
        return true;
    }
}
