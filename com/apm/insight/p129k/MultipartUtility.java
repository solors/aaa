package com.apm.insight.p129k;

import com.apm.insight.p130l.C3822f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.apm.insight.k.i */
/* loaded from: classes2.dex */
public final class MultipartUtility {

    /* renamed from: a */
    private final String f3897a;

    /* renamed from: b */
    private HttpURLConnection f3898b;

    /* renamed from: c */
    private String f3899c;

    /* renamed from: d */
    private boolean f3900d;

    /* renamed from: e */
    private DataWithoutCloseStream f3901e;

    /* renamed from: f */
    private ZipWithZipOutputStream f3902f;

    public MultipartUtility(String str, String str2, boolean z) throws IOException {
        this.f3899c = str2;
        this.f3900d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f3897a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f3898b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f3898b.setDoOutput(true);
        this.f3898b.setDoInput(true);
        this.f3898b.setRequestMethod("POST");
        this.f3898b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z) {
            this.f3898b.setRequestProperty("Content-Encoding", "gzip");
            this.f3902f = new ZipWithZipOutputStream(this.f3898b.getOutputStream());
            return;
        }
        this.f3901e = new DataWithoutCloseStream(this.f3898b.getOutputStream());
    }

    /* renamed from: a */
    public final void m101776a(String str, String str2) {
        m101774b(str, str2);
    }

    /* renamed from: b */
    public final void m101774b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f3897a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f3899c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f3900d) {
                this.f3902f.write(sb2.toString().getBytes());
            } else {
                this.f3901e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f3900d) {
                this.f3902f.write(bytes);
                this.f3902f.write("\r\n".getBytes());
                return;
            }
            this.f3901e.write(bytes);
            this.f3901e.write("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    public final void m101775a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f3897a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3900d) {
            this.f3902f.write(sb2.toString().getBytes());
        } else {
            this.f3901e.write(sb2.toString().getBytes());
        }
        if (this.f3900d) {
            C3822f.m101716a(this.f3902f, fileArr);
        } else {
            C3822f.m101716a(this.f3901e, fileArr);
        }
        if (this.f3900d) {
            this.f3902f.write("\r\n".getBytes());
            return;
        }
        this.f3901e.write("\r\n".getBytes());
        this.f3901e.flush();
    }

    /* renamed from: a */
    public final void m101777a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f3897a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f3900d) {
            this.f3902f.write(sb2.toString().getBytes());
        } else {
            this.f3901e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f3900d) {
                this.f3902f.write(bArr, 0, read);
            } else {
                this.f3901e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f3900d) {
            this.f3902f.write("\r\n".getBytes());
            return;
        }
        this.f3901e.write("\r\n".getBytes());
        this.f3901e.flush();
    }

    /* renamed from: a */
    public final String m101778a() throws IOException {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f3897a + "--\r\n").getBytes();
        if (this.f3900d) {
            this.f3902f.write(bytes);
            this.f3902f.m101762b();
            this.f3902f.m101763a();
        } else {
            this.f3901e.write(bytes);
            this.f3901e.flush();
            this.f3901e.m101794a();
        }
        int responseCode = this.f3898b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f3898b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f3898b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            for (String str : arrayList) {
                sb2.append(str);
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
