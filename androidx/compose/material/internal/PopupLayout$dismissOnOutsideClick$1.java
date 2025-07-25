package androidx.compose.material.internal;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata
/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements Function2<Offset, IntRect, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: invoke-KMgbckE  reason: not valid java name */
    public final Boolean mo105910invoke(@Nullable Offset offset, @NotNull IntRect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        boolean z = false;
        if (offset != null && (Offset.m107291getXimpl(offset.m107301unboximpl()) < bounds.getLeft() || Offset.m107291getXimpl(offset.m107301unboximpl()) > bounds.getRight() || Offset.m107292getYimpl(offset.m107301unboximpl()) < bounds.getTop() || Offset.m107292getYimpl(offset.m107301unboximpl()) > bounds.getBottom())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
