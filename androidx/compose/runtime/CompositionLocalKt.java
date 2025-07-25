package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompositionLocal.kt */
@Metadata
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull ProvidedValue<?>[] values, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        startRestartGroup.startProviders(values);
        content.mo105910invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$1(values, content, i));
    }

    @NotNull
    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(@NotNull SnapshotMutationPolicy<T> policy, @NotNull Functions<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new DynamicProvidableCompositionLocal(policy, defaultFactory);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Functions functions, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, functions);
    }

    @NotNull
    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(@NotNull Functions<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new StaticProvidableCompositionLocal(defaultFactory);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@NotNull CompositionLocalContext context, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(context) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocals$runtime_release = context.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, State<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                arrayList.add(((ProvidableCompositionLocal) entry.getKey()).provides(entry.getValue().getValue()));
            }
            Object[] array = arrayList.toArray(new ProvidedValue[0]);
            if (array != null) {
                ProvidedValue[] providedValueArr = (ProvidedValue[]) array;
                CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), content, startRestartGroup, (i2 & 112) | 8);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$3(context, content, i));
    }
}
