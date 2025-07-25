package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: MapSaver.kt */
@Metadata
/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$1<T> extends Lambda implements Function2<SaverScope, T, List<? extends Object>> {
    final /* synthetic */ Function2<SaverScope, T, Map<String, Object>> $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapSaverKt$mapSaver$1(Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> function2) {
        super(2);
        this.$save = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ List<? extends Object> mo105910invoke(SaverScope saverScope, Object obj) {
        return invoke2(saverScope, (SaverScope) obj);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<Object> invoke2(@NotNull SaverScope listSaver, T t) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : this.$save.mo105910invoke(listSaver, t).entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        return arrayList;
    }
}
