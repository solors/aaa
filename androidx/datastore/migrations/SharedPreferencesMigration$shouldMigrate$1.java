package androidx.datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SharedPreferencesMigration.kt */
@DebugMetadata(m17095c = "androidx.datastore.migrations.SharedPreferencesMigration", m17094f = "SharedPreferencesMigration.kt", m17093l = {147}, m17092m = "shouldMigrate")
@Metadata
/* loaded from: classes.dex */
public final class SharedPreferencesMigration$shouldMigrate$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedPreferencesMigration<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration<T> sharedPreferencesMigration, Continuation<? super SharedPreferencesMigration$shouldMigrate$1> continuation) {
        super(continuation);
        this.this$0 = sharedPreferencesMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shouldMigrate(null, this);
    }
}
