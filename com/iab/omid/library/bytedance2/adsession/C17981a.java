package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.C17989a;
import com.iab.omid.library.bytedance2.internal.C17991c;
import com.iab.omid.library.bytedance2.internal.C17994e;
import com.iab.omid.library.bytedance2.internal.C17995f;
import com.iab.omid.library.bytedance2.internal.C17999i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.C18006a;
import com.iab.omid.library.bytedance2.publisher.C18007b;
import com.iab.omid.library.bytedance2.utils.C18019g;
import com.iab.omid.library.bytedance2.weakreference.C18037a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.adsession.a */
/* loaded from: classes6.dex */
public class C17981a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f45285a;

    /* renamed from: b */
    private final AdSessionConfiguration f45286b;

    /* renamed from: c */
    private final C17995f f45287c;

    /* renamed from: d */
    private C18037a f45288d;

    /* renamed from: e */
    private AdSessionStatePublisher f45289e;

    /* renamed from: f */
    private boolean f45290f;

    /* renamed from: g */
    private boolean f45291g;

    /* renamed from: h */
    private final String f45292h;

    /* renamed from: i */
    private boolean f45293i;

    /* renamed from: j */
    private boolean f45294j;

    /* renamed from: k */
    private PossibleObstructionListener f45295k;

    public C17981a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m64478a() {
        if (this.f45293i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m64474b() {
        if (this.f45294j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45291g) {
            return;
        }
        this.f45287c.m64412a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m64472c() {
        return this.f45288d.get();
    }

    /* renamed from: d */
    public List<C17994e> m64471d() {
        return this.f45287c.m64414a();
    }

    /* renamed from: e */
    public boolean m64470e() {
        if (this.f45295k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45291g) {
            C18019g.m64308a(errorType, "Error type is null");
            C18019g.m64306a(str, "Message is null");
            getAdSessionStatePublisher().m64367a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m64469f() {
        if (this.f45290f && !this.f45291g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f45291g) {
            return;
        }
        this.f45288d.clear();
        removeAllFriendlyObstructions();
        this.f45291g = true;
        getAdSessionStatePublisher().m64354f();
        C17991c.m64431c().m64432b(this);
        getAdSessionStatePublisher().mo64349b();
        this.f45289e = null;
        this.f45295k = null;
    }

    /* renamed from: g */
    public boolean m64468g() {
        return this.f45291g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f45292h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45289e;
    }

    /* renamed from: h */
    public boolean m64467h() {
        return this.f45286b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m64466i() {
        return this.f45286b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m64465j() {
        return this.f45290f;
    }

    /* renamed from: k */
    public void m64464k() {
        m64478a();
        getAdSessionStatePublisher().m64353g();
        this.f45293i = true;
    }

    /* renamed from: l */
    public void m64463l() {
        m64474b();
        getAdSessionStatePublisher().m64352h();
        this.f45294j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45291g) {
            return;
        }
        C18019g.m64308a(view, "AdView is null");
        if (m64472c() == view) {
            return;
        }
        m64473b(view);
        getAdSessionStatePublisher().m64372a();
        m64477a(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45291g) {
            return;
        }
        this.f45287c.m64410b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45291g) {
            return;
        }
        this.f45287c.m64408c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45295k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f45290f) {
            return;
        }
        this.f45290f = true;
        C17991c.m64431c().m64430c(this);
        this.f45289e.m64371a(C17999i.m64382c().m64383b());
        this.f45289e.m64361a(C17989a.m64441a().m64439b());
        this.f45289e.mo64351a(this, this.f45285a);
    }

    public C17981a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f45287c = new C17995f();
        this.f45290f = false;
        this.f45291g = false;
        this.f45286b = adSessionConfiguration;
        this.f45285a = adSessionContext;
        this.f45292h = str;
        m64473b(null);
        this.f45289e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18006a(str, adSessionContext.getWebView()) : new C18007b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f45289e.mo64348i();
        C17991c.m64431c().m64434a(this);
        this.f45289e.m64368a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m64477a(View view) {
        Collection<C17981a> m64433b = C17991c.m64431c().m64433b();
        if (m64433b == null || m64433b.isEmpty()) {
            return;
        }
        for (C17981a c17981a : m64433b) {
            if (c17981a != this && c17981a.m64472c() == view) {
                c17981a.f45288d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m64473b(View view) {
        this.f45288d = new C18037a(view);
    }

    /* renamed from: a */
    public void m64476a(List<C18037a> list) {
        if (m64470e()) {
            ArrayList arrayList = new ArrayList();
            for (C18037a c18037a : list) {
                View view = c18037a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45295k.onPossibleObstructionsDetected(this.f45292h, arrayList);
        }
    }

    /* renamed from: a */
    public void m64475a(@NonNull JSONObject jSONObject) {
        m64474b();
        getAdSessionStatePublisher().m64360a(jSONObject);
        this.f45294j = true;
    }
}
