package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.p388c.C17947b;
import com.iab.omid.library.bigosg.p388c.InterfaceC17945a;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.p389d.C17954d;
import com.iab.omid.library.bigosg.p389d.C17956f;
import com.iab.omid.library.bigosg.walking.C17966a;
import com.iab.omid.library.bigosg.walking.p391a.C17972c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TreeWalker implements InterfaceC17945a.InterfaceC17946a {

    /* renamed from: a */
    private static TreeWalker f45247a = new TreeWalker();

    /* renamed from: b */
    private static Handler f45248b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static Handler f45249c = null;

    /* renamed from: j */
    private static final Runnable f45250j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().m64515h();
        }
    };

    /* renamed from: k */
    private static final Runnable f45251k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f45249c != null) {
                TreeWalker.f45249c.post(TreeWalker.f45250j);
                TreeWalker.f45249c.postDelayed(TreeWalker.f45251k, 200L);
            }
        }
    };

    /* renamed from: e */
    private int f45253e;

    /* renamed from: i */
    private long f45257i;

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f45252d = new ArrayList();

    /* renamed from: g */
    private C17966a f45255g = new C17966a();

    /* renamed from: f */
    private C17947b f45254f = new C17947b();

    /* renamed from: h */
    private C17976b f45256h = new C17976b(new C17972c());

    /* loaded from: classes6.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    /* loaded from: classes6.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    public static TreeWalker getInstance() {
        return f45247a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m64515h() {
        m64514i();
        m64519d();
        m64513j();
    }

    /* renamed from: i */
    private void m64514i() {
        this.f45253e = 0;
        this.f45257i = C17954d.m64574a();
    }

    /* renamed from: j */
    private void m64513j() {
        m64529a(C17954d.m64574a() - this.f45257i);
    }

    /* renamed from: k */
    private void m64512k() {
        if (f45249c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f45249c = handler;
            handler.post(f45250j);
            f45249c.postDelayed(f45251k, 200L);
        }
    }

    /* renamed from: l */
    private void m64511l() {
        Handler handler = f45249c;
        if (handler != null) {
            handler.removeCallbacks(f45251k);
            f45249c = null;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f45252d.contains(treeWalkerTimeLogger)) {
            this.f45252d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void m64523b() {
        m64520c();
        this.f45252d.clear();
        f45248b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f45256h.m64483a();
            }
        });
    }

    /* renamed from: c */
    public void m64520c() {
        m64511l();
    }

    @VisibleForTesting
    /* renamed from: d */
    void m64519d() {
        this.f45255g.m64502c();
        long m64574a = C17954d.m64574a();
        InterfaceC17945a m64603a = this.f45254f.m64603a();
        if (this.f45255g.m64505b().size() > 0) {
            Iterator<String> it = this.f45255g.m64505b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject mo64600a = m64603a.mo64600a(null);
                m64524a(next, this.f45255g.m64503b(next), mo64600a);
                C17951b.m64588a(mo64600a);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f45256h.m64479b(mo64600a, hashSet, m64574a);
            }
        }
        if (this.f45255g.m64510a().size() > 0) {
            JSONObject mo64600a2 = m64603a.mo64600a(null);
            m64527a(null, m64603a, mo64600a2, EnumC17977c.PARENT_VIEW);
            C17951b.m64588a(mo64600a2);
            this.f45256h.m64481a(mo64600a2, this.f45255g.m64510a(), m64574a);
        } else {
            this.f45256h.m64483a();
        }
        this.f45255g.m64500d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f45252d.contains(treeWalkerTimeLogger)) {
            this.f45252d.remove(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    private void m64522b(View view, JSONObject jSONObject) {
        C17966a.C17967a m64504b = this.f45255g.m64504b(view);
        if (m64504b != null) {
            C17951b.m64587a(jSONObject, m64504b);
        }
    }

    /* renamed from: a */
    public void m64530a() {
        m64512k();
    }

    /* renamed from: a */
    private void m64529a(long j) {
        if (this.f45252d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f45252d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f45253e, TimeUnit.NANOSECONDS.toMillis(j));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f45253e, j);
                }
            }
        }
    }

    @Override // com.iab.omid.library.bigosg.p388c.InterfaceC17945a.InterfaceC17946a
    /* renamed from: a */
    public void mo64528a(View view, InterfaceC17945a interfaceC17945a, JSONObject jSONObject) {
        EnumC17977c m64501c;
        if (C17956f.m64557d(view) && (m64501c = this.f45255g.m64501c(view)) != EnumC17977c.UNDERLYING_VIEW) {
            JSONObject mo64600a = interfaceC17945a.mo64600a(view);
            C17951b.m64584a(jSONObject, mo64600a);
            if (!m64526a(view, mo64600a)) {
                m64522b(view, mo64600a);
                m64527a(view, interfaceC17945a, mo64600a, m64501c);
            }
            this.f45253e++;
        }
    }

    /* renamed from: a */
    private void m64527a(View view, InterfaceC17945a interfaceC17945a, JSONObject jSONObject, EnumC17977c enumC17977c) {
        interfaceC17945a.mo64599a(view, jSONObject, this, enumC17977c == EnumC17977c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m64524a(String str, View view, JSONObject jSONObject) {
        InterfaceC17945a m64602b = this.f45254f.m64602b();
        String m64506a = this.f45255g.m64506a(str);
        if (m64506a != null) {
            JSONObject mo64600a = m64602b.mo64600a(view);
            C17951b.m64586a(mo64600a, str);
            C17951b.m64582b(mo64600a, m64506a);
            C17951b.m64584a(jSONObject, mo64600a);
        }
    }

    /* renamed from: a */
    private boolean m64526a(View view, JSONObject jSONObject) {
        String m64509a = this.f45255g.m64509a(view);
        if (m64509a != null) {
            C17951b.m64586a(jSONObject, m64509a);
            this.f45255g.m64498e();
            return true;
        }
        return false;
    }
}
