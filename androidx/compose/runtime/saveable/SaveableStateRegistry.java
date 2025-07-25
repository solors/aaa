package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SaveableStateRegistry.kt */
@Metadata
/* loaded from: classes.dex */
public interface SaveableStateRegistry {

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata
    /* loaded from: classes.dex */
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(@NotNull Object obj);

    @Nullable
    Object consumeRestored(@NotNull String str);

    @NotNull
    Map<String, List<Object>> performSave();

    @NotNull
    Entry registerProvider(@NotNull String str, @NotNull Functions<? extends Object> functions);
}
