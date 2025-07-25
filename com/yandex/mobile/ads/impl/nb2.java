package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.yandex.mobile.ads.C29880R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nb2 {
    @NotNull

    /* renamed from: a */
    private final Function1<InterfaceC31400sw, Unit> f82663a;
    @NotNull

    /* renamed from: b */
    private final C30051bw f82664b;

    /* JADX WARN: Multi-variable type inference failed */
    public nb2(@NotNull Function1<? super InterfaceC31400sw, Unit> onAction, @NotNull C30051bw imageLoader) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f82663a = onAction;
        this.f82664b = imageLoader;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC32021zw m31621a(@NotNull View itemView, @LayoutRes int i) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (i == C29880R.C29885layout.debug_panel_item_action_button) {
            return new C31862y(hb2.f80027b, itemView);
        }
        if (i == C29880R.C29885layout.debug_panel_item_switch) {
            return new xy1(itemView, new ib2(this));
        }
        if (i == C29880R.C29885layout.deubg_panel_item_header) {
            return new yc0(itemView);
        }
        if (i == C29880R.C29885layout.deubg_panel_item_key_value) {
            return new ao0(itemView);
        }
        if (i == C29880R.C29885layout.debug_panel_item_mediation_adapter) {
            return new vw0(itemView, this.f82664b, new jb2(this), new kb2(this));
        }
        return i == C29880R.C29885layout.debug_panel_item_ad_units ? new C29926aa(itemView, new lb2(this)) : i == C29880R.C29885layout.debug_panel_item_ad_unit ? new C31876y9(new mb2(this), itemView) : new u10(itemView);
    }
}
