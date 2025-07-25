package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45186b;
import p802n9.DivVideoAttachable;
import sb.DivVideoScale;

/* compiled from: DivPlayerView.kt */
@Metadata
/* loaded from: classes8.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C45186b.divImageStyle : i);
    }

    public /* bridge */ /* synthetic */ void attach(@NotNull DivPlayer divPlayer) {
        super.attach(divPlayer);
    }

    public /* bridge */ /* synthetic */ void detach() {
        super.detach();
    }

    @Nullable
    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return super.getAttachedPlayer();
    }

    public /* bridge */ /* synthetic */ void setScale(@NotNull DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
