package re;

import kotlin.Metadata;

/* compiled from: CollectionSerializers.kt */
@Metadata
/* renamed from: re.r1 */
/* loaded from: classes8.dex */
public abstract class AbstractC39539r1<Array> {
    /* renamed from: c */
    public static /* synthetic */ void m12341c(AbstractC39539r1 abstractC39539r1, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = abstractC39539r1.mo12304d() + 1;
            }
            abstractC39539r1.mo12305b(i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    /* renamed from: a */
    public abstract Array mo12306a();

    /* renamed from: b */
    public abstract void mo12305b(int i);

    /* renamed from: d */
    public abstract int mo12304d();
}
