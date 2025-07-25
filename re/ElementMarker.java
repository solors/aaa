package re;

import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: re.z */
/* loaded from: classes8.dex */
public final class ElementMarker {
    @NotNull

    /* renamed from: e */
    private static final C39562a f103941e = new C39562a(null);
    @NotNull

    /* renamed from: f */
    private static final long[] f103942f = new long[0];
    @NotNull

    /* renamed from: a */
    private final SerialDescriptor f103943a;
    @NotNull

    /* renamed from: b */
    private final Function2<SerialDescriptor, Integer, Boolean> f103944b;

    /* renamed from: c */
    private long f103945c;
    @NotNull

    /* renamed from: d */
    private final long[] f103946d;

    /* compiled from: ElementMarker.kt */
    @Metadata
    /* renamed from: re.z$a */
    /* loaded from: classes8.dex */
    private static final class C39562a {
        private C39562a() {
        }

        public /* synthetic */ C39562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(@NotNull SerialDescriptor descriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f103943a = descriptor;
        this.f103944b = readIfAbsent;
        int mo12262e = descriptor.mo12262e();
        if (mo12262e <= 64) {
            this.f103945c = mo12262e != 64 ? (-1) << mo12262e : 0L;
            this.f103946d = f103942f;
            return;
        }
        this.f103945c = 0L;
        this.f103946d = m12266e(mo12262e);
    }

    /* renamed from: b */
    private final void m12269b(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f103946d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: c */
    private final int m12268c() {
        int length = this.f103946d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f103946d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.f103944b.mo105910invoke(this.f103943a, Integer.valueOf(i4)).booleanValue()) {
                    this.f103946d[i] = j;
                    return i4;
                }
            }
            this.f103946d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: e */
    private final long[] m12266e(int i) {
        int m17326Z;
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            m17326Z = _Arrays.m17326Z(jArr);
            jArr[m17326Z] = (-1) << i;
        }
        return jArr;
    }

    /* renamed from: a */
    public final void m12270a(int i) {
        if (i < 64) {
            this.f103945c |= 1 << i;
        } else {
            m12269b(i);
        }
    }

    /* renamed from: d */
    public final int m12267d() {
        int numberOfTrailingZeros;
        int mo12262e = this.f103943a.mo12262e();
        do {
            long j = this.f103945c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f103945c |= 1 << numberOfTrailingZeros;
            } else if (mo12262e > 64) {
                return m12268c();
            } else {
                return -1;
            }
        } while (!this.f103944b.mo105910invoke(this.f103943a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}
