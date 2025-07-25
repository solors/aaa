package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.saveable.ListSaverKt */
/* loaded from: classes.dex */
public final class ListSaver {
    @NotNull
    public static final <Original, Saveable> Saver<Original, Object> listSaver(@NotNull Function2<? super SaverScope, ? super Original, ? extends List<? extends Saveable>> save, @NotNull Function1<? super List<? extends Saveable>, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return SaverKt.Saver(new ListSaverKt$listSaver$1(save), (Function1) TypeIntrinsics.m17006e(restore, 1));
    }
}
