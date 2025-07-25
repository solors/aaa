package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xe */
/* loaded from: assets/audience_network.dex */
public class C12894Xe extends DownloadAction.Deserializer {
    public C12894Xe(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* renamed from: A00 */
    public final C12893Xd A01(int i, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C12893Xd(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
