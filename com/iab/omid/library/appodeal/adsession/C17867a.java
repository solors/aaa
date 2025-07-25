package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.internal.C17875a;
import com.iab.omid.library.appodeal.internal.C17877c;
import com.iab.omid.library.appodeal.internal.C17880e;
import com.iab.omid.library.appodeal.internal.C17881f;
import com.iab.omid.library.appodeal.internal.C17885i;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.C17894a;
import com.iab.omid.library.appodeal.publisher.C17895b;
import com.iab.omid.library.appodeal.utils.C17907g;
import com.iab.omid.library.appodeal.weakreference.C17925a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.adsession.a */
/* loaded from: classes6.dex */
public class C17867a extends AdSession {

    /* renamed from: a */
    private final AdSessionContext f45029a;

    /* renamed from: b */
    private final AdSessionConfiguration f45030b;

    /* renamed from: c */
    private final C17881f f45031c;

    /* renamed from: d */
    private C17925a f45032d;

    /* renamed from: e */
    private AdSessionStatePublisher f45033e;

    /* renamed from: f */
    private boolean f45034f;

    /* renamed from: g */
    private boolean f45035g;

    /* renamed from: h */
    private final String f45036h;

    /* renamed from: i */
    private boolean f45037i;

    /* renamed from: j */
    private boolean f45038j;

    /* renamed from: k */
    private PossibleObstructionListener f45039k;

    public C17867a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    private void m64945a() {
        if (this.f45037i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: b */
    private void m64941b() {
        if (this.f45038j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45035g) {
            return;
        }
        this.f45031c.m64879a(view, friendlyObstructionPurpose, str);
    }

    /* renamed from: c */
    public View m64939c() {
        return this.f45032d.get();
    }

    /* renamed from: d */
    public List<C17880e> m64938d() {
        return this.f45031c.m64881a();
    }

    /* renamed from: e */
    public boolean m64937e() {
        if (this.f45039k != null) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45035g) {
            C17907g.m64766a(errorType, "Error type is null");
            C17907g.m64764a(str, "Message is null");
            getAdSessionStatePublisher().m64827a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m64936f() {
        if (this.f45034f && !this.f45035g) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void finish() {
        if (this.f45035g) {
            return;
        }
        this.f45032d.clear();
        removeAllFriendlyObstructions();
        this.f45035g = true;
        getAdSessionStatePublisher().m64813f();
        C17877c.m64898c().m64899b(this);
        getAdSessionStatePublisher().mo64808b();
        this.f45033e = null;
        this.f45039k = null;
    }

    /* renamed from: g */
    public boolean m64935g() {
        return this.f45035g;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public String getAdSessionId() {
        return this.f45036h;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45033e;
    }

    /* renamed from: h */
    public boolean m64934h() {
        return this.f45030b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m64933i() {
        return this.f45030b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean m64932j() {
        return this.f45034f;
    }

    /* renamed from: k */
    public void m64931k() {
        m64945a();
        getAdSessionStatePublisher().m64812g();
        this.f45037i = true;
    }

    /* renamed from: l */
    public void m64930l() {
        m64941b();
        getAdSessionStatePublisher().m64811h();
        this.f45038j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f45035g || m64939c() == view) {
            return;
        }
        m64940b(view);
        getAdSessionStatePublisher().m64832a();
        m64944a(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45035g) {
            return;
        }
        this.f45031c.m64877b();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45035g) {
            return;
        }
        this.f45031c.m64875c(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f45039k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void start() {
        if (!this.f45034f && this.f45033e != null) {
            this.f45034f = true;
            C17877c.m64898c().m64897c(this);
            this.f45033e.m64831a(C17885i.m64848c().m64849b());
            this.f45033e.m64821a(C17875a.m64908a().m64906b());
            this.f45033e.mo64810a(this, this.f45029a);
        }
    }

    public C17867a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f45031c = new C17881f();
        this.f45034f = false;
        this.f45035g = false;
        this.f45030b = adSessionConfiguration;
        this.f45029a = adSessionContext;
        this.f45036h = str;
        m64940b(null);
        this.f45033e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C17894a(str, adSessionContext.getWebView()) : new C17895b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f45033e.mo64807i();
        C17877c.m64898c().m64901a(this);
        this.f45033e.m64828a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m64944a(@Nullable View view) {
        Collection<C17867a> m64900b = C17877c.m64898c().m64900b();
        if (m64900b == null || m64900b.isEmpty()) {
            return;
        }
        for (C17867a c17867a : m64900b) {
            if (c17867a != this && c17867a.m64939c() == view) {
                c17867a.f45032d.clear();
            }
        }
    }

    /* renamed from: b */
    private void m64940b(@Nullable View view) {
        this.f45032d = new C17925a(view);
    }

    /* renamed from: a */
    public void m64943a(List<C17925a> list) {
        if (m64937e()) {
            ArrayList arrayList = new ArrayList();
            for (C17925a c17925a : list) {
                View view = c17925a.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f45039k.onPossibleObstructionsDetected(this.f45036h, arrayList);
        }
    }

    /* renamed from: a */
    public void m64942a(@NonNull JSONObject jSONObject) {
        m64941b();
        getAdSessionStatePublisher().m64820a(jSONObject);
        this.f45038j = true;
    }
}
