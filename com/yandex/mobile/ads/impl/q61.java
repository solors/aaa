package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q61 {
    @NotNull

    /* renamed from: a */
    private final pn1 f84243a;
    @Nullable

    /* renamed from: b */
    private final ja0 f84244b;
    @Nullable

    /* renamed from: c */
    private View f84245c;

    /* renamed from: com.yandex.mobile.ads.impl.q61$a */
    /* loaded from: classes8.dex */
    private final class C31181a implements uh1 {
        public C31181a() {
        }

        @Override // com.yandex.mobile.ads.impl.uh1
        /* renamed from: a */
        public final void mo27864a(long j, long j2) {
            View view = q61.this.f84245c;
            if (view != null) {
                q61.this.f84243a.m30612a(view, j, j2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.uh1
        /* renamed from: a */
        public final void mo27865a() {
            View view = q61.this.f84245c;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    public /* synthetic */ q61(m02 m02Var, b61 b61Var, e02 e02Var) {
        this(m02Var, b61Var, e02Var, new qn1(), new pn1(m02Var));
    }

    /* renamed from: c */
    public final void m30457c() {
        ja0 ja0Var = this.f84244b;
        if (ja0Var != null) {
            ja0Var.resume();
        }
    }

    /* renamed from: a */
    public final void m30462a() {
        this.f84245c = null;
        ja0 ja0Var = this.f84244b;
        if (ja0Var != null) {
            ja0Var.invalidate();
        }
    }

    /* renamed from: b */
    public final void m30459b() {
        ja0 ja0Var = this.f84244b;
        if (ja0Var != null) {
            ja0Var.pause();
        }
    }

    public q61(@NotNull m02 timerViewProvider, @NotNull b61 nativeMediaContent, @NotNull e02 timeProviderContainer, @NotNull qn1 rewardViewControllerProvider, @NotNull pn1 rewardTimerViewController) {
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(rewardViewControllerProvider, "rewardViewControllerProvider");
        Intrinsics.checkNotNullParameter(rewardTimerViewController, "rewardTimerViewController");
        this.f84243a = rewardTimerViewController;
        C31181a c31181a = new C31181a();
        rewardViewControllerProvider.getClass();
        this.f84244b = qn1.m30257a(c31181a, nativeMediaContent, timeProviderContainer);
    }

    /* renamed from: a */
    public final void m30461a(@Nullable View view) {
        this.f84245c = view;
        ja0 ja0Var = this.f84244b;
        if (ja0Var != null) {
            ja0Var.start();
        }
    }
}
