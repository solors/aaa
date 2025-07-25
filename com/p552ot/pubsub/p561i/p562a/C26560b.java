package com.p552ot.pubsub.p561i.p562a;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.maticoo.sdk.utils.request.network.Headers;
import com.p552ot.pubsub.p555c.C26524d;
import com.p552ot.pubsub.p561i.C26558a;
import com.p552ot.pubsub.util.C26585i;
import com.p552ot.pubsub.util.C26586j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.ot.pubsub.i.a.b */
/* loaded from: classes7.dex */
public class C26560b {

    /* renamed from: a */
    public static final int f69637a = 30000;

    /* renamed from: b */
    public static final int f69638b = 60000;

    /* renamed from: c */
    public static final int f69639c = 30000;

    /* renamed from: d */
    public static final int f69640d = 60000;

    /* renamed from: e */
    private static String f69641e = "HttpUtil";

    /* renamed from: f */
    private static final String f69642f = "UTF-8";

    /* renamed from: g */
    private static final String f69643g = "&";

    /* renamed from: h */
    private static final String f69644h = "=";

    /* renamed from: i */
    private static final String f69645i = "miui_sdkconfig_jafej!@#)(*e@!#";

    /* renamed from: j */
    private static final String f69646j = "POST";

    /* renamed from: k */
    private static final String f69647k = "GET";

    private C26560b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* renamed from: a */
    public static C26558a m41188a(String str, String str2, String str3) {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        Exception e;
        OutputStream outputStream2;
        HttpURLConnection httpURLConnection2;
        Exception e2;
        InputStream inputStream;
        byte[] bytes;
        C26558a c26558a;
        ?? r3 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("accept", Headers.VALUE_ACCEPT_ALL);
                    httpURLConnection.setRequestProperty("connection", HttpHeaders.KEEP_ALIVE);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Authorization", str3);
                    httpURLConnection.setDoOutput(true);
                    bytes = str2.getBytes("UTF-8");
                    outputStream = httpURLConnection.getOutputStream();
                } catch (Exception e3) {
                    e = e3;
                    outputStream = null;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
            } catch (Exception e4) {
                e = e4;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = null;
                outputStream = null;
            }
            try {
                outputStream.write(bytes, 0, bytes.length);
                outputStream.flush();
                int responseCode = httpURLConnection.getResponseCode();
                c26558a = new C26558a();
                c26558a.f69628d = responseCode;
                if (responseCode != 200) {
                    inputStream = httpURLConnection.getErrorStream();
                } else {
                    inputStream = httpURLConnection.getInputStream();
                }
            } catch (Exception e5) {
                e = e5;
                e2 = e;
                inputStream = null;
                C26586j.m41072b(f69641e, "HttpUtils POST 上传异常", e2.getMessage());
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                httpURLConnection2 = httpURLConnection;
                outputStream2 = outputStream;
                C26585i.m41091a((InputStream) r3);
                C26585i.m41088a((OutputStream) outputStream2);
                C26585i.m41087a((HttpURLConnection) httpURLConnection2);
                throw th;
            }
            try {
                c26558a.m41189a(new String(C26585i.m41083c(inputStream), "UTF-8"));
                if (c26558a.f69628d == 200) {
                    C26586j.m41080a(f69641e, "POST 成功 publishResponse:" + c26558a.toString());
                } else {
                    C26586j.m41074b(f69641e, "POST 失败 publishResponse:" + c26558a.toString());
                }
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection);
                return c26558a;
            } catch (Exception e6) {
                e2 = e6;
                C26586j.m41072b(f69641e, "HttpUtils POST 上传异常", e2.getMessage());
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection);
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
            r3 = str2;
            httpURLConnection2 = str;
            outputStream2 = str3;
            C26585i.m41091a((InputStream) r3);
            C26585i.m41088a((OutputStream) outputStream2);
            C26585i.m41087a((HttpURLConnection) httpURLConnection2);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m41187a(String str, String str2, Map<String, String> map) {
        String m41183a;
        InputStream inputStream;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        byte[] bytes;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        HttpURLConnection httpURLConnection2 = null;
        if (map == null) {
            m41183a = null;
        } else {
            try {
                m41183a = m41183a(map, true);
            } catch (Exception e) {
                e = e;
                inputStream = null;
                httpURLConnection = null;
                outputStream = null;
                C26586j.m41073b(f69641e, "HttpUtils POST 上传异常", e);
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = null;
                outputStream = null;
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection2);
                throw th;
            }
        }
        httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        try {
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str);
            httpURLConnection.setDoOutput(true);
            bytes = m41183a.getBytes("UTF-8");
            outputStream = httpURLConnection.getOutputStream();
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            outputStream = null;
        }
        try {
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();
            int responseCode = httpURLConnection.getResponseCode();
            C26586j.m41080a(f69641e, "postGetToken responseData statusCode:" + responseCode);
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            httpURLConnection2 = httpURLConnection;
            C26585i.m41091a(inputStream);
            C26585i.m41088a(outputStream);
            C26585i.m41087a(httpURLConnection2);
            throw th;
        }
        try {
            try {
                String str3 = new String(C26585i.m41083c(inputStream), "UTF-8");
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection);
                return str3;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection2 = httpURLConnection;
                C26585i.m41091a(inputStream);
                C26585i.m41088a(outputStream);
                C26585i.m41087a(httpURLConnection2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            C26586j.m41073b(f69641e, "HttpUtils POST 上传异常", e);
            C26585i.m41091a(inputStream);
            C26585i.m41088a(outputStream);
            C26585i.m41087a(httpURLConnection);
            return null;
        }
    }

    /* renamed from: a */
    public static String m41185a(String str, Map<String, String> map, boolean z) throws IOException {
        return m41186a("POST", str, map, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* renamed from: a */
    private static String m41186a(String str, String str2, Map<String, String> map, boolean z) {
        OutputStream outputStream;
        ?? r0;
        String m41183a;
        InputStream inputStream;
        String str3;
        String str4 = "POST";
        HttpURLConnection httpURLConnection = null;
        try {
            if (map == 0) {
                m41183a = null;
            } else {
                try {
                    m41183a = m41183a(map, z);
                } catch (Exception e) {
                    e = e;
                    map = 0;
                    z = 0;
                    inputStream = null;
                    C26586j.m41073b(f69641e, "HttpUtils POST 上传异常", e);
                    C26585i.m41091a(inputStream);
                    C26585i.m41088a((OutputStream) map);
                    C26585i.m41087a((HttpURLConnection) z);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                    r0 = 0;
                    C26585i.m41091a((InputStream) r0);
                    C26585i.m41088a(outputStream);
                    C26585i.m41087a(httpURLConnection);
                    throw th;
                }
            }
            if (!"GET".equals(str) || m41183a == null) {
                str3 = str2;
            } else {
                str3 = str2 + "? " + m41183a;
            }
            z = (HttpURLConnection) new URL(str3).openConnection();
            try {
                z.setConnectTimeout(30000);
                z.setReadTimeout(30000);
            } catch (Exception e2) {
                e = e2;
                map = 0;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                map = 0;
                str4 = null;
            }
            try {
                if ("GET".equals(str)) {
                    z.setRequestMethod("GET");
                } else if ("POST".equals(str) && m41183a != null) {
                    z.setRequestMethod("POST");
                    z.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    z.setDoOutput(true);
                    byte[] bytes = m41183a.getBytes("UTF-8");
                    OutputStream outputStream2 = z.getOutputStream();
                    try {
                        outputStream2.write(bytes, 0, bytes.length);
                        outputStream2.flush();
                        map = outputStream2;
                        int responseCode = z.getResponseCode();
                        inputStream = z.getInputStream();
                        byte[] m41083c = C26585i.m41083c(inputStream);
                        C26586j.m41080a(f69641e, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                        String str5 = new String(m41083c, "UTF-8");
                        C26585i.m41091a(inputStream);
                        C26585i.m41088a((OutputStream) map);
                        C26585i.m41087a((HttpURLConnection) z);
                        return str5;
                    } catch (Exception e3) {
                        e = e3;
                        inputStream = null;
                        C26586j.m41073b(f69641e, "HttpUtils POST 上传异常", e);
                        C26585i.m41091a(inputStream);
                        C26585i.m41088a((OutputStream) map);
                        C26585i.m41087a((HttpURLConnection) z);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        str4 = null;
                        httpURLConnection = z;
                        r0 = str4;
                        outputStream = map;
                        C26585i.m41091a((InputStream) r0);
                        C26585i.m41088a(outputStream);
                        C26585i.m41087a(httpURLConnection);
                        throw th;
                    }
                }
                byte[] m41083c2 = C26585i.m41083c(inputStream);
                C26586j.m41080a(f69641e, String.format("HttpUtils POST 上传成功 url: %s, code: %s", str2, Integer.valueOf(responseCode)));
                String str52 = new String(m41083c2, "UTF-8");
                C26585i.m41091a(inputStream);
                C26585i.m41088a((OutputStream) map);
                C26585i.m41087a((HttpURLConnection) z);
                return str52;
            } catch (Exception e4) {
                e = e4;
                C26586j.m41073b(f69641e, "HttpUtils POST 上传异常", e);
                C26585i.m41091a(inputStream);
                C26585i.m41088a((OutputStream) map);
                C26585i.m41087a((HttpURLConnection) z);
                return null;
            }
            map = 0;
            int responseCode2 = z.getResponseCode();
            inputStream = z.getInputStream();
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: a */
    private static String m41183a(Map<String, String> map, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                if (!TextUtils.isEmpty(entry.getKey())) {
                    if (sb2.length() > 0) {
                        sb2.append("&");
                    }
                    sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    sb2.append("=");
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "null" : entry.getValue(), "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
                C26586j.m41074b(f69641e, "format params failed");
            }
        }
        if (z) {
            String m41184a = m41184a(map);
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(URLEncoder.encode("sign", "UTF-8"));
            sb2.append("=");
            sb2.append(URLEncoder.encode(m41184a, "UTF-8"));
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static String m41184a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            ArrayList<String> arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    sb2.append(map.get(str));
                }
            }
        }
        sb2.append(f69645i);
        return C26524d.m41337c(sb2.toString());
    }
}
