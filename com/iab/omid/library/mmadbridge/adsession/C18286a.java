package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.C18294a;
import com.iab.omid.library.mmadbridge.internal.C18296c;
import com.iab.omid.library.mmadbridge.internal.C18299e;
import com.iab.omid.library.mmadbridge.internal.C18300f;
import com.iab.omid.library.mmadbridge.internal.C18304i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.C18313a;
import com.iab.omid.library.mmadbridge.publisher.C18314b;
import com.iab.omid.library.mmadbridge.utils.C18326g;
import com.iab.omid.library.mmadbridge.weakreference.C18344a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.adsession.a */
/* loaded from: classes6.dex */
public class C18286a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f45917a;

    /* renamed from: b */
    private final AdSessionConfiguration f45918b;

    /* renamed from: c */
    private final C18300f f45919c;

    /* renamed from: d */
    private C18344a f45920d;

    /* renamed from: e */
    private AdSessionStatePublisher f45921e;

    /* renamed from: f */
    private boolean f45922f;

    /* renamed from: g */
    private boolean f45923g;

    /* renamed from: h */
    private final String f45924h;

    /* renamed from: i */
    private boolean f45925i;

    /* renamed from: j */
    private boolean f45926j;

    /* renamed from: k */
    private PossibleObstructionListener f45927k;

    public C18286a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m63299a() {
        if (this.f45925i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m63295b() {
        if (this.f45926j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45923g) {
            return;
        }
        this.f45919c.m63233a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m63293c() {
        return this.f45920d.get();
    }

    /* renamed from: d */
    public List<C18299e> m63292d() {
        return this.f45919c.m63235a();
    }

    /* renamed from: e */
    public boolean m63291e() {
        if (this.f45927k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45923g) {
            C18326g.m63120a(errorType, "Error type is null");
            C18326g.m63118a(str, "Message is null");
            getAdSessionStatePublisher().m63181a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m63290f() {
        if (this.f45922f && !this.f45923g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f45923g) {
            return;
        }
        this.f45920d.clear();
        removeAllFriendlyObstructions();
        this.f45923g = true;
        getAdSessionStatePublisher().m63167f();
        C18296c.m63252c().m63253b(this);
        getAdSessionStatePublisher().mo63162b();
        this.f45921e = null;
        this.f45927k = null;
    }

    /* renamed from: g */
    public boolean m63289g() {
        return this.f45923g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f45924h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45921e;
    }

    /* renamed from: h */
    public boolean m63288h() {
        return this.f45918b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m63287i() {
        return this.f45918b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m63286j() {
        return this.f45922f;
    }

    /* renamed from: k */
    public void m63285k() {
        m63299a();
        getAdSessionStatePublisher().m63166g();
        this.f45925i = true;
    }

    /* renamed from: l */
    public void m63284l() {
        m63295b();
        getAdSessionStatePublisher().m63165h();
        this.f45926j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45923g) {
            return;
        }
        C18326g.m63120a(view, "AdView is null");
        if (m63293c() == view) {
            return;
        }
        m63294b(view);
        getAdSessionStatePublisher().m63186a();
        m63298a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45923g) {
            return;
        }
        this.f45919c.m63231b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45923g) {
            return;
        }
        this.f45919c.m63229c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45927k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f45922f) {
            return;
        }
        this.f45922f = true;
        C18296c.m63252c().m63251c(this);
        this.f45921e.m63185a(C18304i.m63202c().m63203b());
        this.f45921e.m63175a(C18294a.m63262a().m63260b());
        this.f45921e.mo63164a(this, this.f45917a);
    }

    public C18286a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f45919c = new C18300f();
        this.f45922f = false;
        this.f45923g = false;
        this.f45918b = adSessionConfiguration;
        this.f45917a = adSessionContext;
        this.f45924h = str;
        m63294b(null);
        this.f45921e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18313a(str, adSessionContext.getWebView()) : new C18314b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f45921e.mo63161i();
        C18296c.m63252c().m63255a(this);
        this.f45921e.m63182a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m63298a(View view) {
        Collection<C18286a> m63254b = C18296c.m63252c().m63254b();
        if (m63254b == null || m63254b.isEmpty()) {
            return;
        }
        for (C18286a c18286a : m63254b) {
            if (c18286a != this && c18286a.m63293c() == view) {
                c18286a.f45920d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m63294b(View view) {
        this.f45920d = new C18344a(view);
    }

    /* renamed from: a */
    public void m63297a(List<C18344a> list) {
        if (m63291e()) {
            ArrayList arrayList = new ArrayList();
            for (C18344a c18344a : list) {
                View view = c18344a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45927k.onPossibleObstructionsDetected(this.f45924h, arrayList);
        }
    }

    /* renamed from: a */
    public void m63296a(@NonNull JSONObject jSONObject) {
        m63295b();
        getAdSessionStatePublisher().m63174a(jSONObject);
        this.f45926j = true;
    }
}
