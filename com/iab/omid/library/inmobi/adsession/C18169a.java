package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.internal.C18177a;
import com.iab.omid.library.inmobi.internal.C18179c;
import com.iab.omid.library.inmobi.internal.C18182e;
import com.iab.omid.library.inmobi.internal.C18183f;
import com.iab.omid.library.inmobi.internal.C18187i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.C18194a;
import com.iab.omid.library.inmobi.publisher.C18195b;
import com.iab.omid.library.inmobi.utils.C18207g;
import com.iab.omid.library.inmobi.weakreference.C18225a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.adsession.a */
/* loaded from: classes6.dex */
public class C18169a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f45663a;

    /* renamed from: b */
    private final AdSessionConfiguration f45664b;

    /* renamed from: c */
    private final C18183f f45665c;

    /* renamed from: d */
    private C18225a f45666d;

    /* renamed from: e */
    private AdSessionStatePublisher f45667e;

    /* renamed from: f */
    private boolean f45668f;

    /* renamed from: g */
    private boolean f45669g;

    /* renamed from: h */
    private final String f45670h;

    /* renamed from: i */
    private boolean f45671i;

    /* renamed from: j */
    private boolean f45672j;

    /* renamed from: k */
    private PossibleObstructionListener f45673k;

    public C18169a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m63775a() {
        if (this.f45671i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m63771b() {
        if (this.f45672j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45669g) {
            return;
        }
        this.f45665c.m63709a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m63769c() {
        return this.f45666d.get();
    }

    /* renamed from: d */
    public List<C18182e> m63768d() {
        return this.f45665c.m63711a();
    }

    /* renamed from: e */
    public boolean m63767e() {
        if (this.f45673k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45669g) {
            C18207g.m63605a(errorType, "Error type is null");
            C18207g.m63603a(str, "Message is null");
            getAdSessionStatePublisher().m63664a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m63766f() {
        if (this.f45668f && !this.f45669g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f45669g) {
            return;
        }
        this.f45666d.clear();
        removeAllFriendlyObstructions();
        this.f45669g = true;
        getAdSessionStatePublisher().m63651f();
        C18179c.m63728c().m63729b(this);
        getAdSessionStatePublisher().mo63646b();
        this.f45667e = null;
        this.f45673k = null;
    }

    /* renamed from: g */
    public boolean m63765g() {
        return this.f45669g;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public String getAdSessionId() {
        return this.f45670h;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45667e;
    }

    /* renamed from: h */
    public boolean m63764h() {
        return this.f45664b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m63763i() {
        return this.f45664b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m63762j() {
        return this.f45668f;
    }

    /* renamed from: k */
    public void m63761k() {
        m63775a();
        getAdSessionStatePublisher().m63650g();
        this.f45671i = true;
    }

    /* renamed from: l */
    public void m63760l() {
        m63771b();
        getAdSessionStatePublisher().m63649h();
        this.f45672j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45669g) {
            return;
        }
        C18207g.m63605a(view, "AdView is null");
        if (m63769c() == view) {
            return;
        }
        m63770b(view);
        getAdSessionStatePublisher().m63669a();
        m63774a(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45669g) {
            return;
        }
        this.f45665c.m63707b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45669g) {
            return;
        }
        this.f45665c.m63705c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45673k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f45668f) {
            return;
        }
        this.f45668f = true;
        C18179c.m63728c().m63727c(this);
        this.f45667e.m63668a(C18187i.m63679c().m63680b());
        this.f45667e.m63658a(C18177a.m63738a().m63736b());
        this.f45667e.mo63648a(this, this.f45663a);
    }

    public C18169a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f45665c = new C18183f();
        this.f45668f = false;
        this.f45669g = false;
        this.f45664b = adSessionConfiguration;
        this.f45663a = adSessionContext;
        this.f45670h = str;
        m63770b(null);
        this.f45667e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18194a(str, adSessionContext.getWebView()) : new C18195b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f45667e.mo63645i();
        C18179c.m63728c().m63731a(this);
        this.f45667e.m63665a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m63774a(View view) {
        Collection<C18169a> m63730b = C18179c.m63728c().m63730b();
        if (m63730b == null || m63730b.isEmpty()) {
            return;
        }
        for (C18169a c18169a : m63730b) {
            if (c18169a != this && c18169a.m63769c() == view) {
                c18169a.f45666d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m63770b(View view) {
        this.f45666d = new C18225a(view);
    }

    /* renamed from: a */
    public void m63773a(List<C18225a> list) {
        if (m63767e()) {
            ArrayList arrayList = new ArrayList();
            for (C18225a c18225a : list) {
                View view = c18225a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45673k.onPossibleObstructionsDetected(this.f45670h, arrayList);
        }
    }

    /* renamed from: a */
    public void m63772a(@NonNull JSONObject jSONObject) {
        m63771b();
        getAdSessionStatePublisher().m63657a(jSONObject);
        this.f45672j = true;
    }
}
