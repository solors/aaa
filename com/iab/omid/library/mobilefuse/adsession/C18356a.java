package com.iab.omid.library.mobilefuse.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mobilefuse.internal.C18364a;
import com.iab.omid.library.mobilefuse.internal.C18366c;
import com.iab.omid.library.mobilefuse.internal.C18369e;
import com.iab.omid.library.mobilefuse.internal.C18370f;
import com.iab.omid.library.mobilefuse.internal.C18374i;
import com.iab.omid.library.mobilefuse.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mobilefuse.publisher.C18383a;
import com.iab.omid.library.mobilefuse.publisher.C18384b;
import com.iab.omid.library.mobilefuse.utils.C18396g;
import com.iab.omid.library.mobilefuse.weakreference.C18414a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.adsession.a */
/* loaded from: classes6.dex */
public class C18356a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f46052a;

    /* renamed from: b */
    private final AdSessionConfiguration f46053b;

    /* renamed from: c */
    private final C18370f f46054c;

    /* renamed from: d */
    private C18414a f46055d;

    /* renamed from: e */
    private AdSessionStatePublisher f46056e;

    /* renamed from: f */
    private boolean f46057f;

    /* renamed from: g */
    private boolean f46058g;

    /* renamed from: h */
    private final String f46059h;

    /* renamed from: i */
    private boolean f46060i;

    /* renamed from: j */
    private boolean f46061j;

    /* renamed from: k */
    private PossibleObstructionListener f46062k;

    public C18356a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m63046a() {
        if (this.f46060i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m63042b() {
        if (this.f46061j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46058g) {
            return;
        }
        this.f46054c.m62980a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m63040c() {
        return this.f46055d.get();
    }

    /* renamed from: d */
    public List<C18369e> m63039d() {
        return this.f46054c.m62982a();
    }

    /* renamed from: e */
    public boolean m63038e() {
        if (this.f46062k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46058g) {
            C18396g.m62867a(errorType, "Error type is null");
            C18396g.m62865a(str, "Message is null");
            getAdSessionStatePublisher().m62928a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m63037f() {
        if (this.f46057f && !this.f46058g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void finish() {
        if (this.f46058g) {
            return;
        }
        this.f46055d.clear();
        removeAllFriendlyObstructions();
        this.f46058g = true;
        getAdSessionStatePublisher().m62914f();
        C18366c.m62999c().m63000b(this);
        getAdSessionStatePublisher().mo62909b();
        this.f46056e = null;
        this.f46062k = null;
    }

    /* renamed from: g */
    public boolean m63036g() {
        return this.f46058g;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public String getAdSessionId() {
        return this.f46059h;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46056e;
    }

    /* renamed from: h */
    public boolean m63035h() {
        return this.f46053b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m63034i() {
        return this.f46053b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m63033j() {
        return this.f46057f;
    }

    /* renamed from: k */
    public void m63032k() {
        m63046a();
        getAdSessionStatePublisher().m62913g();
        this.f46060i = true;
    }

    /* renamed from: l */
    public void m63031l() {
        m63042b();
        getAdSessionStatePublisher().m62912h();
        this.f46061j = true;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f46058g) {
            return;
        }
        C18396g.m62867a(view, "AdView is null");
        if (m63040c() == view) {
            return;
        }
        m63041b(view);
        getAdSessionStatePublisher().m62933a();
        m63045a(view);
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46058g) {
            return;
        }
        this.f46054c.m62978b();
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46058g) {
            return;
        }
        this.f46054c.m62976c(view);
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46062k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mobilefuse.adsession.AdSession
    public void start() {
        if (this.f46057f) {
            return;
        }
        this.f46057f = true;
        C18366c.m62999c().m62998c(this);
        this.f46056e.m62932a(C18374i.m62949c().m62950b());
        this.f46056e.m62922a(C18364a.m63009a().m63007b());
        this.f46056e.mo62911a(this, this.f46052a);
    }

    public C18356a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f46054c = new C18370f();
        this.f46057f = false;
        this.f46058g = false;
        this.f46053b = adSessionConfiguration;
        this.f46052a = adSessionContext;
        this.f46059h = str;
        m63041b(null);
        this.f46056e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18383a(str, adSessionContext.getWebView()) : new C18384b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f46056e.mo62908i();
        C18366c.m62999c().m63002a(this);
        this.f46056e.m62929a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m63045a(View view) {
        Collection<C18356a> m63001b = C18366c.m62999c().m63001b();
        if (m63001b == null || m63001b.isEmpty()) {
            return;
        }
        for (C18356a c18356a : m63001b) {
            if (c18356a != this && c18356a.m63040c() == view) {
                c18356a.f46055d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m63041b(View view) {
        this.f46055d = new C18414a(view);
    }

    /* renamed from: a */
    public void m63044a(List<C18414a> list) {
        if (m63038e()) {
            ArrayList arrayList = new ArrayList();
            for (C18414a c18414a : list) {
                View view = c18414a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46062k.onPossibleObstructionsDetected(this.f46059h, arrayList);
        }
    }

    /* renamed from: a */
    public void m63043a(@NonNull JSONObject jSONObject) {
        m63042b();
        getAdSessionStatePublisher().m62921a(jSONObject);
        this.f46061j = true;
    }
}
