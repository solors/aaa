package p988u;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p837q.AbstractC39308j;
import p837q.C39316r;
import p837q.ImageResult;
import p988u.InterfaceC44412c;

@Metadata
/* renamed from: u.b */
/* loaded from: classes2.dex */
public final class NoneTransition implements InterfaceC44412c {
    @NotNull

    /* renamed from: a */
    private final TransitionTarget f116560a;
    @NotNull

    /* renamed from: b */
    private final AbstractC39308j f116561b;

    /* compiled from: NoneTransition.kt */
    @Metadata
    /* renamed from: u.b$a */
    /* loaded from: classes2.dex */
    public static final class C44411a implements InterfaceC44412c.InterfaceC44413a {
        @Override // p988u.InterfaceC44412c.InterfaceC44413a
        @NotNull
        /* renamed from: a */
        public InterfaceC44412c mo3088a(@NotNull TransitionTarget transitionTarget, @NotNull AbstractC39308j abstractC39308j) {
            return new NoneTransition(transitionTarget, abstractC39308j);
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof C44411a;
        }

        public int hashCode() {
            return C44411a.class.hashCode();
        }
    }

    public NoneTransition(@NotNull TransitionTarget transitionTarget, @NotNull AbstractC39308j abstractC39308j) {
        this.f116560a = transitionTarget;
        this.f116561b = abstractC39308j;
    }

    @Override // p988u.InterfaceC44412c
    /* renamed from: a */
    public void mo3089a() {
        AbstractC39308j abstractC39308j = this.f116561b;
        if (abstractC39308j instanceof C39316r) {
            this.f116560a.mo12242a(((C39316r) abstractC39308j).mo13017a());
        } else if (abstractC39308j instanceof ImageResult) {
            this.f116560a.mo12240c(abstractC39308j.mo13017a());
        }
    }
}
