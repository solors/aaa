package ge;

import ie.Symbol;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p674fe.BufferOverflow;
import p704he.C33513h;

/* compiled from: SharedFlow.kt */
@Metadata
/* renamed from: ge.f0 */
/* loaded from: classes8.dex */
public final class C33323f0 {
    @NotNull

    /* renamed from: a */
    public static final Symbol f90938a = new Symbol("NO_VALUE");

    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC33420y<T> m24128a(int i, int i2, @NotNull BufferOverflow bufferOverflow) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    z3 = false;
                }
                if (z3) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C33318e0(i, i3, bufferOverflow);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC33420y m24127b(int i, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m24128a(i, i2, bufferOverflow);
    }

    @NotNull
    /* renamed from: e */
    public static final <T> InterfaceC33327h<T> m24124e(@NotNull SharedFlow<? extends T> sharedFlow, @NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow) {
        if ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return sharedFlow;
        }
        return new C33513h(sharedFlow, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: f */
    public static final Object m24123f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* renamed from: g */
    public static final void m24122g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
