package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RecomposeScopeImpl.kt */
@Metadata
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    @Nullable
    private Anchor anchor;
    @Nullable
    private Function2<? super Composer, ? super Integer, Unit> block;
    @Nullable
    private CompositionImpl composition;
    private int currentToken;
    private int flags;
    @Nullable
    private IdentityArrayMap<DerivedState<?>, Object> trackedDependencies;
    @Nullable
    private IdentityArrayIntMap trackedInstances;

    public RecomposeScopeImpl(@Nullable CompositionImpl compositionImpl) {
        this.composition = compositionImpl;
    }

    private final boolean getRereading() {
        if ((this.flags & 32) != 0) {
            return true;
        }
        return false;
    }

    private final void setRereading(boolean z) {
        if (z) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z) {
        if (z) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(@NotNull CompositionImpl composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.composition = composition;
    }

    public final void compose(@NotNull Composer composer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 != null) {
            function2.mo105910invoke(composer, 1);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IllegalStateException("Invalid restart scope".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
        if (r3 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
        return new androidx.compose.runtime.RecomposeScopeImpl$end$1$2(r7, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return null;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.Composition, kotlin.Unit> end(int r8) {
        /*
            r7 = this;
            androidx.compose.runtime.collection.IdentityArrayIntMap r0 = r7.trackedInstances
            r1 = 0
            if (r0 == 0) goto L3d
            boolean r2 = r7.getSkipped$runtime_release()
            if (r2 != 0) goto L3d
            int r2 = r0.getSize()
            r3 = 0
            r4 = r3
        L11:
            if (r4 >= r2) goto L36
            java.lang.Object[] r5 = r0.getKeys()
            r5 = r5[r4]
            if (r5 == 0) goto L2e
            int[] r5 = r0.getValues()
            r5 = r5[r4]
            r6 = 1
            if (r5 == r8) goto L26
            r5 = r6
            goto L27
        L26:
            r5 = r3
        L27:
            if (r5 == 0) goto L2b
            r3 = r6
            goto L36
        L2b:
            int r4 = r4 + 1
            goto L11
        L2e:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            r8.<init>(r0)
            throw r8
        L36:
            if (r3 == 0) goto L3d
            androidx.compose.runtime.RecomposeScopeImpl$end$1$2 r1 = new androidx.compose.runtime.RecomposeScopeImpl$end$1$2
            r1.<init>(r7, r8, r0)
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.end(int):kotlin.jvm.functions.Function1");
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        if (this.block != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final boolean getDefaultsInScope() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInvalid() {
        if ((this.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getRequiresRecompose() {
        if ((this.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getSkipped$runtime_release() {
        if ((this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getUsed() {
        if ((this.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getValid() {
        boolean z;
        if (this.composition == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        if (anchor != null) {
            z = anchor.getValid();
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null) {
            compositionImpl.invalidate(this, null);
        }
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object obj) {
        InvalidationResult invalidate;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl == null || (invalidate = compositionImpl.invalidate(this, obj)) == null) {
            return InvalidationResult.IGNORED;
        }
        return invalidate;
    }

    public final boolean isConditional() {
        if (this.trackedDependencies != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInvalidFor(@Nullable IdentityArraySet<Object> identityArraySet) {
        IdentityArrayMap<DerivedState<?>, Object> identityArrayMap;
        boolean z;
        boolean z2;
        if (identityArraySet != null && (identityArrayMap = this.trackedDependencies) != 0 && identityArraySet.isNotEmpty()) {
            if (!identityArraySet.isEmpty()) {
                for (Object obj : identityArraySet) {
                    if ((obj instanceof DerivedState) && Intrinsics.m17075f(identityArrayMap.get(obj), ((DerivedState) obj).getCurrentValue())) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        return true;
    }

    public final void recordRead(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (getRereading()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.trackedInstances;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.trackedInstances = identityArrayIntMap;
        }
        identityArrayIntMap.add(instance, this.currentToken);
        if (instance instanceof DerivedState) {
            IdentityArrayMap<DerivedState<?>, Object> identityArrayMap = this.trackedDependencies;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap<>(0, 1, null);
                this.trackedDependencies = identityArrayMap;
            }
            identityArrayMap.set(instance, ((DerivedState) instance).getCurrentValue());
        }
    }

    public final void release() {
        this.composition = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        CompositionImpl compositionImpl = this.composition;
        if (compositionImpl != null && (identityArrayIntMap = this.trackedInstances) != null) {
            setRereading(true);
            try {
                int size = identityArrayIntMap.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj = identityArrayIntMap.getKeys()[i];
                    if (obj != null) {
                        int i2 = identityArrayIntMap.getValues()[i];
                        compositionImpl.recordReadOf(obj);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                }
            } finally {
                setRereading(false);
            }
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i) {
        this.currentToken = i;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }
}
