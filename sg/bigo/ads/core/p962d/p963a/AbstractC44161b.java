package sg.bigo.ads.core.p962d.p963a;

import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.core.p958c.C44136b;
import sg.bigo.ads.core.p962d.C44153a;
import sg.bigo.ads.core.p969g.AbstractC44224d;
import sg.bigo.ads.core.p969g.C44225e;

/* renamed from: sg.bigo.ads.core.d.a.b */
/* loaded from: classes10.dex */
public abstract class AbstractC44161b {

    /* renamed from: e */
    protected C43579q f115893e;

    /* renamed from: f */
    protected C44173e f115894f;

    /* renamed from: k */
    public CopyOnWriteArrayList<C44172d> f115899k;

    /* renamed from: l */
    public CopyOnWriteArrayList<C44172d> f115900l;

    /* renamed from: m */
    public CopyOnWriteArrayList<C44172d> f115901m;

    /* renamed from: n */
    public CopyOnWriteArrayList<C44172d> f115902n;
    @NonNull

    /* renamed from: o */
    private final Map<String, String> f115903o;

    /* renamed from: p */
    private int f115904p;

    /* renamed from: g */
    public long f115895g = 0;

    /* renamed from: h */
    public long f115896h = 0;

    /* renamed from: i */
    public long f115897i = 0;

    /* renamed from: j */
    public long f115898j = 0;

    /* renamed from: a */
    public CopyOnWriteArrayList<C44172d> f115889a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public CopyOnWriteArrayList<C44172d> f115890b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public CopyOnWriteArrayList<C44172d> f115891c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public CopyOnWriteArrayList<C44172d> f115892d = new CopyOnWriteArrayList<>();

    public AbstractC44161b(C43579q c43579q) {
        this.f115893e = c43579q;
        HashMap hashMap = new HashMap();
        this.f115903o = hashMap;
        this.f115894f = new C44173e(this.f115893e, hashMap);
    }

    /* renamed from: a */
    public final void m3799a(int i) {
        this.f115904p = i;
        C44173e c44173e = this.f115894f;
        if (c44173e != null) {
            c44173e.f115954r = i;
        }
    }

    /* renamed from: b */
    public final void m3791b(@NonNull String str, @NonNull String str2) {
        Iterator<C44172d> it = this.f115889a.iterator();
        while (it.hasNext()) {
            C44172d next = it.next();
            if (next.m3773c()) {
                next.m3776a(str, str2);
            }
        }
        Iterator<C44172d> it2 = this.f115890b.iterator();
        while (it2.hasNext()) {
            C44172d next2 = it2.next();
            if (next2.m3773c()) {
                next2.m3776a(str, str2);
            }
        }
        Iterator<C44172d> it3 = this.f115891c.iterator();
        while (it3.hasNext()) {
            C44172d next3 = it3.next();
            if (next3.m3773c()) {
                next3.m3776a(str, str2);
            }
        }
        Iterator<C44172d> it4 = this.f115892d.iterator();
        while (it4.hasNext()) {
            C44172d next4 = it4.next();
            if (next4.m3773c()) {
                next4.m3776a(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m3789c(boolean z) {
        if (C43906a.m4616p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f115893e.f114128a;
        Iterator<C44172d> it = this.f115891c.iterator();
        while (it.hasNext()) {
            it.next().m3771e();
        }
        if (z2) {
            this.f115897i = currentTimeMillis;
            this.f115901m = new CopyOnWriteArrayList<>();
            Iterator<C44172d> it2 = this.f115891c.iterator();
            while (it2.hasNext()) {
                C44172d next = it2.next();
                if (!z || next.m3777a()) {
                    if (next.m3773c()) {
                        this.f115901m.add(next);
                    }
                }
            }
            if (this.f115901m.size() > 0) {
                C44173e c44173e = this.f115894f;
                c44173e.f115957u = this.f115901m;
                c44173e.f115950n = currentTimeMillis;
                c44173e.f115949m = 0;
                C44168c.m3787a().m3785a(this.f115894f);
            }
        } else {
            C43782a.m5010a(0, 3, "AdTracker", "trackThirdNUrl not need retry");
        }
        Iterator<C44172d> it3 = this.f115891c.iterator();
        while (it3.hasNext()) {
            final C44172d next2 = it3.next();
            if (!z || next2.m3777a()) {
                if (next2.m3773c()) {
                    m3795a("nurl_track", next2, z2);
                } else {
                    C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.core.d.a.b.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC44161b.m3794a(AbstractC44161b.this, "nurl_track", next2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m3788d(boolean z) {
        if (C43906a.m4616p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f115893e.f114128a;
        Iterator<C44172d> it = this.f115892d.iterator();
        while (it.hasNext()) {
            it.next().m3771e();
        }
        if (z2) {
            this.f115898j = currentTimeMillis;
            this.f115902n = new CopyOnWriteArrayList<>();
            Iterator<C44172d> it2 = this.f115892d.iterator();
            while (it2.hasNext()) {
                C44172d next = it2.next();
                if (!z || next.m3777a()) {
                    if (next.m3773c()) {
                        this.f115902n.add(next);
                    }
                }
            }
            if (this.f115902n.size() > 0) {
                C44173e c44173e = this.f115894f;
                c44173e.f115958v = this.f115902n;
                c44173e.f115952p = currentTimeMillis;
                c44173e.f115951o = 0;
                C44168c.m3787a().m3785a(this.f115894f);
            }
        } else {
            C43782a.m5010a(0, 3, "AdTracker", "trackThirdLUrl not need retry");
        }
        Iterator<C44172d> it3 = this.f115892d.iterator();
        while (it3.hasNext()) {
            final C44172d next2 = it3.next();
            if (!z || next2.m3777a()) {
                if (next2.m3773c()) {
                    m3795a("lurl_track", next2, z2);
                } else {
                    C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.core.d.a.b.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC44161b.m3794a(AbstractC44161b.this, "lurl_track", next2);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m3798a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f115903o.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m3790b(boolean z) {
        if (C43906a.m4616p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f115893e.f114128a;
        Iterator<C44172d> it = this.f115890b.iterator();
        while (it.hasNext()) {
            it.next().m3771e();
        }
        if (z2) {
            this.f115896h = currentTimeMillis;
            this.f115900l = new CopyOnWriteArrayList<>();
            Iterator<C44172d> it2 = this.f115890b.iterator();
            while (it2.hasNext()) {
                C44172d next = it2.next();
                if (!z || next.m3777a()) {
                    if (next.m3773c()) {
                        this.f115900l.add(next);
                    }
                }
            }
            if (this.f115900l.size() > 0) {
                C44173e c44173e = this.f115894f;
                c44173e.f115956t = this.f115900l;
                c44173e.f115948l = currentTimeMillis;
                c44173e.f115947k = 0;
                C44168c.m3787a().m3785a(this.f115894f);
            }
        } else {
            C43782a.m5010a(0, 3, "AdTracker", "trackThirdClick not need retry");
        }
        Iterator<C44172d> it3 = this.f115890b.iterator();
        while (it3.hasNext()) {
            final C44172d next2 = it3.next();
            if (!z || next2.m3777a()) {
                if (next2.m3773c()) {
                    m3795a("click_track", next2, z2);
                } else {
                    C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.core.d.a.b.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC44161b.m3794a(AbstractC44161b.this, "click_track", next2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3797a(String str, String str2, String str3) {
        C44177g m3742a = C44177g.m3742a(this.f115903o, this.f115893e, this.f115904p, str, str2, str3);
        m3742a.m3744a(m3742a.f115964a);
    }

    /* renamed from: a */
    final void m3796a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap(this.f115903o);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap.put("action", str);
        hashMap.put("track_url", str3);
        hashMap.put("track_name", str4);
        hashMap.put("states", str2);
        hashMap.put(C26484a.f69196M, "0");
        hashMap.put("out_ad", String.valueOf(this.f115904p));
        if ("impl_track".equals(str)) {
            C44136b.m3896a(hashMap);
        } else if ("click_track".equals(str)) {
            C44136b.m3847b(hashMap);
        }
    }

    /* renamed from: a */
    private void m3795a(final String str, final C44172d c44172d, final boolean z) {
        String str2 = c44172d.f115933b;
        String m3772d = c44172d.m3772d();
        c44172d.m3777a();
        C44153a.m3811a(str, m3772d, str2, this.f115904p, this.f115903o, new C44153a.InterfaceC44155a() { // from class: sg.bigo.ads.core.d.a.b.5
            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: a */
            public final void mo3734a() {
                C44172d c44172d2 = c44172d;
                if (c44172d2.f115934c == 1) {
                    AbstractC44161b.m3793a(AbstractC44161b.this, str, c44172d2, true);
                }
                C44168c.m3787a().m3782b(AbstractC44161b.this.f115894f);
            }

            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: b */
            public final void mo3732b() {
                AbstractC44161b.m3793a(AbstractC44161b.this, str, c44172d, z);
                C44168c.m3787a().m3782b(AbstractC44161b.this.f115894f);
            }

            @Override // sg.bigo.ads.core.p962d.C44153a.InterfaceC44155a
            /* renamed from: a */
            public final boolean mo3733a(int i) {
                return AbstractC44161b.this.f115893e.m5373a(i);
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m3794a(AbstractC44161b abstractC44161b, final String str, C44172d c44172d) {
        String m3772d = c44172d.m3772d();
        final String str2 = c44172d.f115933b;
        if (TextUtils.isEmpty(m3772d)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            m3772d = m3772d.replaceAll("\\?", "%3f");
        }
        abstractC44161b.m3796a(str, "start", m3772d, str2);
        final C44225e m3630a = C44225e.m3630a(C43617a.f114190a);
        if (m3630a != null) {
            m3630a.setWebViewClient(new AbstractC44224d() { // from class: sg.bigo.ads.core.d.a.b.6
                @Override // sg.bigo.ads.core.p969g.AbstractC44224d
                /* renamed from: a */
                public final void mo3439a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    m3630a.destroy();
                }

                @Override // sg.bigo.ads.core.p969g.AbstractC44224d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    AbstractC44161b.this.m3796a(str, "success", str3, str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                int i = c44172d.f115932a;
                if (i == 1) {
                    m3630a.loadUrl(m3772d);
                    return;
                }
                if (i == 2) {
                    m3630a.loadData(m3772d, "text/html", "UTF-8");
                }
            } catch (Exception e) {
                C44136b.m3908a(3002, 10106, e.getMessage());
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m3793a(AbstractC44161b abstractC44161b, String str, C44172d c44172d, boolean z) {
        CopyOnWriteArrayList<C44172d> copyOnWriteArrayList;
        CopyOnWriteArrayList<C44172d> copyOnWriteArrayList2;
        CopyOnWriteArrayList<C44172d> copyOnWriteArrayList3;
        CopyOnWriteArrayList<C44172d> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList4 = abstractC44161b.f115899k) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(c44172d);
        } else if ("click_track".equals(str)) {
            if (!z || (copyOnWriteArrayList3 = abstractC44161b.f115900l) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(c44172d);
        } else if ("nurl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList2 = abstractC44161b.f115901m) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(c44172d);
        } else if ("lurl_track".equals(str) && z && (copyOnWriteArrayList = abstractC44161b.f115902n) != null) {
            copyOnWriteArrayList.remove(c44172d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m3792a(boolean z) {
        if (C43906a.m4616p()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f115893e.f114128a;
        Iterator<C44172d> it = this.f115889a.iterator();
        while (it.hasNext()) {
            it.next().m3771e();
        }
        if (z2) {
            this.f115895g = currentTimeMillis;
            this.f115899k = new CopyOnWriteArrayList<>();
            Iterator<C44172d> it2 = this.f115889a.iterator();
            while (it2.hasNext()) {
                C44172d next = it2.next();
                if (!z || next.m3777a()) {
                    if (next.m3773c()) {
                        this.f115899k.add(next);
                    }
                }
            }
            if (this.f115899k.size() > 0) {
                C44173e c44173e = this.f115894f;
                c44173e.f115955s = this.f115899k;
                c44173e.f115946j = currentTimeMillis;
                c44173e.f115945i = 0;
                C44168c.m3787a().m3785a(this.f115894f);
            }
        } else {
            C43782a.m5010a(0, 3, "AdTracker", "trackThirdImpression not need retry");
        }
        Iterator<C44172d> it3 = this.f115889a.iterator();
        while (it3.hasNext()) {
            final C44172d next2 = it3.next();
            if (!z || next2.m3777a()) {
                if (next2.m3773c()) {
                    m3795a("impl_track", next2, z2);
                } else {
                    C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.core.d.a.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC44161b.m3794a(AbstractC44161b.this, "impl_track", next2);
                        }
                    });
                }
            }
        }
    }
}
