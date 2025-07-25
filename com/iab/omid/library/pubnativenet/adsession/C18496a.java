package com.iab.omid.library.pubnativenet.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.internal.C18504a;
import com.iab.omid.library.pubnativenet.internal.C18506c;
import com.iab.omid.library.pubnativenet.internal.C18509e;
import com.iab.omid.library.pubnativenet.internal.C18510f;
import com.iab.omid.library.pubnativenet.internal.C18514i;
import com.iab.omid.library.pubnativenet.publisher.AdSessionStatePublisher;
import com.iab.omid.library.pubnativenet.publisher.C18523a;
import com.iab.omid.library.pubnativenet.publisher.C18524b;
import com.iab.omid.library.pubnativenet.utils.C18536g;
import com.iab.omid.library.pubnativenet.weakreference.C18554a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.adsession.a */
/* loaded from: classes6.dex */
public class C18496a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f46322a;

    /* renamed from: b */
    private final AdSessionConfiguration f46323b;

    /* renamed from: c */
    private final C18510f f46324c;

    /* renamed from: d */
    private C18554a f46325d;

    /* renamed from: e */
    private AdSessionStatePublisher f46326e;

    /* renamed from: f */
    private boolean f46327f;

    /* renamed from: g */
    private boolean f46328g;

    /* renamed from: h */
    private final String f46329h;

    /* renamed from: i */
    private boolean f46330i;

    /* renamed from: j */
    private boolean f46331j;

    /* renamed from: k */
    private PossibleObstructionListener f46332k;

    public C18496a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m62540a() {
        if (this.f46330i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m62536b() {
        if (this.f46331j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46328g) {
            return;
        }
        this.f46324c.m62474a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m62534c() {
        return this.f46325d.get();
    }

    /* renamed from: d */
    public List<C18509e> m62533d() {
        return this.f46324c.m62476a();
    }

    /* renamed from: e */
    public boolean m62532e() {
        if (this.f46332k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46328g) {
            C18536g.m62361a(errorType, "Error type is null");
            C18536g.m62359a(str, "Message is null");
            getAdSessionStatePublisher().m62422a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m62531f() {
        if (this.f46327f && !this.f46328g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void finish() {
        if (this.f46328g) {
            return;
        }
        this.f46325d.clear();
        removeAllFriendlyObstructions();
        this.f46328g = true;
        getAdSessionStatePublisher().m62408f();
        C18506c.m62493c().m62494b(this);
        getAdSessionStatePublisher().mo62403b();
        this.f46326e = null;
        this.f46332k = null;
    }

    /* renamed from: g */
    public boolean m62530g() {
        return this.f46328g;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public String getAdSessionId() {
        return this.f46329h;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46326e;
    }

    /* renamed from: h */
    public boolean m62529h() {
        return this.f46323b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m62528i() {
        return this.f46323b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m62527j() {
        return this.f46327f;
    }

    /* renamed from: k */
    public void m62526k() {
        m62540a();
        getAdSessionStatePublisher().m62407g();
        this.f46330i = true;
    }

    /* renamed from: l */
    public void m62525l() {
        m62536b();
        getAdSessionStatePublisher().m62406h();
        this.f46331j = true;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f46328g || m62534c() == view) {
            return;
        }
        m62535b(view);
        getAdSessionStatePublisher().m62427a();
        m62539a(view);
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46328g) {
            return;
        }
        this.f46324c.m62472b();
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46328g) {
            return;
        }
        this.f46324c.m62470c(view);
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46332k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.pubnativenet.adsession.AdSession
    public void start() {
        if (!this.f46327f && this.f46326e != null) {
            this.f46327f = true;
            C18506c.m62493c().m62492c(this);
            this.f46326e.m62426a(C18514i.m62443c().m62444b());
            this.f46326e.m62416a(C18504a.m62503a().m62501b());
            this.f46326e.mo62405a(this, this.f46322a);
        }
    }

    public C18496a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f46324c = new C18510f();
        this.f46327f = false;
        this.f46328g = false;
        this.f46323b = adSessionConfiguration;
        this.f46322a = adSessionContext;
        this.f46329h = str;
        m62535b(null);
        this.f46326e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18523a(str, adSessionContext.getWebView()) : new C18524b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f46326e.mo62402i();
        C18506c.m62493c().m62496a(this);
        this.f46326e.m62423a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m62539a(@Nullable View view) {
        Collection<C18496a> m62495b = C18506c.m62493c().m62495b();
        if (m62495b == null || m62495b.isEmpty()) {
            return;
        }
        for (C18496a c18496a : m62495b) {
            if (c18496a != this && c18496a.m62534c() == view) {
                c18496a.f46325d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m62535b(@Nullable View view) {
        this.f46325d = new C18554a(view);
    }

    /* renamed from: a */
    public void m62538a(List<C18554a> list) {
        if (m62532e()) {
            ArrayList arrayList = new ArrayList();
            for (C18554a c18554a : list) {
                View view = c18554a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46332k.onPossibleObstructionsDetected(this.f46329h, arrayList);
        }
    }

    /* renamed from: a */
    public void m62537a(@NonNull JSONObject jSONObject) {
        m62536b();
        getAdSessionStatePublisher().m62415a(jSONObject);
        this.f46331j = true;
    }
}
