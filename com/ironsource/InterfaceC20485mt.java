package com.ironsource;

import com.ironsource.C20606ot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.mt */
/* loaded from: classes6.dex */
public interface InterfaceC20485mt {

    @Metadata
    /* renamed from: com.ironsource.mt$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20486a {
        /* renamed from: a */
        void mo54361a();
    }

    @Metadata
    /* renamed from: com.ironsource.mt$b */
    /* loaded from: classes6.dex */
    public static final class C20487b {

        /* renamed from: a */
        private long f52077a;

        /* renamed from: b */
        private long f52078b;

        /* renamed from: a */
        public final long m56245a() {
            return this.f52078b;
        }

        /* renamed from: b */
        public final long m56243b() {
            return this.f52077a;
        }

        /* renamed from: a */
        public final void m56244a(long j) {
            this.f52078b = j;
        }

        /* renamed from: b */
        public final void m56242b(long j) {
            this.f52077a = j;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mt$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC20488c {
        @NotNull
        /* renamed from: a */
        InterfaceC20485mt mo56241a(@NotNull C20487b c20487b);
    }

    @Metadata
    /* renamed from: com.ironsource.mt$d */
    /* loaded from: classes6.dex */
    public static final class C20489d implements InterfaceC20488c {
        @Override // com.ironsource.InterfaceC20485mt.InterfaceC20488c
        @NotNull
        /* renamed from: a */
        public InterfaceC20485mt mo56241a(@NotNull C20487b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new C20490e(new C20606ot(timerConfig.m56243b()));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.mt$e */
    /* loaded from: classes6.dex */
    private static final class C20490e implements InterfaceC20485mt {
        @NotNull

        /* renamed from: a */
        private final C20606ot f52079a;

        @Metadata
        /* renamed from: com.ironsource.mt$e$a */
        /* loaded from: classes6.dex */
        public static final class C20491a implements C20606ot.InterfaceC20607a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC20486a f52080a;

            C20491a(InterfaceC20486a interfaceC20486a) {
                this.f52080a = interfaceC20486a;
            }

            @Override // com.ironsource.C20606ot.InterfaceC20607a
            /* renamed from: a */
            public void mo55897a() {
                this.f52080a.mo54361a();
            }
        }

        public C20490e(@NotNull C20606ot timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f52079a = timer;
        }

        @Override // com.ironsource.InterfaceC20485mt
        /* renamed from: a */
        public void mo56240a(@NotNull InterfaceC20486a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f52079a.m55900a((C20606ot.InterfaceC20607a) new C20491a(callback));
        }

        @Override // com.ironsource.InterfaceC20485mt
        public void cancel() {
            this.f52079a.m55898e();
        }
    }

    /* renamed from: a */
    void mo56240a(@NotNull InterfaceC20486a interfaceC20486a);

    void cancel();
}
