package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37726f2;
import kotlinx.coroutines.C37733h2;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Effects.kt */
@Metadata
/* loaded from: classes.dex */
public final class EffectsKt {
    @NotNull
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    @NotNull
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    @NotNull
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(@NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-904483903);
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        if ((i & 1) != 0 || !startRestartGroup.getSkipping()) {
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        startRestartGroup.skipToGroupEnd();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new EffectsKt$LaunchedEffect$1(block, i));
    }

    @Composable
    public static final void SideEffect(@NotNull Functions<Unit> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-1288466761);
        composer.recordSideEffect(effect);
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final CoroutineScope createCompositionCoroutineScope(@NotNull CoroutineContext coroutineContext, @NotNull Composer composer) {
        CompletableJob m16339b;
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(composer, "composer");
        InterfaceC37708b2.C37710b c37710b = InterfaceC37708b2.f99515b8;
        if (coroutineContext.get(c37710b) != null) {
            m16339b = C37733h2.m16339b(null, 1, null);
            m16339b.mo16373b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return C37785p0.m16131a(m16339b);
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        return C37785p0.m16131a(applyCoroutineContext.plus(C37726f2.m16369a((InterfaceC37708b2) applyCoroutineContext.get(c37710b))).plus(coroutineContext));
    }

    @Composable
    @NotNull
    public static final CoroutineScope rememberCoroutineScope(@Nullable Functions<? extends CoroutineContext> functions, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(773894976);
        if ((i2 & 1) != 0) {
            functions = EffectsKt$rememberCoroutineScope$1.INSTANCE;
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope(functions.invoke(), composer));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-1371986847);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(1179185413);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(1429097729);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(590241125);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-1239538271);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(-54093371);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(@NotNull Object[] keys, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(effect, "effect");
        composer.startReplaceableGroup(-1307627122);
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(effect));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Object[] keys, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        composer.startReplaceableGroup(-139560008);
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(keys, keys.length);
        composer.startReplaceableGroup(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, block));
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
