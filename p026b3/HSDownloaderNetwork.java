package p026b3;

import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.helpshift.log.HSLogger;
import com.ironsource.C20517nb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p752k3.C37383m;
import p752k3.ListUtil;

/* renamed from: b3.d */
/* loaded from: classes5.dex */
public class HSDownloaderNetwork {

    /* renamed from: a */
    private final URLConnectionProvider f1557a;

    public HSDownloaderNetwork(URLConnectionProvider uRLConnectionProvider) {
        this.f1557a = uRLConnectionProvider;
    }

    /* renamed from: b */
    private static String m103968b(List<String> list) {
        if (ListUtil.m18246a(list)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb2.append(";");
            sb2.append(list.get(i));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* renamed from: a */
    public HSDownloaderResponse m103969a(String str, Map<String, String> map, File file) {
        boolean z;
        Exception exc;
        FileOutputStream fileOutputStream;
        UnknownHostException unknownHostException;
        FileOutputStream fileOutputStream2;
        InputStream inputStream;
        FileOutputStream fileOutputStream3;
        boolean z2;
        String str2;
        String str3;
        String str4;
        InputStream inputStream2;
        FileOutputStream fileOutputStream4;
        String str5 = "";
        String str6 = C20517nb.f52167N;
        JSONObject jSONObject = new JSONObject();
        int i = 404;
        try {
            try {
                try {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f1557a.m103950a(str).openConnection();
                    map.put("Accept-Encoding", "gzip");
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        try {
                            httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        } catch (UnknownHostException e) {
                            unknownHostException = e;
                            fileOutputStream = "";
                            z = false;
                            fileOutputStream3 = null;
                            inputStream = null;
                            HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                            C37383m.m18238b(fileOutputStream3);
                            C37383m.m18238b(inputStream);
                            fileOutputStream2 = fileOutputStream;
                            str3 = str5;
                            str2 = str6;
                            z2 = z;
                            str4 = fileOutputStream2;
                            return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                        } catch (Exception e2) {
                            exc = e2;
                            fileOutputStream = "";
                            z = false;
                            fileOutputStream3 = null;
                            inputStream = null;
                            HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                            C37383m.m18238b(fileOutputStream3);
                            C37383m.m18238b(inputStream);
                            fileOutputStream2 = fileOutputStream;
                            str3 = str5;
                            str2 = str6;
                            z2 = z;
                            str4 = fileOutputStream2;
                            return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                        }
                    }
                    i = httpsURLConnection.getResponseCode();
                    str6 = httpsURLConnection.getContentEncoding();
                    String contentType = httpsURLConnection.getContentType();
                    try {
                        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            try {
                                if (entry2.getKey() != null || entry2.getValue() != null) {
                                    if (entry2.getKey() == null) {
                                        jSONObject.put("", m103968b(entry2.getValue()));
                                    } else {
                                        jSONObject.put(entry2.getKey(), m103968b(entry2.getValue()));
                                        if (entry2.getKey().equalsIgnoreCase(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN)) {
                                            jSONObject.put(entry2.getKey(), ProxyConfig.MATCH_ALL_SCHEMES);
                                        }
                                    }
                                }
                            } catch (UnknownHostException e3) {
                                unknownHostException = e3;
                                fileOutputStream = "";
                                str5 = contentType;
                                z = false;
                                fileOutputStream3 = null;
                                inputStream = null;
                                HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            } catch (Exception e4) {
                                exc = e4;
                                fileOutputStream = "";
                                str5 = contentType;
                                z = false;
                                fileOutputStream3 = null;
                                inputStream = null;
                                HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            }
                        }
                        List<String> list = headerFields.get(DownloadModel.ETAG);
                        if (ListUtil.m18245b(list)) {
                            try {
                                str5 = list.get(0);
                            } catch (UnknownHostException e5) {
                                unknownHostException = e5;
                                fileOutputStream = "";
                                z = false;
                                str5 = contentType;
                                fileOutputStream3 = null;
                                inputStream = null;
                                HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            } catch (Exception e6) {
                                exc = e6;
                                fileOutputStream = "";
                                z = false;
                                str5 = contentType;
                                fileOutputStream3 = null;
                                inputStream = null;
                                HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            }
                        }
                        if (i >= 200 && i <= 300) {
                            inputStream2 = httpsURLConnection.getInputStream();
                            if (inputStream2 != null) {
                                try {
                                    try {
                                        if (C37383m.m18233g(str6) && str6.contains("gzip")) {
                                            inputStream2 = new GZIPInputStream(inputStream2);
                                        }
                                    } catch (UnknownHostException e7) {
                                        unknownHostException = e7;
                                        fileOutputStream = str5;
                                        inputStream = inputStream2;
                                        str5 = contentType;
                                        z = false;
                                        fileOutputStream3 = null;
                                        HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                        C37383m.m18238b(fileOutputStream3);
                                        C37383m.m18238b(inputStream);
                                        fileOutputStream2 = fileOutputStream;
                                        str3 = str5;
                                        str2 = str6;
                                        z2 = z;
                                        str4 = fileOutputStream2;
                                        return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                                    } catch (Exception e8) {
                                        exc = e8;
                                        fileOutputStream = str5;
                                        inputStream = inputStream2;
                                        str5 = contentType;
                                        z = false;
                                        fileOutputStream3 = null;
                                        HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                        C37383m.m18238b(fileOutputStream3);
                                        C37383m.m18238b(inputStream);
                                        fileOutputStream2 = fileOutputStream;
                                        str3 = str5;
                                        str2 = str6;
                                        z2 = z;
                                        str4 = fileOutputStream2;
                                        return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = inputStream2;
                                    fileOutputStream2 = 0;
                                    C37383m.m18238b(fileOutputStream2);
                                    C37383m.m18238b(inputStream);
                                    throw th;
                                }
                            }
                            try {
                                FileOutputStream fileOutputStream5 = new FileOutputStream(file);
                                try {
                                    try {
                                        byte[] bArr = new byte[8192];
                                        while (true) {
                                            int read = inputStream2.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            z = false;
                                            try {
                                                fileOutputStream5.write(bArr, 0, read);
                                            } catch (UnknownHostException e9) {
                                                e = e9;
                                                fileOutputStream3 = fileOutputStream5;
                                                inputStream = inputStream2;
                                                unknownHostException = e;
                                                fileOutputStream = str5;
                                                str5 = contentType;
                                                HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                                C37383m.m18238b(fileOutputStream3);
                                                C37383m.m18238b(inputStream);
                                                fileOutputStream2 = fileOutputStream;
                                                str3 = str5;
                                                str2 = str6;
                                                z2 = z;
                                                str4 = fileOutputStream2;
                                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                                            } catch (Exception e10) {
                                                e = e10;
                                                fileOutputStream3 = fileOutputStream5;
                                                inputStream = inputStream2;
                                                exc = e;
                                                fileOutputStream = str5;
                                                str5 = contentType;
                                                HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                                C37383m.m18238b(fileOutputStream3);
                                                C37383m.m18238b(inputStream);
                                                fileOutputStream2 = fileOutputStream;
                                                str3 = str5;
                                                str2 = str6;
                                                z2 = z;
                                                str4 = fileOutputStream2;
                                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                                            }
                                        }
                                        z = false;
                                        fileOutputStream4 = fileOutputStream5;
                                    } catch (UnknownHostException e11) {
                                        e = e11;
                                        z = false;
                                    } catch (Exception e12) {
                                        e = e12;
                                        z = false;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream2 = fileOutputStream5;
                                    inputStream = inputStream2;
                                    C37383m.m18238b(fileOutputStream2);
                                    C37383m.m18238b(inputStream);
                                    throw th;
                                }
                            } catch (UnknownHostException e13) {
                                z = false;
                                unknownHostException = e13;
                                fileOutputStream = str5;
                                inputStream = inputStream2;
                                str5 = contentType;
                                fileOutputStream3 = null;
                                HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            } catch (Exception e14) {
                                z = false;
                                exc = e14;
                                fileOutputStream = str5;
                                inputStream = inputStream2;
                                str5 = contentType;
                                fileOutputStream3 = null;
                                HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            }
                        } else {
                            z = false;
                            inputStream2 = null;
                            fileOutputStream4 = null;
                        }
                        if ((i >= 200 && i <= 300) || i == 304) {
                            try {
                                HSLogger.m65441d("dwnldrNet", "Successfully downloaded the resource with Url: " + str + " headers: " + map);
                                z = true;
                            } catch (UnknownHostException e15) {
                                unknownHostException = e15;
                                fileOutputStream = str5;
                                str5 = contentType;
                                fileOutputStream3 = fileOutputStream4;
                                inputStream = inputStream2;
                                HSLogger.m65439e("dwnldrNet", "Error downloading resource: " + str + " \n " + unknownHostException.getMessage());
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            } catch (Exception e16) {
                                exc = e16;
                                fileOutputStream = str5;
                                str5 = contentType;
                                fileOutputStream3 = fileOutputStream4;
                                inputStream = inputStream2;
                                HSLogger.m65438e("dwnldrNet", "Error downloading resource: " + str, exc);
                                C37383m.m18238b(fileOutputStream3);
                                C37383m.m18238b(inputStream);
                                fileOutputStream2 = fileOutputStream;
                                str3 = str5;
                                str2 = str6;
                                z2 = z;
                                str4 = fileOutputStream2;
                                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream2 = fileOutputStream4;
                                inputStream = inputStream2;
                                C37383m.m18238b(fileOutputStream2);
                                C37383m.m18238b(inputStream);
                                throw th;
                            }
                        }
                        C37383m.m18238b(fileOutputStream4);
                        C37383m.m18238b(inputStream2);
                        str4 = str5;
                        z2 = z;
                        str3 = contentType;
                        str2 = str6;
                    } catch (UnknownHostException e17) {
                        z = false;
                        unknownHostException = e17;
                        fileOutputStream = str5;
                    } catch (Exception e18) {
                        z = false;
                        exc = e18;
                        fileOutputStream = str5;
                    }
                } catch (UnknownHostException e19) {
                    z = false;
                    unknownHostException = e19;
                    fileOutputStream = "";
                } catch (Exception e20) {
                    z = false;
                    exc = e20;
                    fileOutputStream = "";
                }
                return new HSDownloaderResponse(i, jSONObject, str4, str3, str2, z2);
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream2 = null;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
