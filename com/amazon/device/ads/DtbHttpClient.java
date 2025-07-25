package com.amazon.device.ads;

import androidx.annotation.NonNull;
import com.ironsource.C21114v8;
import com.learnings.purchase.event.EventUploader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DtbHttpClient {
    private String message;
    private int responseCode;
    private String url;
    private boolean secure = true;
    private boolean isQueryParamsEnabled = false;
    private String response = null;
    private HashMap<String, Object> params = new HashMap<>();
    private HashMap<String, Object> headers = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum HTTPMethod {
        POST,
        GET
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DtbHttpClient(String str) {
        this.url = str;
    }

    @NonNull
    private static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine + "\n");
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } catch (IOException e) {
                DtbLog.debug("Error converting stream to string. Ex=" + e);
            }
            try {
                break;
            } catch (IOException unused2) {
                return sb2.toString();
            }
        }
        inputStream.close();
    }

    private HttpURLConnection createDefaultConnection(URL url, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(i);
        return httpURLConnection;
    }

    private void executeRequest(HTTPMethod hTTPMethod, URL url, int i) throws JSONException, IOException {
        InputStream inputStream;
        String paramsAsJsonString;
        String str;
        HttpURLConnection createDefaultConnection = createDefaultConnection(url, i);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : this.headers.keySet()) {
            if (this.headers.get(str2) != null) {
                str = this.headers.get(str2).toString();
            } else {
                str = "";
            }
            createDefaultConnection.setRequestProperty(str2, str);
            sb2.append(str2 + ":" + str + " ");
        }
        DtbLog.debug("with headers:[" + ((Object) sb2) + C21114v8.C21123i.f54139e);
        if (hTTPMethod == HTTPMethod.POST) {
            createDefaultConnection.setDoOutput(true);
            if (!this.params.isEmpty()) {
                if (this.isQueryParamsEnabled) {
                    createDefaultConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");
                    paramsAsJsonString = getQueryParams();
                } else {
                    createDefaultConnection.setRequestProperty("content-type", EventUploader.MEDIA_TYPE_JSON);
                    paramsAsJsonString = getParamsAsJsonString();
                }
                DtbLog.debug("with json params:[" + paramsAsJsonString + C21114v8.C21123i.f54139e);
                OutputStream outputStream = createDefaultConnection.getOutputStream();
                outputStream.write(paramsAsJsonString.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        }
        try {
            try {
                inputStream = createDefaultConnection.getInputStream();
            } catch (Exception e) {
                this.response = null;
                DtbLog.debug("Error while connecting to remote server: " + createDefaultConnection.getURL().toString() + " with error:" + e.getMessage());
            }
            if (inputStream == null) {
                return;
            }
            this.responseCode = createDefaultConnection.getResponseCode();
            this.message = createDefaultConnection.getResponseMessage();
            this.response = convertStreamToString(inputStream);
            inputStream.close();
            DtbLog.debug("Response :" + this.response);
        } finally {
            createDefaultConnection.disconnect();
        }
    }

    private String getParamsAsJsonString() throws JSONException {
        return DtbCommonUtils.getParamsAsJsonString(this.params);
    }

    private String getQueryParams() {
        String str = "";
        if (!this.params.isEmpty()) {
            for (String str2 : this.params.keySet()) {
                if (this.params.get(str2) != null) {
                    String str3 = str2 + "=" + DtbCommonUtils.getURLEncodedString(this.params.get(str2).toString());
                    if (str.length() > 1) {
                        str = str + C21114v8.C21123i.f54135c + str3;
                    } else {
                        str = str + str3;
                    }
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    protected void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    public void enableQueryParams() {
        this.isQueryParamsEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void executeGET(int i) throws JSONException, IOException {
        String str;
        if (this.params.isEmpty()) {
            str = "";
        } else {
            str = "?" + getQueryParams();
        }
        String str2 = this.url;
        String str3 = DtbConstants.HTTPS;
        if (!str2.startsWith(DtbConstants.HTTPS) && !this.url.startsWith("http://")) {
            StringBuilder sb2 = new StringBuilder();
            if (!this.secure) {
                str3 = "http://";
            }
            sb2.append(str3);
            sb2.append(this.url);
            str2 = sb2.toString();
        }
        DtbLog.debug("GET URL:" + str2);
        DtbLog.debug("with params: " + str);
        executeRequest(HTTPMethod.GET, new URL(str2 + str), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void executePOST(int i) throws JSONException, IOException {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.secure) {
            str = DtbConstants.HTTPS;
        } else {
            str = "http://";
        }
        sb2.append(str);
        sb2.append(this.url);
        String sb3 = sb2.toString();
        DtbLog.debug("POST URL:" + sb3);
        executeRequest(HTTPMethod.POST, new URL(sb3), i);
    }

    protected String getErrorMessage() {
        return this.message;
    }

    protected HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    protected HashMap<String, Object> getParams() {
        return this.params;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getResponse() {
        return this.response;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getResponseCode() {
        return this.responseCode;
    }

    protected String getUrl() {
        return this.url;
    }

    public boolean isHttpStatusCodeOK() {
        if (this.responseCode == 200) {
            return true;
        }
        return false;
    }

    protected void setHeaders(HashMap<String, Object> hashMap) {
        this.headers = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setParams(HashMap<String, Object> hashMap) {
        this.params = hashMap;
    }

    protected void setUrl(String str) {
        this.url = str;
    }

    public void setUseSecure(boolean z) {
        this.secure = z;
    }
}
