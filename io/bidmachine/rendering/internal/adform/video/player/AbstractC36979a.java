package io.bidmachine.rendering.internal.adform.video.player;

import android.net.Uri;
import android.view.View;
import androidx.annotation.CallSuper;
import io.bidmachine.rendering.internal.InterfaceC37036j;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.bidmachine.rendering.internal.adform.video.player.a */
/* loaded from: classes9.dex */
public abstract class AbstractC36979a implements InterfaceC36981b {

    /* renamed from: f */
    private InterfaceC36983d f97655f;

    /* renamed from: i */
    private Uri f97658i;

    /* renamed from: j */
    private long f97659j;

    /* renamed from: g */
    private volatile boolean f97656g = false;

    /* renamed from: h */
    private volatile boolean f97657h = false;

    /* renamed from: a */
    private final C36980a f97650a = new C36980a(16);

    /* renamed from: b */
    private final AtomicBoolean f97651b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AtomicBoolean f97652c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f97653d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicLong f97654e = new AtomicLong(-1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.rendering.internal.adform.video.player.a$a */
    /* loaded from: classes9.dex */
    public class C36980a implements InterfaceC37036j {

        /* renamed from: a */
        private final AtomicBoolean f97660a = new AtomicBoolean(false);

        /* renamed from: b */
        private final AtomicInteger f97661b = new AtomicInteger(0);

        /* renamed from: c */
        private final int f97662c;

        public C36980a(int i) {
            this.f97662c = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m19374c() {
            this.f97660a.set(false);
            UiUtils.cancelOnUiThread(this);
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public void onRun() {
            if (!this.f97660a.get()) {
                return;
            }
            if (AbstractC36979a.this.m19390e()) {
                m19378a();
            }
            AbstractC36979a abstractC36979a = AbstractC36979a.this;
            abstractC36979a.m19405a(abstractC36979a.mo19334h());
            UiUtils.onUiThread(this, this.f97662c);
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th) {
            super.onThrows(th);
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }

        /* renamed from: a */
        private void m19378a() {
            float mo19334h = (((float) AbstractC36979a.this.mo19334h()) * 100.0f) / ((float) AbstractC36979a.this.mo19335g());
            int i = this.f97661b.get();
            if (mo19334h > (i * 25.0f) - 1.0f) {
                if (i == 0) {
                    AbstractC36979a.this.m19381t();
                } else if (i == 1) {
                    AbstractC36979a.this.m19383r();
                } else if (i == 2) {
                    AbstractC36979a.this.m19382s();
                } else if (i == 3) {
                    AbstractC36979a.this.m19380u();
                } else if (i == 4) {
                    AbstractC36979a.this.m19384q();
                }
                this.f97661b.incrementAndGet();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m19376b() {
            m19374c();
            this.f97660a.set(true);
            UiUtils.onUiThread(this);
        }
    }

    /* renamed from: a */
    private void m19401a(boolean z, Long l) {
        if (l != null) {
            try {
                m19398b(l.longValue());
            } catch (Exception e) {
                m19403a(e);
                return;
            }
        }
        if (z) {
            mo19329z();
            return;
        }
        mo19345B();
        Uri uri = this.f97658i;
        if (uri != null) {
            mo19340b(uri);
        }
        mo19346A();
    }

    /* renamed from: c */
    private InterfaceC36983d m19395c() {
        return this.f97655f;
    }

    /* renamed from: A */
    protected abstract void mo19346A();

    /* renamed from: B */
    protected abstract void mo19345B();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m19400b() {
        this.f97650a.m19374c();
    }

    /* renamed from: b */
    protected abstract void mo19340b(Uri uri);

    /* renamed from: c */
    protected abstract void mo19337c(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m19391d() {
        if (this.f97652c.compareAndSet(true, false)) {
            m19401a(true, Long.valueOf(this.f97659j));
        }
        m19385p();
    }

    /* renamed from: d */
    protected abstract void mo19336d(float f);

    /* renamed from: e */
    public boolean m19390e() {
        try {
            return mo19332w();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b, io.bidmachine.rendering.internal.InterfaceC37042p
    /* renamed from: f */
    public void mo19154f() {
        if (this.f97657h && !this.f97653d.get()) {
            pause();
            m19398b(mo19335g());
            m19387m();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: g */
    public abstract /* synthetic */ long mo19335g();

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public abstract /* synthetic */ float getVolume();

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: h */
    public abstract /* synthetic */ long mo19334h();

    /* renamed from: i */
    public boolean m19389i() {
        try {
            return mo19331x();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b, io.bidmachine.rendering.internal.InterfaceC37039m
    /* renamed from: j */
    public void mo19153j() {
        m19399b(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m19388k() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19363c(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b, io.bidmachine.rendering.internal.InterfaceC37039m
    /* renamed from: l */
    public void mo19152l() {
        m19399b(0.0f);
    }

    /* renamed from: m */
    protected void m19387m() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19362d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m19386n() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19365b(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: o */
    public abstract /* synthetic */ View mo19333o();

    /* renamed from: p */
    protected void m19385p() {
        InterfaceC36983d m19395c;
        if (this.f97651b.compareAndSet(false, true) && (m19395c = m19395c()) != null) {
            m19395c.mo19360f(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public void pause() {
        try {
            this.f97652c.set(false);
            mo19330y();
            this.f97659j = mo19334h();
        } catch (Exception unused) {
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public void play() {
        Long l;
        try {
            this.f97657h = true;
            this.f97652c.set(true);
            boolean m19389i = m19389i();
            if (this.f97653d.get()) {
                l = Long.valueOf(mo19335g());
            } else {
                l = null;
            }
            m19401a(m19389i, l);
        } catch (Exception e) {
            m19396b(e);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    public void prepare() {
        try {
            mo19346A();
        } catch (Exception e) {
            m19392c(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void m19384q() {
        InterfaceC36983d m19395c;
        if (this.f97653d.compareAndSet(false, true) && (m19395c = m19395c()) != null) {
            m19395c.mo19357i(this);
        }
    }

    /* renamed from: r */
    protected void m19383r() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19370a(this);
        }
    }

    /* renamed from: s */
    protected void m19382s() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19358h(this);
        }
    }

    /* renamed from: t */
    protected void m19381t() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19359g(this);
        }
    }

    /* renamed from: u */
    protected void m19380u() {
        InterfaceC36983d m19395c;
        if (!this.f97653d.get() && (m19395c = m19395c()) != null) {
            m19395c.mo19361e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public void m19379v() {
        if (!this.f97653d.get()) {
            this.f97650a.m19376b();
        }
    }

    /* renamed from: w */
    protected abstract boolean mo19332w();

    /* renamed from: x */
    protected abstract boolean mo19331x();

    /* renamed from: y */
    protected abstract void mo19330y();

    /* renamed from: z */
    protected abstract void mo19329z();

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: a */
    public void mo19344a() {
        this.f97655f = null;
        m19400b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m19397b(Error error) {
        InterfaceC36983d m19395c;
        if (this.f97653d.get() || (m19395c = m19395c()) == null) {
            return;
        }
        m19395c.mo19367a(this, error);
    }

    /* renamed from: c */
    protected void m19393c(Error error) {
        InterfaceC36983d m19395c;
        if (this.f97653d.get() || (m19395c = m19395c()) == null) {
            return;
        }
        m19395c.mo19364b(this, error);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m19404a(Error error) {
        if (this.f97657h) {
            m19397b(error);
        } else {
            m19393c(error);
        }
    }

    /* renamed from: b */
    protected void m19396b(Throwable th) {
        m19397b(Error.create(th));
    }

    /* renamed from: c */
    protected void m19392c(Throwable th) {
        m19393c(Error.create(th));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m19403a(Throwable th) {
        m19404a(Error.create(th));
    }

    /* renamed from: b */
    public void m19398b(long j) {
        try {
            mo19337c(j);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m19394c(float f) {
        boolean z;
        if (f == 0.0f && !this.f97656g) {
            z = true;
        } else if (!this.f97656g) {
            return;
        } else {
            z = false;
        }
        this.f97656g = z;
        m19402a(z);
    }

    /* renamed from: a */
    protected void m19402a(boolean z) {
        InterfaceC36983d m19395c;
        if (this.f97653d.get() || (m19395c = m19395c()) == null) {
            return;
        }
        m19395c.mo19366a(this, z);
    }

    /* renamed from: b */
    public void m19399b(float f) {
        try {
            mo19336d(f);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m19405a(long j) {
        InterfaceC36983d m19395c;
        if (this.f97654e.getAndSet(j) == j || this.f97653d.get() || (m19395c = m19395c()) == null) {
            return;
        }
        m19395c.mo19368a(this, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m19406a(float f) {
        InterfaceC36983d m19395c;
        if (this.f97653d.get() || (m19395c = m19395c()) == null) {
            return;
        }
        m19395c.mo19369a((InterfaceC36981b) this, f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: a */
    public void mo19372a(InterfaceC36983d interfaceC36983d) {
        this.f97655f = interfaceC36983d;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.InterfaceC36981b
    /* renamed from: a */
    public void mo19373a(Uri uri) {
        try {
            mo19340b(uri);
            this.f97658i = uri;
        } catch (Exception unused) {
        }
    }
}
