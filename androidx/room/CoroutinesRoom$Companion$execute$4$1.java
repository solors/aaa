package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.p021db.SupportSQLiteCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutinesRoom.kt */
@Metadata
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ InterfaceC37708b2 $job;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, InterfaceC37708b2 interfaceC37708b2) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = interfaceC37708b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        SupportSQLiteCompat.Api16Impl.cancel(this.$cancellationSignal);
        InterfaceC37708b2.C37709a.m16410a(this.$job, null, 1, null);
    }
}
