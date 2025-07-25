package p983t8;

import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Demographic.kt */
@Metadata
/* renamed from: t8.f */
/* loaded from: classes7.dex */
public enum EnumC44379f {
    UNDER_100K(0, new PrimitiveRanges(Integer.MIN_VALUE, 100000)),
    FROM_100K_TO_300K(1, new PrimitiveRanges(100001, 300000)),
    FROM_300K_TO_500K(2, new PrimitiveRanges(300001, 500000)),
    FROM_500K_TO_700K(3, new PrimitiveRanges(500001, 700000)),
    FROM_700K_TO_900K(4, new PrimitiveRanges(700001, TimeUtils.FIFTEEN_MINUTES_IN_MS)),
    FROM_900K_TO_1M1(5, new PrimitiveRanges(900001, 1100000)),
    FROM_1M1_TO_1M3(6, new PrimitiveRanges(1100001, 1300000)),
    FROM_1M3_TO_1M5(7, new PrimitiveRanges(1300001, 1500000)),
    FROM_1M5_TO_1M7(8, new PrimitiveRanges(1500001, 1700000)),
    OVER_1M7(9, new PrimitiveRanges(1700001, Integer.MAX_VALUE));
    
    @NotNull
    public static final C44380a Companion = new C44380a(null);

    /* renamed from: id */
    private final int f116504id;
    @NotNull
    private final PrimitiveRanges range;

    /* compiled from: Demographic.kt */
    @Metadata
    /* renamed from: t8.f$a */
    /* loaded from: classes7.dex */
    public static final class C44380a {
        private C44380a() {
        }

        public /* synthetic */ C44380a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC44379f fromPrice$vungle_ads_release(int i) {
            EnumC44379f enumC44379f;
            boolean z;
            EnumC44379f[] values = EnumC44379f.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC44379f = values[i2];
                    PrimitiveRanges range = enumC44379f.getRange();
                    int m16953c = range.m16953c();
                    if (i <= range.m16952d() && m16953c <= i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                } else {
                    enumC44379f = null;
                    break;
                }
            }
            if (enumC44379f == null) {
                return EnumC44379f.UNDER_100K;
            }
            return enumC44379f;
        }
    }

    EnumC44379f(int i, PrimitiveRanges primitiveRanges) {
        this.f116504id = i;
        this.range = primitiveRanges;
    }

    public final int getId() {
        return this.f116504id;
    }

    @NotNull
    public final PrimitiveRanges getRange() {
        return this.range;
    }
}
