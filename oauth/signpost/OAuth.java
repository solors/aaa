package oauth.signpost;

import com.google.gdata.util.common.base.PercentEscaper;
import com.ironsource.C21114v8;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import oauth.signpost.http.HttpParameters;

/* loaded from: classes10.dex */
public class OAuth {
    public static final String ENCODING = "UTF-8";
    public static final String FORM_ENCODED = "application/x-www-form-urlencoded";
    public static final String HTTP_AUTHORIZATION_HEADER = "Authorization";
    public static final String OAUTH_CALLBACK = "oauth_callback";
    public static final String OAUTH_CALLBACK_CONFIRMED = "oauth_callback_confirmed";
    public static final String OAUTH_CONSUMER_KEY = "oauth_consumer_key";
    public static final String OAUTH_NONCE = "oauth_nonce";
    public static final String OAUTH_SIGNATURE = "oauth_signature";
    public static final String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";
    public static final String OAUTH_TIMESTAMP = "oauth_timestamp";
    public static final String OAUTH_TOKEN = "oauth_token";
    public static final String OAUTH_TOKEN_SECRET = "oauth_token_secret";
    public static final String OAUTH_VERIFIER = "oauth_verifier";
    public static final String OAUTH_VERSION = "oauth_version";
    public static final String OUT_OF_BAND = "oob";
    public static final String VERSION_1_0 = "1.0";
    private static final PercentEscaper percentEncoder = new PercentEscaper("-._~", false);

    public static String addQueryParameters(String str, String... strArr) {
        String str2 = str.contains("?") ? C21114v8.C21123i.f54135c : "?";
        StringBuilder sb2 = new StringBuilder(str + str2);
        for (int i = 0; i < strArr.length; i += 2) {
            if (i > 0) {
                sb2.append(C21114v8.C21123i.f54135c);
            }
            sb2.append(percentEncode(strArr[i]) + "=" + percentEncode(strArr[i + 1]));
        }
        return sb2.toString();
    }

    public static String addQueryString(String str, String str2) {
        String str3 = "?";
        if (str.contains("?")) {
            str3 = C21114v8.C21123i.f54135c;
        }
        return (str + str3) + str2;
    }

    public static void debugOut(String str, String str2) {
        if (System.getProperty("debug") != null) {
            PrintStream printStream = System.out;
            printStream.println("[SIGNPOST] " + str + ": " + str2);
        }
    }

    public static HttpParameters decodeForm(String str) {
        String[] split;
        String percentDecode;
        String str2;
        HttpParameters httpParameters = new HttpParameters();
        if (isEmpty(str)) {
            return httpParameters;
        }
        for (String str3 : str.split("\\&")) {
            int indexOf = str3.indexOf(61);
            if (indexOf < 0) {
                str2 = percentDecode(str3);
                percentDecode = null;
            } else {
                String percentDecode2 = percentDecode(str3.substring(0, indexOf));
                percentDecode = percentDecode(str3.substring(indexOf + 1));
                str2 = percentDecode2;
            }
            httpParameters.put(str2, percentDecode);
        }
        return httpParameters;
    }

    public static <T extends Map.Entry<String, String>> void formEncode(Collection<T> collection, OutputStream outputStream) throws IOException {
        if (collection != null) {
            boolean z = true;
            for (T t : collection) {
                if (z) {
                    z = false;
                } else {
                    outputStream.write(38);
                }
                outputStream.write(percentEncode(safeToString(t.getKey())).getBytes());
                outputStream.write(61);
                outputStream.write(percentEncode(safeToString(t.getValue())).getBytes());
            }
        }
    }

    public static boolean isEmpty(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static HttpParameters oauthHeaderToParamsMap(String str) {
        HttpParameters httpParameters = new HttpParameters();
        if (str != null && str.startsWith("OAuth ")) {
            for (String str2 : str.substring(6).split(",")) {
                String[] split = str2.split("=");
                httpParameters.put(split[0].trim(), split[1].replace("\"", "").trim());
            }
        }
        return httpParameters;
    }

    public static String percentDecode(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String percentEncode(String str) {
        if (str == null) {
            return "";
        }
        return percentEncoder.escape(str);
    }

    public static String prepareOAuthHeader(String... strArr) {
        boolean z;
        String str;
        StringBuilder sb2 = new StringBuilder("OAuth ");
        for (int i = 0; i < strArr.length; i += 2) {
            if (i > 0) {
                sb2.append(", ");
            }
            if (!strArr[i].startsWith("oauth_") && !strArr[i].startsWith("x_oauth_")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = percentEncode(strArr[i + 1]);
            } else {
                str = strArr[i + 1];
            }
            sb2.append(percentEncode(strArr[i]) + "=\"" + str + "\"");
        }
        return sb2.toString();
    }

    public static final String safeToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String toHeaderElement(String str, String str2) {
        return percentEncode(str) + "=\"" + percentEncode(str2) + "\"";
    }

    public static <T extends Map.Entry<String, String>> Map<String, String> toMap(Collection<T> collection) {
        HashMap hashMap = new HashMap();
        if (collection != null) {
            for (T t : collection) {
                String str = (String) t.getKey();
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, t.getValue());
                }
            }
        }
        return hashMap;
    }

    public static <T extends Map.Entry<String, String>> String formEncode(Collection<T> collection) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        formEncode(collection, byteArrayOutputStream);
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String addQueryParameters(String str, Map<String, String> map) {
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (String str2 : map.keySet()) {
            strArr[i] = str2;
            strArr[i + 1] = map.get(str2);
            i += 2;
        }
        return addQueryParameters(str, strArr);
    }

    public static HttpParameters decodeForm(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb2.append(readLine);
        }
        return decodeForm(sb2.toString());
    }
}
