package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import ge.C33329j;
import ge.C33361p0;
import ge.InterfaceC33421z;
import ge.StateFlow;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lifecycle.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class Lifecycle {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    @Metadata
    /* loaded from: classes.dex */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* compiled from: Lifecycle.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {

            /* compiled from: Lifecycle.kt */
            @Metadata
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final Event downFrom(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return Event.ON_PAUSE;
                    }
                    return Event.ON_STOP;
                }
                return Event.ON_DESTROY;
            }

            @Nullable
            public final Event downTo(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            return null;
                        }
                        return Event.ON_DESTROY;
                    }
                    return Event.ON_PAUSE;
                }
                return Event.ON_STOP;
            }

            @Nullable
            public final Event upFrom(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 5) {
                            return null;
                        }
                        return Event.ON_CREATE;
                    }
                    return Event.ON_RESUME;
                }
                return Event.ON_START;
            }

            @Nullable
            public final Event upTo(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return Event.ON_RESUME;
                    }
                    return Event.ON_START;
                }
                return Event.ON_CREATE;
            }
        }

        /* compiled from: Lifecycle.kt */
        @Metadata
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Nullable
        public static final Event downFrom(@NotNull State state) {
            return Companion.downFrom(state);
        }

        @Nullable
        public static final Event downTo(@NotNull State state) {
            return Companion.downTo(state);
        }

        @Nullable
        public static final Event upFrom(@NotNull State state) {
            return Companion.upFrom(state);
        }

        @Nullable
        public static final Event upTo(@NotNull State state) {
            return Companion.upTo(state);
        }

        @NotNull
        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    @Metadata
    /* loaded from: classes.dex */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(InterfaceC33421z mutableStateFlow, LifecycleOwner lifecycleOwner, Event event) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    @MainThread
    public abstract void addObserver(@NotNull LifecycleObserver lifecycleObserver);

    @MainThread
    @NotNull
    public abstract State getCurrentState();

    @NotNull
    public StateFlow<State> getCurrentStateFlow() {
        final InterfaceC33421z m24033a = C33361p0.m24033a(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.f
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(InterfaceC33421z.this, lifecycleOwner, event);
            }
        });
        return C33329j.m24098c(m24033a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(@NotNull LifecycleObserver lifecycleObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(@NotNull AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
