package p776ld;

import ad.Scheduler;
import id.ComputationScheduler;
import id.ExecutorScheduler;
import id.IoScheduler;
import id.NewThreadScheduler;
import id.SingleScheduler;
import id.TrampolineScheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p762kd.RxJavaPlugins;

/* renamed from: ld.a */
/* loaded from: classes9.dex */
public final class Schedulers {

    /* renamed from: a */
    static final Scheduler f100902a = RxJavaPlugins.m17730g(new CallableC38162h());

    /* renamed from: b */
    static final Scheduler f100903b = RxJavaPlugins.m17733d(new CallableC38156b());

    /* renamed from: c */
    static final Scheduler f100904c = RxJavaPlugins.m17732e(new CallableC38157c());

    /* renamed from: d */
    static final Scheduler f100905d = TrampolineScheduler.m23012a();

    /* renamed from: e */
    static final Scheduler f100906e = RxJavaPlugins.m17731f(new CallableC38160f());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$a */
    /* loaded from: classes9.dex */
    public static final class C38155a {

        /* renamed from: a */
        static final Scheduler f100907a = new ComputationScheduler();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$b */
    /* loaded from: classes9.dex */
    static final class CallableC38156b implements Callable<Scheduler> {
        CallableC38156b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C38155a.f100907a;
        }
    }

    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$c */
    /* loaded from: classes9.dex */
    static final class CallableC38157c implements Callable<Scheduler> {
        CallableC38157c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C38158d.f100908a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$d */
    /* loaded from: classes9.dex */
    public static final class C38158d {

        /* renamed from: a */
        static final Scheduler f100908a = new IoScheduler();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$e */
    /* loaded from: classes9.dex */
    public static final class C38159e {

        /* renamed from: a */
        static final Scheduler f100909a = new NewThreadScheduler();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$f */
    /* loaded from: classes9.dex */
    static final class CallableC38160f implements Callable<Scheduler> {
        CallableC38160f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C38159e.f100909a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$g */
    /* loaded from: classes9.dex */
    public static final class C38161g {

        /* renamed from: a */
        static final Scheduler f100910a = new SingleScheduler();
    }

    /* compiled from: Schedulers.java */
    /* renamed from: ld.a$h */
    /* loaded from: classes9.dex */
    static final class CallableC38162h implements Callable<Scheduler> {
        CallableC38162h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Scheduler call() throws Exception {
            return C38161g.f100910a;
        }
    }

    /* renamed from: a */
    public static Scheduler m15542a(Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    /* renamed from: b */
    public static Scheduler m15541b() {
        return RxJavaPlugins.m17725l(f100902a);
    }
}
