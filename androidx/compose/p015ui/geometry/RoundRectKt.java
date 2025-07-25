package androidx.compose.p015ui.geometry;

import androidx.compose.p015ui.util.MathHelpers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RoundRect.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.RoundRectKt */
/* loaded from: classes.dex */
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, CornerRadius, CornerRadius, CornerRadius, CornerRadius, null);
    }

    @NotNull
    /* renamed from: RoundRect-ZAM2FJo  reason: not valid java name */
    public static final RoundRect m107343RoundRectZAM2FJo(@NotNull Rect rect, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, null);
    }

    /* renamed from: RoundRect-ZAM2FJo$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m107344RoundRectZAM2FJo$default(Rect rect, long j, long j2, long j3, long j4, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 2) != 0) {
            j5 = CornerRadius.Companion.m107276getZerokKHJgLs();
        } else {
            j5 = j;
        }
        if ((i & 4) != 0) {
            j6 = CornerRadius.Companion.m107276getZerokKHJgLs();
        } else {
            j6 = j2;
        }
        if ((i & 8) != 0) {
            j7 = CornerRadius.Companion.m107276getZerokKHJgLs();
        } else {
            j7 = j3;
        }
        if ((i & 16) != 0) {
            j8 = CornerRadius.Companion.m107276getZerokKHJgLs();
        } else {
            j8 = j4;
        }
        return m107343RoundRectZAM2FJo(rect, j5, j6, j7, j8);
    }

    @NotNull
    /* renamed from: RoundRect-gG7oq9Y  reason: not valid java name */
    public static final RoundRect m107345RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m107266getXimpl(j), CornerRadius.m107267getYimpl(j));
    }

    @NotNull
    /* renamed from: RoundRect-sniSvfs  reason: not valid java name */
    public static final RoundRect m107346RoundRectsniSvfs(@NotNull Rect rect, long j) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m107266getXimpl(j), CornerRadius.m107267getYimpl(j));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m107266getXimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m107267getYimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m107267getYimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m107266getXimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs()), CornerRadius.m107266getXimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m107267getYimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m107267getYimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        boolean z;
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (roundRect.getWidth() == roundRect.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z && isEllipse(roundRect)) {
            return true;
        }
        return false;
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (CornerRadius.m107267getYimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (CornerRadius.m107266getXimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (CornerRadius.m107267getYimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (CornerRadius.m107266getXimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m107267getYimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && roundRect.getWidth() <= CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) * 2.0d && roundRect.getHeight() <= CornerRadius.m107267getYimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (roundRect.getLeft() < roundRect.getRight() && roundRect.getTop() < roundRect.getBottom()) {
            return false;
        }
        return true;
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float top = roundRect.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                float right = roundRect.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    float bottom = roundRect.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r0 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isRect(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.geometry.RoundRect r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            long r0 = r6.m107341getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107266getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 != 0) goto L2a
            long r4 = r6.m107341getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107267getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L91
        L2a:
            long r4 = r6.m107342getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107266getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L38
            r0 = r2
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 != 0) goto L4c
            long r4 = r6.m107342getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107267getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r2
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r0 == 0) goto L91
        L4c:
            long r4 = r6.m107339getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107266getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5a
            r0 = r2
            goto L5b
        L5a:
            r0 = r3
        L5b:
            if (r0 != 0) goto L6e
            long r4 = r6.m107339getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107267getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L6b
            r0 = r2
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L91
        L6e:
            long r4 = r6.m107340getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p015ui.geometry.CornerRadius.m107266getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = r2
            goto L7d
        L7c:
            r0 = r3
        L7d:
            if (r0 != 0) goto L92
            long r4 = r6.m107340getBottomRightCornerRadiuskKHJgLs()
            float r6 = androidx.compose.p015ui.geometry.CornerRadius.m107267getYimpl(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L8d
            r6 = r2
            goto L8e
        L8d:
            r6 = r3
        L8e:
            if (r6 == 0) goto L91
            goto L92
        L91:
            r2 = r3
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107342getTopRightCornerRadiuskKHJgLs())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107340getBottomRightCornerRadiuskKHJgLs())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107266getXimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (CornerRadius.m107266getXimpl(roundRect.m107341getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m107267getYimpl(roundRect.m107339getBottomLeftCornerRadiuskKHJgLs())) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpers.lerp(start.getLeft(), stop.getLeft(), f), MathHelpers.lerp(start.getTop(), stop.getTop(), f), MathHelpers.lerp(start.getRight(), stop.getRight(), f), MathHelpers.lerp(start.getBottom(), stop.getBottom(), f), CornerRadiusKt.m107277lerp3Ry4LBc(start.m107341getTopLeftCornerRadiuskKHJgLs(), stop.m107341getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m107277lerp3Ry4LBc(start.m107342getTopRightCornerRadiuskKHJgLs(), stop.m107342getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m107277lerp3Ry4LBc(start.m107340getBottomRightCornerRadiuskKHJgLs(), stop.m107340getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m107277lerp3Ry4LBc(start.m107339getBottomLeftCornerRadiuskKHJgLs(), stop.m107339getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    @NotNull
    /* renamed from: translate-Uv8p0NA  reason: not valid java name */
    public static final RoundRect m107347translateUv8p0NA(@NotNull RoundRect translate, long j) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(translate.getLeft() + Offset.m107291getXimpl(j), translate.getTop() + Offset.m107292getYimpl(j), translate.getRight() + Offset.m107291getXimpl(j), translate.getBottom() + Offset.m107292getYimpl(j), translate.m107341getTopLeftCornerRadiuskKHJgLs(), translate.m107342getTopRightCornerRadiuskKHJgLs(), translate.m107340getBottomRightCornerRadiuskKHJgLs(), translate.m107339getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f, float f2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
