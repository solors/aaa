package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y */
/* loaded from: classes8.dex */
public final class C31862y extends AbstractC32021zw<AbstractC31846xw.C31849c> {
    @NotNull

    /* renamed from: a */
    private final Function1<AbstractC31846xw.C31849c.EnumC31850a, Unit> f87970a;
    @NotNull

    /* renamed from: b */
    private final TextView f87971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31862y(@NotNull Function1 onButtonClick, @NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f87970a = onButtonClick;
        View findViewById = itemView.findViewById(C29880R.C29884id.item_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87971b = (TextView) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC32021zw
    /* renamed from: a */
    public final void mo25980a(@NotNull final AbstractC31846xw.C31849c unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f87971b.setText(unit.m27201b());
        this.f87971b.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.b13
            {
                C31862y.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C31862y.m27133a(C31862y.this, unit, view);
            }
        });
    }

    /* renamed from: a */
    public static final void m27133a(C31862y this$0, AbstractC31846xw.C31849c unit, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f87970a.invoke(unit.m27202a());
    }
}
