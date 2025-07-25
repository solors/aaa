package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.C20086i9;
import com.ironsource.InterfaceC20633pd;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.learnings.purchase.event.EventUploader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a */
    private static final int f51923a = 15000;

    /* renamed from: b */
    private static final String f51924b = "GET";

    /* renamed from: c */
    private static final String f51925c = "POST";

    /* renamed from: d */
    private static final String f51926d = "UTF-8";

    /* renamed from: e */
    private static final String f51927e = "Bad Request - 400";

    /* renamed from: f */
    private static final ExecutorService f51928f = Executors.newSingleThreadExecutor();

    /* renamed from: com.ironsource.mediationsdk.server.HttpFunctions$a */
    /* loaded from: classes6.dex */
    class RunnableC20446a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f51929a;

        /* renamed from: b */
        final /* synthetic */ String f51930b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC20633pd f51931c;

        RunnableC20446a(String str, String str2, InterfaceC20633pd interfaceC20633pd) {
            this.f51929a = str;
            this.f51930b = str2;
            this.f51931c = interfaceC20633pd;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            boolean z;
            try {
                httpURLConnection = HttpFunctions.m56477b(this.f51929a);
            } catch (Exception e) {
                e = e;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
                outputStream = null;
            }
            try {
                outputStream = httpURLConnection.getOutputStream();
            } catch (Exception e2) {
                e = e2;
                outputStream = null;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                HttpFunctions.m56478b(outputStream, httpURLConnection, null);
                throw th;
            }
            try {
                try {
                    HttpFunctions.m56476b(this.f51930b, outputStream);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                    }
                    this.f51931c.mo53853a(z);
                } catch (Throwable th3) {
                    th = th3;
                    HttpFunctions.m56478b(outputStream, httpURLConnection, null);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                C20086i9.m57997d().m58003a(e);
                IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                this.f51931c.mo53853a(false);
                HttpFunctions.m56478b(outputStream, httpURLConnection, null);
            }
            HttpFunctions.m56478b(outputStream, httpURLConnection, null);
        }
    }

    @Nullable
    /* renamed from: a */
    private static String m56482a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb2.append(readLine);
        }
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(sb3)) {
            return null;
        }
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static HttpURLConnection m56477b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String getStringFromURL(String str) throws Exception {
        return getStringFromURL(str, null);
    }

    @Nullable
    public static String sendPostRequest(String str, String str2, C20423p.InterfaceC20426c interfaceC20426c) {
        BufferedReader bufferedReader;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        Exception e;
        BufferedReader bufferedReader2;
        Throwable th;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = m56477b(str);
            try {
                httpURLConnection.setRequestProperty("Content-Type", EventUploader.MEDIA_TYPE_JSON);
                outputStream = httpURLConnection.getOutputStream();
                try {
                    m56476b(str2, outputStream);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (!(responseCode == 200)) {
                        if (responseCode == 400 && interfaceC20426c != null) {
                            interfaceC20426c.mo53706a(f51927e);
                        }
                        m56478b(outputStream, httpURLConnection, null);
                        return null;
                    }
                    bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        String m56482a = m56482a(bufferedReader2);
                        m56478b(outputStream, httpURLConnection, bufferedReader2);
                        return m56482a;
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            C20086i9.m57997d().m58003a(e);
                            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            m56478b(outputStream, httpURLConnection, bufferedReader2);
                            return null;
                        } catch (Throwable th2) {
                            httpURLConnection2 = httpURLConnection;
                            bufferedReader = bufferedReader2;
                            th = th2;
                            th = th;
                            bufferedReader2 = bufferedReader;
                            httpURLConnection = httpURLConnection2;
                            m56478b(outputStream, httpURLConnection, bufferedReader2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        m56478b(outputStream, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e = e;
                    bufferedReader2 = null;
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                    m56478b(outputStream, httpURLConnection, bufferedReader2);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection2 = httpURLConnection;
                    bufferedReader = null;
                    th = th;
                    bufferedReader2 = bufferedReader;
                    httpURLConnection = httpURLConnection2;
                    m56478b(outputStream, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                outputStream = null;
            } catch (Throwable th5) {
                th = th5;
                outputStream = null;
                httpURLConnection2 = httpURLConnection;
                bufferedReader = null;
            }
        } catch (Exception e5) {
            e = e5;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m56478b(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                C20086i9.m57997d().m58003a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while closing output stream " + e.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                C20086i9.m57997d().m58003a(e2);
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception while closing reader " + e2.getMessage());
            }
        }
    }

    public static String getStringFromURL(String str, C20423p.InterfaceC20426c interfaceC20426c) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e2) {
            e = e2;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            bufferedReader = null;
        }
        try {
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 400) {
                if (interfaceC20426c != null) {
                    interfaceC20426c.mo53706a(f51927e);
                }
                m56478b(null, httpURLConnection, null);
                return null;
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                String m56482a = m56482a(bufferedReader2);
                m56478b(null, httpURLConnection, bufferedReader2);
                return m56482a;
            } catch (Exception e3) {
                e = e3;
                try {
                    C20086i9.m57997d().m58003a(e);
                    m56478b(null, httpURLConnection, bufferedReader2);
                    return null;
                } catch (Throwable th3) {
                    bufferedReader = bufferedReader2;
                    th = th3;
                    BufferedReader bufferedReader3 = bufferedReader;
                    th = th;
                    bufferedReader2 = bufferedReader3;
                    m56478b(null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                m56478b(null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            e = e;
            bufferedReader2 = null;
            C20086i9.m57997d().m58003a(e);
            m56478b(null, httpURLConnection, bufferedReader2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            BufferedReader bufferedReader32 = bufferedReader;
            th = th;
            bufferedReader2 = bufferedReader32;
            m56478b(null, httpURLConnection, bufferedReader2);
            throw th;
        }
    }

    public static void sendPostRequest(String str, String str2, InterfaceC20633pd interfaceC20633pd) {
        f51928f.submit(new RunnableC20446a(str, str2, interfaceC20633pd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m56476b(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
