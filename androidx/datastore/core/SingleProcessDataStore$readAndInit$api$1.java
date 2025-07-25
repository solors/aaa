package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Ref;
import me.Mutex;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
@Metadata
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ C37609n0<T> $initData;
    final /* synthetic */ Ref $initializationComplete;
    final /* synthetic */ Mutex $updateLock;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleProcessDataStore$readAndInit$api$1(Mutex mutex, Ref ref, C37609n0<T> c37609n0, SingleProcessDataStore<T> singleProcessDataStore) {
        this.$updateLock = mutex;
        this.$initializationComplete = ref;
        this.$initData = c37609n0;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x0096, B:32:0x009a, B:47:0x00d7, B:48:0x00de), top: B:57:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x0096, B:32:0x009a, B:47:0x00d7, B:48:0x00de), top: B:57:0x0096 }] */
    @Override // androidx.datastore.core.InitializerApi
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateData(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1.updateData(kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }
}
