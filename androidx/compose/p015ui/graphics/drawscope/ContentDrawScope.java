package androidx.compose.p015ui.graphics.drawscope;

import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.graphics.ColorFilter;
import androidx.compose.p015ui.graphics.ImageBitmap;
import androidx.compose.p015ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentDrawScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope */
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    /* compiled from: ContentDrawScope.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m107970drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            ContentDrawScope.super.mo107927drawImageAZ2fEMs(image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m107971getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo108020getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m107972getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo108021getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m107973roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo106207roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m107974roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo106208roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m107975toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo106209toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m107976toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo106210toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m107978toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo106212toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m107979toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo106213toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m107980toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo106214toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return ContentDrawScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m107981toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j) {
            return ContentDrawScope.super.mo106215toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m107982toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo106216toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m107983toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo106217toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m107977toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo106211toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m107984toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo106218toSpkPz2Gy4(i);
        }
    }

    void drawContent();
}
