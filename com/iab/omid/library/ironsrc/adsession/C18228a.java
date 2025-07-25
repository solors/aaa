package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.C18236a;
import com.iab.omid.library.ironsrc.internal.C18238c;
import com.iab.omid.library.ironsrc.internal.C18241e;
import com.iab.omid.library.ironsrc.internal.C18245h;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C18252a;
import com.iab.omid.library.ironsrc.publisher.C18253b;
import com.iab.omid.library.ironsrc.utils.C18264g;
import com.iab.omid.library.ironsrc.weakreference.C18281a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
/* loaded from: classes6.dex */
public class C18228a extends AdSession {

    /* renamed from: l */
    private static final Pattern f45792l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f45793a;

    /* renamed from: b */
    private final AdSessionConfiguration f45794b;

    /* renamed from: d */
    private C18281a f45796d;

    /* renamed from: e */
    private AdSessionStatePublisher f45797e;

    /* renamed from: i */
    private boolean f45801i;

    /* renamed from: j */
    private boolean f45802j;

    /* renamed from: k */
    private PossibleObstructionListener f45803k;

    /* renamed from: c */
    private final List<C18241e> f45795c = new ArrayList();

    /* renamed from: f */
    private boolean f45798f = false;

    /* renamed from: g */
    private boolean f45799g = false;

    /* renamed from: h */
    private final String f45800h = UUID.randomUUID().toString();

    public C18228a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher c18252a;
        this.f45794b = adSessionConfiguration;
        this.f45793a = adSessionContext;
        m63524d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            c18252a = new C18253b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            c18252a = new C18252a(adSessionContext.getWebView());
        }
        this.f45797e = c18252a;
        this.f45797e.mo63407i();
        C18238c.m63484c().m63487a(this);
        this.f45797e.m63427a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m63534a() {
        if (this.f45801i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private C18241e m63528b(View view) {
        for (C18241e c18241e : this.f45795c) {
            if (c18241e.m63469c().get() == view) {
                return c18241e;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45799g) {
            return;
        }
        m63533a(view);
        m63532a(str);
        if (m63528b(view) == null) {
            this.f45795c.add(new C18241e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: c */
    public View m63527c() {
        return this.f45796d.get();
    }

    /* renamed from: d */
    public List<C18241e> m63525d() {
        return this.f45795c;
    }

    /* renamed from: e */
    public boolean m63523e() {
        if (this.f45803k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45799g) {
            C18264g.m63368a(errorType, "Error type is null");
            C18264g.m63366a(str, "Message is null");
            getAdSessionStatePublisher().m63426a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m63522f() {
        if (this.f45798f && !this.f45799g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f45799g) {
            return;
        }
        this.f45796d.clear();
        removeAllFriendlyObstructions();
        this.f45799g = true;
        getAdSessionStatePublisher().m63413f();
        C18238c.m63484c().m63485b(this);
        getAdSessionStatePublisher().mo63408b();
        this.f45797e = null;
        this.f45803k = null;
    }

    /* renamed from: g */
    public boolean m63521g() {
        return this.f45799g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f45800h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45797e;
    }

    /* renamed from: h */
    public boolean m63520h() {
        return this.f45794b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m63519i() {
        return this.f45794b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m63518j() {
        return this.f45798f;
    }

    /* renamed from: k */
    public void m63517k() {
        m63534a();
        getAdSessionStatePublisher().m63412g();
        this.f45801i = true;
    }

    /* renamed from: l */
    public void m63516l() {
        m63529b();
        getAdSessionStatePublisher().m63411h();
        this.f45802j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45799g) {
            return;
        }
        C18264g.m63368a(view, "AdView is null");
        if (m63527c() == view) {
            return;
        }
        m63524d(view);
        getAdSessionStatePublisher().m63431a();
        m63526c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45799g) {
            return;
        }
        this.f45795c.clear();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45799g) {
            return;
        }
        m63533a(view);
        C18241e m63528b = m63528b(view);
        if (m63528b != null) {
            this.f45795c.remove(m63528b);
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45803k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f45798f) {
            return;
        }
        this.f45798f = true;
        C18238c.m63484c().m63483c(this);
        this.f45797e.m63430a(C18245h.m63441c().m63442b());
        this.f45797e.m63420a(C18236a.m63494a().m63492b());
        this.f45797e.mo63410a(this, this.f45793a);
    }

    /* renamed from: a */
    private static void m63533a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    private void m63529b() {
        if (this.f45802j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m63526c(View view) {
        Collection<C18228a> m63486b = C18238c.m63484c().m63486b();
        if (m63486b == null || m63486b.isEmpty()) {
            return;
        }
        for (C18228a c18228a : m63486b) {
            if (c18228a != this && c18228a.m63527c() == view) {
                c18228a.f45796d.clear();
            }
        }
    }

    /* renamed from: d */
    private void m63524d(View view) {
        this.f45796d = new C18281a(view);
    }

    /* renamed from: a */
    private void m63532a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45792l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* renamed from: a */
    public void m63531a(List<C18281a> list) {
        if (m63523e()) {
            ArrayList arrayList = new ArrayList();
            for (C18281a c18281a : list) {
                View view = c18281a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45803k.onPossibleObstructionsDetected(this.f45800h, arrayList);
        }
    }

    /* renamed from: a */
    public void m63530a(@NonNull JSONObject jSONObject) {
        m63529b();
        getAdSessionStatePublisher().m63419a(jSONObject);
        this.f45802j = true;
    }
}
