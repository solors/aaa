package androidx.compose.p015ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransferParameters.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.colorspace.TransferParameters */
/* loaded from: classes.dex */
public final class TransferParameters {

    /* renamed from: a */
    private final double f415a;

    /* renamed from: b */
    private final double f416b;

    /* renamed from: c */
    private final double f417c;

    /* renamed from: d */
    private final double f418d;

    /* renamed from: e */
    private final double f419e;

    /* renamed from: f */
    private final double f420f;
    private final double gamma;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        if ((r2 == 0.0d) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
        if ((r2 == 0.0d) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TransferParameters(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.TransferParameters.<init>(double, double, double, double, double, double, double):void");
    }

    public static /* synthetic */ TransferParameters copy$default(TransferParameters transferParameters, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        if ((i & 1) != 0) {
            d8 = transferParameters.gamma;
        } else {
            d8 = d;
        }
        if ((i & 2) != 0) {
            d9 = transferParameters.f415a;
        } else {
            d9 = d2;
        }
        if ((i & 4) != 0) {
            d10 = transferParameters.f416b;
        } else {
            d10 = d3;
        }
        if ((i & 8) != 0) {
            d11 = transferParameters.f417c;
        } else {
            d11 = d4;
        }
        if ((i & 16) != 0) {
            d12 = transferParameters.f418d;
        } else {
            d12 = d5;
        }
        if ((i & 32) != 0) {
            d13 = transferParameters.f419e;
        } else {
            d13 = d6;
        }
        if ((i & 64) != 0) {
            d14 = transferParameters.f420f;
        } else {
            d14 = d7;
        }
        return transferParameters.copy(d8, d9, d10, d11, d12, d13, d14);
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f415a;
    }

    public final double component3() {
        return this.f416b;
    }

    public final double component4() {
        return this.f417c;
    }

    public final double component5() {
        return this.f418d;
    }

    public final double component6() {
        return this.f419e;
    }

    public final double component7() {
        return this.f420f;
    }

    @NotNull
    public final TransferParameters copy(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return new TransferParameters(d, d2, d3, d4, d5, d6, d7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        if (Intrinsics.m17075f(Double.valueOf(this.gamma), Double.valueOf(transferParameters.gamma)) && Intrinsics.m17075f(Double.valueOf(this.f415a), Double.valueOf(transferParameters.f415a)) && Intrinsics.m17075f(Double.valueOf(this.f416b), Double.valueOf(transferParameters.f416b)) && Intrinsics.m17075f(Double.valueOf(this.f417c), Double.valueOf(transferParameters.f417c)) && Intrinsics.m17075f(Double.valueOf(this.f418d), Double.valueOf(transferParameters.f418d)) && Intrinsics.m17075f(Double.valueOf(this.f419e), Double.valueOf(transferParameters.f419e)) && Intrinsics.m17075f(Double.valueOf(this.f420f), Double.valueOf(transferParameters.f420f))) {
            return true;
        }
        return false;
    }

    public final double getA() {
        return this.f415a;
    }

    public final double getB() {
        return this.f416b;
    }

    public final double getC() {
        return this.f417c;
    }

    public final double getD() {
        return this.f418d;
    }

    public final double getE() {
        return this.f419e;
    }

    public final double getF() {
        return this.f420f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f415a)) * 31) + Double.hashCode(this.f416b)) * 31) + Double.hashCode(this.f417c)) * 31) + Double.hashCode(this.f418d)) * 31) + Double.hashCode(this.f419e)) * 31) + Double.hashCode(this.f420f);
    }

    @NotNull
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f415a + ", b=" + this.f416b + ", c=" + this.f417c + ", d=" + this.f418d + ", e=" + this.f419e + ", f=" + this.f420f + ')';
    }

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? 0.0d : d6, (i & 64) != 0 ? 0.0d : d7);
    }
}
