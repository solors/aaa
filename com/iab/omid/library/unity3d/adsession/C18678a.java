package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.internal.C18686a;
import com.iab.omid.library.unity3d.internal.C18688c;
import com.iab.omid.library.unity3d.internal.C18691e;
import com.iab.omid.library.unity3d.internal.C18695h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.C18702a;
import com.iab.omid.library.unity3d.publisher.C18703b;
import com.iab.omid.library.unity3d.utils.C18715g;
import com.iab.omid.library.unity3d.weakreference.C18732a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.adsession.a */
/* loaded from: classes6.dex */
public class C18678a extends AdSession {

    /* renamed from: l */
    private static final Pattern f46720l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f46721a;

    /* renamed from: b */
    private final AdSessionConfiguration f46722b;

    /* renamed from: d */
    private C18732a f46724d;

    /* renamed from: e */
    private AdSessionStatePublisher f46725e;

    /* renamed from: h */
    private final String f46728h;

    /* renamed from: i */
    private boolean f46729i;

    /* renamed from: j */
    private boolean f46730j;

    /* renamed from: k */
    private PossibleObstructionListener f46731k;

    /* renamed from: c */
    private final List<C18691e> f46723c = new ArrayList();

    /* renamed from: f */
    private boolean f46726f = false;

    /* renamed from: g */
    private boolean f46727g = false;

    public C18678a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher c18702a;
        this.f46722b = adSessionConfiguration;
        this.f46721a = adSessionContext;
        String uuid = UUID.randomUUID().toString();
        this.f46728h = uuid;
        m61789d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            c18702a = new C18703b(uuid, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            c18702a = new C18702a(uuid, adSessionContext.getWebView());
        }
        this.f46725e = c18702a;
        this.f46725e.mo61673i();
        C18688c.m61749c().m61752a(this);
        this.f46725e.m61693a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m61799a() {
        if (this.f46729i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private C18691e m61793b(View view) {
        for (C18691e c18691e : this.f46723c) {
            if (c18691e.m61734c().get() == view) {
                return c18691e;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46727g) {
            return;
        }
        m61798a(view);
        m61797a(str);
        if (m61793b(view) == null) {
            this.f46723c.add(new C18691e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: c */
    public View m61792c() {
        return this.f46724d.get();
    }

    /* renamed from: d */
    public List<C18691e> m61790d() {
        return this.f46723c;
    }

    /* renamed from: e */
    public boolean m61788e() {
        if (this.f46731k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46727g) {
            C18715g.m61634a(errorType, "Error type is null");
            C18715g.m61632a(str, "Message is null");
            getAdSessionStatePublisher().m61692a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m61787f() {
        if (this.f46726f && !this.f46727g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f46727g) {
            return;
        }
        this.f46724d.clear();
        removeAllFriendlyObstructions();
        this.f46727g = true;
        getAdSessionStatePublisher().m61679f();
        C18688c.m61749c().m61750b(this);
        getAdSessionStatePublisher().mo61674b();
        this.f46725e = null;
        this.f46731k = null;
    }

    /* renamed from: g */
    public boolean m61786g() {
        return this.f46727g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f46728h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46725e;
    }

    /* renamed from: h */
    public boolean m61785h() {
        return this.f46722b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m61784i() {
        return this.f46722b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m61783j() {
        return this.f46726f;
    }

    /* renamed from: k */
    public void m61782k() {
        m61799a();
        getAdSessionStatePublisher().m61678g();
        this.f46729i = true;
    }

    /* renamed from: l */
    public void m61781l() {
        m61794b();
        getAdSessionStatePublisher().m61677h();
        this.f46730j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f46727g) {
            return;
        }
        C18715g.m61634a(view, "AdView is null");
        if (m61792c() == view) {
            return;
        }
        m61789d(view);
        getAdSessionStatePublisher().m61697a();
        m61791c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46727g) {
            return;
        }
        this.f46723c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46727g) {
            return;
        }
        m61798a(view);
        C18691e m61793b = m61793b(view);
        if (m61793b != null) {
            this.f46723c.remove(m61793b);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46731k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f46726f) {
            return;
        }
        this.f46726f = true;
        C18688c.m61749c().m61748c(this);
        this.f46725e.m61696a(C18695h.m61707c().m61708b());
        this.f46725e.m61686a(C18686a.m61759a().m61757b());
        this.f46725e.mo61676a(this, this.f46721a);
    }

    /* renamed from: a */
    private static void m61798a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    private void m61794b() {
        if (this.f46730j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m61791c(View view) {
        Collection<C18678a> m61751b = C18688c.m61749c().m61751b();
        if (m61751b == null || m61751b.isEmpty()) {
            return;
        }
        for (C18678a c18678a : m61751b) {
            if (c18678a != this && c18678a.m61792c() == view) {
                c18678a.f46724d.clear();
            }
        }
    }

    /* renamed from: d */
    private void m61789d(View view) {
        this.f46724d = new C18732a(view);
    }

    /* renamed from: a */
    private void m61797a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46720l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* renamed from: a */
    public void m61796a(List<C18732a> list) {
        if (m61788e()) {
            ArrayList arrayList = new ArrayList();
            for (C18732a c18732a : list) {
                View view = c18732a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46731k.onPossibleObstructionsDetected(this.f46728h, arrayList);
        }
    }

    /* renamed from: a */
    public void m61795a(@NonNull JSONObject jSONObject) {
        m61794b();
        getAdSessionStatePublisher().m61685a(jSONObject);
        this.f46730j = true;
    }
}
