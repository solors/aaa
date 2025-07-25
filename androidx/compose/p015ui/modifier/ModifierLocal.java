package androidx.compose.p015ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocal.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocal */
/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    @NotNull
    private final Functions<T> defaultFactory;

    public /* synthetic */ ModifierLocal(Functions functions, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions);
    }

    @NotNull
    public final Functions<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(Functions<? extends T> functions) {
        this.defaultFactory = functions;
    }
}
