package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.platform.InspectorInfo;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3 */
/* loaded from: classes.dex */
public final class C0916x56256fb7 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ Function2 $block$inlined;
    final /* synthetic */ Object[] $keys$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0916x56256fb7(Object[] objArr, Function2 function2) {
        super(1);
        this.$keys$inlined = objArr;
        this.$block$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set(UserMetadata.KEYDATA_FILENAME, this.$keys$inlined);
        inspectorInfo.getProperties().set("block", this.$block$inlined);
    }
}
