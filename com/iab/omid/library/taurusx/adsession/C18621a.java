package com.iab.omid.library.taurusx.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.internal.C18629a;
import com.iab.omid.library.taurusx.internal.C18631c;
import com.iab.omid.library.taurusx.internal.C18634e;
import com.iab.omid.library.taurusx.internal.C18638h;
import com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher;
import com.iab.omid.library.taurusx.publisher.C18645a;
import com.iab.omid.library.taurusx.publisher.C18646b;
import com.iab.omid.library.taurusx.utils.C18658g;
import com.iab.omid.library.taurusx.weakreference.C18675a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.adsession.a */
/* loaded from: classes6.dex */
public class C18621a extends AdSession {

    /* renamed from: l */
    private static final Pattern f46592l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f46593a;

    /* renamed from: b */
    private final AdSessionConfiguration f46594b;

    /* renamed from: d */
    private C18675a f46596d;

    /* renamed from: e */
    private AdSessionStatePublisher f46597e;

    /* renamed from: i */
    private boolean f46601i;

    /* renamed from: j */
    private boolean f46602j;

    /* renamed from: k */
    private PossibleObstructionListener f46603k;

    /* renamed from: c */
    private final List<C18634e> f46595c = new ArrayList();

    /* renamed from: f */
    private boolean f46598f = false;

    /* renamed from: g */
    private boolean f46599g = false;

    /* renamed from: h */
    private final String f46600h = UUID.randomUUID().toString();

    public C18621a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher c18645a;
        this.f46594b = adSessionConfiguration;
        this.f46593a = adSessionContext;
        m62024d(null);
        if (adSessionContext.getAdSessionContextType() != AdSessionContextType.HTML && adSessionContext.getAdSessionContextType() != AdSessionContextType.JAVASCRIPT) {
            c18645a = new C18646b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        } else {
            c18645a = new C18645a(adSessionContext.getWebView());
        }
        this.f46597e = c18645a;
        this.f46597e.mo61907i();
        C18631c.m61984c().m61987a(this);
        this.f46597e.m61927a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m62034a() {
        if (this.f46601i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private C18634e m62028b(View view) {
        for (C18634e c18634e : this.f46595c) {
            if (c18634e.m61969c().get() == view) {
                return c18634e;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46599g) {
            return;
        }
        m62033a(view);
        m62032a(str);
        if (m62028b(view) == null) {
            this.f46595c.add(new C18634e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: c */
    public View m62027c() {
        return this.f46596d.get();
    }

    /* renamed from: d */
    public List<C18634e> m62025d() {
        return this.f46595c;
    }

    /* renamed from: e */
    public boolean m62023e() {
        if (this.f46603k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46599g) {
            C18658g.m61868a(errorType, "Error type is null");
            C18658g.m61866a(str, "Message is null");
            getAdSessionStatePublisher().m61926a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m62022f() {
        if (this.f46598f && !this.f46599g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void finish() {
        if (this.f46599g) {
            return;
        }
        this.f46596d.clear();
        removeAllFriendlyObstructions();
        this.f46599g = true;
        getAdSessionStatePublisher().m61913f();
        C18631c.m61984c().m61985b(this);
        getAdSessionStatePublisher().mo61908b();
        this.f46597e = null;
        this.f46603k = null;
    }

    /* renamed from: g */
    public boolean m62021g() {
        return this.f46599g;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public String getAdSessionId() {
        return this.f46600h;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46597e;
    }

    /* renamed from: h */
    public boolean m62020h() {
        return this.f46594b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m62019i() {
        return this.f46594b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m62018j() {
        return this.f46598f;
    }

    /* renamed from: k */
    public void m62017k() {
        m62034a();
        getAdSessionStatePublisher().m61912g();
        this.f46601i = true;
    }

    /* renamed from: l */
    public void m62016l() {
        m62029b();
        getAdSessionStatePublisher().m61911h();
        this.f46602j = true;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f46599g) {
            return;
        }
        C18658g.m61868a(view, "AdView is null");
        if (m62027c() == view) {
            return;
        }
        m62024d(view);
        getAdSessionStatePublisher().m61931a();
        m62026c(view);
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46599g) {
            return;
        }
        this.f46595c.clear();
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46599g) {
            return;
        }
        m62033a(view);
        C18634e m62028b = m62028b(view);
        if (m62028b != null) {
            this.f46595c.remove(m62028b);
        }
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46603k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void start() {
        if (this.f46598f) {
            return;
        }
        this.f46598f = true;
        C18631c.m61984c().m61983c(this);
        this.f46597e.m61930a(C18638h.m61941c().m61942b());
        this.f46597e.m61920a(C18629a.m61994a().m61992b());
        this.f46597e.mo61910a(this, this.f46593a);
    }

    /* renamed from: a */
    private static void m62033a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    private void m62029b() {
        if (this.f46602j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m62026c(View view) {
        Collection<C18621a> m61986b = C18631c.m61984c().m61986b();
        if (m61986b == null || m61986b.isEmpty()) {
            return;
        }
        for (C18621a c18621a : m61986b) {
            if (c18621a != this && c18621a.m62027c() == view) {
                c18621a.f46596d.clear();
            }
        }
    }

    /* renamed from: d */
    private void m62024d(View view) {
        this.f46596d = new C18675a(view);
    }

    /* renamed from: a */
    private void m62032a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f46592l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    /* renamed from: a */
    public void m62031a(List<C18675a> list) {
        if (m62023e()) {
            ArrayList arrayList = new ArrayList();
            for (C18675a c18675a : list) {
                View view = c18675a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46603k.onPossibleObstructionsDetected(this.f46600h, arrayList);
        }
    }

    /* renamed from: a */
    public void m62030a(@NonNull JSONObject jSONObject) {
        m62029b();
        getAdSessionStatePublisher().m61919a(jSONObject);
        this.f46602j = true;
    }
}
