package androidx.compose.runtime.saveable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.saveable.MapSaverKt */
/* loaded from: classes.dex */
public final class MapSaver {
    @NotNull
    public static final <T> Saver<T, Object> mapSaver(@NotNull Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> save, @NotNull Function1<? super Map<String, ? extends Object>, ? extends T> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return ListSaver.listSaver(new MapSaverKt$mapSaver$1(save), new MapSaverKt$mapSaver$2(restore));
    }
}
