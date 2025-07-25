package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.C17807a;
import com.iab.omid.library.applovin.internal.C17809c;
import com.iab.omid.library.applovin.internal.C17812e;
import com.iab.omid.library.applovin.internal.C17813f;
import com.iab.omid.library.applovin.internal.C17817i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C17824a;
import com.iab.omid.library.applovin.publisher.C17825b;
import com.iab.omid.library.applovin.utils.C17837g;
import com.iab.omid.library.applovin.weakreference.C17855a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
/* loaded from: classes6.dex */
public class C17799a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f44900a;

    /* renamed from: b */
    private final AdSessionConfiguration f44901b;

    /* renamed from: c */
    private final C17813f f44902c;

    /* renamed from: d */
    private C17855a f44903d;

    /* renamed from: e */
    private AdSessionStatePublisher f44904e;

    /* renamed from: f */
    private boolean f44905f;

    /* renamed from: g */
    private boolean f44906g;

    /* renamed from: h */
    private final String f44907h;

    /* renamed from: i */
    private boolean f44908i;

    /* renamed from: j */
    private boolean f44909j;

    /* renamed from: k */
    private PossibleObstructionListener f44910k;

    public C17799a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m65186a() {
        if (this.f44908i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m65182b() {
        if (this.f44909j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f44906g) {
            return;
        }
        this.f44902c.m65120a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m65180c() {
        return this.f44903d.get();
    }

    /* renamed from: d */
    public List<C17812e> m65179d() {
        return this.f44902c.m65122a();
    }

    /* renamed from: e */
    public boolean m65178e() {
        if (this.f44910k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f44906g) {
            C17837g.m65016a(errorType, "Error type is null");
            C17837g.m65014a(str, "Message is null");
            getAdSessionStatePublisher().m65075a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m65177f() {
        if (this.f44905f && !this.f44906g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f44906g) {
            return;
        }
        this.f44903d.clear();
        removeAllFriendlyObstructions();
        this.f44906g = true;
        getAdSessionStatePublisher().m65062f();
        C17809c.m65139c().m65140b(this);
        getAdSessionStatePublisher().mo65057b();
        this.f44904e = null;
        this.f44910k = null;
    }

    /* renamed from: g */
    public boolean m65176g() {
        return this.f44906g;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public String getAdSessionId() {
        return this.f44907h;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f44904e;
    }

    /* renamed from: h */
    public boolean m65175h() {
        return this.f44901b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m65174i() {
        return this.f44901b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m65173j() {
        return this.f44905f;
    }

    /* renamed from: k */
    public void m65172k() {
        m65186a();
        getAdSessionStatePublisher().m65061g();
        this.f44908i = true;
    }

    /* renamed from: l */
    public void m65171l() {
        m65182b();
        getAdSessionStatePublisher().m65060h();
        this.f44909j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f44906g) {
            return;
        }
        C17837g.m65016a(view, "AdView is null");
        if (m65180c() == view) {
            return;
        }
        m65181b(view);
        getAdSessionStatePublisher().m65080a();
        m65185a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f44906g) {
            return;
        }
        this.f44902c.m65118b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f44906g) {
            return;
        }
        this.f44902c.m65116c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f44910k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f44905f) {
            return;
        }
        this.f44905f = true;
        C17809c.m65139c().m65138c(this);
        this.f44904e.m65079a(C17817i.m65090c().m65091b());
        this.f44904e.m65069a(C17807a.m65149a().m65147b());
        this.f44904e.mo65059a(this, this.f44900a);
    }

    public C17799a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f44902c = new C17813f();
        this.f44905f = false;
        this.f44906g = false;
        this.f44901b = adSessionConfiguration;
        this.f44900a = adSessionContext;
        this.f44907h = str;
        m65181b(null);
        this.f44904e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C17824a(str, adSessionContext.getWebView()) : new C17825b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f44904e.mo65056i();
        C17809c.m65139c().m65142a(this);
        this.f44904e.m65076a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m65185a(View view) {
        Collection<C17799a> m65141b = C17809c.m65139c().m65141b();
        if (m65141b == null || m65141b.isEmpty()) {
            return;
        }
        for (C17799a c17799a : m65141b) {
            if (c17799a != this && c17799a.m65180c() == view) {
                c17799a.f44903d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m65181b(View view) {
        this.f44903d = new C17855a(view);
    }

    /* renamed from: a */
    public void m65184a(List<C17855a> list) {
        if (m65178e()) {
            ArrayList arrayList = new ArrayList();
            for (C17855a c17855a : list) {
                View view = c17855a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f44910k.onPossibleObstructionsDetected(this.f44907h, arrayList);
        }
    }

    /* renamed from: a */
    public void m65183a(@NonNull JSONObject jSONObject) {
        m65182b();
        getAdSessionStatePublisher().m65068a(jSONObject);
        this.f44909j = true;
    }
}
