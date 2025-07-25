package p689h;

import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;
import p853r.EnumC39423h;

@Metadata
/* renamed from: h.h */
/* loaded from: classes2.dex */
public final class DecodeUtils {
    @NotNull

    /* renamed from: a */
    public static final DecodeUtils f91255a = new DecodeUtils();

    /* compiled from: DecodeUtils.kt */
    @Metadata
    /* renamed from: h.h$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C33438a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC39423h.values().length];
            iArr[EnumC39423h.FILL.ordinal()] = 1;
            iArr[EnumC39423h.FIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DecodeUtils() {
    }

    /* renamed from: a */
    public static final int m23944a(@InterfaceC0152Px int i, @InterfaceC0152Px int i2, @InterfaceC0152Px int i3, @InterfaceC0152Px int i4, @NotNull EnumC39423h enumC39423h) {
        int min;
        int m16917e;
        int highestOneBit = Integer.highestOneBit(i / i3);
        int highestOneBit2 = Integer.highestOneBit(i2 / i4);
        int i5 = C33438a.$EnumSwitchMapping$0[enumC39423h.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                min = Math.max(highestOneBit, highestOneBit2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            min = Math.min(highestOneBit, highestOneBit2);
        }
        m16917e = _Ranges.m16917e(min, 1);
        return m16917e;
    }

    /* renamed from: b */
    public static final double m23943b(@InterfaceC0152Px double d, @InterfaceC0152Px double d2, @InterfaceC0152Px double d3, @InterfaceC0152Px double d4, @NotNull EnumC39423h enumC39423h) {
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int i = C33438a.$EnumSwitchMapping$0[enumC39423h.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Math.min(d5, d6);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d5, d6);
    }

    /* renamed from: c */
    public static final double m23942c(@InterfaceC0152Px int i, @InterfaceC0152Px int i2, @InterfaceC0152Px int i3, @InterfaceC0152Px int i4, @NotNull EnumC39423h enumC39423h) {
        double d = i3 / i;
        double d2 = i4 / i2;
        int i5 = C33438a.$EnumSwitchMapping$0[enumC39423h.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return Math.min(d, d2);
            }
            throw new NoWhenBranchMatchedException();
        }
        return Math.max(d, d2);
    }
}
