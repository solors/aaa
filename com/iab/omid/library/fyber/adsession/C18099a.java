package com.iab.omid.library.fyber.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.internal.C18107a;
import com.iab.omid.library.fyber.internal.C18109c;
import com.iab.omid.library.fyber.internal.C18112e;
import com.iab.omid.library.fyber.internal.C18113f;
import com.iab.omid.library.fyber.internal.C18117i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.C18126a;
import com.iab.omid.library.fyber.publisher.C18127b;
import com.iab.omid.library.fyber.utils.C18139g;
import com.iab.omid.library.fyber.weakreference.C18157a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.adsession.a */
/* loaded from: classes6.dex */
public class C18099a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f45528a;

    /* renamed from: b */
    private final AdSessionConfiguration f45529b;

    /* renamed from: c */
    private final C18113f f45530c;

    /* renamed from: d */
    private C18157a f45531d;

    /* renamed from: e */
    private AdSessionStatePublisher f45532e;

    /* renamed from: f */
    private boolean f45533f;

    /* renamed from: g */
    private boolean f45534g;

    /* renamed from: h */
    private final String f45535h;

    /* renamed from: i */
    private boolean f45536i;

    /* renamed from: j */
    private boolean f45537j;

    /* renamed from: k */
    private PossibleObstructionListener f45538k;

    public C18099a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m64028a() {
        if (this.f45536i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m64024b() {
        if (this.f45537j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45534g) {
            return;
        }
        this.f45530c.m63962a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m64022c() {
        return this.f45531d.get();
    }

    /* renamed from: d */
    public List<C18112e> m64021d() {
        return this.f45530c.m63964a();
    }

    /* renamed from: e */
    public boolean m64020e() {
        if (this.f45538k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45534g) {
            C18139g.m63849a(errorType, "Error type is null");
            C18139g.m63847a(str, "Message is null");
            getAdSessionStatePublisher().m63910a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m64019f() {
        if (this.f45533f && !this.f45534g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f45534g) {
            return;
        }
        this.f45531d.clear();
        removeAllFriendlyObstructions();
        this.f45534g = true;
        getAdSessionStatePublisher().m63896f();
        C18109c.m63981c().m63982b(this);
        getAdSessionStatePublisher().mo63891b();
        this.f45532e = null;
        this.f45538k = null;
    }

    /* renamed from: g */
    public boolean m64018g() {
        return this.f45534g;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public String getAdSessionId() {
        return this.f45535h;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45532e;
    }

    /* renamed from: h */
    public boolean m64017h() {
        return this.f45529b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m64016i() {
        return this.f45529b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m64015j() {
        return this.f45533f;
    }

    /* renamed from: k */
    public void m64014k() {
        m64028a();
        getAdSessionStatePublisher().m63895g();
        this.f45536i = true;
    }

    /* renamed from: l */
    public void m64013l() {
        m64024b();
        getAdSessionStatePublisher().m63894h();
        this.f45537j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f45534g || m64022c() == view) {
            return;
        }
        m64023b(view);
        getAdSessionStatePublisher().m63915a();
        m64027a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45534g) {
            return;
        }
        this.f45530c.m63960b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45534g) {
            return;
        }
        this.f45530c.m63958c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45538k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (!this.f45533f && this.f45532e != null) {
            this.f45533f = true;
            C18109c.m63981c().m63980c(this);
            this.f45532e.m63914a(C18117i.m63931c().m63932b());
            this.f45532e.m63904a(C18107a.m63991a().m63989b());
            this.f45532e.mo63893a(this, this.f45528a);
        }
    }

    public C18099a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f45530c = new C18113f();
        this.f45533f = false;
        this.f45534g = false;
        this.f45529b = adSessionConfiguration;
        this.f45528a = adSessionContext;
        this.f45535h = str;
        m64023b(null);
        this.f45532e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18126a(str, adSessionContext.getWebView()) : new C18127b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f45532e.mo63890i();
        C18109c.m63981c().m63984a(this);
        this.f45532e.m63911a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m64027a(@Nullable View view) {
        Collection<C18099a> m63983b = C18109c.m63981c().m63983b();
        if (m63983b == null || m63983b.isEmpty()) {
            return;
        }
        for (C18099a c18099a : m63983b) {
            if (c18099a != this && c18099a.m64022c() == view) {
                c18099a.f45531d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m64023b(@Nullable View view) {
        this.f45531d = new C18157a(view);
    }

    /* renamed from: a */
    public void m64026a(List<C18157a> list) {
        if (m64020e()) {
            ArrayList arrayList = new ArrayList();
            for (C18157a c18157a : list) {
                View view = c18157a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45538k.onPossibleObstructionsDetected(this.f45535h, arrayList);
        }
    }

    /* renamed from: a */
    public void m64025a(@NonNull JSONObject jSONObject) {
        m64024b();
        getAdSessionStatePublisher().m63903a(jSONObject);
        this.f45537j = true;
    }
}
