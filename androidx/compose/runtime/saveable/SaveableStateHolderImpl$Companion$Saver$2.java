package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {
    public static final SaveableStateHolderImpl$Companion$Saver$2 INSTANCE = new SaveableStateHolderImpl$Companion$Saver$2();

    SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
        return invoke2((Map<Object, Map<String, List<Object>>>) map);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final SaveableStateHolderImpl invoke2(@NotNull Map<Object, Map<String, List<Object>>> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new SaveableStateHolderImpl(it);
    }
}
