package com.iab.omid.library.pubmatic.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.internal.C18434a;
import com.iab.omid.library.pubmatic.internal.C18436c;
import com.iab.omid.library.pubmatic.internal.C18439e;
import com.iab.omid.library.pubmatic.internal.C18440f;
import com.iab.omid.library.pubmatic.internal.C18444i;
import com.iab.omid.library.pubmatic.publisher.AdSessionStatePublisher;
import com.iab.omid.library.pubmatic.publisher.C18453a;
import com.iab.omid.library.pubmatic.publisher.C18454b;
import com.iab.omid.library.pubmatic.utils.C18466g;
import com.iab.omid.library.pubmatic.weakreference.C18484a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.adsession.a */
/* loaded from: classes6.dex */
public class C18426a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f46187a;

    /* renamed from: b */
    private final AdSessionConfiguration f46188b;

    /* renamed from: c */
    private final C18440f f46189c;

    /* renamed from: d */
    private C18484a f46190d;

    /* renamed from: e */
    private AdSessionStatePublisher f46191e;

    /* renamed from: f */
    private boolean f46192f;

    /* renamed from: g */
    private boolean f46193g;

    /* renamed from: h */
    private final String f46194h;

    /* renamed from: i */
    private boolean f46195i;

    /* renamed from: j */
    private boolean f46196j;

    /* renamed from: k */
    private PossibleObstructionListener f46197k;

    public C18426a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m62793a() {
        if (this.f46195i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m62789b() {
        if (this.f46196j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46193g) {
            return;
        }
        this.f46189c.m62727a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m62787c() {
        return this.f46190d.get();
    }

    /* renamed from: d */
    public List<C18439e> m62786d() {
        return this.f46189c.m62729a();
    }

    /* renamed from: e */
    public boolean m62785e() {
        if (this.f46197k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46193g) {
            C18466g.m62614a(errorType, "Error type is null");
            C18466g.m62612a(str, "Message is null");
            getAdSessionStatePublisher().m62675a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m62784f() {
        if (this.f46192f && !this.f46193g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void finish() {
        if (this.f46193g) {
            return;
        }
        this.f46190d.clear();
        removeAllFriendlyObstructions();
        this.f46193g = true;
        getAdSessionStatePublisher().m62661f();
        C18436c.m62746c().m62747b(this);
        getAdSessionStatePublisher().mo62656b();
        this.f46191e = null;
        this.f46197k = null;
    }

    /* renamed from: g */
    public boolean m62783g() {
        return this.f46193g;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public String getAdSessionId() {
        return this.f46194h;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46191e;
    }

    /* renamed from: h */
    public boolean m62782h() {
        return this.f46188b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m62781i() {
        return this.f46188b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m62780j() {
        return this.f46192f;
    }

    /* renamed from: k */
    public void m62779k() {
        m62793a();
        getAdSessionStatePublisher().m62660g();
        this.f46195i = true;
    }

    /* renamed from: l */
    public void m62778l() {
        m62789b();
        getAdSessionStatePublisher().m62659h();
        this.f46196j = true;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f46193g || m62787c() == view) {
            return;
        }
        m62788b(view);
        getAdSessionStatePublisher().m62680a();
        m62792a(view);
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46193g) {
            return;
        }
        this.f46189c.m62725b();
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46193g) {
            return;
        }
        this.f46189c.m62723c(view);
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46197k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.pubmatic.adsession.AdSession
    public void start() {
        if (!this.f46192f && this.f46191e != null) {
            this.f46192f = true;
            C18436c.m62746c().m62745c(this);
            this.f46191e.m62679a(C18444i.m62696c().m62697b());
            this.f46191e.m62669a(C18434a.m62756a().m62754b());
            this.f46191e.mo62658a(this, this.f46187a);
        }
    }

    public C18426a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f46189c = new C18440f();
        this.f46192f = false;
        this.f46193g = false;
        this.f46188b = adSessionConfiguration;
        this.f46187a = adSessionContext;
        this.f46194h = str;
        m62788b(null);
        this.f46191e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18453a(str, adSessionContext.getWebView()) : new C18454b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f46191e.mo62655i();
        C18436c.m62746c().m62749a(this);
        this.f46191e.m62676a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m62792a(@Nullable View view) {
        Collection<C18426a> m62748b = C18436c.m62746c().m62748b();
        if (m62748b == null || m62748b.isEmpty()) {
            return;
        }
        for (C18426a c18426a : m62748b) {
            if (c18426a != this && c18426a.m62787c() == view) {
                c18426a.f46190d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m62788b(@Nullable View view) {
        this.f46190d = new C18484a(view);
    }

    /* renamed from: a */
    public void m62791a(List<C18484a> list) {
        if (m62785e()) {
            ArrayList arrayList = new ArrayList();
            for (C18484a c18484a : list) {
                View view = c18484a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46197k.onPossibleObstructionsDetected(this.f46194h, arrayList);
        }
    }

    /* renamed from: a */
    public void m62790a(@NonNull JSONObject jSONObject) {
        m62789b();
        getAdSessionStatePublisher().m62668a(jSONObject);
        this.f46196j = true;
    }
}
