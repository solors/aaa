package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Composition.kt */
@Metadata
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2);

    <R> R delegateInvalidations(@Nullable ControlledComposition controlledComposition, int i, @NotNull Functions<? extends R> functions);

    @InternalComposeApi
    void disposeUnusedMovableContent(@NotNull MovableContentState movableContentState);

    boolean getHasPendingChanges();

    @InternalComposeApi
    void insertMovableContent(@NotNull List<Tuples<MovableContentStateReference, MovableContentStateReference>> list);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@NotNull Set<? extends Object> set);

    void prepareCompose(@NotNull Functions<Unit> functions);

    boolean recompose();

    void recordModificationsOf(@NotNull Set<? extends Object> set);

    void recordReadOf(@NotNull Object obj);

    void recordWriteOf(@NotNull Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
