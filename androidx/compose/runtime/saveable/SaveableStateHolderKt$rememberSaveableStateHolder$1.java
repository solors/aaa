package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SaveableStateHolder.kt */
@Metadata
/* loaded from: classes.dex */
final class SaveableStateHolderKt$rememberSaveableStateHolder$1 extends Lambda implements Functions<SaveableStateHolderImpl> {
    public static final SaveableStateHolderKt$rememberSaveableStateHolder$1 INSTANCE = new SaveableStateHolderKt$rememberSaveableStateHolder$1();

    SaveableStateHolderKt$rememberSaveableStateHolder$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final SaveableStateHolderImpl invoke() {
        return new SaveableStateHolderImpl(null, 1, null);
    }
}
