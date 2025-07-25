package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: Preferences.kt */
@DebugMetadata(m17095c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m17094f = "Preferences.kt", m17093l = {329}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
final class PreferencesKt$edit$2 extends AbstractC37596l implements Function2<Preferences, Continuation<? super Preferences>, Object> {
    final /* synthetic */ Function2<MutablePreferences, Continuation<? super Unit>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(Function2<? super MutablePreferences, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super PreferencesKt$edit$2> continuation) {
        super(2, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, continuation);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull Preferences preferences, @Nullable Continuation<? super Preferences> continuation) {
        return ((PreferencesKt$edit$2) create(preferences, continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                C38508r.m14539b(obj);
                return mutablePreferences;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C38508r.m14539b(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
        Function2<MutablePreferences, Continuation<? super Unit>, Object> function2 = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        if (function2.mo105910invoke(mutablePreferences2, this) == m6959e) {
            return m6959e;
        }
        return mutablePreferences2;
    }
}
