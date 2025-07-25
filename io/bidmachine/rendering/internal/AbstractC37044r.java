package io.bidmachine.rendering.internal;

import androidx.annotation.CallSuper;
import io.bidmachine.rendering.internal.event.InterfaceC37027a;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.bidmachine.rendering.internal.r */
/* loaded from: classes9.dex */
public abstract class AbstractC37044r implements InterfaceC37041o, InterfaceC37039m, InterfaceC37040n, InterfaceC37043q, InterfaceC37042p, InterfaceC37033h {

    /* renamed from: a */
    private final InterfaceC37027a f97747a;

    /* renamed from: b */
    private final List f97748b = new CopyOnWriteArrayList();

    /* renamed from: io.bidmachine.rendering.internal.r$a */
    /* loaded from: classes9.dex */
    class C37045a extends AbstractC37046b {
        C37045a() {
            super(null);
        }

        @Override // io.bidmachine.rendering.internal.AbstractC37044r.AbstractC37046b, io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public void onRun() {
            AbstractC37044r.this.m19150p().mo19195k();
            AbstractC37044r.this.f97748b.remove(this);
        }

        @Override // io.bidmachine.rendering.internal.AbstractC37044r.AbstractC37046b, io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th) {
            super.onThrows(th);
        }

        @Override // io.bidmachine.rendering.internal.AbstractC37044r.AbstractC37046b, io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    /* renamed from: io.bidmachine.rendering.internal.r$b */
    /* loaded from: classes9.dex */
    private static abstract class AbstractC37046b implements InterfaceC37036j {

        /* renamed from: a */
        private long f97750a;

        /* renamed from: b */
        private long f97751b;

        private AbstractC37046b() {
        }

        /* synthetic */ AbstractC37046b(C37045a c37045a) {
            this();
        }

        /* renamed from: c */
        private long m19145c() {
            return Math.max(this.f97751b - System.currentTimeMillis(), 0L);
        }

        /* renamed from: a */
        public void m19148a() {
            this.f97750a = m19145c();
            UiUtils.cancelOnUiThread(this);
        }

        /* renamed from: b */
        public void m19146b() {
            long j = this.f97750a;
            if (j > 0) {
                UiUtils.onUiThread(this, j);
            } else {
                UiUtils.onUiThread(this);
            }
        }

        @Override // io.bidmachine.rendering.internal.InterfaceC37036j, io.bidmachine.rendering.utils.SafeRunnable
        public abstract /* synthetic */ void onRun();

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
        public void m19147a(long j) {
            this.f97750a = j;
            this.f97751b = System.currentTimeMillis() + j;
            m19146b();
        }
    }

    public AbstractC37044r(InterfaceC37027a interfaceC37027a) {
        this.f97747a = interfaceC37027a;
    }

    /* renamed from: a */
    public void mo19099a(long j, long j2, float f) {
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37041o
    /* renamed from: m */
    public void mo19151m() {
        for (AbstractC37046b abstractC37046b : this.f97748b) {
            abstractC37046b.m19146b();
        }
    }

    /* renamed from: p */
    public InterfaceC37027a m19150p() {
        return this.f97747a;
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37041o
    public void pause() {
        for (AbstractC37046b abstractC37046b : this.f97748b) {
            abstractC37046b.m19148a();
        }
    }

    /* renamed from: q */
    public abstract String mo19149q();

    /* renamed from: a */
    public void mo19156a(String str) {
    }

    /* renamed from: a */
    public void mo19159a() {
        for (AbstractC37046b abstractC37046b : this.f97748b) {
            abstractC37046b.m19148a();
        }
        this.f97748b.clear();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37041o
    /* renamed from: a */
    public void mo19158a(long j) {
        C37045a c37045a = new C37045a();
        this.f97748b.add(c37045a);
        c37045a.m19147a(j);
    }

    /* renamed from: b */
    public void mo19155b() {
    }

    /* renamed from: f */
    public void mo19154f() {
    }

    /* renamed from: j */
    public void mo19153j() {
    }

    /* renamed from: l */
    public void mo19152l() {
    }
}
