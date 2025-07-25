package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusRequester.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusRequester */
/* loaded from: classes.dex */
public final class FocusRequester {
    @NotNull
    private final MutableVector<FocusRequesterModifierLocal> focusRequesterModifierLocals = new MutableVector<>(new FocusRequesterModifierLocal[16], 0);
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = MutableVector.$stable;
    @NotNull
    private static final FocusRequester Default = new FocusRequester();

    /* compiled from: FocusRequester.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {

        /* compiled from: FocusRequester.kt */
        @StabilityInferred(parameters = 0)
        @Metadata
        @ExperimentalComposeUiApi
        /* renamed from: androidx.compose.ui.focus.FocusRequester$Companion$FocusRequesterFactory */
        /* loaded from: classes.dex */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            @NotNull
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }
    }

    public final boolean captureFocus() {
        if (this.focusRequesterModifierLocals.isNotEmpty()) {
            MutableVector<FocusRequesterModifierLocal> mutableVector = this.focusRequesterModifierLocals;
            int size = mutableVector.getSize();
            int i = 0;
            if (size <= 0) {
                return false;
            }
            FocusRequesterModifierLocal[] content = mutableVector.getContent();
            boolean z = false;
            do {
                FocusModifier findFocusNode = content[i].findFocusNode();
                if (findFocusNode != null && FocusTransactions.captureFocus(findFocusNode)) {
                    z = true;
                }
                i++;
            } while (i < size);
            return z;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    public final boolean freeFocus() {
        if (this.focusRequesterModifierLocals.isNotEmpty()) {
            MutableVector<FocusRequesterModifierLocal> mutableVector = this.focusRequesterModifierLocals;
            int size = mutableVector.getSize();
            int i = 0;
            if (size <= 0) {
                return false;
            }
            FocusRequesterModifierLocal[] content = mutableVector.getContent();
            boolean z = false;
            do {
                FocusModifier findFocusNode = content[i].findFocusNode();
                if (findFocusNode != null && FocusTransactions.freeFocus(findFocusNode)) {
                    z = true;
                }
                i++;
            } while (i < size);
            return z;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }

    @NotNull
    public final MutableVector<FocusRequesterModifierLocal> getFocusRequesterModifierLocals$ui_release() {
        return this.focusRequesterModifierLocals;
    }

    public final void requestFocus() {
        if (this.focusRequesterModifierLocals.isNotEmpty()) {
            MutableVector<FocusRequesterModifierLocal> mutableVector = this.focusRequesterModifierLocals;
            int size = mutableVector.getSize();
            if (size > 0) {
                FocusRequesterModifierLocal[] content = mutableVector.getContent();
                int i = 0;
                do {
                    FocusModifier findFocusNode = content[i].findFocusNode();
                    if (findFocusNode != null) {
                        FocusTransactions.requestFocus(findFocusNode);
                    }
                    i++;
                } while (i < size);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
