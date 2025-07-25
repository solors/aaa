package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContentScale.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.layout.ContentScale */
/* loaded from: classes.dex */
public interface ContentScale {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    long mo109011computeScaleFactorH7hwNQA(long j, long j2);

    /* compiled from: ContentScale.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.ContentScale$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                float m109013access$computeFillMaxDimensioniLBOSCw = ContentScaleKt.m109013access$computeFillMaxDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m109013access$computeFillMaxDimensioniLBOSCw, m109013access$computeFillMaxDimensioniLBOSCw);
            }
        };
        @NotNull
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                float m109014access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m109014access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m109014access$computeFillMinDimensioniLBOSCw, m109014access$computeFillMinDimensioniLBOSCw);
            }
        };
        @NotNull
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                float m109012access$computeFillHeightiLBOSCw = ContentScaleKt.m109012access$computeFillHeightiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m109012access$computeFillHeightiLBOSCw, m109012access$computeFillHeightiLBOSCw);
            }
        };
        @NotNull
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                float m109015access$computeFillWidthiLBOSCw = ContentScaleKt.m109015access$computeFillWidthiLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m109015access$computeFillWidthiLBOSCw, m109015access$computeFillWidthiLBOSCw);
            }
        };
        @NotNull
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                if (Size.m107360getWidthimpl(j) <= Size.m107360getWidthimpl(j2) && Size.m107357getHeightimpl(j) <= Size.m107357getHeightimpl(j2)) {
                    return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
                }
                float m109014access$computeFillMinDimensioniLBOSCw = ContentScaleKt.m109014access$computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactorKt.ScaleFactor(m109014access$computeFillMinDimensioniLBOSCw, m109014access$computeFillMinDimensioniLBOSCw);
            }
        };
        @NotNull
        private static final FixedScale None = new FixedScale(1.0f);
        @NotNull
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.p015ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m109015access$computeFillWidthiLBOSCw(j, j2), ContentScaleKt.m109012access$computeFillHeightiLBOSCw(j, j2));
            }
        };

        private Companion() {
        }

        @NotNull
        public final ContentScale getCrop() {
            return Crop;
        }

        @NotNull
        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        @NotNull
        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        @NotNull
        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        @NotNull
        public final ContentScale getFit() {
            return Fit;
        }

        @NotNull
        public final ContentScale getInside() {
            return Inside;
        }

        @NotNull
        public final FixedScale getNone() {
            return None;
        }

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
