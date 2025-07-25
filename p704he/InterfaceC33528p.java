package p704he;

import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p674fe.BufferOverflow;

/* compiled from: ChannelFlow.kt */
@Metadata
/* renamed from: he.p */
/* loaded from: classes8.dex */
public interface InterfaceC33528p<T> extends InterfaceC33327h<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata
    /* renamed from: he.p$a */
    /* loaded from: classes8.dex */
    public static final class C33529a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC33327h m23568a(InterfaceC33528p interfaceC33528p, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = C37586g.f99289b;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return interfaceC33528p.mo23569b(coroutineContext, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    /* renamed from: b */
    InterfaceC33327h<T> mo23569b(@NotNull CoroutineContext coroutineContext, int i, @NotNull BufferOverflow bufferOverflow);
}
