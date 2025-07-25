package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.InterfaceC25243d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.InterfaceC25120d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.AbstractC25103k;
import ge.C33329j;
import ge.C33361p0;
import ge.InterfaceC33330j0;
import ge.InterfaceC33421z;
import ge.StateFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.NoWhenBranchMatchedException;
import sd.C42688d;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d */
/* loaded from: classes7.dex */
public final class C25073d implements InterfaceC25072c {
    @NotNull

    /* renamed from: b */
    public final StateFlow<AbstractC25103k> f65049b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC33421z<InterfaceC25243d.AbstractC25244a> f65050c;

    @DebugMetadata(m17095c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AdGoNextActionImpl$1", m17094f = "AdGoNextAction.kt", m17093l = {}, m17092m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d$a */
    /* loaded from: classes7.dex */
    public static final class C25074a extends AbstractC37596l implements Function2<AbstractC25103k, Continuation<? super Unit>, Object> {

        /* renamed from: l */
        public int f65051l;

        /* renamed from: m */
        public /* synthetic */ Object f65052m;

        public C25074a(Continuation<? super C25074a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: b */
        public final Object mo105910invoke(@Nullable AbstractC25103k abstractC25103k, @Nullable Continuation<? super Unit> continuation) {
            return ((C25074a) create(abstractC25103k, continuation)).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C25074a c25074a = new C25074a(continuation);
            c25074a.f65052m = obj;
            return c25074a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC25120d interfaceC25120d;
            C42688d.m6959e();
            if (this.f65051l == 0) {
                C38508r.m14539b(obj);
                AbstractC25103k abstractC25103k = (AbstractC25103k) this.f65052m;
                if (abstractC25103k instanceof AbstractC25103k.C25104a) {
                    interfaceC25120d = ((AbstractC25103k.C25104a) abstractC25103k).m45133a();
                } else if (abstractC25103k instanceof AbstractC25103k.C25105b) {
                    interfaceC25120d = ((AbstractC25103k.C25105b) abstractC25103k).m45132a();
                } else {
                    interfaceC25120d = null;
                }
                if (interfaceC25120d == null) {
                    return Unit.f99208a;
                }
                interfaceC25120d.reset();
                return Unit.f99208a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25073d(@NotNull StateFlow<? extends AbstractC25103k> currentPlaylistItem, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f65049b = currentPlaylistItem;
        C33329j.m24105N(C33329j.m24111H(currentPlaylistItem, new C25074a(null)), scope, InterfaceC33330j0.f90958a.m24072c(), null);
        this.f65050c = C33361p0.m24033a(InterfaceC25243d.AbstractC25244a.C25247c.f65538a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.InterfaceC25243d
    @NotNull
    /* renamed from: l */
    public StateFlow<InterfaceC25243d.AbstractC25244a> mo44825l() {
        AbstractC25103k value = this.f65049b.getValue();
        if (value instanceof AbstractC25103k.C25104a) {
            return ((AbstractC25103k.C25104a) value).m45133a().mo44825l();
        }
        if (value instanceof AbstractC25103k.C25105b) {
            return ((AbstractC25103k.C25105b) value).m45132a().mo44825l();
        }
        if (value instanceof AbstractC25103k.C25106c) {
            return ((AbstractC25103k.C25106c) value).m45131a().mo44825l();
        }
        if (value instanceof AbstractC25103k.C25107d) {
            return ((AbstractC25103k.C25107d) value).m45130a().mo44825l();
        }
        if (value == null) {
            return this.f65050c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
