package com.facebook.ads.redexgen.p370X;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.3O */
/* loaded from: assets/audience_network.dex */
public final class C110723O<E> extends AbstractC112836r implements InterfaceC11912Hd<E, CharSequence> {
    public static byte[] A01;
    public static String[] A02 = {"myGvayzKyHjMQEIVnJngawcUxLve9dSw", "2Qe1VU4DTht28N06OT2Ihgi6oEKZqtec", "K0Li6ixfMtV0yZyxCQAKXgUatNnBOdUM", "fO5swDl5NsVWlWfEmM", "VHq1YhoMTFYvBPIbWX", "Ou2XCvX7MjVMMc63rBnsB152pi", "9GBk78KeH101Q3mSP0uttZ9ZoKvhLy8x", "cwulO8Q8e8Se0d6UTyiWa0crzgg6O8Y"};
    public final /* synthetic */ AbstractC11936I1<E> A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C110723O(AbstractC11936I1<? extends E> abstractC11936I1) {
        super(1);
        this.A00 = abstractC11936I1;
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A02;
        if (strArr[0].charAt(12) != strArr[6].charAt(12)) {
            throw new RuntimeException();
        }
        A02[3] = "5dLUOQ3MAe9BBWnkDO";
        A01 = new byte[]{-87, -11, -23, -22, -12, -95, -60, -16, -19, -19, -26, -28, -11, -22, -16, -17, -86};
    }

    static {
        A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11912Hd
    /* renamed from: A00 */
    public final CharSequence A9K(E e) {
        return e == this.A00 ? A01(0, 17, 59) : String.valueOf(e);
    }
}
