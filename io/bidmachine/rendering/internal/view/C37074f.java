package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.internal.AbstractC37026e;
import io.bidmachine.rendering.internal.AbstractC37034i;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.internal.InterfaceC37036j;
import io.bidmachine.rendering.internal.controller.C37009e;
import io.bidmachine.rendering.internal.controller.InterfaceC37008d;
import io.bidmachine.rendering.internal.controller.InterfaceC37017f;
import io.bidmachine.rendering.internal.controller.InterfaceC37018g;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.Tag;
import io.bidmachine.rendering.utils.UiUtils;

/* renamed from: io.bidmachine.rendering.internal.view.f */
/* loaded from: classes9.dex */
public class C37074f extends FrameLayout {

    /* renamed from: a */
    private final Tag f97800a;

    /* renamed from: b */
    private final C37068d f97801b;

    /* renamed from: c */
    private final InterfaceC37008d f97802c;

    /* renamed from: d */
    private final C37072e f97803d;

    /* renamed from: e */
    private final C37072e f97804e;

    /* renamed from: f */
    private InterfaceC37078d f97805f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.internal.view.f$b */
    /* loaded from: classes9.dex */
    public final class C37076b implements InterfaceC37017f {
        private C37076b() {
            C37074f.this = r1;
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37017f
        /* renamed from: a */
        public void mo19053a(InterfaceC37008d interfaceC37008d, Error error) {
            AbstractC37037k.m19167a(C37074f.this.f97800a, "onAdPhaseFailToLoad (%s) - %s", interfaceC37008d, error);
            interfaceC37008d.mo19276a();
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37017f
        /* renamed from: a */
        public void mo19054a(InterfaceC37008d interfaceC37008d) {
            AbstractC37037k.m19162b(C37074f.this.f97800a, "onAdPhaseLoaded (%s)", interfaceC37008d);
            C37074f.this.setBackgroundColor(interfaceC37008d.mo19245f().getBackgroundColor());
            C37074f c37074f = C37074f.this;
            AbstractC37026e.m19217a(c37074f, c37074f.f97803d, interfaceC37008d.mo19243g());
            C37074f c37074f2 = C37074f.this;
            AbstractC37026e.m19217a(c37074f2, c37074f2.f97804e, interfaceC37008d.mo19242h());
            interfaceC37008d.mo19267a(new C37077c());
            C37074f.this.m19058h();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.view.f$d */
    /* loaded from: classes9.dex */
    public interface InterfaceC37078d {
        /* renamed from: a */
        void mo19047a();

        /* renamed from: b */
        void mo19046b();
    }

    public C37074f(Context context, AdPhaseParams adPhaseParams) {
        super(context);
        this.f97800a = new Tag("PlaceholderView");
        this.f97802c = new C37009e(context, adPhaseParams == null ? AbstractC37034i.m19172a() : adPhaseParams, new C37076b());
        C37072e c37072e = new C37072e(context);
        this.f97803d = c37072e;
        addView(c37072e, new ViewGroup.LayoutParams(-1, -1));
        C37072e c37072e2 = new C37072e(context);
        this.f97804e = c37072e2;
        addView(c37072e2, new ViewGroup.LayoutParams(-1, -1));
        C37068d c37068d = new C37068d(context);
        this.f97801b = c37068d;
        addView(c37068d, new ViewGroup.LayoutParams(-1, -1));
        c37068d.m19097a();
    }

    /* renamed from: h */
    void m19058h() {
        AbstractC37037k.m19162b(this.f97800a, "notifyPlaceholderLoaded", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.j
            {
                C37074f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C37074f.this.m19064e();
            }
        });
    }

    /* renamed from: i */
    public void m19057i() {
        this.f97802c.onShown();
    }

    /* renamed from: j */
    public void m19056j() {
        this.f97802c.mo19250d();
    }

    /* renamed from: k */
    public void m19055k() {
        this.f97802c.mo19247e();
    }

    public void setListener(@Nullable InterfaceC37078d interfaceC37078d) {
        this.f97805f = interfaceC37078d;
    }

    /* renamed from: c */
    public /* synthetic */ void m19068c() {
        this.f97803d.removeAllViews();
        this.f97804e.removeAllViews();
    }

    /* renamed from: d */
    public /* synthetic */ void m19066d() {
        InterfaceC37078d interfaceC37078d = this.f97805f;
        if (interfaceC37078d != null) {
            interfaceC37078d.mo19047a();
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m19064e() {
        InterfaceC37078d interfaceC37078d = this.f97805f;
        if (interfaceC37078d != null) {
            interfaceC37078d.mo19046b();
        }
    }

    /* renamed from: g */
    private void m19060g() {
        AbstractC37037k.m19162b(this.f97800a, "notifyPlaceholderClosed", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.view.i
            {
                C37074f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C37074f.this.m19066d();
            }
        });
    }

    /* renamed from: a */
    void m19072a() {
        m19060g();
    }

    /* renamed from: b */
    public void m19070b() {
        this.f97802c.mo19276a();
        UiUtils.onUiThread(new InterfaceC37036j() { // from class: io.bidmachine.rendering.internal.view.k
            {
                C37074f.this = this;
            }

            @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
            public final void onRun() {
                C37074f.this.m19068c();
            }
        });
    }

    /* renamed from: f */
    public void m19062f() {
        AbstractC37037k.m19162b(this.f97800a, "load", new Object[0]);
        this.f97802c.mo19254c();
    }

    /* renamed from: io.bidmachine.rendering.internal.view.f$c */
    /* loaded from: classes9.dex */
    private final class C37077c implements InterfaceC37018g {
        private C37077c() {
            C37074f.this = r1;
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37018g
        /* renamed from: a */
        public void mo19052a() {
            C37074f.this.f97801b.m19089c();
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37018g
        /* renamed from: b */
        public void mo19051b() {
            C37074f.this.m19072a();
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37018g
        /* renamed from: c */
        public void mo19050c() {
            C37074f.this.f97801b.m19097a();
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37018g
        /* renamed from: f */
        public void mo19048f() {
            C37074f.this.m19072a();
        }

        @Override // io.bidmachine.rendering.internal.controller.InterfaceC37018g
        /* renamed from: d */
        public void mo19049d() {
        }
    }
}
