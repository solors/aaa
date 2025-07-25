package com.amazon.p047a.p048a.p056e;

import com.amazon.p047a.p048a.p056e.Expirable;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourcePopulationAware;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.a.a.e.a */
/* loaded from: classes2.dex */
public abstract class Expirable<T extends Expirable<T>> implements ResourcePopulationAware {

    /* renamed from: b */
    private static final KiwiLogger f2385b = new KiwiLogger("Expirable");
    @Resource

    /* renamed from: a */
    protected TaskManager f2386a;

    /* renamed from: c */
    private AtomicBoolean f2387c = new AtomicBoolean(false);

    /* renamed from: d */
    private final List<ExpirationObserver<T>> f2388d = new Vector();

    /* renamed from: h */
    private void m103131h() {
        this.f2386a.mo102885a(TaskPipelineId.BACKGROUND, new Task() { // from class: com.amazon.a.a.e.a.1
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                Expirable.this.m103134c();
            }

            public String toString() {
                return "Expire: " + Expirable.this.toString();
            }
        }, mo103015a());
    }

    /* renamed from: i */
    private void m103130i() {
        for (ExpirationObserver<T> expirationObserver : this.f2388d) {
            expirationObserver.mo103012a(this);
        }
    }

    /* renamed from: a */
    protected abstract Date mo103015a();

    /* renamed from: a */
    public final void m103135a(ExpirationObserver<T> expirationObserver) {
        this.f2388d.add(expirationObserver);
    }

    /* renamed from: c */
    public void m103134c() {
        if (!this.f2387c.compareAndSet(false, true)) {
            return;
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2385b;
            kiwiLogger.m102829a("Expiring: " + this);
        }
        mo102795d();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger2 = f2385b;
            kiwiLogger2.m102829a("Notifying Observers of expiration: " + this);
        }
        m103130i();
    }

    /* renamed from: d */
    protected abstract void mo102795d();

    @Override // com.amazon.p047a.p048a.p063k.ResourcePopulationAware
    /* renamed from: e */
    public final void mo102735e() {
        m103131h();
        mo103063b();
    }

    /* renamed from: f */
    public final void m103133f() {
        if (!this.f2387c.compareAndSet(false, true)) {
            return;
        }
        m103130i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public boolean m103132g() {
        return this.f2387c.get();
    }

    /* renamed from: b */
    protected void mo103063b() {
    }
}
