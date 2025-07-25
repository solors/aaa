package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.modifier.ModifierLocalConsumer;
import androidx.compose.p015ui.modifier.ModifierLocalProvider;
import androidx.compose.p015ui.modifier.ModifierLocalReadScope;
import androidx.compose.p015ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FocusEventModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusEventModifierLocal */
/* loaded from: classes.dex */
public final class FocusEventModifierLocal implements ModifierLocalProvider<FocusEventModifierLocal>, ModifierLocalConsumer {
    @NotNull
    private final MutableVector<FocusEventModifierLocal> children;
    @NotNull
    private final MutableVector<FocusModifier> focusModifiers;
    @NotNull
    private final Function1<FocusState, Unit> onFocusEvent;
    @Nullable
    private FocusEventModifierLocal parent;

    /* compiled from: FocusEventModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusEventModifierLocal$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventModifierLocal(@NotNull Function1<? super FocusState, Unit> onFocusEvent) {
        Intrinsics.checkNotNullParameter(onFocusEvent, "onFocusEvent");
        this.onFocusEvent = onFocusEvent;
        this.children = new MutableVector<>(new FocusEventModifierLocal[16], 0);
        this.focusModifiers = new MutableVector<>(new FocusModifier[16], 0);
    }

    private final void addFocusModifiers(MutableVector<FocusModifier> mutableVector) {
        MutableVector<FocusModifier> mutableVector2 = this.focusModifiers;
        mutableVector2.addAll(mutableVector2.getSize(), mutableVector);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.addFocusModifiers(mutableVector);
        }
    }

    private final void removeFocusModifiers(MutableVector<FocusModifier> mutableVector) {
        this.focusModifiers.removeAll(mutableVector);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.removeFocusModifiers(mutableVector);
        }
    }

    public final void addFocusModifier(@NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.addFocusModifier(focusModifier);
        }
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<FocusEventModifierLocal> getKey() {
        return FocusEventModifierKt.getModifierLocalFocusEvent();
    }

    @NotNull
    public final Function1<FocusState, Unit> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.p015ui.modifier.ModifierLocalProvider
    @NotNull
    public FocusEventModifierLocal getValue() {
        return this;
    }

    public final void notifyIfNoFocusModifiers() {
        if (this.focusModifiers.isEmpty()) {
            this.onFocusEvent.invoke(FocusStateImpl.Inactive);
        }
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusEventModifierLocal focusEventModifierLocal = (FocusEventModifierLocal) scope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
        if (!Intrinsics.m17075f(focusEventModifierLocal, this.parent)) {
            FocusEventModifierLocal focusEventModifierLocal2 = this.parent;
            if (focusEventModifierLocal2 != null) {
                focusEventModifierLocal2.children.remove(this);
                focusEventModifierLocal2.removeFocusModifiers(this.focusModifiers);
            }
            this.parent = focusEventModifierLocal;
            if (focusEventModifierLocal != null) {
                focusEventModifierLocal.children.add(this);
                focusEventModifierLocal.addFocusModifiers(this.focusModifiers);
            }
        }
        this.parent = (FocusEventModifierLocal) scope.getCurrent(FocusEventModifierKt.getModifierLocalFocusEvent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Boolean] */
    public final void propagateFocusEvent() {
        FocusStateImpl focusStateImpl;
        FocusModifier focusModifier;
        FocusModifier focusModifier2;
        int size = this.focusModifiers.getSize();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                MutableVector<FocusModifier> mutableVector = this.focusModifiers;
                int size2 = mutableVector.getSize();
                FocusModifier focusModifier3 = null;
                if (size2 > 0) {
                    FocusModifier[] content = mutableVector.getContent();
                    FocusModifier focusModifier4 = null;
                    do {
                        FocusModifier focusModifier5 = content[i];
                        focusModifier2 = focusModifier3;
                        focusModifier2 = focusModifier3;
                        switch (WhenMappings.$EnumSwitchMapping$0[focusModifier5.getFocusState().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                focusModifier4 = focusModifier5;
                                focusModifier2 = Boolean.FALSE;
                                break;
                            case 5:
                                if (focusModifier3 == null) {
                                    focusModifier2 = Boolean.TRUE;
                                    break;
                                }
                                break;
                            case 6:
                                focusModifier2 = Boolean.FALSE;
                                break;
                        }
                        i++;
                        focusModifier3 = focusModifier2;
                    } while (i < size2);
                    focusModifier = focusModifier2;
                    focusModifier3 = focusModifier4;
                } else {
                    focusModifier = null;
                }
                if (focusModifier3 == null || (focusStateImpl = focusModifier3.getFocusState()) == null) {
                    if (Intrinsics.m17075f(focusModifier, Boolean.TRUE)) {
                        focusStateImpl = FocusStateImpl.Deactivated;
                    } else {
                        focusStateImpl = FocusStateImpl.Inactive;
                    }
                }
            } else {
                focusStateImpl = this.focusModifiers.getContent()[0].getFocusState();
            }
        } else {
            focusStateImpl = FocusStateImpl.Inactive;
        }
        this.onFocusEvent.invoke(focusStateImpl);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.propagateFocusEvent();
        }
    }

    public final void removeFocusModifier(@NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusEventModifierLocal focusEventModifierLocal = this.parent;
        if (focusEventModifierLocal != null) {
            focusEventModifierLocal.removeFocusModifier(focusModifier);
        }
    }
}
