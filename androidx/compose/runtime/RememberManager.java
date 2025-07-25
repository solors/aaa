package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public interface RememberManager {
    void forgetting(@NotNull RememberObserver rememberObserver);

    void remembering(@NotNull RememberObserver rememberObserver);

    void sideEffect(@NotNull Functions<Unit> functions);
}
