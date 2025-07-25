package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yc0 extends AbstractC32021zw<AbstractC31846xw.C31852e> {
    @NotNull

    /* renamed from: a */
    private final TextView f88144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc0(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View findViewById = itemView.findViewById(C29880R.C29884id.item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f88144a = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC32021zw
    /* renamed from: a */
    public final void mo25980a(AbstractC31846xw.C31852e c31852e) {
        AbstractC31846xw.C31852e unit = c31852e;
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f88144a.setText(unit.m27200a());
    }
}
