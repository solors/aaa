package com.fyber.inneractive.sdk.bidder;

import android.app.Activity;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.config.AbstractC14413u;
import com.fyber.inneractive.sdk.config.C14414v;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.ignite.C14567l;
import com.fyber.inneractive.sdk.serverapi.AbstractC15395b;
import com.fyber.inneractive.sdk.serverapi.C15394a;
import com.fyber.inneractive.sdk.serverapi.C15396c;
import com.fyber.inneractive.sdk.topics.C15399b;
import com.fyber.inneractive.sdk.util.AbstractC15453j;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.AbstractC15465p;
import com.fyber.inneractive.sdk.util.AbstractC15469r;
import com.fyber.inneractive.sdk.util.EnumC15433Y;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;

/* renamed from: com.fyber.inneractive.sdk.bidder.d */
/* loaded from: classes4.dex */
public final class C14241d {

    /* renamed from: A */
    public String f26922A;

    /* renamed from: B */
    public Boolean f26923B;

    /* renamed from: C */
    public String f26924C;

    /* renamed from: D */
    public int f26925D;

    /* renamed from: E */
    public InneractiveUserConfig.Gender f26926E;

    /* renamed from: F */
    public boolean f26927F;

    /* renamed from: G */
    public String f26928G;

    /* renamed from: H */
    public String f26929H;

    /* renamed from: I */
    public String f26930I;

    /* renamed from: J */
    public String f26931J;

    /* renamed from: K */
    public final boolean f26932K;

    /* renamed from: L */
    public Boolean f26933L;

    /* renamed from: M */
    public ArrayList f26934M = new ArrayList();

    /* renamed from: N */
    public ArrayList f26935N = new ArrayList();

    /* renamed from: a */
    public final C15396c f26936a;

    /* renamed from: b */
    public String f26937b;

    /* renamed from: c */
    public final String f26938c;

    /* renamed from: d */
    public final String f26939d;

    /* renamed from: e */
    public final String f26940e;

    /* renamed from: f */
    public final String f26941f;

    /* renamed from: g */
    public String f26942g;

    /* renamed from: h */
    public String f26943h;

    /* renamed from: i */
    public String f26944i;

    /* renamed from: j */
    public String f26945j;

    /* renamed from: k */
    public String f26946k;

    /* renamed from: l */
    public Long f26947l;

    /* renamed from: m */
    public int f26948m;

    /* renamed from: n */
    public int f26949n;

    /* renamed from: o */
    public final EnumC14254q f26950o;

    /* renamed from: p */
    public String f26951p;

    /* renamed from: q */
    public String f26952q;

    /* renamed from: r */
    public final EnumC14198D f26953r;

    /* renamed from: s */
    public Boolean f26954s;

    /* renamed from: t */
    public Boolean f26955t;

    /* renamed from: u */
    public Boolean f26956u;

    /* renamed from: v */
    public boolean f26957v;

    /* renamed from: w */
    public Boolean f26958w;

    /* renamed from: x */
    public Boolean f26959x;

    /* renamed from: y */
    public Boolean f26960y;

    /* renamed from: z */
    public int f26961z;

    public C14241d(C15396c c15396c) {
        String str;
        EnumC14254q enumC14254q;
        EnumC14198D enumC14198D;
        this.f26936a = c15396c;
        if (TextUtils.isEmpty(this.f26937b)) {
            AbstractC15465p.f30611a.execute(new RunnableC14240c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.3.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f26938c = sb2.toString();
        this.f26939d = AbstractC15459m.f30607a.getPackageName();
        this.f26940e = AbstractC15453j.m76499k();
        this.f26941f = AbstractC15453j.m76497m();
        this.f26948m = AbstractC15459m.m76482b(AbstractC15459m.m76476f());
        this.f26949n = AbstractC15459m.m76482b(AbstractC15459m.m76477e());
        C15394a c15394a = AbstractC15395b.f30493a;
        try {
            Activity activity = UnityPlayer.currentActivity;
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        if (!str.equals("native")) {
            if (!str.equals("unity3d")) {
                enumC14254q = EnumC14254q.UNRECOGNIZED;
            } else {
                enumC14254q = EnumC14254q.UNITY3D;
            }
        } else {
            enumC14254q = EnumC14254q.NATIVE;
        }
        this.f26950o = enumC14254q;
        if (!(!AbstractC15469r.m76470a()) && !IAConfigManager.f27060O.f27093q) {
            enumC14198D = EnumC14198D.UNSECURE;
        } else {
            enumC14198D = EnumC14198D.SECURE;
        }
        this.f26953r = enumC14198D;
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        if (!TextUtils.isEmpty(iAConfigManager.f27090n)) {
            String str2 = iAConfigManager.f27088l;
            String str3 = iAConfigManager.f27090n;
            this.f26929H = str2 + "_" + str3;
        } else {
            this.f26929H = iAConfigManager.f27088l;
        }
        this.f26932K = InneractiveAdManager.isCurrentUserAChild();
        m78021a();
        this.f26955t = AbstractC15395b.m76561g();
        this.f26923B = AbstractC15395b.m76559i();
        this.f26958w = AbstractC15395b.m76562f();
        this.f26959x = AbstractC15395b.m76556l();
        this.f26960y = AbstractC15395b.m76557k();
    }

    /* renamed from: a */
    public final void m78021a() {
        String str;
        String substring;
        this.f26936a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.f27060O;
        this.f26942g = iAConfigManager.f27091o;
        String str2 = null;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f26936a.getClass();
            this.f26943h = AbstractC15453j.m76500j();
            this.f26944i = this.f26936a.m76553a();
            String str3 = this.f26936a.f30498b;
            String str4 = "";
            if (str3 == null) {
                substring = "";
            } else {
                substring = str3.substring(0, Math.min(3, str3.length()));
            }
            this.f26945j = substring;
            String str5 = this.f26936a.f30498b;
            if (str5 != null) {
                str4 = str5.substring(Math.min(3, str5.length()));
            }
            this.f26946k = str4;
            this.f26936a.getClass();
            EnumC15433Y m76513a = EnumC15433Y.m76513a();
            IAlog.m76529a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", m76513a, m76513a.m76512b());
            this.f26952q = m76513a.m76512b();
            int i = AbstractC14392k.f27223a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                C14414v c14414v = AbstractC14413u.f27280a.f27285b;
                if (c14414v != null) {
                    property = c14414v.f27281a;
                } else {
                    property = null;
                }
            }
            this.f26922A = property;
            this.f26928G = iAConfigManager.f27086j.getZipCode();
        }
        this.f26926E = iAConfigManager.f27086j.getGender();
        this.f26925D = iAConfigManager.f27086j.getAge();
        this.f26947l = AbstractC15395b.m76563e();
        this.f26936a.getClass();
        ArrayList arrayList = iAConfigManager.f27092p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f26951p = AbstractC15459m.m76484a(arrayList);
        }
        this.f26924C = AbstractC15395b.m76566b();
        this.f26957v = AbstractC15395b.m76560h().booleanValue();
        this.f26961z = AbstractC15395b.m76565c().intValue();
        this.f26927F = iAConfigManager.f27087k;
        this.f26954s = AbstractC15395b.m76555m();
        if (!TextUtils.isEmpty(iAConfigManager.f27090n)) {
            this.f26929H = iAConfigManager.f27088l + "_" + iAConfigManager.f27090n;
        } else {
            this.f26929H = iAConfigManager.f27088l;
        }
        this.f26956u = AbstractC15395b.m76554n();
        iAConfigManager.f27067E.m77796n();
        C14567l c14567l = iAConfigManager.f27067E.f27607p;
        if (c14567l != null) {
            str = c14567l.f103395a.mo12231i();
        } else {
            str = null;
        }
        this.f26930I = str;
        C14567l c14567l2 = iAConfigManager.f27067E.f27607p;
        if (c14567l2 != null) {
            str2 = c14567l2.f103395a.mo12232d();
        }
        this.f26931J = str2;
        this.f26936a.getClass();
        this.f26948m = AbstractC15459m.m76482b(AbstractC15459m.m76476f());
        this.f26936a.getClass();
        this.f26949n = AbstractC15459m.m76482b(AbstractC15459m.m76477e());
        this.f26933L = AbstractC15395b.m76558j();
        C15399b c15399b = iAConfigManager.f27068F;
        if (c15399b != null && IAConfigManager.m77991f()) {
            this.f26935N = c15399b.f30505f;
            this.f26934M = c15399b.f30504e;
        }
    }
}
