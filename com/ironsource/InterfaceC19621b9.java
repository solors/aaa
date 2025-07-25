package com.ironsource;

import com.ironsource.InterfaceC20146jd;
import com.ironsource.InterfaceC20338md;
import com.ironsource.InterfaceC20485mt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.b9 */
/* loaded from: classes6.dex */
public interface InterfaceC19621b9 {
    @NotNull

    /* renamed from: a */
    public static final C19625c f49256a = C19625c.f49263a;

    @Metadata
    /* renamed from: com.ironsource.b9$a */
    /* loaded from: classes6.dex */
    public static final class C19622a implements InterfaceC19621b9 {
        @NotNull

        /* renamed from: b */
        private final InterfaceC20094id f49257b;
        @NotNull

        /* renamed from: c */
        private final InterfaceC20485mt f49258c;
        @NotNull

        /* renamed from: d */
        private final AtomicBoolean f49259d;

        @Metadata
        /* renamed from: com.ironsource.b9$a$a */
        /* loaded from: classes6.dex */
        public static final class C19623a implements InterfaceC20485mt.InterfaceC20486a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC19626d f49260a;

            /* renamed from: b */
            final /* synthetic */ C19622a f49261b;

            C19623a(InterfaceC19626d interfaceC19626d, C19622a c19622a) {
                this.f49260a = interfaceC19626d;
                this.f49261b = c19622a;
            }

            @Override // com.ironsource.InterfaceC20485mt.InterfaceC20486a
            /* renamed from: a */
            public void mo54361a() {
                this.f49260a.mo55315a(new InterfaceC20338md.C20339a(new InterfaceC20146jd.C20147a(this.f49261b.f49257b.mo57984b())));
                this.f49261b.f49259d.set(false);
            }
        }

        public C19622a(@NotNull InterfaceC20094id config, @NotNull InterfaceC20485mt timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f49257b = config;
            this.f49258c = timer;
            this.f49259d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC19621b9
        /* renamed from: a */
        public synchronized void mo59344a() {
            this.f49258c.cancel();
            this.f49259d.set(false);
        }

        @Override // com.ironsource.InterfaceC19621b9
        /* renamed from: a */
        public synchronized void mo59343a(@NotNull InterfaceC19626d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f49259d.compareAndSet(false, true)) {
                this.f49258c.mo56240a(new C19623a(callback, this));
            }
        }
    }

    @Metadata
    /* renamed from: com.ironsource.b9$b */
    /* loaded from: classes6.dex */
    public static final class C19624b implements InterfaceC19621b9 {
        @NotNull

        /* renamed from: b */
        public static final C19624b f49262b = new C19624b();

        private C19624b() {
        }

        @Override // com.ironsource.InterfaceC19621b9
        /* renamed from: a */
        public void mo59344a() {
        }

        @Override // com.ironsource.InterfaceC19621b9
        /* renamed from: a */
        public void mo59343a(@NotNull InterfaceC19626d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    @Metadata
    /* renamed from: com.ironsource.b9$c */
    /* loaded from: classes6.dex */
    public static final class C19625c {

        /* renamed from: a */
        static final /* synthetic */ C19625c f49263a = new C19625c();

        private C19625c() {
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC19621b9 m59342a() {
            return C19624b.f49262b;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC19621b9 m59341a(@NotNull C20202kd featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (featureFlag.mo57647c()) {
                C20044hd c20044hd = new C20044hd(featureFlag);
                InterfaceC20485mt.C20487b c20487b = new InterfaceC20485mt.C20487b();
                c20487b.m56242b(c20044hd.mo57985a());
                c20487b.m56244a(c20044hd.mo57985a());
                return new C19622a(c20044hd, new InterfaceC20485mt.C20489d().mo56241a(c20487b));
            }
            return C19624b.f49262b;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.b9$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC19626d {
        /* renamed from: a */
        void mo55315a(@NotNull InterfaceC20338md interfaceC20338md);
    }

    @NotNull
    /* renamed from: a */
    static InterfaceC19621b9 m59347a(@NotNull C20202kd c20202kd) {
        return f49256a.m59341a(c20202kd);
    }

    /* renamed from: a */
    void mo59344a();

    /* renamed from: a */
    void mo59343a(@NotNull InterfaceC19626d interfaceC19626d);
}
