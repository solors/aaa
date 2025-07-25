package androidx.compose.p015ui;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Modifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.CombinedModifier$toString$1 */
/* loaded from: classes.dex */
final class CombinedModifier$toString$1 extends Lambda implements Function2<String, Modifier.Element, String> {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final String mo105910invoke(@NotNull String acc, @NotNull Modifier.Element element) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
