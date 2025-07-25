package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ColorSpace.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpace */
/* loaded from: classes.dex */
public abstract class ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;

    /* renamed from: id */
    private final int f404id;
    private final long model;
    @NotNull
    private final String name;

    /* compiled from: ColorSpace.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpace$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ColorSpace(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(Reflection.m17042b(getClass()), Reflection.m17042b(obj.getClass()))) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f404id != colorSpace.f404id || !Intrinsics.m17075f(this.name, colorSpace.name)) {
            return false;
        }
        return ColorModel.m107885equalsimpl0(this.model, colorSpace.model);
    }

    @NotNull
    public final float[] fromXyz(float f, float f2, float f3) {
        float[] fArr = new float[ColorModel.m107886getComponentCountimpl(this.model)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        return fromXyz(fArr);
    }

    @NotNull
    public abstract float[] fromXyz(@NotNull float[] fArr);

    public final int getComponentCount() {
        return ColorModel.m107886getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.f404id;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    /* renamed from: getModel-xdoWZVw  reason: not valid java name */
    public final long m107894getModelxdoWZVw() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m107887hashCodeimpl(this.model)) * 31) + this.f404id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @NotNull
    public String toString() {
        return this.name + " (id=" + this.f404id + ", model=" + ((Object) ColorModel.m107888toStringimpl(this.model)) + ')';
    }

    @NotNull
    public final float[] toXyz(float f, float f2, float f3) {
        return toXyz(new float[]{f, f2, f3});
    }

    @NotNull
    public abstract float[] toXyz(@NotNull float[] fArr);

    public /* synthetic */ ColorSpace(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    private ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.f404id = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j) {
        this(str, j, -1, null);
    }
}
