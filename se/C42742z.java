package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.UByte;
import p804nd.UInt;
import p804nd.ULong;
import p804nd.UShort;

/* compiled from: Composers.kt */
@Metadata
/* renamed from: se.z */
/* loaded from: classes8.dex */
public final class C42742z extends C42725r {

    /* renamed from: c */
    private final boolean f111919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42742z(@NotNull InterfaceC42743z0 writer, boolean z) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f111919c = z;
    }

    @Override // se.C42725r
    /* renamed from: d */
    public void mo6646d(byte b) {
        boolean z = this.f111919c;
        String m14527f = UByte.m14527f(UByte.m14530c(b));
        if (z) {
            mo6680m(m14527f);
        } else {
            m6689j(m14527f);
        }
    }

    @Override // se.C42725r
    /* renamed from: h */
    public void mo6645h(int i) {
        boolean z = this.f111919c;
        int m14507c = UInt.m14507c(i);
        if (z) {
            mo6680m(C42732v.m6670a(m14507c));
        } else {
            m6689j(C42734w.m6668a(m14507c));
        }
    }

    @Override // se.C42725r
    /* renamed from: i */
    public void mo6644i(long j) {
        String m6661a;
        String m6658a;
        boolean z = this.f111919c;
        long m14617c = ULong.m14617c(j);
        if (z) {
            m6658a = C42738y.m6658a(m14617c, 10);
            mo6680m(m6658a);
            return;
        }
        m6661a = C42736x.m6661a(m14617c, 10);
        m6689j(m6661a);
    }

    @Override // se.C42725r
    /* renamed from: k */
    public void mo6643k(short s) {
        boolean z = this.f111919c;
        String m14587f = UShort.m14587f(UShort.m14590c(s));
        if (z) {
            mo6680m(m14587f);
        } else {
            m6689j(m14587f);
        }
    }
}
