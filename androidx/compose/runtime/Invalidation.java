package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public final class Invalidation {
    @Nullable
    private IdentityArraySet<Object> instances;
    private final int location;
    @NotNull
    private final RecomposeScopeImpl scope;

    public Invalidation(@NotNull RecomposeScopeImpl scope, int i, @Nullable IdentityArraySet<Object> identityArraySet) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.location = i;
        this.instances = identityArraySet;
    }

    @Nullable
    public final IdentityArraySet<Object> getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    @NotNull
    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(@Nullable IdentityArraySet<Object> identityArraySet) {
        this.instances = identityArraySet;
    }
}
