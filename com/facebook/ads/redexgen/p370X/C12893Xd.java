package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xd */
/* loaded from: assets/audience_network.dex */
public final class C12893Xd extends DownloadAction {
    public static byte[] A01;
    public static final DownloadAction.Deserializer A02;
    public final String A00;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{4, 6, 3, -5, 6, -7, 7, 7, -3, 10, -7};
    }

    static {
        A06();
        A02 = new C12894Xe(A05(0, 11, 96), 0);
    }

    public C12893Xd(Uri uri, boolean z, byte[] bArr, String str) {
        super(A05(0, 11, 96), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    /* renamed from: A02 */
    public final C12892Xc A07(C11723EQ c11723eq) {
        return new C12892Xc(this.A01, this.A00, c11723eq);
    }

    private String A04() {
        return this.A00 != null ? this.A00 : AbstractC11904HV.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean customCacheKeySet = this.A00 != null;
        dataOutputStream.writeBoolean(customCacheKeySet);
        if (customCacheKeySet) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof C12893Xd) && A04().equals(((C12893Xd) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return AbstractC11953IK.A0g(this.A00, ((C12893Xd) obj).A00);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction
    public final int hashCode() {
        int result = super.hashCode();
        int i = result * 31;
        int result2 = this.A00 != null ? this.A00.hashCode() : 0;
        return i + result2;
    }
}
