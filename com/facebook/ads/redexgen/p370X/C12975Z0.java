package com.facebook.ads.redexgen.p370X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.Z0 */
/* loaded from: assets/audience_network.dex */
public final class C12975Z0 implements InterfaceC11506Ag {
    public static String[] A06 = {"x4SLKw0ecPcHsWHgO1Td4vJ14144RMMS", "Zh7tfC3TFBRtLhPe9z1RavfnQghohUvM", "5a1nSgSc9ubjxiTpcQH3XZ5BSJHYyomE", "9hzCYTVbSoKGzhiGE0INbgm8vz2Ul1tD", "U5QynYTJKvqXrBDteFA3kKN8MUDMbs9q", "vYVMMAOqO79qbNxEgxq93Z6FBxHJHfxt", "X8bjNxmBNAlkg", "EWWs7bfWX2zABqEPcCAhkdtns4Cu5rHI"};
    public boolean A05;
    public int A02 = -1;
    public int A00 = -1;
    public int A01 = 0;
    public ByteBuffer A03 = InterfaceC11506Ag.A00;
    public ByteBuffer A04 = InterfaceC11506Ag.A00;

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A4m(int i, int i2, int i3) throws C11505Af {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.A02 == i && this.A00 == i2 && this.A01 == i3) {
                return false;
            }
            this.A02 = i;
            this.A00 = i2;
            this.A01 = i3;
            return true;
        }
        throw new C11505Af(i, i2, i3);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final ByteBuffer A7u() {
        ByteBuffer byteBuffer = this.A04;
        ByteBuffer outputBuffer = InterfaceC11506Ag.A00;
        this.A04 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7v() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7w() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final int A7x() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A9L() {
        return (this.A01 == 0 || this.A01 == 2) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final boolean A9Q() {
        if (this.A05) {
            ByteBuffer byteBuffer = this.A04;
            ByteBuffer byteBuffer2 = InterfaceC11506Ag.A00;
            if (A06[3].charAt(27) != 'U') {
                throw new RuntimeException();
            }
            A06[6] = "37MFS79N5bC4O";
            if (byteBuffer == byteBuffer2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void AEh() {
        this.A05 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void AEi(ByteBuffer byteBuffer) {
        int limit;
        int i = byteBuffer.position();
        int resampledSize = byteBuffer.limit();
        int limit2 = resampledSize - i;
        int position = this.A01;
        switch (position) {
            case Integer.MIN_VALUE:
                int position2 = limit2 / 3;
                limit = position2 * 2;
                break;
            case 3:
                limit = limit2 * 2;
                break;
            case 1073741824:
                limit = limit2 / 2;
                break;
            default:
                throw new IllegalStateException();
        }
        int position3 = this.A03.capacity();
        if (position3 < limit) {
            this.A03 = ByteBuffer.allocateDirect(limit).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        int i2 = this.A01;
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[0];
        int limit3 = str.charAt(21);
        int position4 = str2.charAt(21);
        if (limit3 != position4) {
            throw new RuntimeException();
        }
        A06[4] = "sqNpl1OaV4AX2PiDopzrEiO6zTyyi8x2";
        switch (i2) {
            case Integer.MIN_VALUE:
                while (i < resampledSize) {
                    int position5 = i + 1;
                    this.A03.put(byteBuffer.get(position5));
                    int position6 = i + 2;
                    this.A03.put(byteBuffer.get(position6));
                    i += 3;
                }
                break;
            case 3:
                while (i < resampledSize) {
                    this.A03.put((byte) 0);
                    ByteBuffer byteBuffer2 = this.A03;
                    int position7 = byteBuffer.get(i);
                    byteBuffer2.put((byte) ((position7 & 255) - 128));
                    i++;
                }
                break;
            case 1073741824:
                while (i < resampledSize) {
                    int position8 = i + 2;
                    this.A03.put(byteBuffer.get(position8));
                    int position9 = i + 3;
                    this.A03.put(byteBuffer.get(position9));
                    i += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void flush() {
        this.A04 = InterfaceC11506Ag.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11506Ag
    public final void reset() {
        flush();
        this.A02 = -1;
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = InterfaceC11506Ag.A00;
    }
}
