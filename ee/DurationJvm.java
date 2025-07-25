package ee;

import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ee.a */
/* loaded from: classes7.dex */
public final class DurationJvm {

    /* renamed from: a */
    private static final boolean f90125a = false;
    @NotNull

    /* renamed from: b */
    private static final ThreadLocal<DecimalFormat>[] f90126b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f90126b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m25158a() {
        return f90125a;
    }
}
