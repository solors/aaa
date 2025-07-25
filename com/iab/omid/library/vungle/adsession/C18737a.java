package com.iab.omid.library.vungle.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.C18745a;
import com.iab.omid.library.vungle.internal.C18747c;
import com.iab.omid.library.vungle.internal.C18750e;
import com.iab.omid.library.vungle.internal.C18751f;
import com.iab.omid.library.vungle.internal.C18755i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.C18764a;
import com.iab.omid.library.vungle.publisher.C18765b;
import com.iab.omid.library.vungle.utils.C18777g;
import com.iab.omid.library.vungle.weakreference.C18795a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.adsession.a */
/* loaded from: classes6.dex */
public class C18737a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f46848a;

    /* renamed from: b */
    private final AdSessionConfiguration f46849b;

    /* renamed from: c */
    private final C18751f f46850c;

    /* renamed from: d */
    private C18795a f46851d;

    /* renamed from: e */
    private AdSessionStatePublisher f46852e;

    /* renamed from: f */
    private boolean f46853f;

    /* renamed from: g */
    private boolean f46854g;

    /* renamed from: h */
    private final String f46855h;

    /* renamed from: i */
    private boolean f46856i;

    /* renamed from: j */
    private boolean f46857j;

    /* renamed from: k */
    private PossibleObstructionListener f46858k;

    public C18737a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m61565a() {
        if (this.f46856i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m61561b() {
        if (this.f46857j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46854g) {
            return;
        }
        this.f46850c.m61499a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m61559c() {
        return this.f46851d.get();
    }

    /* renamed from: d */
    public List<C18750e> m61558d() {
        return this.f46850c.m61501a();
    }

    /* renamed from: e */
    public boolean m61557e() {
        if (this.f46858k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46854g) {
            C18777g.m61386a(errorType, "Error type is null");
            C18777g.m61384a(str, "Message is null");
            getAdSessionStatePublisher().m61447a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m61556f() {
        if (this.f46853f && !this.f46854g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f46854g) {
            return;
        }
        this.f46851d.clear();
        removeAllFriendlyObstructions();
        this.f46854g = true;
        getAdSessionStatePublisher().m61433f();
        C18747c.m61518c().m61519b(this);
        getAdSessionStatePublisher().mo61428b();
        this.f46852e = null;
        this.f46858k = null;
    }

    /* renamed from: g */
    public boolean m61555g() {
        return this.f46854g;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public String getAdSessionId() {
        return this.f46855h;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46852e;
    }

    /* renamed from: h */
    public boolean m61554h() {
        return this.f46849b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m61553i() {
        return this.f46849b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m61552j() {
        return this.f46853f;
    }

    /* renamed from: k */
    public void m61551k() {
        m61565a();
        getAdSessionStatePublisher().m61432g();
        this.f46856i = true;
    }

    /* renamed from: l */
    public void m61550l() {
        m61561b();
        getAdSessionStatePublisher().m61431h();
        this.f46857j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f46854g || m61559c() == view) {
            return;
        }
        m61560b(view);
        getAdSessionStatePublisher().m61452a();
        m61564a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46854g) {
            return;
        }
        this.f46850c.m61497b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46854g) {
            return;
        }
        this.f46850c.m61495c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46858k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f46853f) {
            return;
        }
        this.f46853f = true;
        C18747c.m61518c().m61517c(this);
        this.f46852e.m61451a(C18755i.m61468c().m61469b());
        this.f46852e.m61441a(C18745a.m61528a().m61526b());
        this.f46852e.mo61430a(this, this.f46848a);
    }

    public C18737a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f46850c = new C18751f();
        this.f46853f = false;
        this.f46854g = false;
        this.f46849b = adSessionConfiguration;
        this.f46848a = adSessionContext;
        this.f46855h = str;
        m61560b(null);
        this.f46852e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18764a(str, adSessionContext.getWebView()) : new C18765b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f46852e.mo61427i();
        C18747c.m61518c().m61521a(this);
        this.f46852e.m61448a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m61564a(@Nullable View view) {
        Collection<C18737a> m61520b = C18747c.m61518c().m61520b();
        if (m61520b == null || m61520b.isEmpty()) {
            return;
        }
        for (C18737a c18737a : m61520b) {
            if (c18737a != this && c18737a.m61559c() == view) {
                c18737a.f46851d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m61560b(@Nullable View view) {
        this.f46851d = new C18795a(view);
    }

    /* renamed from: a */
    public void m61563a(List<C18795a> list) {
        if (m61557e()) {
            ArrayList arrayList = new ArrayList();
            for (C18795a c18795a : list) {
                View view = c18795a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46858k.onPossibleObstructionsDetected(this.f46855h, arrayList);
        }
    }

    /* renamed from: a */
    public void m61562a(@NonNull JSONObject jSONObject) {
        m61561b();
        getAdSessionStatePublisher().m61440a(jSONObject);
        this.f46857j = true;
    }
}
