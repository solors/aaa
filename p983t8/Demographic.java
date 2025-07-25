package p983t8;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: t8.a */
/* loaded from: classes7.dex */
public enum Demographic {
    AGE_18_20(1, new PrimitiveRanges(18, 20)),
    AGE_21_30(2, new PrimitiveRanges(21, 30)),
    AGE_31_40(3, new PrimitiveRanges(31, 40)),
    AGE_41_50(4, new PrimitiveRanges(41, 50)),
    AGE_51_60(5, new PrimitiveRanges(51, 60)),
    AGE_61_70(6, new PrimitiveRanges(61, 70)),
    AGE_71_75(7, new PrimitiveRanges(71, 75)),
    OTHERS(0, new PrimitiveRanges(Integer.MIN_VALUE, Integer.MAX_VALUE));
    
    @NotNull
    public static final C44368a Companion = new C44368a(null);

    /* renamed from: id */
    private final int f116502id;
    @NotNull
    private final PrimitiveRanges range;

    /* compiled from: Demographic.kt */
    @Metadata
    /* renamed from: t8.a$a */
    /* loaded from: classes7.dex */
    public static final class C44368a {
        private C44368a() {
        }

        public /* synthetic */ C44368a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Demographic fromAge$vungle_ads_release(int i) {
            Demographic demographic;
            boolean z;
            Demographic[] values = Demographic.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    demographic = values[i2];
                    PrimitiveRanges range = demographic.getRange();
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
                    demographic = null;
                    break;
                }
            }
            if (demographic == null) {
                return Demographic.OTHERS;
            }
            return demographic;
        }
    }

    Demographic(int i, PrimitiveRanges primitiveRanges) {
        this.f116502id = i;
        this.range = primitiveRanges;
    }

    public final int getId() {
        return this.f116502id;
    }

    @NotNull
    public final PrimitiveRanges getRange() {
        return this.range;
    }
}
