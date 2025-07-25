package androidx.compose.p015ui.modifier;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocal.kt */
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalReadScope */
/* loaded from: classes.dex */
public interface ModifierLocalReadScope {
    <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal);
}
