package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.BlendMode;
import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageVector.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.ImageVector */
/* loaded from: classes.dex */
public final class ImageVector {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean autoMirror;
    private final float defaultHeight;
    private final float defaultWidth;
    @NotNull
    private final String name;
    @NotNull
    private final VectorGroup root;
    private final int tintBlendMode;
    private final long tintColor;
    private final float viewportHeight;
    private final float viewportWidth;

    /* compiled from: ImageVector.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder */
    /* loaded from: classes.dex */
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;
        @NotNull
        private final String name;
        @NotNull
        private final ArrayList<GroupParams> nodes;
        @NotNull
        private GroupParams root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        /* compiled from: ImageVector.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder$GroupParams */
        /* loaded from: classes.dex */
        public static final class GroupParams {
            @NotNull
            private List<VectorNode> children;
            @NotNull
            private List<? extends PathNode> clipPathData;
            @NotNull
            private String name;
            private float pivotX;
            private float pivotY;
            private float rotate;
            private float scaleX;
            private float scaleY;
            private float translationX;
            private float translationY;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            @NotNull
            public final List<VectorNode> getChildren() {
                return this.children;
            }

            @NotNull
            public final List<PathNode> getClipPathData() {
                return this.clipPathData;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public final float getPivotX() {
                return this.pivotX;
            }

            public final float getPivotY() {
                return this.pivotY;
            }

            public final float getRotate() {
                return this.rotate;
            }

            public final float getScaleX() {
                return this.scaleX;
            }

            public final float getScaleY() {
                return this.scaleY;
            }

            public final float getTranslationX() {
                return this.translationX;
            }

            public final float getTranslationY() {
                return this.translationY;
            }

            public final void setChildren(@NotNull List<VectorNode> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.children = list;
            }

            public final void setClipPathData(@NotNull List<? extends PathNode> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.clipPathData = list;
            }

            public final void setName(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.name = str;
            }

            public final void setPivotX(float f) {
                this.pivotX = f;
            }

            public final void setPivotY(float f) {
                this.pivotY = f;
            }

            public final void setRotate(float f) {
                this.rotate = f;
            }

            public final void setScaleX(float f) {
                this.scaleX = f;
            }

            public final void setScaleY(float f) {
                this.scaleY = f;
            }

            public final void setTranslationX(float f) {
                this.translationX = f;
            }

            public final void setTranslationY(float f) {
                this.translationY = f;
            }

            public GroupParams(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData, @NotNull List<VectorNode> children) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
                Intrinsics.checkNotNullParameter(children, "children");
                this.name = name;
                this.rotate = f;
                this.pivotX = f2;
                this.pivotY = f3;
                this.scaleX = f4;
                this.scaleY = f5;
                this.translationX = f6;
                this.translationY = f7;
                this.clipPathData = clipPathData;
                this.children = children;
            }

            public /* synthetic */ GroupParams(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? VectorKt.getEmptyPath() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            String str2;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            List<PathNode> list2;
            if ((i & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f13 = 0.0f;
            if ((i & 2) != 0) {
                f8 = 0.0f;
            } else {
                f8 = f;
            }
            if ((i & 4) != 0) {
                f9 = 0.0f;
            } else {
                f9 = f2;
            }
            if ((i & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            float f14 = 1.0f;
            if ((i & 16) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f4;
            }
            if ((i & 32) == 0) {
                f14 = f5;
            }
            if ((i & 64) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f6;
            }
            if ((i & 128) == 0) {
                f13 = f7;
            }
            if ((i & 256) != 0) {
                list2 = VectorKt.getEmptyPath();
            } else {
                list2 = list;
            }
            return builder.addGroup(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        }

        /* renamed from: addPath-oIyEayM$default */
        public static /* synthetic */ Builder m108102addPathoIyEayM$default(Builder builder, List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            int i5;
            String str2;
            Brush brush3;
            float f8;
            float f9;
            float f10;
            int i6;
            int i7;
            float f11;
            float f12;
            if ((i4 & 2) != 0) {
                i5 = VectorKt.getDefaultFillType();
            } else {
                i5 = i;
            }
            if ((i4 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            Brush brush4 = null;
            if ((i4 & 8) != 0) {
                brush3 = null;
            } else {
                brush3 = brush;
            }
            float f13 = 1.0f;
            if ((i4 & 16) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f;
            }
            if ((i4 & 32) == 0) {
                brush4 = brush2;
            }
            if ((i4 & 64) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f2;
            }
            float f14 = 0.0f;
            if ((i4 & 128) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            if ((i4 & 256) != 0) {
                i6 = VectorKt.getDefaultStrokeLineCap();
            } else {
                i6 = i2;
            }
            if ((i4 & 512) != 0) {
                i7 = VectorKt.getDefaultStrokeLineJoin();
            } else {
                i7 = i3;
            }
            if ((i4 & 1024) != 0) {
                f11 = 4.0f;
            } else {
                f11 = f4;
            }
            if ((i4 & 2048) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f5;
            }
            if ((i4 & 4096) == 0) {
                f13 = f6;
            }
            if ((i4 & 8192) == 0) {
                f14 = f7;
            }
            return builder.m108103addPathoIyEayM(list, i5, str2, brush3, f8, brush4, f9, f10, i6, i7, f11, f12, f13, f14);
        }

        private final VectorGroup asVectorGroup(GroupParams groupParams) {
            return new VectorGroup(groupParams.getName(), groupParams.getRotate(), groupParams.getPivotX(), groupParams.getPivotY(), groupParams.getScaleX(), groupParams.getScaleY(), groupParams.getTranslationX(), groupParams.getTranslationY(), groupParams.getClipPathData(), groupParams.getChildren());
        }

        private final void ensureNotConsumed() {
            if (!this.isConsumed) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }

        private final GroupParams getCurrentGroup() {
            return (GroupParams) Stack.m108119peekimpl(this.nodes);
        }

        @NotNull
        public final Builder addGroup(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
            ensureNotConsumed();
            Stack.m108121pushimpl(this.nodes, new GroupParams(name, f, f2, f3, f4, f5, f6, f7, clipPathData, null, 512, null));
            return this;
        }

        @NotNull
        /* renamed from: addPath-oIyEayM */
        public final Builder m108103addPathoIyEayM(@NotNull List<? extends PathNode> pathData, int i, @NotNull String name, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            Intrinsics.checkNotNullParameter(pathData, "pathData");
            Intrinsics.checkNotNullParameter(name, "name");
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(new VectorPath(name, pathData, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        @NotNull
        public final ImageVector build() {
            ensureNotConsumed();
            while (Stack.m108117getSizeimpl(this.nodes) > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, null);
            this.isConsumed = true;
            return imageVector;
        }

        @NotNull
        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().getChildren().add(asVectorGroup((GroupParams) Stack.m108120popimpl(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.name = str;
            this.defaultWidth = f;
            this.defaultHeight = f2;
            this.viewportWidth = f3;
            this.viewportHeight = f4;
            this.tintColor = j;
            this.tintBlendMode = i;
            this.autoMirror = z;
            ArrayList<GroupParams> m108114constructorimpl$default = Stack.m108114constructorimpl$default(null, 1, null);
            this.nodes = m108114constructorimpl$default;
            GroupParams groupParams = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = groupParams;
            Stack.m108121pushimpl(m108114constructorimpl$default, groupParams);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m107469getSrcIn0nO6VwU() : i, (i2 & 128) != 0 ? false : z, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m107563getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m107469getSrcIn0nO6VwU() : i, (DefaultConstructorMarker) null);
        }

        private Builder(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ImageVector.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (!Intrinsics.m17075f(this.name, imageVector.name) || !C1059Dp.m109739equalsimpl0(this.defaultWidth, imageVector.defaultWidth) || !C1059Dp.m109739equalsimpl0(this.defaultHeight, imageVector.defaultHeight)) {
            return false;
        }
        if (this.viewportWidth == imageVector.viewportWidth) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.viewportHeight == imageVector.viewportHeight) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.m17075f(this.root, imageVector.root) && Color.m107528equalsimpl0(this.tintColor, imageVector.tintColor) && BlendMode.m107440equalsimpl0(this.tintBlendMode, imageVector.tintBlendMode) && this.autoMirror == imageVector.autoMirror) {
            return true;
        }
        return false;
    }

    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM */
    public final float m108098getDefaultHeightD9Ej5fM() {
        return this.defaultHeight;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM */
    public final float m108099getDefaultWidthD9Ej5fM() {
        return this.defaultWidth;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final VectorGroup getRoot() {
        return this.root;
    }

    /* renamed from: getTintBlendMode-0nO6VwU */
    public final int m108100getTintBlendMode0nO6VwU() {
        return this.tintBlendMode;
    }

    /* renamed from: getTintColor-0d7_KjU */
    public final long m108101getTintColor0d7_KjU() {
        return this.tintColor;
    }

    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + C1059Dp.m109740hashCodeimpl(this.defaultWidth)) * 31) + C1059Dp.m109740hashCodeimpl(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + Color.m107534hashCodeimpl(this.tintColor)) * 31) + BlendMode.m107441hashCodeimpl(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    private ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z) {
        this.name = str;
        this.defaultWidth = f;
        this.defaultHeight = f2;
        this.viewportWidth = f3;
        this.viewportHeight = f4;
        this.root = vectorGroup;
        this.tintColor = j;
        this.tintBlendMode = i;
        this.autoMirror = z;
    }
}
