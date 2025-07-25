package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class fw1 implements InterfaceC31941z<ew1> {
    @NotNull

    /* renamed from: a */
    private final rt1 f79336a;
    @NotNull

    /* renamed from: b */
    private final nw1 f79337b;

    public fw1(@NotNull rt1 showSocialActionsReporter, @NotNull nw1 socialActionRenderer) {
        Intrinsics.checkNotNullParameter(showSocialActionsReporter, "showSocialActionsReporter");
        Intrinsics.checkNotNullParameter(socialActionRenderer, "socialActionRenderer");
        this.f79336a = showSocialActionsReporter;
        this.f79337b = socialActionRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31941z
    /* renamed from: a */
    public final void mo26510a(View view, ew1 ew1Var) {
        ew1 action = ew1Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79336a.m29952a(action.m34415c());
        this.f79337b.m31255a(view, action);
    }
}
