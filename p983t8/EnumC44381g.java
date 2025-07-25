package p983t8;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Demographic.kt */
@Metadata
/* renamed from: t8.g */
/* loaded from: classes7.dex */
public enum EnumC44381g {
    UNDER_500(0, new PrimitiveRanges(Integer.MIN_VALUE, 500)),
    FROM_500_TO_1000(1, new PrimitiveRanges(501, 1000)),
    FROM_1000_TO_1500(2, new PrimitiveRanges(1001, 1500)),
    FROM_1500_TO_2000(3, new PrimitiveRanges(1501, 2000)),
    FROM_2000_TO_2500(4, new PrimitiveRanges(2001, 2500)),
    FROM_2500_TO_3000(5, new PrimitiveRanges(2501, 3000)),
    FROM_3000_TO_3500(6, new PrimitiveRanges(3001, IronSourceConstants.BN_AUCTION_REQUEST)),
    FROM_3500_TO_4000(7, new PrimitiveRanges(IronSourceConstants.BN_AUCTION_FAILED, 4000)),
    FROM_4000_TO_4500(8, new PrimitiveRanges(4001, IronSourceConstants.NT_AUCTION_REQUEST)),
    OVER_4500(9, new PrimitiveRanges(IronSourceConstants.NT_AUCTION_FAILED, Integer.MAX_VALUE));
    
    @NotNull
    public static final C44382a Companion = new C44382a(null);

    /* renamed from: id */
    private final int f116505id;
    @NotNull
    private final PrimitiveRanges range;

    /* compiled from: Demographic.kt */
    @Metadata
    /* renamed from: t8.g$a */
    /* loaded from: classes7.dex */
    public static final class C44382a {
        private C44382a() {
        }

        public /* synthetic */ C44382a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC44381g fromCost$vungle_ads_release(int i) {
            EnumC44381g enumC44381g;
            boolean z;
            EnumC44381g[] values = EnumC44381g.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    enumC44381g = values[i2];
                    PrimitiveRanges range = enumC44381g.getRange();
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
                    enumC44381g = null;
                    break;
                }
            }
            if (enumC44381g == null) {
                return EnumC44381g.UNDER_500;
            }
            return enumC44381g;
        }
    }

    EnumC44381g(int i, PrimitiveRanges primitiveRanges) {
        this.f116505id = i;
        this.range = primitiveRanges;
    }

    public final int getId() {
        return this.f116505id;
    }

    @NotNull
    public final PrimitiveRanges getRange() {
        return this.range;
    }
}
