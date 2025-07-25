package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.common.InterfaceC43665g;

/* renamed from: sg.bigo.ads.api.core.g */
/* loaded from: classes10.dex */
public final class C43562g {
    @NonNull

    /* renamed from: a */
    public final InterfaceC43550c f114090a;
    @NonNull

    /* renamed from: b */
    public final InterfaceC43528l f114091b;
    @NonNull

    /* renamed from: c */
    public final AbstractC43532b f114092c;
    @Nullable

    /* renamed from: d */
    public InterfaceC43665g f114093d;

    /* renamed from: sg.bigo.ads.api.core.g$a */
    /* loaded from: classes10.dex */
    public static class C43563a {
        @Nullable

        /* renamed from: a */
        public InterfaceC43665g f114094a;
        @NonNull

        /* renamed from: b */
        private final InterfaceC43550c f114095b;
        @NonNull

        /* renamed from: c */
        private final InterfaceC43528l f114096c;
        @NonNull

        /* renamed from: d */
        private final AbstractC43532b f114097d;

        public C43563a(@NonNull InterfaceC43550c interfaceC43550c, @NonNull InterfaceC43528l interfaceC43528l, @NonNull AbstractC43532b abstractC43532b) {
            this.f114095b = interfaceC43550c;
            this.f114096c = interfaceC43528l;
            this.f114097d = abstractC43532b;
        }

        /* renamed from: a */
        public final C43562g m5412a() {
            C43562g c43562g = new C43562g(this.f114095b, this.f114096c, this.f114097d, (byte) 0);
            c43562g.f114093d = this.f114094a;
            return c43562g;
        }
    }

    private C43562g(@NonNull InterfaceC43550c interfaceC43550c, @NonNull InterfaceC43528l interfaceC43528l, @NonNull AbstractC43532b abstractC43532b) {
        this.f114090a = interfaceC43550c;
        this.f114091b = interfaceC43528l;
        this.f114092c = abstractC43532b;
    }

    /* renamed from: a */
    public final C43562g m5413a(InterfaceC43550c interfaceC43550c) {
        C43562g c43562g = new C43562g(interfaceC43550c, this.f114091b, this.f114092c);
        c43562g.f114093d = this.f114093d;
        return c43562g;
    }

    /* synthetic */ C43562g(InterfaceC43550c interfaceC43550c, InterfaceC43528l interfaceC43528l, AbstractC43532b abstractC43532b, byte b) {
        this(interfaceC43550c, interfaceC43528l, abstractC43532b);
    }
}
