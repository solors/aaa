package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.corpmailru.p393b.C18047a;
import com.iab.omid.library.corpmailru.p393b.C18050c;
import com.iab.omid.library.corpmailru.p393b.C18054f;
import com.iab.omid.library.corpmailru.p395d.C18066e;
import com.iab.omid.library.corpmailru.p396e.C18068a;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;
import com.iab.omid.library.corpmailru.publisher.C18071a;
import com.iab.omid.library.corpmailru.publisher.C18072b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.adsession.a */
/* loaded from: classes6.dex */
public class C18045a extends AdSession {

    /* renamed from: a */
    private static final Pattern f45419a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f45420b;

    /* renamed from: c */
    private final AdSessionConfiguration f45421c;

    /* renamed from: e */
    private C18068a f45423e;

    /* renamed from: f */
    private AdSessionStatePublisher f45424f;

    /* renamed from: j */
    private boolean f45428j;

    /* renamed from: k */
    private boolean f45429k;

    /* renamed from: d */
    private final List<C18050c> f45422d = new ArrayList();

    /* renamed from: g */
    private boolean f45425g = false;

    /* renamed from: h */
    private boolean f45426h = false;

    /* renamed from: i */
    private final String f45427i = UUID.randomUUID().toString();

    public C18045a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher c18071a;
        this.f45421c = adSessionConfiguration;
        this.f45420b = adSessionContext;
        m64222c(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            c18071a = new C18072b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            c18071a = new C18071a(adSessionContext.getWebView());
        }
        this.f45424f = c18071a;
        this.f45424f.mo64085a();
        C18047a.m64206a().m64205a(this);
        this.f45424f.m64102a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C18050c m64228a(View view) {
        for (C18050c c18050c : this.f45422d) {
            if (c18050c.m64191a().get() == view) {
                return c18050c;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m64214j() {
        if (!this.f45428j) {
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    /* renamed from: k */
    private void m64213k() {
        if (!this.f45429k) {
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45426h) {
            return;
        }
        m64224b(view);
        m64227a(str);
        if (m64228a(view) == null) {
            this.f45422d.add(new C18050c(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: b */
    public void m64225b() {
        m64214j();
        getAdSessionStatePublisher().m64088g();
        this.f45428j = true;
    }

    /* renamed from: c */
    public void m64223c() {
        m64213k();
        getAdSessionStatePublisher().m64087h();
        this.f45429k = true;
    }

    /* renamed from: d */
    public View m64221d() {
        return this.f45423e.get();
    }

    /* renamed from: e */
    public boolean m64219e() {
        if (this.f45425g && !this.f45426h) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45426h) {
            C18066e.m64120a(errorType, "Error type is null");
            C18066e.m64118a(str, "Message is null");
            getAdSessionStatePublisher().m64101a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m64218f() {
        return this.f45425g;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void finish() {
        if (this.f45426h) {
            return;
        }
        this.f45423e.clear();
        removeAllFriendlyObstructions();
        this.f45426h = true;
        getAdSessionStatePublisher().m64089f();
        C18047a.m64206a().m64201c(this);
        getAdSessionStatePublisher().mo64082b();
        this.f45424f = null;
    }

    /* renamed from: g */
    public boolean m64217g() {
        return this.f45426h;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public String getAdSessionId() {
        return this.f45427i;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45424f;
    }

    /* renamed from: h */
    public boolean m64216h() {
        return this.f45421c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m64215i() {
        return this.f45421c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45426h) {
            return;
        }
        C18066e.m64120a(view, "AdView is null");
        if (m64221d() == view) {
            return;
        }
        m64222c(view);
        getAdSessionStatePublisher().m64086i();
        m64220d(view);
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45426h) {
            return;
        }
        this.f45422d.clear();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45426h) {
            return;
        }
        m64224b(view);
        C18050c m64228a = m64228a(view);
        if (m64228a != null) {
            this.f45422d.remove(m64228a);
        }
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void start() {
        if (this.f45425g) {
            return;
        }
        this.f45425g = true;
        C18047a.m64206a().m64203b(this);
        this.f45424f.m64105a(C18054f.m64167a().m64161d());
        this.f45424f.mo64084a(this, this.f45420b);
    }

    /* renamed from: b */
    private static void m64224b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m64222c(View view) {
        this.f45423e = new C18068a(view);
    }

    /* renamed from: d */
    private void m64220d(View view) {
        Collection<C18045a> m64204b = C18047a.m64206a().m64204b();
        if (m64204b == null || m64204b.isEmpty()) {
            return;
        }
        for (C18045a c18045a : m64204b) {
            if (c18045a != this && c18045a.m64221d() == view) {
                c18045a.f45423e.clear();
            }
        }
    }

    /* renamed from: a */
    public List<C18050c> m64229a() {
        return this.f45422d;
    }

    /* renamed from: a */
    private void m64227a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f45419a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    /* renamed from: a */
    public void m64226a(@NonNull JSONObject jSONObject) {
        m64213k();
        getAdSessionStatePublisher().m64095a(jSONObject);
        this.f45429k = true;
    }
}
