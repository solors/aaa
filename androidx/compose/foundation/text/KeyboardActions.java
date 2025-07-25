package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyboardActions.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onDone;
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onGo;
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onNext;
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onPrevious;
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSearch;
    @Nullable
    private final Function1<KeyboardActionScope, Unit> onSend;

    /* compiled from: KeyboardActions.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnDone() {
        return this.onDone;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnGo() {
        return this.onGo;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnNext() {
        return this.onNext;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnPrevious() {
        return this.onPrevious;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSearch() {
        return this.onSearch;
    }

    @Nullable
    public final Function1<KeyboardActionScope, Unit> getOnSend() {
        return this.onSend;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyboardActions(@Nullable Function1<? super KeyboardActionScope, Unit> function1, @Nullable Function1<? super KeyboardActionScope, Unit> function12, @Nullable Function1<? super KeyboardActionScope, Unit> function13, @Nullable Function1<? super KeyboardActionScope, Unit> function14, @Nullable Function1<? super KeyboardActionScope, Unit> function15, @Nullable Function1<? super KeyboardActionScope, Unit> function16) {
        this.onDone = function1;
        this.onGo = function12;
        this.onNext = function13;
        this.onPrevious = function14;
        this.onSearch = function15;
        this.onSend = function16;
    }

    public /* synthetic */ KeyboardActions(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? null : function16);
    }
}
