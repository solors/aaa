package com.facebook.ads.redexgen.p370X;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.learnings.abcenter.util.AbCenterConstant;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", AbCenterConstant.RULE_TYPE_LIST, "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", KiwiConstants.f2714as, FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.3N */
/* loaded from: assets/audience_network.dex */
public final class C110713N<E> extends AbstractC112866x<E> implements RandomAccess {
    public static byte[] A03;
    public int A00;
    public final int A01;
    public final AbstractC112866x<E> A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-96, -99, -89, -88};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C110713N(AbstractC112866x<? extends E> abstractC112866x, int i, int i2) {
        C13227d7.A07(abstractC112866x, A00(0, 4, 40));
        this.A02 = abstractC112866x;
        this.A01 = i;
        AbstractC112866x.A02.A05(this.A01, i2, this.A02.size());
        this.A00 = i2 - this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11936I1
    public final int A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC112866x, java.util.List
    public final E get(int i) {
        AbstractC112866x.A02.A03(i, this.A00);
        return this.A02.get(this.A01 + i);
    }
}
