package sg.bigo.ads.controller.p944a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.C43808h;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p933u.p936c.C43803d;
import sg.bigo.ads.common.utils.C43829l;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.controller.AbstractC43960b;
import sg.bigo.ads.controller.p944a.InterfaceC43952f;
import sg.bigo.ads.controller.p944a.p945a.AbstractC43936g;
import sg.bigo.ads.controller.p944a.p945a.C43918b;
import sg.bigo.ads.controller.p944a.p945a.C43924c;
import sg.bigo.ads.controller.p944a.p945a.C43926e;
import sg.bigo.ads.controller.p944a.p945a.C43929f;
import sg.bigo.ads.controller.p951g.C44057k;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.controller.a.b */
/* loaded from: classes10.dex */
public final class C43938b {

    /* renamed from: a */
    public final C43914a f115060a;

    /* renamed from: b */
    final InterfaceC43665g f115061b;
    @Nullable

    /* renamed from: g */
    public AbstractC43960b f115066g;

    /* renamed from: h */
    private final InterfaceC43524h f115067h;

    /* renamed from: c */
    final AtomicBoolean f115062c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f115063d = new AtomicBoolean(false);

    /* renamed from: e */
    final AtomicBoolean f115064e = new AtomicBoolean(false);

    /* renamed from: f */
    final AtomicBoolean f115065f = new AtomicBoolean(false);

    /* renamed from: j */
    private final InterfaceC43955g f115069j = new InterfaceC43955g() { // from class: sg.bigo.ads.controller.a.b.1
        @Override // sg.bigo.ads.controller.p944a.InterfaceC43955g
        /* renamed from: a */
        public final void mo4515a(String str) {
            C43938b.this.f115060a.m5317a(0L);
            C43782a.m5010a(0, 3, "AntiBan", "[saveAsync], reSave config, fromUrlPath=".concat(String.valueOf(str)));
        }

        @Override // sg.bigo.ads.controller.p944a.InterfaceC43955g
        /* renamed from: a */
        public final void mo4514a(String str, boolean z) {
            C43782a.m5010a(0, 3, "AntiBan", "fetchConfig, country=" + str + ", fromSDKConfigUrl=" + z);
            if (!z) {
                C43938b.m4530a(C43938b.this, (C44057k.InterfaceC44058a) null);
            }
            C43938b.m4531a(C43938b.this, str, true);
        }
    };

    /* renamed from: k */
    private final Runnable f115070k = new Runnable() { // from class: sg.bigo.ads.controller.a.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (!C43938b.m4530a(C43938b.this, new C44057k.InterfaceC44058a() { // from class: sg.bigo.ads.controller.a.b.2.1
                @Override // sg.bigo.ads.controller.p951g.C44057k.InterfaceC44058a
                /* renamed from: a */
                public final void mo4073a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map) {
                    C43938b c43938b = C43938b.this;
                    C43938b.m4531a(c43938b, c43938b.f115061b.mo4123x(), false);
                }

                @Override // sg.bigo.ads.controller.p951g.C44057k.InterfaceC44058a
                /* renamed from: a */
                public final void mo4072a(String str, int i, String str2, @Nullable Map<String, Object> map) {
                }
            })) {
                C43938b c43938b = C43938b.this;
                C43938b.m4531a(c43938b, c43938b.f115061b.mo4123x(), false);
            }
        }
    };

    /* renamed from: i */
    private final Map<String, String> f115068i = new ConcurrentHashMap();

    /* renamed from: sg.bigo.ads.controller.a.b$a */
    /* loaded from: classes10.dex */
    static class C43948a {

        /* renamed from: a */
        public final C43959k f115094a;

        /* renamed from: b */
        public final String f115095b;

        /* renamed from: c */
        public final long f115096c;

        private C43948a(C43959k c43959k, String str, long j) {
            this.f115094a = c43959k;
            this.f115095b = str;
            this.f115096c = j;
        }

        /* synthetic */ C43948a(C43959k c43959k, String str, long j, byte b) {
            this(c43959k, str, j);
        }
    }

    public C43938b(@NonNull Context context, @NonNull InterfaceC43665g interfaceC43665g, @NonNull InterfaceC43524h interfaceC43524h) {
        this.f115060a = new C43914a(context, interfaceC43524h);
        this.f115061b = interfaceC43665g;
        this.f115067h = interfaceC43524h;
    }

    /* renamed from: a */
    public final InterfaceC43952f m4536a(@NonNull String str) {
        InterfaceC43952f.C43953a c43953a = new InterfaceC43952f.C43953a(this.f115060a, this.f115061b, this.f115067h, str);
        c43953a.mo4523a(this.f115069j);
        return c43953a;
    }

    /* renamed from: b */
    public final String m4529b(String str) {
        if (C43836q.m4837a((CharSequence) str)) {
            return "";
        }
        C43918b.C43922b c43922b = this.f115060a.f114993i.f115004b;
        if (c43922b != null && !C43836q.m4837a((CharSequence) c43922b.f115123a)) {
            return C43950d.m4527a(str, c43922b.f115123a);
        }
        return str;
    }

    @NonNull
    /* renamed from: a */
    public final C43956h m4533a(String str, String str2, long j, boolean z) {
        C43956h m4584a = this.f115060a.m4584a(str, str2, this.f115068i);
        long elapsedRealtime = j <= 0 ? 0L : SystemClock.elapsedRealtime() - j;
        if (m4584a.f115118b) {
            this.f115060a.m5317a(0L);
            C43782a.m5010a(0, 3, "AntiBan", "[saveAsync], update host config, configSource=" + str2 + ", result=" + m4584a);
            if (z) {
                C44136b.m3901a(elapsedRealtime, m4584a.f115119c, str2, true);
            }
        } else {
            int i = m4584a.f115120d;
            if (i == 0) {
                if (z) {
                    C44136b.m3901a(elapsedRealtime, m4584a.f115119c, str2, false);
                }
            } else if (z) {
                C44136b.m3902a(elapsedRealtime, m4584a.f115119c, str2, i, m4584a.f115121e);
            }
        }
        C43782a.m5010a(0, 3, "AntiBan", "updateHostConfig, configSource=" + str2 + ", update result=" + m4584a);
        return m4584a;
    }

    /* renamed from: a */
    public final void m4537a(long j, String str) {
        C43782a.m5010a(0, 3, "AntiBan", "fetchAntiBanConfig, delayMillis=" + j + ", from=" + str);
        C43727d.m5106a(this.f115070k);
        C43727d.m5107a(1, this.f115070k, Math.max(j, 0L));
    }

    /* renamed from: a */
    public final void m4534a(String str, String str2) {
        C43782a.m5010a(0, 3, "AntiBan", "addExtraHost, country=" + str + ", host=" + str2);
        if (C43950d.m4528a(str2)) {
            if (C43836q.m4837a((CharSequence) str)) {
                str = "all";
            }
            this.f115068i.put(str, str2);
            if (this.f115060a.m4585a(str, str2)) {
                this.f115060a.m5317a(10L);
                C43782a.m5010a(0, 3, "AntiBan", "saveAsync, addExtraHost, delayMillis=10");
            }
        }
    }

    /* renamed from: a */
    final void m4532a(@NonNull final String str, @NonNull final AbstractC43936g abstractC43936g, @Nullable final ValueCallback<C43948a> valueCallback, @Nullable final ValueCallback<String> valueCallback2) {
        final C43959k mo4540a = abstractC43936g.mo4540a(str);
        C43782a.m5010a(0, 3, "AntiBan", "[net disk] [saveAsync] fetch svr config, country=" + str + ", url=" + mo4540a);
        this.f115060a.m5317a(0L);
        if (mo4540a == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
                return;
            }
            return;
        }
        C43795a c43795a = new C43795a(new C43798d(mo4540a.f115125a));
        c43795a.f114617k = RunnableC43792e.m4989b();
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C43807g.m4958a(c43795a, new AbstractC43793b<C43795a, C43803d>() { // from class: sg.bigo.ads.controller.a.b.8
            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ C43803d mo3801a(@NonNull C43800a c43800a) {
                return new C43803d(c43800a);
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3803a(@NonNull C43795a c43795a2, @NonNull C43803d c43803d) {
                C43782a.m5010a(0, 3, "AntiBan", "[net disk] succeed to fetch net disk url: " + mo4540a.f115125a);
                String m4964a = c43803d.m4964a();
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(new C43948a(mo4540a, m4964a, elapsedRealtime, (byte) 0));
                }
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3802a(@NonNull C43795a c43795a2, @NonNull C43808h c43808h) {
                C43782a.m5010a(0, 3, "AntiBan", "[net disk] try another net disk url due to failed to fetch net disk url: " + mo4540a.f115125a);
                C44136b.m3902a(elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L, false, mo4540a.f115125a, 4000, "NetError:" + c43808h.f114641a + ", " + c43808h.getMessage());
                C43938b.this.m4532a(str, abstractC43936g, valueCallback, valueCallback2);
            }
        });
    }

    /* renamed from: a */
    final boolean m4535a(String str, final ValueCallback<C43948a> valueCallback, ValueCallback<String> valueCallback2) {
        final C43926e c43926e = this.f115060a.f114995k;
        C43782a.m5010a(0, 3, "AntiBan", "[net disk] fetch free svr config, canFetch=" + c43926e.m4551a());
        if (!c43926e.m4551a()) {
            this.f115065f.set(false);
            return false;
        }
        c43926e.m4549b();
        m4532a(str, c43926e, new ValueCallback<C43948a>() { // from class: sg.bigo.ads.controller.a.b.7
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(C43948a c43948a) {
                c43926e.mo4538a(true);
                C43938b.this.f115060a.m5317a(0L);
                C43782a.m5010a(0, 3, "AntiBan", "[net disk] [saveAsync], fetch third free svr config, onSuccess");
                valueCallback.onReceiveValue(c43948a);
            }
        }, valueCallback2);
        return true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m4531a(C43938b c43938b, final String str, boolean z) {
        c43938b.f115064e.compareAndSet(false, z);
        if (!c43938b.f115063d.compareAndSet(false, true)) {
            C43782a.m5010a(0, 3, "AntiBan", "[net disk] fetch pay svr config return because is fetching, fetch free svr config after fail -> ".concat(String.valueOf(z)));
            return false;
        }
        C43929f c43929f = c43938b.f115060a.f114994j;
        C43782a.m5010a(0, 3, "AntiBan", "[net disk] fetch pay svr config, canFetch=" + c43929f.m4547a() + ", fetch free svr config after fail -> " + z);
        final ValueCallback<C43948a> valueCallback = new ValueCallback<C43948a>() { // from class: sg.bigo.ads.controller.a.b.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(C43948a c43948a) {
                C43959k c43959k;
                C43948a c43948a2 = c43948a;
                C43938b.this.f115063d.set(false);
                C43938b.this.f115064e.set(false);
                C43938b.this.f115065f.set(false);
                if (c43948a2 != null && (c43959k = c43948a2.f115094a) != null) {
                    C43938b.this.m4533a(c43948a2.f115095b, c43959k.f115125a, c43948a2.f115096c, true);
                }
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                C43782a.m5010a(0, 3, "AntiBan", "[net disk] all svr urls are fail");
                C43938b.this.f115064e.set(false);
                C43938b.this.f115065f.set(false);
            }
        };
        if (c43929f.m4547a()) {
            c43929f.m4545b();
            c43938b.m4532a(str, c43929f, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.6
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    C43938b.this.f115063d.set(false);
                    if (C43938b.this.f115064e.compareAndSet(true, false) && C43938b.this.f115065f.compareAndSet(false, true)) {
                        C43938b.this.m4535a(str, valueCallback, valueCallback2);
                    } else {
                        C43782a.m5010a(0, 3, "AntiBan", "[net disk] all pay svr urls are fail");
                    }
                }
            });
            return true;
        }
        if (c43938b.f115064e.compareAndSet(true, false) && c43938b.f115065f.compareAndSet(false, true)) {
            c43938b.m4535a(str, valueCallback, valueCallback2);
        }
        c43938b.f115063d.set(false);
        return false;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m4530a(C43938b c43938b, final C44057k.InterfaceC44058a interfaceC44058a) {
        final C43924c c43924c = c43938b.f115060a.f114991g;
        C43782a.m5010a(0, 3, "AntiBan", "[sdk config] fetch sdk config, canFetch=" + c43924c.m4570a() + ", ignoreFetchInterval=false");
        if (!c43938b.f115062c.compareAndSet(false, true)) {
            C43782a.m5010a(0, 3, "AntiBan", "[sdk config] fetch sdk config return because it is fetching.");
            return false;
        } else if (!c43924c.m4570a()) {
            c43938b.f115062c.set(false);
            return false;
        } else {
            c43924c.f115022g = System.currentTimeMillis();
            c43938b.f115060a.m5317a(0L);
            C43782a.m5010a(0, 3, "AntiBan", "[saveAsync], fetch sdk config");
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            new C44057k(c43938b.f115061b, c43938b, new C44057k.InterfaceC44058a() { // from class: sg.bigo.ads.controller.a.b.3
                @Override // sg.bigo.ads.controller.p951g.C44057k.InterfaceC44058a
                /* renamed from: a */
                public final void mo4073a(String str, int i, int i2, int i3, @NonNull String str2, @Nullable Map<String, Object> map) {
                    C43938b.this.f115062c.set(false);
                    if (TextUtils.isEmpty(C43829l.m4867a(map, "host_cfg"))) {
                        long elapsedRealtime2 = elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L;
                        C44136b.m3902a(elapsedRealtime2, false, str, 4001, "code=" + i2 + ",subCode=" + i3 + ",message=" + str2);
                    }
                    C44057k.InterfaceC44058a interfaceC44058a2 = interfaceC44058a;
                    if (interfaceC44058a2 != null) {
                        interfaceC44058a2.mo4073a(str, i, i2, i3, str2, map);
                    }
                    AbstractC43960b abstractC43960b = C43938b.this.f115066g;
                    if (abstractC43960b != null) {
                        abstractC43960b.mo3993a(i, i2, i3, str2, map);
                    }
                }

                @Override // sg.bigo.ads.controller.p951g.C44057k.InterfaceC44058a
                /* renamed from: a */
                public final void mo4072a(String str, int i, String str2, @Nullable Map<String, Object> map) {
                    C43938b.this.f115062c.set(false);
                    c43924c.f115023h = System.currentTimeMillis();
                    C43938b.this.f115060a.m5317a(0L);
                    C43782a.m5010a(0, 3, "AntiBan", "[saveAsync], fetch sdk config, on sdk config fetch success");
                    if (TextUtils.isEmpty(C43829l.m4867a(map, "host_cfg"))) {
                        C44136b.m3902a(elapsedRealtime > 0 ? SystemClock.elapsedRealtime() - elapsedRealtime : 0L, false, str, 4002, "host_cfg is empty.");
                    }
                    C44057k.InterfaceC44058a interfaceC44058a2 = interfaceC44058a;
                    if (interfaceC44058a2 != null) {
                        interfaceC44058a2.mo4072a(str, i, str2, map);
                    }
                    AbstractC43960b abstractC43960b = C43938b.this.f115066g;
                    if (abstractC43960b != null) {
                        abstractC43960b.mo4119a(i, str2);
                    }
                }
            }).m4091b();
            return true;
        }
    }
}
