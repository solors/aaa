package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1 */
/* loaded from: classes.dex */
final class SemanticsProperties$IsPopup$1 extends Lambda implements Function2<Unit, Unit, Unit> {
    public static final SemanticsProperties$IsPopup$1 INSTANCE = new SemanticsProperties$IsPopup$1();

    SemanticsProperties$IsPopup$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Unit mo105910invoke(@Nullable Unit unit, @NotNull Unit unit2) {
        Intrinsics.checkNotNullParameter(unit2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
