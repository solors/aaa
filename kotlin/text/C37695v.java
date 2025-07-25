package kotlin.text;

/* compiled from: R8$$SyntheticClass */
/* renamed from: kotlin.text.v */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37695v {
    /* renamed from: a */
    public static /* synthetic */ long m16528a(long j, long j2) {
        if (j2 < 0) {
            if ((j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE)) {
                i = 0;
            }
            return j3 + i;
        }
    }
}
