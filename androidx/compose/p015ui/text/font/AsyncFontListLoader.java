package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.TypefaceResult;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader */
/* loaded from: classes.dex */
public final class AsyncFontListLoader implements State<Object> {
    @NotNull
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    @NotNull
    private final List<Font> fontList;
    @NotNull
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    @NotNull
    private final PlatformFontLoader platformFontLoader;
    @NotNull
    private final TypefaceRequest typefaceRequest;
    @NotNull
    private final SnapshotState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@NotNull List<? extends Font> fontList, @NotNull Object initialType, @NotNull TypefaceRequest typefaceRequest, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onCompletion, @NotNull PlatformFontLoader platformFontLoader) {
        SnapshotState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.fontList = fontList;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = onCompletion;
        this.platformFontLoader = platformFontLoader;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    @NotNull
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:89:0x0075, B:91:0x008c, B:96:0x00bb, B:99:0x00ef), top: B:116:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:89:0x0075, B:91:0x008c, B:96:0x00bb, B:99:0x00ef), top: B:116:0x0075 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0102 -> B:103:0x0103). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010a -> B:107:0x010c). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object load(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncFontListLoader.load(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0036  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(@org.jetbrains.annotations.NotNull androidx.compose.p015ui.text.font.Font r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p015ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p015ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.p015ui.text.font.Font) r7
            p804nd.C38508r.m14539b(r8)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p804nd.C38508r.m14539b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.L$0 = r7     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.label = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.C37727f3.m16350e(r2, r8, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r4 = r8
            goto L85
        L4d:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            kotlinx.coroutines.l0$b r2 = kotlinx.coroutines.InterfaceC37764l0.f99607a8
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.l0 r1 = (kotlinx.coroutines.InterfaceC37764l0) r1
            if (r1 == 0) goto L85
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L85
        L7a:
            r7 = move-exception
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.C37726f2.m16355o(r8)
            if (r8 == 0) goto L86
        L85:
            return r4
        L86:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }
}
