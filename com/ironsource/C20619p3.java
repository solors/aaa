package com.ironsource;

import com.ironsource.lifecycle.C20271b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.p3 */
/* loaded from: classes6.dex */
public final class C20619p3 extends AbstractC21231xn {
    @NotNull

    /* renamed from: f */
    public static final C20620a f52374f = new C20620a(null);
    @NotNull

    /* renamed from: g */
    private static final String f52375g = "AppLifecycleTrigger";
    @NotNull

    /* renamed from: d */
    private final C20271b f52376d;
    @NotNull

    /* renamed from: e */
    private final InterfaceC20105ij f52377e;

    @Metadata
    /* renamed from: com.ironsource.p3$a */
    /* loaded from: classes6.dex */
    public static final class C20620a {
        private C20620a() {
        }

        public /* synthetic */ C20620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20619p3(@NotNull C20271b lifeCycleObserver) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(lifeCycleObserver, "lifeCycleObserver");
        this.f52376d = lifeCycleObserver;
        C20621b c20621b = new C20621b();
        this.f52377e = c20621b;
        lifeCycleObserver.m57457a(c20621b);
        m54111a(lifeCycleObserver.m57445e());
    }

    @Override // com.ironsource.AbstractC21231xn
    @NotNull
    /* renamed from: b */
    public String mo54110b() {
        return f52375g;
    }

    /* renamed from: e */
    public final void m55868e() {
        this.f52376d.m57453b(this.f52377e);
    }

    @Metadata
    /* renamed from: com.ironsource.p3$b */
    /* loaded from: classes6.dex */
    public static final class C20621b implements InterfaceC20105ij {
        C20621b() {
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: a */
        public void mo55609a() {
            C20619p3.this.m54111a(false);
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: d */
        public void mo55605d() {
            C20619p3.this.m54111a(true);
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: b */
        public void mo55607b() {
        }

        @Override // com.ironsource.InterfaceC20105ij
        /* renamed from: c */
        public void mo55606c() {
        }
    }
}
