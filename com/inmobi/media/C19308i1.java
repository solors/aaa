package com.inmobi.media;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C19308i1;
import com.ironsource.C19658bt;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i1 */
/* loaded from: classes6.dex */
public final class C19308i1 extends AbstractC18997Kb {

    /* renamed from: o */
    public C19238d1 f48329o;

    /* renamed from: p */
    public C19238d1 f48330p;

    /* renamed from: q */
    public C19238d1 f48331q;

    /* renamed from: r */
    public C19238d1 f48332r;

    public C19308i1(InMobiAudio.C18828a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        m60955b(callbacks);
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: a */
    public final void mo59838a(byte[] bArr, PublisherCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: b */
    public final void mo59835b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61254c(str, "onAdFetchSuccess " + this);
        }
        C19238d1 c19238d1 = this.f48332r;
        if ((c19238d1 != null ? c19238d1.m59652m() : null) == null) {
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String str2 = AbstractC19322j1.f48383a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C18864B4) m60943p2).m61255b(str2, "adObject is null, fetch failed");
            }
            mo60155a((AbstractC19503w0) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        InterfaceC18850A4 m60943p3 = m60943p();
        if (m60943p3 != null) {
            String str3 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C18864B4) m60943p3).m61259a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.mo59835b(info);
        m60940s().post(new Runnable() { // from class: o3.b4
            {
                C19308i1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19308i1.m60263a(C19308i1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: c */
    public final void mo59832c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61254c(str, "onAdLoadSucceeded " + this);
        }
        super.mo59832c(info);
        m60971a((byte) 0);
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String str2 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C18864B4) m60943p2).m61253d(str2, "AdManager state - CREATED");
        }
        InterfaceC18850A4 m60943p3 = m60943p();
        if (m60943p3 != null) {
            String str3 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C18864B4) m60943p3).m61259a(str3, "Ad load successful, providing callback");
        }
        m60940s().post(new Runnable() { // from class: o3.d4
            {
                C19308i1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19308i1.m60260b(C19308i1.this, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC19335k0
    /* renamed from: d */
    public final void mo60102d() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "onAdShowFailed " + this);
        }
        m60940s().post(new Runnable() { // from class: o3.a4
            {
                C19308i1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19308i1.m60265a(C19308i1.this);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: j */
    public final AbstractC19503w0 mo59831j() {
        Byte b;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61254c(str, "shouldUseForegroundUnit " + this);
        }
        C19238d1 c19238d1 = this.f48331q;
        if (c19238d1 != null) {
            b = Byte.valueOf(c19238d1.m59802Q());
        } else {
            b = null;
        }
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String str2 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C18864B4) m60943p2).m61253d(str2, "State - " + b);
        }
        if ((b != null && b.byteValue() == 4) || ((b != null && b.byteValue() == 7) || (b != null && b.byteValue() == 6))) {
            return this.f48331q;
        }
        return this.f48332r;
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: w */
    public final void mo60258w() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "submitAdLoadCalled " + this);
        }
        C19238d1 c19238d1 = this.f48332r;
        if (c19238d1 != null) {
            c19238d1.m59637t0();
        }
    }

    /* renamed from: x */
    public final void m60257x() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61254c(str, "registerLifeCycleCallbacks " + this);
        }
        C19238d1 c19238d1 = this.f48329o;
        if (c19238d1 != null) {
            c19238d1.m59950G0();
        }
        C19238d1 c19238d12 = this.f48330p;
        if (c19238d12 != null) {
            c19238d12.m59950G0();
        }
    }

    /* renamed from: y */
    public final void m60256y() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "loadIntoView " + this);
        }
        C19238d1 c19238d1 = this.f48332r;
        if (c19238d1 != null) {
            if (m60958a("InMobi", c19238d1.m59810I().toString())) {
                m60971a((byte) 8);
                InterfaceC18850A4 m60943p2 = m60943p();
                if (m60943p2 != null) {
                    String str2 = AbstractC19322j1.f48383a;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((C18864B4) m60943p2).m61253d(str2, "AdManager state - LOADING_INTO_VIEW");
                }
                c19238d1.mo59659j0();
                return;
            }
            return;
        }
        throw new IllegalStateException(AbstractC18997Kb.f47411m.toString());
    }

    /* renamed from: a */
    public static final void m60263a(C19308i1 this$0, AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(info, "$info");
        PublisherCallbacks m60947l = this$0.m60947l();
        if (m60947l != null) {
            m60947l.onAdFetchSuccessful(info);
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: a */
    public final void mo60155a(AbstractC19503w0 abstractC19503w0, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61255b(str, C19658bt.f49339b);
        }
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            ((C18864B4) m60943p2).m61260a();
        }
    }

    /* renamed from: a */
    public static final void m60265a(C19308i1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC18850A4 m60943p = this$0.m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks m60947l = this$0.m60947l();
        if (m60947l != null) {
            m60947l.onAdDisplayFailed();
        }
        InterfaceC18850A4 m60943p2 = this$0.m60943p();
        if (m60943p2 != null) {
            ((C18864B4) m60943p2).m61260a();
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: a */
    public final void mo60114a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "onAdDisplayed");
        }
        super.mo60114a(info);
        AbstractC19503w0 mo59831j = mo59831j();
        if (mo59831j != null) {
            mo59831j.m59629x0();
        }
    }

    /* renamed from: b */
    public static final void m60260b(C19308i1 this$0, AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(info, "$info");
        PublisherCallbacks m60947l = this$0.m60947l();
        if (m60947l != null) {
            m60947l.onAdLoadSucceeded(info);
        }
    }

    @Override // com.inmobi.media.AbstractC18997Kb, com.inmobi.media.AbstractC19335k0
    /* renamed from: b */
    public final void mo59837b() {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "onAdDismissed " + this);
        }
        m60971a((byte) 0);
        InterfaceC18850A4 m60943p2 = m60943p();
        if (m60943p2 != null) {
            String str2 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C18864B4) m60943p2).m61253d(str2, "AdManager state - CREATED");
        }
        InterfaceC18850A4 m60943p3 = m60943p();
        if (m60943p3 != null) {
            ((C18864B4) m60943p3).m61260a();
        }
        super.mo59837b();
    }

    /* renamed from: a */
    public final void m60266a(final RelativeLayout audio) {
        Intrinsics.checkNotNullParameter(audio, "audio");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m60261b(audio);
            } else {
                m60940s().post(new Runnable() { // from class: o3.c4
                    {
                        C19308i1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19308i1.m60264a(C19308i1.this, audio);
                    }
                });
            }
        } catch (Exception e) {
            C19238d1 c19238d1 = this.f48332r;
            if (c19238d1 != null) {
                c19238d1.m60380d((short) 26);
            }
            String str2 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            AbstractC19187Z5.m60514a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                ((C18864B4) m60943p2).m61255b(str2, AbstractC18886Cc.m61171a(e, AbstractC18851A5.m61272a(str2, "access$getTAG$p(...)", "Show failed with unexpected error: ")));
            }
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    /* renamed from: b */
    public final void m60259b(String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "load 1 " + this);
        }
        C19238d1 c19238d1 = this.f48332r;
        if (c19238d1 != null && m60957a("InMobi", c19238d1.m59810I().toString(), m60947l()) && c19238d1.m59683e((byte) 1)) {
            m60971a((byte) 1);
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                String str2 = AbstractC19322j1.f48383a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C18864B4) m60943p2).m61253d(str2, "AdManager state - LOADING");
            }
            m60949d(null);
            c19238d1.m59936e(adSize);
            c19238d1.m59939d(false);
        }
    }

    /* renamed from: b */
    public final void m60261b(RelativeLayout relativeLayout) {
        InterfaceC19432r m59658k;
        C18971J m59810I;
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61259a(str, "showAudioAd");
        }
        C19238d1 c19238d1 = this.f48331q;
        if (c19238d1 != null ? c19238d1.m59953D0() : false) {
            String str2 = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            AbstractC19187Z5.m60514a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            InterfaceC18850A4 m60943p2 = m60943p();
            if (m60943p2 != null) {
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C18864B4) m60943p2).m61255b(str2, "ad is active");
            }
            C19238d1 c19238d12 = this.f48332r;
            if (c19238d12 != null) {
                c19238d12.m60380d((short) 15);
                return;
            }
            return;
        }
        C19238d1 c19238d13 = this.f48332r;
        if (c19238d13 != null) {
            InterfaceC18850A4 interfaceC18850A4 = c19238d13.f48769j;
            if (interfaceC18850A4 != null) {
                String m59684e = AbstractC19503w0.m59684e();
                Intrinsics.checkNotNullExpressionValue(m59684e, "<get-TAG>(...)");
                ((C18864B4) interfaceC18850A4).m61254c(m59684e, "canProceedToShow");
            }
            if (c19238d13.m59796W()) {
                String m59684e2 = AbstractC19503w0.m59684e();
                Intrinsics.checkNotNullExpressionValue(m59684e2, "<get-TAG>(...)");
                AbstractC19187Z5.m60514a((byte) 1, m59684e2, "Ad Show has failed because current ad is expired. Please call load() again.");
                InterfaceC18850A4 interfaceC18850A42 = c19238d13.f48769j;
                if (interfaceC18850A42 != null) {
                    String m59684e3 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e3, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A42).m61255b(m59684e3, "ad is expired");
                }
                InterfaceC18850A4 interfaceC18850A43 = c19238d13.f48769j;
                if (interfaceC18850A43 != null) {
                    String m59684e4 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e4, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A43).m61253d(m59684e4, "AdUnit " + c19238d13 + " state - CREATED");
                }
                c19238d13.m59691d((byte) 0);
                c19238d13.m60380d((short) 2153);
                return;
            }
            byte m59802Q = c19238d13.m59802Q();
            if (m59802Q == 1 || m59802Q == 2) {
                AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                InterfaceC18850A4 interfaceC18850A44 = c19238d13.f48769j;
                if (interfaceC18850A44 != null) {
                    String m59684e5 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e5, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A44).m61255b(m59684e5, "ad is not ready");
                }
                InterfaceC18850A4 interfaceC18850A45 = c19238d13.f48769j;
                if (interfaceC18850A45 != null) {
                    String m59684e6 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e6, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A45).m61259a(m59684e6, "callback - onShowFailure");
                }
                c19238d13.m60380d((short) 2152);
            } else if (m59802Q == 3) {
                AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                c19238d13.m60380d((short) 0);
                InterfaceC18850A4 interfaceC18850A46 = c19238d13.f48769j;
                if (interfaceC18850A46 != null) {
                    String m59684e7 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e7, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A46).m61259a(m59684e7, "callback - onShowFailure");
                }
                InterfaceC18850A4 interfaceC18850A47 = c19238d13.f48769j;
                if (interfaceC18850A47 != null) {
                    String m59684e8 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e8, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A47).m61255b(m59684e8, "ad is failed");
                }
            } else if (m59802Q == 0) {
                AbstractC19187Z5.m60514a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
                c19238d13.m60380d((short) 0);
                InterfaceC18850A4 interfaceC18850A48 = c19238d13.f48769j;
                if (interfaceC18850A48 != null) {
                    String m59684e9 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e9, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A48).m61259a(m59684e9, "callback - onShowFailure");
                }
                InterfaceC18850A4 interfaceC18850A49 = c19238d13.f48769j;
                if (interfaceC18850A49 != null) {
                    String m59684e10 = AbstractC19503w0.m59684e();
                    Intrinsics.checkNotNullExpressionValue(m59684e10, "<get-TAG>(...)");
                    ((C18864B4) interfaceC18850A49).m61255b(m59684e10, "show called before load");
                }
            } else {
                InterfaceC18850A4 m60943p3 = m60943p();
                if (m60943p3 != null) {
                    String str3 = AbstractC19322j1.f48383a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C18864B4) m60943p3).m61259a(str3, "swapAdUnits " + this);
                }
                C19238d1 c19238d14 = this.f48331q;
                if (Intrinsics.m17075f(c19238d14, this.f48329o)) {
                    this.f48331q = this.f48330p;
                    this.f48332r = this.f48329o;
                } else if (Intrinsics.m17075f(c19238d14, this.f48330p) || c19238d14 == null) {
                    this.f48331q = this.f48329o;
                    this.f48332r = this.f48330p;
                }
                InterfaceC18850A4 m60943p4 = m60943p();
                if (m60943p4 != null) {
                    String str4 = AbstractC19322j1.f48383a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C18864B4) m60943p4).m61259a(str4, "displayAd " + this);
                }
                C19238d1 c19238d15 = this.f48331q;
                if (c19238d15 == null || (m59658k = c19238d15.m59658k()) == null) {
                    return;
                }
                GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = (GestureDetector$OnGestureListenerC19100S9) m59658k;
                AbstractC19347kc viewableAd = gestureDetector$OnGestureListenerC19100S9.getViewableAd();
                C19238d1 c19238d16 = this.f48331q;
                if (c19238d16 != null && (m59810I = c19238d16.m59810I()) != null && m59810I.m60999p()) {
                    gestureDetector$OnGestureListenerC19100S9.mo59919e();
                }
                ViewParent parent = gestureDetector$OnGestureListenerC19100S9.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View mo60045d = viewableAd.mo60045d();
                viewableAd.mo59996a((HashMap) null);
                C19238d1 c19238d17 = this.f48332r;
                if (c19238d17 != null) {
                    c19238d17.m59952E0();
                }
                if (viewGroup == null) {
                    relativeLayout.addView(mo60045d, layoutParams);
                } else {
                    viewGroup.removeAllViews();
                    viewGroup.addView(mo60045d, layoutParams);
                }
                C19238d1 c19238d18 = this.f48332r;
                if (c19238d18 != null) {
                    c19238d18.mo59673g();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m60264a(C19308i1 this$0, RelativeLayout audio) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(audio, "$audio");
        this$0.m60261b(audio);
    }

    @Override // com.inmobi.media.AbstractC18997Kb
    /* renamed from: a */
    public final void mo60262a(short s) {
        InterfaceC18850A4 m60943p = m60943p();
        if (m60943p != null) {
            String str = AbstractC19322j1.f48383a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C18864B4) m60943p).m61255b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        C19238d1 c19238d1 = this.f48332r;
        if (c19238d1 != null) {
            c19238d1.m59735a(s);
        }
    }
}
