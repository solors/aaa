package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.player.a */
/* loaded from: classes10.dex */
public final class C44301a {

    /* renamed from: a */
    InterfaceC44306c f116300a;

    /* renamed from: b */
    Map<String, RunnableC44304b> f116301b = new HashMap();

    /* renamed from: c */
    Map<String, RunnableC44302a> f116302c = new HashMap();

    /* renamed from: sg.bigo.ads.core.player.a$a */
    /* loaded from: classes10.dex */
    class RunnableC44302a implements Runnable {

        /* renamed from: a */
        WeakReference<C43681a> f116303a;

        public RunnableC44302a(C43681a c43681a) {
            this.f116303a = new WeakReference<>(c43681a);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<C43681a> weakReference = RunnableC44302a.this.f116303a;
                    if (weakReference != null && weakReference.get() != null) {
                        RunnableC44302a runnableC44302a = RunnableC44302a.this;
                        C44301a.this.f116302c.remove(runnableC44302a.f116303a.get().f114335a);
                        RunnableC44302a runnableC44302a2 = RunnableC44302a.this;
                        C44301a.this.f116300a.mo3384c(runnableC44302a2.f116303a.get());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.player.a$b */
    /* loaded from: classes10.dex */
    public class RunnableC44304b implements Runnable {

        /* renamed from: a */
        C43681a f116306a;

        public RunnableC44304b(C43681a c43681a) {
            this.f116306a = c43681a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    RunnableC44304b runnableC44304b = RunnableC44304b.this;
                    C43681a c43681a = runnableC44304b.f116306a;
                    if (c43681a != null) {
                        C44301a.this.f116301b.remove(c43681a.f114335a);
                        RunnableC44304b runnableC44304b2 = RunnableC44304b.this;
                        C44301a.this.f116300a.mo3387b(runnableC44304b2.f116306a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    C43782a.m5010a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.player.a$c */
    /* loaded from: classes10.dex */
    public interface InterfaceC44306c {
        /* renamed from: b */
        void mo3387b(C43681a c43681a);

        /* renamed from: c */
        void mo3384c(C43681a c43681a);
    }

    public C44301a(InterfaceC44306c interfaceC44306c) {
        this.f116300a = interfaceC44306c;
    }

    /* renamed from: a */
    public final void m3425a(C43681a c43681a) {
        if (c43681a.m5218c()) {
            if (c43681a.m5216e() > 0) {
                m3423c(c43681a);
            }
            if (c43681a.m5215f() > 0) {
                if (this.f116302c.containsKey(c43681a.f114335a)) {
                    C43727d.m5106a(this.f116302c.remove(c43681a.f114335a));
                }
                RunnableC44302a runnableC44302a = new RunnableC44302a(c43681a);
                this.f116302c.put(c43681a.f114335a, runnableC44302a);
                C43727d.m5107a(3, runnableC44302a, c43681a.m5215f() * 1000);
            }
        }
    }

    /* renamed from: b */
    public final void m3424b(C43681a c43681a) {
        if (this.f116302c.containsKey(c43681a.f114335a)) {
            C43727d.m5106a(this.f116302c.get(c43681a.f114335a));
            this.f116302c.remove(c43681a.f114335a);
        }
    }

    /* renamed from: c */
    public final void m3423c(C43681a c43681a) {
        if (this.f116301b.containsKey(c43681a.f114335a)) {
            C43727d.m5106a(this.f116301b.remove(c43681a.f114335a));
            C43782a.m5010a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + c43681a.f114335a);
        }
        RunnableC44304b runnableC44304b = new RunnableC44304b(c43681a);
        this.f116301b.put(c43681a.f114335a, runnableC44304b);
        C43727d.m5107a(3, runnableC44304b, c43681a.m5216e() * 1000);
        C43782a.m5010a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + c43681a.m5216e());
    }
}
