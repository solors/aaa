package com.iab.omid.library.bigosg.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.p387b.C17935a;
import com.iab.omid.library.bigosg.p387b.C17939c;
import com.iab.omid.library.bigosg.p387b.C17943f;
import com.iab.omid.library.bigosg.p389d.C17955e;
import com.iab.omid.library.bigosg.p390e.C17957a;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bigosg.publisher.C17960a;
import com.iab.omid.library.bigosg.publisher.C17961b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.adsession.a */
/* loaded from: classes6.dex */
public class C17933a extends AdSession {

    /* renamed from: a */
    private static final Pattern f45169a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f45170b;

    /* renamed from: c */
    private final AdSessionConfiguration f45171c;

    /* renamed from: e */
    private C17957a f45173e;

    /* renamed from: f */
    private AdSessionStatePublisher f45174f;

    /* renamed from: j */
    private boolean f45178j;

    /* renamed from: k */
    private boolean f45179k;

    /* renamed from: d */
    private final List<C17939c> f45172d = new ArrayList();

    /* renamed from: g */
    private boolean f45175g = false;

    /* renamed from: h */
    private boolean f45176h = false;

    /* renamed from: i */
    private String f45177i = UUID.randomUUID().toString();

    public C17933a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        AdSessionStatePublisher c17961b;
        this.f45171c = adSessionConfiguration;
        this.f45170b = adSessionContext;
        m64677c(null);
        if (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML) {
            c17961b = new C17960a(adSessionContext.getWebView());
        } else {
            c17961b = new C17961b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        }
        this.f45174f = c17961b;
        this.f45174f.mo64535a();
        C17935a.m64659a().m64658a(this);
        this.f45174f.m64552a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C17939c m64683a(View view) {
        for (C17939c c17939c : this.f45172d) {
            if (c17939c.m64641a().get() == view) {
                return c17939c;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void m64669j() {
        if (!this.f45178j) {
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    /* renamed from: k */
    private void m64668k() {
        if (!this.f45179k) {
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
    }

    /* renamed from: b */
    public void m64680b() {
        m64669j();
        getAdSessionStatePublisher().m64538g();
        this.f45178j = true;
    }

    /* renamed from: c */
    public void m64678c() {
        m64668k();
        getAdSessionStatePublisher().m64537h();
        this.f45179k = true;
    }

    /* renamed from: d */
    public View m64676d() {
        return this.f45173e.get();
    }

    /* renamed from: e */
    public boolean m64674e() {
        if (this.f45175g && !this.f45176h) {
            return true;
        }
        return false;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (!this.f45176h) {
            C17955e.m64570a(errorType, "Error type is null");
            C17955e.m64568a(str, "Message is null");
            getAdSessionStatePublisher().m64551a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean m64673f() {
        return this.f45175g;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void finish() {
        if (this.f45176h) {
            return;
        }
        this.f45173e.clear();
        removeAllFriendlyObstructions();
        this.f45176h = true;
        getAdSessionStatePublisher().m64539f();
        C17935a.m64659a().m64654c(this);
        getAdSessionStatePublisher().mo64532b();
        this.f45174f = null;
    }

    /* renamed from: g */
    public boolean m64672g() {
        return this.f45176h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public String getAdSessionId() {
        return this.f45177i;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f45174f;
    }

    /* renamed from: h */
    public boolean m64671h() {
        return this.f45171c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean m64670i() {
        return this.f45171c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f45176h) {
            return;
        }
        C17955e.m64570a(view, "AdView is null");
        if (m64676d() == view) {
            return;
        }
        m64677c(view);
        getAdSessionStatePublisher().m64536i();
        m64675d(view);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f45176h) {
            return;
        }
        this.f45172d.clear();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f45176h) {
            return;
        }
        m64679b(view);
        C17939c m64683a = m64683a(view);
        if (m64683a != null) {
            this.f45172d.remove(m64683a);
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void start() {
        if (this.f45175g) {
            return;
        }
        this.f45175g = true;
        C17935a.m64659a().m64656b(this);
        this.f45174f.m64555a(C17943f.m64617a().m64611d());
        this.f45174f.mo64534a(this, this.f45170b);
    }

    /* renamed from: b */
    private void m64679b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m64677c(View view) {
        this.f45173e = new C17957a(view);
    }

    /* renamed from: d */
    private void m64675d(View view) {
        Collection<C17933a> m64657b = C17935a.m64659a().m64657b();
        if (m64657b == null || m64657b.size() <= 0) {
            return;
        }
        for (C17933a c17933a : m64657b) {
            if (c17933a != this && c17933a.m64676d() == view) {
                c17933a.f45173e.clear();
            }
        }
    }

    /* renamed from: a */
    public List<C17939c> m64684a() {
        return this.f45172d;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f45176h) {
            return;
        }
        m64679b(view);
        m64682a(str);
        if (m64683a(view) == null) {
            this.f45172d.add(new C17939c(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m64682a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f45169a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    /* renamed from: a */
    public void m64681a(@NonNull JSONObject jSONObject) {
        m64668k();
        getAdSessionStatePublisher().m64545a(jSONObject);
        this.f45179k = true;
    }
}
