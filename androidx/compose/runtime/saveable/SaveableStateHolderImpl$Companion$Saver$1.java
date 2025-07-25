package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {
    public static final SaveableStateHolderImpl$Companion$Saver$1 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$1();

    SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Map<Object, Map<String, List<Object>>> mo105910invoke(@NotNull SaverScope Saver, @NotNull SaveableStateHolderImpl it) {
        Map<Object, Map<String, List<Object>>> saveAll;
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        saveAll = it.saveAll();
        return saveAll;
    }
}
