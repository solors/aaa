package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectableValueKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocalConsumer.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumerKt */
/* loaded from: classes.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier modifierLocalConsumer(@NotNull Modifier modifier, @NotNull Function1<? super ModifierLocalReadScope, Unit> consumer) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C0926x4a113c71(consumer);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalConsumerImpl(consumer, noInspectorInfo));
    }
}
