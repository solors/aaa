package androidx.compose.material;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37780o;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: SnackbarHost.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class SnackbarHostState {
    @NotNull
    private final SnapshotState currentSnackbarData$delegate;
    @NotNull
    private final Mutex mutex = C38289c.m15157b(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarHost.kt */
    @Stable
    @Metadata
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        @Nullable
        private final String actionLabel;
        @NotNull
        private final InterfaceC37780o<SnackbarResult> continuation;
        @NotNull
        private final SnackbarDuration duration;
        @NotNull
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(@NotNull String message, @Nullable String str, @NotNull SnackbarDuration duration, @NotNull InterfaceC37780o<? super SnackbarResult> continuation) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.message = message;
            this.actionLabel = str;
            this.duration = duration;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                InterfaceC37780o<SnackbarResult> interfaceC37780o = this.continuation;
                Result.C38506a c38506a = Result.f101870c;
                interfaceC37780o.resumeWith(Result.m14549b(SnackbarResult.Dismissed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        @Nullable
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        @NotNull
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                InterfaceC37780o<SnackbarResult> interfaceC37780o = this.continuation;
                Result.C38506a c38506a = Result.f101870c;
                interfaceC37780o.resumeWith(Result.m14549b(SnackbarResult.ActionPerformed));
            }
        }
    }

    public SnackbarHostState() {
        SnapshotState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentSnackbarData$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, continuation);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:24:0x008a, B:26:0x00b6), top: B:40:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object showSnackbar(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.Nullable java.lang.String r10, @org.jetbrains.annotations.NotNull androidx.compose.material.SnackbarDuration r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.d):java.lang.Object");
    }
}
