package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp;
import com.bytedance.sdk.component.p228IL.p229bg.C7197WR;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.Kg */
/* loaded from: classes3.dex */
public class C7205Kg extends AbstractC7220xxp {

    /* renamed from: IL */
    InputStream f15532IL;

    /* renamed from: bg */
    HttpURLConnection f15533bg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7205Kg(HttpURLConnection httpURLConnection) throws IOException {
        this.f15533bg = httpURLConnection;
        this.f15532IL = new C7211ldr(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp
    /* renamed from: IL */
    public String mo89565IL() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f15532IL));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                } else {
                    String stringBuffer2 = stringBuffer.toString();
                    close();
                    return stringBuffer2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp
    /* renamed from: bX */
    public InputStream mo89564bX() {
        return this.f15532IL;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp
    /* renamed from: bg */
    public long mo89563bg() {
        try {
            return this.f15533bg.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f15532IL.close();
            this.f15533bg.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp
    public byte[] eqN() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = this.f15532IL.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp
    /* renamed from: zx */
    public C7197WR mo89562zx() {
        if (this.f15533bg.getContentType() != null) {
            return C7197WR.m89634bg(this.f15533bg.getContentType());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7205Kg(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.f15533bg = httpURLConnection;
        this.f15532IL = new C7211ldr(inputStream, httpURLConnection);
    }
}
