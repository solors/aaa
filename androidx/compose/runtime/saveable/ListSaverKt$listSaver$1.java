package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [Original] */
/* compiled from: ListSaver.kt */
@Metadata
/* loaded from: classes.dex */
final class ListSaverKt$listSaver$1<Original> extends Lambda implements Function2<SaverScope, Original, Object> {
    final /* synthetic */ Function2<SaverScope, Original, List<Saveable>> $save;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListSaverKt$listSaver$1(Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> function2) {
        super(2);
        this.$save = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(SaverScope saverScope, Object obj) {
        return invoke2(saverScope, (SaverScope) obj);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull SaverScope Saver, Original original) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        List list = (List) this.$save.mo105910invoke(Saver, original);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null && !Saver.canBeSaved(obj)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
