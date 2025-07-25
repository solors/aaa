package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GraphicsLayerScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerScope */
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    /* compiled from: GraphicsLayerScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.GraphicsLayerScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
        public static long m107689getAmbientShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo107683getAmbientShadowColor0d7_KjU();
        }

        @Deprecated
        @Nullable
        public static RenderEffect getRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
        public static long m107690getSpotShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo107684getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m107691roundToPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m107692roundToPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo106208roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: setAmbientShadowColor-8_81llA  reason: not valid java name */
        public static void m107693setAmbientShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo107686setAmbientShadowColor8_81llA(j);
        }

        @Deprecated
        public static void setRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope, @Nullable RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* renamed from: setSpotShadowColor-8_81llA  reason: not valid java name */
        public static void m107694setSpotShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            GraphicsLayerScope.super.mo107687setSpotShadowColor8_81llA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m107695toDpGaN1DYA(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m107696toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m107698toDpSizekrfVVM(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m107699toPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m107700toPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull GraphicsLayerScope graphicsLayerScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return GraphicsLayerScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m107701toSizeXkaWNTQ(@NotNull GraphicsLayerScope graphicsLayerScope, long j) {
            return GraphicsLayerScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m107702toSp0xMU5do(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m107703toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m107697toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m107704toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo106218toSpkPz2Gy4(i);
        }

        public static /* synthetic */ void getClip$annotations() {
        }
    }

    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
    default long mo107683getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    @Nullable
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @NotNull
    Shape getShape();

    /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
    default long mo107684getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    long mo107685getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(@NotNull Shape shape);

    /* renamed from: setTransformOrigin-__ExYCQ  reason: not valid java name */
    void mo107688setTransformOrigin__ExYCQ(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);

    /* renamed from: setAmbientShadowColor-8_81llA  reason: not valid java name */
    default void mo107686setAmbientShadowColor8_81llA(long j) {
    }

    default void setRenderEffect(@Nullable RenderEffect renderEffect) {
    }

    /* renamed from: setSpotShadowColor-8_81llA  reason: not valid java name */
    default void mo107687setSpotShadowColor8_81llA(long j) {
    }
}
