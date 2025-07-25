package com.iab.omid.library.corpmailru.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.p394c.C18058b;
import com.iab.omid.library.corpmailru.p394c.InterfaceC18056a;
import com.iab.omid.library.corpmailru.p395d.C18062b;
import com.iab.omid.library.corpmailru.p395d.C18065d;
import com.iab.omid.library.corpmailru.p395d.C18067f;
import com.iab.omid.library.corpmailru.walking.C18077a;
import com.iab.omid.library.corpmailru.walking.p397a.C18083c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TreeWalker implements InterfaceC18056a.InterfaceC18057a {

    /* renamed from: a */
    private static TreeWalker f45489a = new TreeWalker();

    /* renamed from: b */
    private static Handler f45490b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static Handler f45491c = null;

    /* renamed from: j */
    private static final Runnable f45492j = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().m64065h();
        }
    };

    /* renamed from: k */
    private static final Runnable f45493k = new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f45491c != null) {
                TreeWalker.f45491c.post(TreeWalker.f45492j);
                TreeWalker.f45491c.postDelayed(TreeWalker.f45493k, 200L);
            }
        }
    };

    /* renamed from: e */
    private int f45495e;

    /* renamed from: i */
    private long f45499i;

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f45494d = new ArrayList();

    /* renamed from: g */
    private C18077a f45497g = new C18077a();

    /* renamed from: f */
    private C18058b f45496f = new C18058b();

    /* renamed from: h */
    private C18087b f45498h = new C18087b(new C18083c());

    /* loaded from: classes6.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    /* loaded from: classes6.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    public static TreeWalker getInstance() {
        return f45489a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m64065h() {
        m64064i();
        m64069d();
        m64063j();
    }

    /* renamed from: i */
    private void m64064i() {
        this.f45495e = 0;
        this.f45499i = C18065d.m64124a();
    }

    /* renamed from: j */
    private void m64063j() {
        m64079a(C18065d.m64124a() - this.f45499i);
    }

    /* renamed from: k */
    private void m64062k() {
        if (f45491c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f45491c = handler;
            handler.post(f45492j);
            f45491c.postDelayed(f45493k, 200L);
        }
    }

    /* renamed from: l */
    private void m64061l() {
        Handler handler = f45491c;
        if (handler != null) {
            handler.removeCallbacks(f45493k);
            f45491c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f45494d.contains(treeWalkerTimeLogger)) {
            this.f45494d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void m64073b() {
        m64070c();
        this.f45494d.clear();
        f45490b.post(new Runnable() { // from class: com.iab.omid.library.corpmailru.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f45498h.m64033a();
            }
        });
    }

    /* renamed from: c */
    public void m64070c() {
        m64061l();
    }

    @VisibleForTesting
    /* renamed from: d */
    public void m64069d() {
        this.f45497g.m64052c();
        long m64124a = C18065d.m64124a();
        InterfaceC18056a m64153a = this.f45496f.m64153a();
        if (this.f45497g.m64055b().size() > 0) {
            Iterator<String> it = this.f45497g.m64055b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject mo64150a = m64153a.mo64150a(null);
                m64074a(next, this.f45497g.m64053b(next), mo64150a);
                C18062b.m64138a(mo64150a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f45498h.m64029b(mo64150a, hashSet, m64124a);
            }
        }
        if (this.f45497g.m64060a().size() > 0) {
            JSONObject mo64150a2 = m64153a.mo64150a(null);
            m64077a(null, m64153a, mo64150a2, EnumC18088c.PARENT_VIEW);
            C18062b.m64138a(mo64150a2);
            this.f45498h.m64031a(mo64150a2, this.f45497g.m64060a(), m64124a);
        } else {
            this.f45498h.m64033a();
        }
        this.f45497g.m64050d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f45494d.contains(treeWalkerTimeLogger)) {
            this.f45494d.remove(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    private void m64072b(View view, JSONObject jSONObject) {
        C18077a.C18078a m64054b = this.f45497g.m64054b(view);
        if (m64054b != null) {
            C18062b.m64137a(jSONObject, m64054b);
        }
    }

    /* renamed from: a */
    public void m64080a() {
        m64062k();
    }

    /* renamed from: a */
    private void m64079a(long j) {
        if (this.f45494d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f45494d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f45495e, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f45495e, j);
                }
            }
        }
    }

    @Override // com.iab.omid.library.corpmailru.p394c.InterfaceC18056a.InterfaceC18057a
    /* renamed from: a */
    public void mo64078a(View view, InterfaceC18056a interfaceC18056a, JSONObject jSONObject) {
        EnumC18088c m64051c;
        if (C18067f.m64107d(view) && (m64051c = this.f45497g.m64051c(view)) != EnumC18088c.UNDERLYING_VIEW) {
            JSONObject mo64150a = interfaceC18056a.mo64150a(view);
            C18062b.m64134a(jSONObject, mo64150a);
            if (!m64076a(view, mo64150a)) {
                m64072b(view, mo64150a);
                m64077a(view, interfaceC18056a, mo64150a, m64051c);
            }
            this.f45495e++;
        }
    }

    /* renamed from: a */
    private void m64077a(View view, InterfaceC18056a interfaceC18056a, JSONObject jSONObject, EnumC18088c enumC18088c) {
        interfaceC18056a.mo64149a(view, jSONObject, this, enumC18088c == EnumC18088c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m64074a(String str, View view, JSONObject jSONObject) {
        InterfaceC18056a m64152b = this.f45496f.m64152b();
        String m64056a = this.f45497g.m64056a(str);
        if (m64056a != null) {
            JSONObject mo64150a = m64152b.mo64150a(view);
            C18062b.m64136a(mo64150a, str);
            C18062b.m64132b(mo64150a, m64056a);
            C18062b.m64134a(jSONObject, mo64150a);
        }
    }

    /* renamed from: a */
    private boolean m64076a(View view, JSONObject jSONObject) {
        String m64059a = this.f45497g.m64059a(view);
        if (m64059a != null) {
            C18062b.m64136a(jSONObject, m64059a);
            this.f45497g.m64048e();
            return true;
        }
        return false;
    }
}
