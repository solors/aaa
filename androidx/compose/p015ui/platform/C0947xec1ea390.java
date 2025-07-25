package androidx.compose.p015ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
/* loaded from: classes.dex */
public final class C0947xec1ea390 extends Lambda implements Functions<Unit> {
    final /* synthetic */ SavedStateRegistry $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947xec1ea390(boolean z, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
    }
}
