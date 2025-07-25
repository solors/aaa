package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.p016pm.PackageInfoCompat;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.ironsource.C20517nb;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h */
    private static final Pattern f43495h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Context f43496a;

    /* renamed from: b */
    private final String f43497b;

    /* renamed from: c */
    private final String f43498c;

    /* renamed from: d */
    private final String f43499d;

    /* renamed from: e */
    private final String f43500e;

    /* renamed from: f */
    private final long f43501f;

    /* renamed from: g */
    private final long f43502g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f43496a = context;
        this.f43497b = str;
        this.f43498c = str2;
        this.f43499d = m66380f(str);
        this.f43500e = str3;
        this.f43501f = j;
        this.f43502g = j2;
    }

    /* renamed from: a */
    private boolean m66385a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: b */
    private String m66384b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: c */
    private JSONObject m66383c(String str, String str2, Map<String, String> map, Long l) throws FirebaseRemoteConfigClientException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
            hashMap.put("appId", this.f43497b);
            Locale locale = this.f43496a.getResources().getConfiguration().locale;
            hashMap.put(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, locale.toLanguageTag());
            hashMap.put(RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, Integer.toString(i));
            hashMap.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f43496a.getPackageManager().getPackageInfo(this.f43496a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put(RemoteConfigConstants.RequestFieldKey.APP_BUILD, Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f43496a.getPackageName());
            hashMap.put("sdkVersion", BuildConfig.VERSION_NAME);
            hashMap.put(RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new JSONObject(map));
            if (l != null) {
                hashMap.put(RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, m66384b(l.longValue()));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    /* renamed from: e */
    private static ConfigContainer m66381e(JSONObject jSONObject, Date date) throws FirebaseRemoteConfigClientException {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        String str;
        try {
            ConfigContainer.Builder withFetchTime = ConfigContainer.newBuilder().withFetchTime(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.ENTRIES);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                withFetchTime = withFetchTime.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                withFetchTime = withFetchTime.withAbtExperiments(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                withFetchTime = withFetchTime.withPersonalizationMetadata(jSONObject3);
            }
            if (jSONObject.has(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER)) {
                str = jSONObject.getString(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);
            } else {
                str = null;
            }
            if (str != null) {
                withFetchTime.withTemplateVersionNumber(Long.parseLong(str));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                withFetchTime = withFetchTime.withRolloutMetadata(jSONArray2);
            }
            return withFetchTime.build();
        } catch (JSONException e) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    /* renamed from: f */
    private static String m66380f(String str) {
        Matcher matcher = f43495h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: g */
    private JSONObject m66379g(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), C20517nb.f52167N));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    /* renamed from: h */
    private String m66378h(String str, String str2) {
        return String.format(RemoteConfigConstants.FETCH_REGEX_URL, str, str2);
    }

    /* renamed from: i */
    private String m66377i() {
        try {
            Context context = this.f43496a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e(FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.f43496a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(FirebaseRemoteConfig.TAG, "No such package: " + this.f43496a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: j */
    private void m66376j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f43498c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f43496a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m66377i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: k */
    private void m66375k(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: l */
    private void m66374l(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: m */
    private void m66373m(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f43501f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f43502g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        m66376j(httpURLConnection, str2);
        m66375k(httpURLConnection, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public HttpURLConnection m66382d() throws FirebaseRemoteConfigException {
        try {
            return (HttpURLConnection) new URL(m66378h(this.f43499d, this.f43500e)).openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public ConfigFetchHandler.FetchResponse fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws FirebaseRemoteConfigException {
        m66373m(httpURLConnection, str3, str2, map2);
        try {
            try {
                m66374l(httpURLConnection, m66383c(str, str2, map, l).toString().getBytes(C20517nb.f52167N));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject m66379g = m66379g(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    ConfigContainer m66381e = m66381e(m66379g, date);
                    if (!m66385a(m66379g)) {
                        return ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, m66381e);
                    }
                    return ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(m66381e, headerField);
                }
                throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e) {
                throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }

    @VisibleForTesting
    public long getConnectTimeoutInSeconds() {
        return this.f43501f;
    }

    @VisibleForTesting
    public long getReadTimeoutInSeconds() {
        return this.f43502g;
    }
}
