package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.scheduling.C24241e;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.publisher.e0 */
/* loaded from: classes7.dex */
public final class C24105e0 {

    /* renamed from: com.moloco.sdk.internal.publisher.e0$a */
    /* loaded from: classes7.dex */
    public static final class C24106a extends Lambda implements Functions<Unit> {

        /* renamed from: g */
        public final /* synthetic */ MolocoInitializationListener f62382g;

        /* renamed from: h */
        public final /* synthetic */ MolocoInitStatus f62383h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24106a(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus molocoInitStatus) {
            super(0);
            this.f62382g = molocoInitializationListener;
            this.f62383h = molocoInitStatus;
        }

        /* renamed from: a */
        public final void m46975a() {
            this.f62382g.onMolocoInitializationStatus(this.f62383h);
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            m46975a();
            return Unit.f99208a;
        }
    }

    /* renamed from: a */
    public static final void m46976a(@NotNull MolocoInitializationListener molocoInitializationListener, @NotNull MolocoInitStatus initStatus) {
        Intrinsics.checkNotNullParameter(molocoInitializationListener, "<this>");
        Intrinsics.checkNotNullParameter(initStatus, "initStatus");
        C24241e.m46731a(new C24106a(molocoInitializationListener, initStatus));
    }
}
