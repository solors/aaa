package com.facebook.ads.redexgen.p370X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.S5 */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC12551S5 {
    boolean ABv(C12549S3 c12549s3);

    HttpURLConnection AEH(String str, Proxy proxy) throws IOException;

    InputStream AEI(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AEJ(HttpURLConnection httpURLConnection) throws IOException;

    void AEZ(HttpURLConnection httpURLConnection, EnumC12547S1 enumC12547S1, String str) throws IOException;

    byte[] AEr(InputStream inputStream) throws IOException;

    void AHj(OutputStream outputStream, byte[] bArr) throws IOException;
}
