package com.iab.omid.library.amazon.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.internal.C17746a;
import com.iab.omid.library.amazon.internal.C17748c;
import com.iab.omid.library.amazon.internal.C17751e;
import com.iab.omid.library.amazon.internal.C17752f;
import com.iab.omid.library.amazon.internal.C17756i;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.C17763a;
import com.iab.omid.library.amazon.publisher.C17764b;
import com.iab.omid.library.amazon.utils.C17776g;
import com.iab.omid.library.amazon.weakreference.C17794a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.adsession.a */
/* loaded from: classes6.dex */
public class C17738a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f44771a;

    /* renamed from: b */
    private final AdSessionConfiguration f44772b;

    /* renamed from: c */
    private final C17752f f44773c;

    /* renamed from: d */
    private C17794a f44774d;

    /* renamed from: e */
    private AdSessionStatePublisher f44775e;

    /* renamed from: f */
    private boolean f44776f;

    /* renamed from: g */
    private boolean f44777g;

    /* renamed from: h */
    private final String f44778h;

    /* renamed from: i */
    private boolean f44779i;

    /* renamed from: j */
    private boolean f44780j;

    /* renamed from: k */
    private PossibleObstructionListener f44781k;

    public C17738a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m65427a() {
        if (this.f44779i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m65423b() {
        if (this.f44780j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f44777g) {
            return;
        }
        this.f44773c.m65361a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m65421c() {
        return this.f44774d.get();
    }

    /* renamed from: d */
    public List<C17751e> m65420d() {
        return this.f44773c.m65363a();
    }

    /* renamed from: e */
    public boolean m65419e() {
        if (this.f44781k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f44777g) {
            C17776g.m65257a(errorType, "Error type is null");
            C17776g.m65255a(str, "Message is null");
            getAdSessionStatePublisher().m65316a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m65418f() {
        if (this.f44776f && !this.f44777g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void finish() {
        if (this.f44777g) {
            return;
        }
        this.f44774d.clear();
        removeAllFriendlyObstructions();
        this.f44777g = true;
        getAdSessionStatePublisher().m65303f();
        C17748c.m65380c().m65381b(this);
        getAdSessionStatePublisher().mo65298b();
        this.f44775e = null;
        this.f44781k = null;
    }

    /* renamed from: g */
    public boolean m65417g() {
        return this.f44777g;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public String getAdSessionId() {
        return this.f44778h;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f44775e;
    }

    /* renamed from: h */
    public boolean m65416h() {
        return this.f44772b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m65415i() {
        return this.f44772b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m65414j() {
        return this.f44776f;
    }

    /* renamed from: k */
    public void m65413k() {
        m65427a();
        getAdSessionStatePublisher().m65302g();
        this.f44779i = true;
    }

    /* renamed from: l */
    public void m65412l() {
        m65423b();
        getAdSessionStatePublisher().m65301h();
        this.f44780j = true;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f44777g) {
            return;
        }
        C17776g.m65257a(view, "AdView is null");
        if (m65421c() == view) {
            return;
        }
        m65422b(view);
        getAdSessionStatePublisher().m65321a();
        m65426a(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f44777g) {
            return;
        }
        this.f44773c.m65359b();
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f44777g) {
            return;
        }
        this.f44773c.m65357c(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f44781k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void start() {
        if (this.f44776f) {
            return;
        }
        this.f44776f = true;
        C17748c.m65380c().m65379c(this);
        this.f44775e.m65320a(C17756i.m65331c().m65332b());
        this.f44775e.m65310a(C17746a.m65390a().m65388b());
        this.f44775e.mo65300a(this, this.f44771a);
    }

    public C17738a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f44773c = new C17752f();
        this.f44776f = false;
        this.f44777g = false;
        this.f44772b = adSessionConfiguration;
        this.f44771a = adSessionContext;
        this.f44778h = str;
        m65422b(null);
        this.f44775e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C17763a(str, adSessionContext.getWebView()) : new C17764b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f44775e.mo65297i();
        C17748c.m65380c().m65383a(this);
        this.f44775e.m65317a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m65426a(View view) {
        Collection<C17738a> m65382b = C17748c.m65380c().m65382b();
        if (m65382b == null || m65382b.isEmpty()) {
            return;
        }
        for (C17738a c17738a : m65382b) {
            if (c17738a != this && c17738a.m65421c() == view) {
                c17738a.f44774d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m65422b(View view) {
        this.f44774d = new C17794a(view);
    }

    /* renamed from: a */
    public void m65425a(List<C17794a> list) {
        if (m65419e()) {
            ArrayList arrayList = new ArrayList();
            for (C17794a c17794a : list) {
                View view = c17794a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f44781k.onPossibleObstructionsDetected(this.f44778h, arrayList);
        }
    }

    /* renamed from: a */
    public void m65424a(@NonNull JSONObject jSONObject) {
        m65423b();
        getAdSessionStatePublisher().m65309a(jSONObject);
        this.f44780j = true;
    }
}
