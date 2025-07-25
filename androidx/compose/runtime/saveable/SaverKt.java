package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Saver.kt */
@Metadata
/* loaded from: classes.dex */
public final class SaverKt {
    @NotNull
    private static final Saver<Object, Object> AutoSaver = Saver(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE);

    @NotNull
    public static final <Original, Saveable> Saver<Original, Saveable> Saver(@NotNull final Function2<? super SaverScope, ? super Original, ? extends Saveable> save, @NotNull final Function1<? super Saveable, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Original restore(@NotNull Saveable value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return restore.invoke(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Saveable save(@NotNull SaverScope saverScope, Original original) {
                Intrinsics.checkNotNullParameter(saverScope, "<this>");
                return save.mo105910invoke(saverScope, original);
            }
        };
    }

    @NotNull
    public static final <T> Saver<T, Object> autoSaver() {
        return (Saver<T, Object>) AutoSaver;
    }
}
