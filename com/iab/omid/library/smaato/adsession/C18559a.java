package com.iab.omid.library.smaato.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.smaato.internal.C18567a;
import com.iab.omid.library.smaato.internal.C18569c;
import com.iab.omid.library.smaato.internal.C18572e;
import com.iab.omid.library.smaato.internal.C18573f;
import com.iab.omid.library.smaato.internal.C18577i;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import com.iab.omid.library.smaato.publisher.C18586a;
import com.iab.omid.library.smaato.publisher.C18587b;
import com.iab.omid.library.smaato.utils.C18599g;
import com.iab.omid.library.smaato.weakreference.C18617a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.adsession.a */
/* loaded from: classes6.dex */
public class C18559a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f46457a;

    /* renamed from: b */
    private final AdSessionConfiguration f46458b;

    /* renamed from: c */
    private final C18573f f46459c;

    /* renamed from: d */
    private C18617a f46460d;

    /* renamed from: e */
    private AdSessionStatePublisher f46461e;

    /* renamed from: f */
    private boolean f46462f;

    /* renamed from: g */
    private boolean f46463g;

    /* renamed from: h */
    private final String f46464h;

    /* renamed from: i */
    private boolean f46465i;

    /* renamed from: j */
    private boolean f46466j;

    /* renamed from: k */
    private PossibleObstructionListener f46467k;

    public C18559a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m62287a() {
        if (this.f46465i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m62283b() {
        if (this.f46466j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f46463g) {
            return;
        }
        this.f46459c.m62221a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m62281c() {
        return this.f46460d.get();
    }

    /* renamed from: d */
    public List<C18572e> m62280d() {
        return this.f46459c.m62223a();
    }

    /* renamed from: e */
    public boolean m62279e() {
        if (this.f46467k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f46463g) {
            C18599g.m62108a(errorType, "Error type is null");
            C18599g.m62106a(str, "Message is null");
            getAdSessionStatePublisher().m62169a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m62278f() {
        if (this.f46462f && !this.f46463g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void finish() {
        if (this.f46463g) {
            return;
        }
        this.f46460d.clear();
        removeAllFriendlyObstructions();
        this.f46463g = true;
        getAdSessionStatePublisher().m62155f();
        C18569c.m62240c().m62241b(this);
        getAdSessionStatePublisher().mo62150b();
        this.f46461e = null;
        this.f46467k = null;
    }

    /* renamed from: g */
    public boolean m62277g() {
        return this.f46463g;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public String getAdSessionId() {
        return this.f46464h;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f46461e;
    }

    /* renamed from: h */
    public boolean m62276h() {
        return this.f46458b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m62275i() {
        return this.f46458b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m62274j() {
        return this.f46462f;
    }

    /* renamed from: k */
    public void m62273k() {
        m62287a();
        getAdSessionStatePublisher().m62154g();
        this.f46465i = true;
    }

    /* renamed from: l */
    public void m62272l() {
        m62283b();
        getAdSessionStatePublisher().m62153h();
        this.f46466j = true;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f46463g || m62281c() == view) {
            return;
        }
        m62282b(view);
        getAdSessionStatePublisher().m62174a();
        m62286a(view);
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f46463g) {
            return;
        }
        this.f46459c.m62219b();
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f46463g) {
            return;
        }
        this.f46459c.m62217c(view);
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f46467k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.smaato.adsession.AdSession
    public void start() {
        if (this.f46462f) {
            return;
        }
        this.f46462f = true;
        C18569c.m62240c().m62239c(this);
        this.f46461e.m62173a(C18577i.m62190c().m62191b());
        this.f46461e.m62163a(C18567a.m62250a().m62248b());
        this.f46461e.mo62152a(this, this.f46457a);
    }

    public C18559a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f46459c = new C18573f();
        this.f46462f = false;
        this.f46463g = false;
        this.f46458b = adSessionConfiguration;
        this.f46457a = adSessionContext;
        this.f46464h = str;
        m62282b(null);
        this.f46461e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C18586a(str, adSessionContext.getWebView()) : new C18587b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f46461e.mo62149i();
        C18569c.m62240c().m62243a(this);
        this.f46461e.m62170a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m62286a(@Nullable View view) {
        Collection<C18559a> m62242b = C18569c.m62240c().m62242b();
        if (m62242b == null || m62242b.isEmpty()) {
            return;
        }
        for (C18559a c18559a : m62242b) {
            if (c18559a != this && c18559a.m62281c() == view) {
                c18559a.f46460d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m62282b(@Nullable View view) {
        this.f46460d = new C18617a(view);
    }

    /* renamed from: a */
    public void m62285a(List<C18617a> list) {
        if (m62279e()) {
            ArrayList arrayList = new ArrayList();
            for (C18617a c18617a : list) {
                View view = c18617a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f46467k.onPossibleObstructionsDetected(this.f46464h, arrayList);
        }
    }

    /* renamed from: a */
    public void m62284a(@NonNull JSONObject jSONObject) {
        m62283b();
        getAdSessionStatePublisher().m62162a(jSONObject);
        this.f46466j = true;
    }
}
