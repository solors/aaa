package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Decoy.kt */
@Metadata
/* loaded from: classes.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    @NotNull
    public static final Void illegalDecoyCallException(@NotNull String fName) {
        Intrinsics.checkNotNullParameter(fName, "fName");
        throw new IllegalStateException("Function " + fName + " should have been replaced by compiler.");
    }
}
