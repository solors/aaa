package androidx.compose.p015ui.node;

import androidx.compose.p015ui.draw.BuildDrawCacheParams;
import androidx.compose.p015ui.draw.DrawCacheModifier;
import androidx.compose.p015ui.draw.DrawModifier;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p015ui.layout.MeasureScope;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DrawEntity.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.DrawEntity */
/* loaded from: classes.dex */
public final class DrawEntity extends LayoutNodeEntity<DrawEntity, DrawModifier> implements OwnerScope {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Function1<DrawEntity, Unit> onCommitAffectingDrawEntity = DrawEntity$Companion$onCommitAffectingDrawEntity$1.INSTANCE;
    @NotNull
    private final BuildDrawCacheParams buildCacheParams;
    @Nullable
    private DrawCacheModifier cacheDrawModifier;
    private boolean invalidateCache;
    @NotNull
    private final Functions<Unit> updateCache;

    /* compiled from: DrawEntity.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.node.DrawEntity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawEntity(@NotNull final LayoutNodeWrapper layoutNodeWrapper, @NotNull DrawModifier modifier) {
        super(layoutNodeWrapper, modifier);
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.buildCacheParams = new BuildDrawCacheParams() { // from class: androidx.compose.ui.node.DrawEntity$buildCacheParams$1
            @NotNull
            private final Density density;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.density = DrawEntity.this.getLayoutNode().getDensity();
            }

            @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
            @NotNull
            public Density getDensity() {
                return this.density;
            }

            @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
            @NotNull
            public LayoutDirection getLayoutDirection() {
                return DrawEntity.this.getLayoutNode().getLayoutDirection();
            }

            @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
            /* renamed from: getSize-NH-jbRc */
            public long mo107213getSizeNHjbRc() {
                return IntSizeKt.m109904toSizeozmzZPI(layoutNodeWrapper.mo109022getSizeYbymL2g());
            }
        };
        this.invalidateCache = true;
        this.updateCache = new DrawEntity$updateCache$1(this);
    }

    private final DrawCacheModifier updateCacheDrawModifier() {
        DrawModifier modifier = getModifier();
        if (modifier instanceof DrawCacheModifier) {
            return (DrawCacheModifier) modifier;
        }
        return null;
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        long m109904toSizeozmzZPI = IntSizeKt.m109904toSizeozmzZPI(m109156getSizeYbymL2g());
        if (this.cacheDrawModifier != null && this.invalidateCache) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingDrawEntity, this.updateCache);
        }
        LayoutNodeDrawScope mDrawScope$ui_release = getLayoutNode().getMDrawScope$ui_release();
        LayoutNodeWrapper layoutNodeWrapper = getLayoutNodeWrapper();
        DrawEntity drawEntity = mDrawScope$ui_release.drawEntity;
        mDrawScope$ui_release.drawEntity = this;
        CanvasDrawScope canvasDrawScope = mDrawScope$ui_release.canvasDrawScope;
        MeasureScope measureScope = layoutNodeWrapper.getMeasureScope();
        LayoutDirection layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m107942component4NHjbRc = drawParams.m107942component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m107945setSizeuvyYCjk(m109904toSizeozmzZPI);
        canvas.save();
        getModifier().draw(mDrawScope$ui_release);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m107945setSizeuvyYCjk(m107942component4NHjbRc);
        mDrawScope$ui_release.drawEntity = drawEntity;
    }

    @Override // androidx.compose.p015ui.node.OwnerScope
    public boolean isValid() {
        return getLayoutNodeWrapper().isAttached();
    }

    @Override // androidx.compose.p015ui.node.LayoutNodeEntity
    public void onAttach() {
        this.cacheDrawModifier = updateCacheDrawModifier();
        this.invalidateCache = true;
        super.onAttach();
    }

    public final void onMeasureResultChanged() {
        this.invalidateCache = true;
    }
}
