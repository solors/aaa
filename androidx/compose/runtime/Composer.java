package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Composer.kt */
@Metadata
/* loaded from: classes.dex */
public interface Composer {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Composer.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            @NotNull
            public String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        @NotNull
        public final Object getEmpty() {
            return Empty;
        }

        @InternalComposeTracingApi
        public final void setTracer(@NotNull CompositionTracer tracer) {
            Intrinsics.checkNotNullParameter(tracer, "tracer");
            ComposerKt.compositionTracer = tracer;
        }
    }

    @ComposeCompilerApi
    <V, T> void apply(V v, @NotNull Function2<? super T, ? super V, Unit> function2);

    @InternalComposeApi
    @NotNull
    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(@Nullable Object obj);

    @ComposeCompilerApi
    default boolean changed(boolean z) {
        return changed(z);
    }

    void collectParameterInformation();

    @InternalComposeApi
    <T> T consume(@NotNull CompositionLocal<T> compositionLocal);

    @ComposeCompilerApi
    <T> void createNode(@NotNull Functions<? extends T> functions);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean z);

    @ComposeCompilerApi
    void disableReusing();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    @InternalComposeApi
    void endProviders();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    @Nullable
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @NotNull
    Applier<?> getApplier();

    @NotNull
    CoroutineContext getApplyCoroutineContext();

    @NotNull
    ControlledComposition getComposition();

    @NotNull
    CompositionData getCompositionData();

    int getCompoundKeyHash();

    boolean getDefaultsInvalid();

    boolean getInserting();

    @Nullable
    RecomposeScope getRecomposeScope();

    @Nullable
    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    @InternalComposeApi
    void insertMovableContent(@NotNull MovableContent<?> movableContent, @Nullable Object obj);

    @InternalComposeApi
    void insertMovableContentReferences(@NotNull List<Tuples<MovableContentStateReference, MovableContentStateReference>> list);

    @ComposeCompilerApi
    @NotNull
    Object joinKey(@Nullable Object obj, @Nullable Object obj2);

    @InternalComposeApi
    void recordSideEffect(@NotNull Functions<Unit> functions);

    @InternalComposeApi
    void recordUsed(@NotNull RecomposeScope recomposeScope);

    @ComposeCompilerApi
    @Nullable
    Object rememberedValue();

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(@NotNull String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i, @NotNull String str);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int i, @Nullable Object obj);

    @ComposeCompilerApi
    void startNode();

    @InternalComposeApi
    void startProviders(@NotNull ProvidedValue<?>[] providedValueArr);

    @ComposeCompilerApi
    void startReplaceableGroup(int i);

    @ComposeCompilerApi
    @NotNull
    Composer startRestartGroup(int i);

    @ComposeCompilerApi
    void startReusableGroup(int i, @Nullable Object obj);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(@Nullable Object obj);

    @ComposeCompilerApi
    void useNode();

    @ComposeCompilerApi
    default boolean changed(char c) {
        return changed(c);
    }

    @ComposeCompilerApi
    default boolean changed(byte b) {
        return changed(b);
    }

    @ComposeCompilerApi
    default boolean changed(short s) {
        return changed(s);
    }

    @ComposeCompilerApi
    default boolean changed(int i) {
        return changed(i);
    }

    @ComposeCompilerApi
    default boolean changed(float f) {
        return changed(f);
    }

    @ComposeCompilerApi
    default boolean changed(long j) {
        return changed(j);
    }

    @ComposeCompilerApi
    default boolean changed(double d) {
        return changed(d);
    }

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    @InternalComposeApi
    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }
}
