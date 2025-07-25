package p983t8;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Demographic.kt */
@Metadata
/* renamed from: t8.d */
/* loaded from: classes7.dex */
public enum EnumC44374d {
    LESS_THAN_ONE_YEAR(0, new PrimitiveRanges(Integer.MIN_VALUE, 0)),
    ONE_TO_FIVE_YEARS(1, new PrimitiveRanges(1, 5)),
    SIX_TO_TEN_YEARS(2, new PrimitiveRanges(6, 10)),
    ELEVEN_TO_TWENTY_YEARS(3, new PrimitiveRanges(11, 20)),
    TWENTY_ONE_TO_THIRTY_YEARS(4, new PrimitiveRanges(21, 30)),
    THIRTY_ONE_TO_FORTY_YEARS(5, new PrimitiveRanges(31, 40)),
    FORTY_ONE_TO_FIFTY_YEARS(6, new PrimitiveRanges(41, 50)),
    FIFTY_ONE_TO_SIXTY_YEARS(7, new PrimitiveRanges(51, 60)),
    SIXTY_ONE_TO_SEVENTY_YEARS(8, new PrimitiveRanges(61, 70)),
    OVER_SEVENTY_ONE_YEARS(9, new PrimitiveRanges(71, Integer.MAX_VALUE));
    
    @NotNull
    public static final C44375a Companion = new C44375a(null);

    /* renamed from: id */
    private final int f116503id;
    @NotNull
    private final PrimitiveRanges range;

    /* compiled from: Demographic.kt */
    @Metadata
    /* renamed from: t8.d$a */
    /* loaded from: classes7.dex */
    public static final class C44375a {
        private C44375a() {
        }

        public /* synthetic */ C44375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC44374d fromYears$vungle_ads_release(int i) {
            EnumC44374d enumC44374d;
            boolean z;
            EnumC44374d[] values = EnumC44374d.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC44374d = values[i2];
                    PrimitiveRanges range = enumC44374d.getRange();
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
                    enumC44374d = null;
                    break;
                }
            }
            if (enumC44374d == null) {
                return EnumC44374d.LESS_THAN_ONE_YEAR;
            }
            return enumC44374d;
        }
    }

    EnumC44374d(int i, PrimitiveRanges primitiveRanges) {
        this.f116503id = i;
        this.range = primitiveRanges;
    }

    public final int getId() {
        return this.f116503id;
    }

    @NotNull
    public final PrimitiveRanges getRange() {
        return this.range;
    }
}
