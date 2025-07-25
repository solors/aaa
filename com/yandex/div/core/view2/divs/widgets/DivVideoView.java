package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.InterfaceC29586d;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.widget.FrameContainerLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45186b;
import p671fb.ExpressionResolver;
import sa.C39638b;
import sa.KAssert;
import sb.DivBorder;
import sb.DivVideo;

/* compiled from: DivVideoView.kt */
@Metadata
/* loaded from: classes8.dex */
public final class DivVideoView extends FrameContainerLayout implements DivHolderView<DivVideo>, Releasable {

    /* renamed from: p */
    private final /* synthetic */ C29688j<DivVideo> f75630p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p985ta.ExpressionSubscriber
    public void addSubscription(@Nullable InterfaceC29586d interfaceC29586d) {
        this.f75630p.addSubscription(interfaceC29586d);
    }

    @Override // p985ta.ExpressionSubscriber
    public void closeAllSubscription() {
        this.f75630p.closeAllSubscription();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Unit unit;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isDrawing()) {
            DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
            if (divBorderDrawer != null) {
                int save = canvas.save();
                try {
                    divBorderDrawer.m37008i(canvas);
                    super.dispatchDraw(canvas);
                    divBorderDrawer.m37007j(canvas);
                    canvas.restoreToCount(save);
                    unit = Unit.f99208a;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Unit unit;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        setDrawing(true);
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            int save = canvas.save();
            try {
                divBorderDrawer.m37008i(canvas);
                super.draw(canvas);
                divBorderDrawer.m37007j(canvas);
                canvas.restoreToCount(save);
                unit = Unit.f99208a;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            super.draw(canvas);
        }
        setDrawing(false);
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.f75630p.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public DivVideo getDiv() {
        return this.f75630p.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.f75630p.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.f75630p.getNeedClipping();
    }

    @Nullable
    public final DivPlayerView getPlayerView() {
        if (getChildCount() > 2) {
            KAssert kAssert = KAssert.f104132a;
            if (C39638b.m11995q()) {
                C39638b.m12001k("Too many children in DivVideo");
            }
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        if (!(childAt instanceof DivPlayerView)) {
            KAssert kAssert2 = KAssert.f104132a;
            if (C39638b.m11995q()) {
                C39638b.m12001k("Wrong view type inside DivVideo");
            }
            return null;
        }
        return (DivPlayerView) childAt;
    }

    @Override // p985ta.ExpressionSubscriber
    @NotNull
    public List<InterfaceC29586d> getSubscriptions() {
        return this.f75630p.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean isDrawing() {
        return this.f75630p.isDrawing();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.f75630p.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i, int i2) {
        this.f75630p.onBoundsChanged(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onBoundsChanged(i, i2);
    }

    @Override // p985ta.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        DivPlayerView playerView = getPlayerView();
        if (playerView != null) {
            DivPlayer attachedPlayer = playerView.getAttachedPlayer();
            playerView.detach();
            if (attachedPlayer != null) {
                attachedPlayer.release();
            }
        }
        releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.f75630p.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.f75630p.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@Nullable DivBorder divBorder, @NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.f75630p.setBorder(divBorder, view, resolver);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable DivVideo divVideo) {
        this.f75630p.setDiv(divVideo);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setDrawing(boolean z) {
        this.f75630p.setDrawing(z);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z) {
        this.f75630p.setNeedClipping(z);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f75630p.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f75630p.transitionStarted(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DivVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C45186b.divImageStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f75630p = new C29688j<>();
    }
}
