package androidx.compose.p015ui.text;

import androidx.compose.p015ui.unit.TextUnit;
import androidx.compose.p015ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Placeholder.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.Placeholder */
/* loaded from: classes.dex */
public final class Placeholder {
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i);
    }

    /* renamed from: copy-K8Q-__8$default  reason: not valid java name */
    public static /* synthetic */ Placeholder m109318copyK8Q__8$default(Placeholder placeholder, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = placeholder.width;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = placeholder.height;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m109319copyK8Q__8(j3, j4, i);
    }

    @NotNull
    /* renamed from: copy-K8Q-__8  reason: not valid java name */
    public final Placeholder m109319copyK8Q__8(long j, long j2, int i) {
        return new Placeholder(j, j2, i, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (TextUnit.m109912equalsimpl0(this.width, placeholder.width) && TextUnit.m109912equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m109326equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign)) {
            return true;
        }
        return false;
    }

    /* renamed from: getHeight-XSAIIZE  reason: not valid java name */
    public final long m109320getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc  reason: not valid java name */
    public final int m109321getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE  reason: not valid java name */
    public final long m109322getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m109916hashCodeimpl(this.width) * 31) + TextUnit.m109916hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m109327hashCodeimpl(this.placeholderVerticalAlign);
    }

    @NotNull
    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m109922toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m109922toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m109328toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j, long j2, int i) {
        this.width = j;
        this.height = j2;
        this.placeholderVerticalAlign = i;
        if (!TextUnitKt.m109933isUnspecifiedR2X_6o(j)) {
            if (!(!TextUnitKt.m109933isUnspecifiedR2X_6o(j2))) {
                throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
            }
            return;
        }
        throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
    }
}
