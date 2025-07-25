package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p704he.AbstractC33507d;

/* compiled from: SharedFlow.kt */
@Metadata
/* renamed from: ge.g0 */
/* loaded from: classes8.dex */
public final class C33326g0 extends AbstractC33507d<C33318e0<?>> {

    /* renamed from: a */
    public long f90948a = -1;
    @Nullable

    /* renamed from: b */
    public Continuation<? super Unit> f90949b;

    @Override // p704he.AbstractC33507d
    /* renamed from: c */
    public boolean mo23592a(@NotNull C33318e0<?> c33318e0) {
        if (this.f90948a >= 0) {
            return false;
        }
        this.f90948a = c33318e0.m24143X();
        return true;
    }

    @Override // p704he.AbstractC33507d
    @NotNull
    /* renamed from: d */
    public Continuation<Unit>[] mo23591b(@NotNull C33318e0<?> c33318e0) {
        long j = this.f90948a;
        this.f90948a = -1L;
        this.f90949b = null;
        return c33318e0.m24144W(j);
    }
}
