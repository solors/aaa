package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.maticoo.sdk.utils.constant.KeyConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes4.dex */
public final class CctTransportBackend implements TransportBackend {

    /* renamed from: a */
    private final DataEncoder f30863a;

    /* renamed from: b */
    private final ConnectivityManager f30864b;

    /* renamed from: c */
    private final Context f30865c;

    /* renamed from: d */
    final URL f30866d;

    /* renamed from: e */
    private final Clock f30867e;

    /* renamed from: f */
    private final Clock f30868f;

    /* renamed from: g */
    private final int f30869g;

    /* loaded from: classes4.dex */
    public static final class HttpRequest {

        /* renamed from: a */
        final URL f30870a;

        /* renamed from: b */
        final BatchedLogRequest f30871b;
        @Nullable

        /* renamed from: c */
        final String f30872c;

        HttpRequest(URL url, BatchedLogRequest batchedLogRequest, @Nullable String str) {
            this.f30870a = url;
            this.f30871b = batchedLogRequest;
            this.f30872c = str;
        }

        /* renamed from: a */
        HttpRequest m76331a(URL url) {
            return new HttpRequest(url, this.f30871b, this.f30872c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class HttpResponse {

        /* renamed from: a */
        final int f30873a;
        @Nullable

        /* renamed from: b */
        final URL f30874b;

        /* renamed from: c */
        final long f30875c;

        HttpResponse(int i, @Nullable URL url, long j) {
            this.f30873a = i;
            this.f30874b = url;
            this.f30875c = j;
        }
    }

    CctTransportBackend(Context context, Clock clock, Clock clock2, int i) {
        this.f30863a = BatchedLogRequest.createDataEncoder();
        this.f30865c = context;
        this.f30864b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f30866d = m76332l(CCTDestination.f30857c);
        this.f30867e = clock2;
        this.f30868f = clock;
        this.f30869g = i;
    }

    /* renamed from: c */
    public HttpResponse m76341c(HttpRequest httpRequest) throws IOException {
        Logging.m76286i("CctTransportBackend", "Making request to: %s", httpRequest.f30870a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.f30870a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f30869g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = httpRequest.f30872c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f30863a.encode(httpRequest.f30871b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Logging.m76286i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                Logging.m76290d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                Logging.m76290d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new HttpResponse(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m76333k = m76333k(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        HttpResponse httpResponse = new HttpResponse(responseCode, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(m76333k))).getNextRequestWaitMillis());
                        if (m76333k != null) {
                            m76333k.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return httpResponse;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                return new HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e) {
            e = e;
            Logging.m76287e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            Logging.m76287e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Logging.m76287e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new HttpResponse(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Logging.m76287e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new HttpResponse(400, null, 0L);
        }
    }

    /* renamed from: d */
    private static int m76340d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: e */
    private static int m76339e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    /* renamed from: f */
    private static int m76338f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.m76287e("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: g */
    private BatchedLogRequest m76337g(BackendRequest backendRequest) {
        LogEvent.Builder protoBuilder;
        HashMap hashMap = new HashMap();
        for (EventInternal eventInternal : backendRequest.getEvents()) {
            String transportName = eventInternal.getTransportName();
            if (!hashMap.containsKey(transportName)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                hashMap.put(transportName, arrayList);
            } else {
                ((List) hashMap.get(transportName)).add(eventInternal);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.f30868f.getTime()).setRequestUptimeMs(this.f30867e.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal2.getInteger("sdk-version"))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get(KeyConstants.Android.KEY_HARDWARE)).setDevice(eventInternal2.get("device")).setProduct(eventInternal2.get("product")).setOsBuild(eventInternal2.get("os-uild")).setManufacturer(eventInternal2.get(CommonUrlParts.MANUFACTURER)).setFingerprint(eventInternal2.get("fingerprint")).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get(CommonUrlParts.LOCALE)).setMccMnc(eventInternal2.get("mcc_mnc")).setApplicationBuild(eventInternal2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.m76344of("proto"))) {
                    protoBuilder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.m76344of("json"))) {
                    protoBuilder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    Logging.m76285w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                protoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype"))).build());
                if (eventInternal3.getCode() != null) {
                    protoBuilder.setEventCode(eventInternal3.getCode());
                }
                arrayList3.add(protoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return BatchedLogRequest.create(arrayList2);
    }

    /* renamed from: h */
    private static TelephonyManager m76336h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @VisibleForTesting
    /* renamed from: i */
    static long m76335i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: j */
    public static /* synthetic */ HttpRequest m76334j(HttpRequest httpRequest, HttpResponse httpResponse) {
        URL url = httpResponse.f30874b;
        if (url != null) {
            Logging.m76290d("CctTransportBackend", "Following redirect to: %s", url);
            return httpRequest.m76331a(httpResponse.f30874b);
        }
        return null;
    }

    /* renamed from: k */
    private static InputStream m76333k(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: l */
    private static URL m76332l(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public EventInternal decorate(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.f30864b.getActiveNetworkInfo();
        return eventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata(KeyConstants.Android.KEY_HARDWARE, Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata(CommonUrlParts.MANUFACTURER, Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT).addMetadata("tz-offset", m76335i()).addMetadata("net-type", m76339e(activeNetworkInfo)).addMetadata("mobile-subtype", m76340d(activeNetworkInfo)).addMetadata("country", Locale.getDefault().getCountry()).addMetadata(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", m76336h(this.f30865c).getSimOperator()).addMetadata("application_build", Integer.toString(m76338f(this.f30865c))).build();
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public BackendResponse send(BackendRequest backendRequest) {
        BatchedLogRequest m76337g = m76337g(backendRequest);
        URL url = this.f30866d;
        String str = null;
        if (backendRequest.getExtras() != null) {
            try {
                CCTDestination fromByteArray = CCTDestination.fromByteArray(backendRequest.getExtras());
                if (fromByteArray.getAPIKey() != null) {
                    str = fromByteArray.getAPIKey();
                }
                if (fromByteArray.getEndPoint() != null) {
                    url = m76332l(fromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.fatalError();
            }
        }
        try {
            HttpResponse httpResponse = (HttpResponse) Retries.retry(5, new HttpRequest(url, m76337g, str), new Function() { // from class: com.google.android.datatransport.cct.a
                {
                    CctTransportBackend.this = this;
                }

                @Override // com.google.android.datatransport.runtime.retries.Function
                public final Object apply(Object obj) {
                    CctTransportBackend.HttpResponse m76341c;
                    m76341c = CctTransportBackend.this.m76341c((CctTransportBackend.HttpRequest) obj);
                    return m76341c;
                }
            }, new RetryStrategy() { // from class: com.google.android.datatransport.cct.b
                @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
                public final Object shouldRetry(Object obj, Object obj2) {
                    CctTransportBackend.HttpRequest m76334j;
                    m76334j = CctTransportBackend.m76334j((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
                    return m76334j;
                }
            });
            int i = httpResponse.f30873a;
            if (i == 200) {
                return BackendResponse.m76305ok(httpResponse.f30875c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return BackendResponse.invalidPayload();
                }
                return BackendResponse.fatalError();
            }
            return BackendResponse.transientError();
        } catch (IOException e) {
            Logging.m76287e("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.transientError();
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }
}
