package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class xy1 extends AbstractC32021zw<AbstractC31846xw.C31855h> {
    @NotNull

    /* renamed from: a */
    private final Function2<AbstractC31846xw.C31855h.EnumC31856a, Boolean, Unit> f87944a;
    @SuppressLint({"UseSwitchCompatOrMaterialCode"})
    @NotNull

    /* renamed from: b */
    private final Switch f87945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xy1(@NotNull View itemView, @NotNull Function2<? super AbstractC31846xw.C31855h.EnumC31856a, ? super Boolean, Unit> onCheckedChange) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        this.f87944a = onCheckedChange;
        View findViewById = itemView.findViewById(C29880R.C29884id.item_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87945b = (Switch) findViewById;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC32021zw
    /* renamed from: a */
    public final void mo25980a(@NotNull final AbstractC31846xw.C31855h unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f87945b.setOnCheckedChangeListener(null);
        this.f87945b.setText(unit.m27183c());
        this.f87945b.setChecked(unit.m27186a());
        this.f87945b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.mobile.ads.impl.z03
            {
                xy1.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xy1.m27159a(xy1.this, unit, compoundButton, z);
            }
        });
    }

    /* renamed from: a */
    public static final void m27159a(xy1 this$0, AbstractC31846xw.C31855h unit, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(unit, "$unit");
        this$0.f87944a.mo105910invoke(unit.m27184b(), Boolean.valueOf(z));
    }
}
