package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BackHandlingRecyclerView.kt */
@Metadata
/* loaded from: classes8.dex */
public class BackHandlingRecyclerView extends RecyclerView {
    @NotNull

    /* renamed from: i */
    private final BackKeyPressedHelper f75454i;

    public /* synthetic */ BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    @CallSuper
    public boolean onKeyPreIme(int i, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.f75454i.m37122a(i, event) && !super.onKeyPreIme(i, event)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    @CallSuper
    protected void onVisibilityChanged(@NotNull View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        this.f75454i.m37121b();
    }

    @Override // android.view.View
    @CallSuper
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f75454i.m37120c(z);
    }

    public void setOnBackClickListener(@Nullable BackKeyPressedHelper.InterfaceC29643a interfaceC29643a) {
        int i;
        if (interfaceC29643a != null) {
            i = 131072;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
        this.f75454i.m37119d(interfaceC29643a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f75454i = new BackKeyPressedHelper(this);
    }
}
