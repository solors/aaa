package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GraphRequest.kt */
@Metadata
/* loaded from: classes3.dex */
public final class GraphRequest {
    @NotNull
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    @NotNull
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    @NotNull
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    @NotNull
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    @NotNull
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    @NotNull
    private static final String BATCH_BODY_PARAM = "body";
    @NotNull
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    @NotNull
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    @NotNull
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    @NotNull
    private static final String BATCH_METHOD_PARAM = "method";
    @NotNull
    private static final String BATCH_PARAM = "batch";
    @NotNull
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    @NotNull
    private static final String CAPTION_PARAM = "caption";
    @NotNull
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    @NotNull
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    @NotNull
    private static final String DEBUG_KEY = "__debug__";
    @NotNull
    private static final String DEBUG_MESSAGES_KEY = "messages";
    @NotNull
    private static final String DEBUG_MESSAGE_KEY = "message";
    @NotNull
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    @NotNull
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    @NotNull
    private static final String DEBUG_PARAM = "debug";
    @NotNull
    private static final String DEBUG_SEVERITY_INFO = "info";
    @NotNull
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    @NotNull
    public static final String FIELDS_PARAM = "fields";
    @NotNull
    private static final String FORMAT_JSON = "json";
    @NotNull
    private static final String FORMAT_PARAM = "format";
    @NotNull
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    @NotNull

    /* renamed from: ME */
    private static final String f24499ME = "me";
    @NotNull
    private static final String MIME_BOUNDARY;
    @NotNull
    private static final String MY_FRIENDS = "me/friends";
    @NotNull
    private static final String MY_PHOTOS = "me/photos";
    @NotNull
    private static final String PICTURE_PARAM = "picture";
    @NotNull
    private static final String SDK_ANDROID = "android";
    @NotNull
    private static final String SDK_PARAM = "sdk";
    @NotNull
    private static final String SEARCH = "search";
    @NotNull
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    @NotNull
    private static final String USER_AGENT_HEADER = "User-Agent";
    @NotNull
    private static final String VIDEOS_SUFFIX = "/videos";
    @Nullable
    private static String defaultBatchApplicationId;
    @Nullable
    private static volatile String userAgent;
    private static final Pattern versionPattern;
    @Nullable
    private AccessToken accessToken;
    @Nullable
    private String batchEntryDependsOn;
    @Nullable
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    @Nullable
    private Callback callback;
    private boolean forceApplicationRequest;
    @Nullable
    private JSONObject graphObject;
    @Nullable
    private String graphPath;
    @Nullable
    private HttpMethod httpMethod;
    @Nullable
    private String overriddenURL;
    @NotNull
    private Bundle parameters;
    @Nullable
    private Object tag;
    @Nullable
    private String version;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final String TAG = GraphRequest.class.getSimpleName();

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface Callback {
        void onCompleted(@NotNull GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HttpURLConnection createConnection(URL url) throws IOException {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        private final String getBatchAppId(GraphRequestBatch graphRequestBatch) {
            String batchApplicationId = graphRequestBatch.getBatchApplicationId();
            boolean z = true;
            if (batchApplicationId != null && (!graphRequestBatch.isEmpty())) {
                return batchApplicationId;
            }
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.defaultBatchApplicationId;
            if (str != null) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    return str;
                }
            }
            return FacebookSdk.getApplicationId();
        }

        private final String getDefaultPhotoPathIfNull(String str) {
            if (str == null) {
                return GraphRequest.MY_PHOTOS;
            }
            return str;
        }

        private final String getMimeContentType() {
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                GraphRequest.userAgent = format;
                String customUserAgent = InternalSettings.getCustomUserAgent();
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.userAgent = format2;
                }
            }
            return GraphRequest.userAgent;
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch graphRequestBatch) {
            for (GraphRequestBatch.Callback callback : graphRequestBatch.getCallbacks()) {
                if (callback instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                if (it.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isGzipCompressible(GraphRequestBatch graphRequestBatch) {
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                for (String str : next.getParameters().keySet()) {
                    if (isSupportedAttachmentType(next.getParameters().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean isMeRequest(String str) {
            boolean m16624M;
            boolean m16624M2;
            Matcher matcher = GraphRequest.versionPattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            m16624M = StringsJVM.m16624M(str, "me/", false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(str, "/me/", false, 2, null);
                if (m16624M2) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public final boolean isSupportedAttachmentType(Object obj) {
            if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof ParcelableResourceWithMimeType)) {
                return false;
            }
            return true;
        }

        public final boolean isSupportedParameterType(Object obj) {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
                return false;
            }
            return true;
        }

        /* renamed from: newMeRequest$lambda-0 */
        public static final void m110041newMeRequest$lambda0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONObjectCallback != null) {
                graphJSONObjectCallback.onCompleted(response.getJSONObject(), response);
            }
        }

        /* renamed from: newPlacesSearchRequest$lambda-1 */
        public static final void m110042newPlacesSearchRequest$lambda1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse response) {
            JSONArray optJSONArray;
            Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONArrayCallback != null) {
                JSONObject jSONObject = response.getJSONObject();
                if (jSONObject == null) {
                    optJSONArray = null;
                } else {
                    optJSONArray = jSONObject.optJSONArray("data");
                }
                graphJSONArrayCallback.onCompleted(optJSONArray, response);
            }
        }

        public final String parameterToString(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void processGraphObject(org.json.JSONObject r10, java.lang.String r11, com.facebook.GraphRequest.InterfaceC10841b r12) {
            /*
                r9 = this;
                boolean r0 = r9.isMeRequest(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                int r0 = kotlin.text.C37686h.m16690e0(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = kotlin.text.C37686h.m16690e0(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.C37686h.m16656y(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                r9.processGraphObjectProperty(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.processGraphObject(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$b):void");
        }

        private final void processGraphObjectProperty(String str, Object obj, InterfaceC10841b interfaceC10841b, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C37612s0 c37612s0 = C37612s0.f99333a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(format, opt, interfaceC10841b, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(str, optString, interfaceC10841b, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(str, optString2, interfaceC10841b, z);
                } else if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    processGraphObjectProperty(str, jSONObject2, interfaceC10841b, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        C37612s0 c37612s02 = C37612s0.f99333a;
                        String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                        Object opt2 = jSONArray.opt(i);
                        Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                        processGraphObjectProperty(format2, opt2, interfaceC10841b, z);
                        if (i2 < length) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format3, "iso8601DateFormat.format(date)");
                    interfaceC10841b.writeString(str, format3);
                    return;
                }
                Utility utility = Utility.INSTANCE;
                Utility.logd(GraphRequest.TAG, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
            } else {
                interfaceC10841b.writeString(str, obj.toString());
            }
        }

        private final void processRequest(GraphRequestBatch graphRequestBatch, Logger logger, int i, URL url, OutputStream outputStream, boolean z) {
            C10842c c10842c = new C10842c(outputStream, logger, z);
            boolean z2 = false;
            if (i == 1) {
                GraphRequest graphRequest = graphRequestBatch.get(0);
                Map<String, C10840a> hashMap = new HashMap<>();
                for (String key : graphRequest.getParameters().keySet()) {
                    Object obj = graphRequest.getParameters().get(key);
                    if (isSupportedAttachmentType(obj)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new C10840a(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.append("  Parameters:\n");
                }
                serializeParameters(graphRequest.getParameters(), c10842c, graphRequest);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, c10842c);
                JSONObject graphObject = graphRequest.getGraphObject();
                if (graphObject != null) {
                    String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    processGraphObject(graphObject, path, c10842c);
                    return;
                }
                return;
            }
            String batchAppId = getBatchAppId(graphRequestBatch);
            if (batchAppId.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                c10842c.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
                Map<String, C10840a> hashMap2 = new HashMap<>();
                serializeRequestsAsJSON(c10842c, graphRequestBatch, hashMap2);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap2, c10842c);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        /* renamed from: runCallbacks$lambda-2 */
        public static final void m110043runCallbacks$lambda2(ArrayList callbacks, GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                ((Callback) pair.first).onCompleted((GraphResponse) obj);
            }
            for (GraphRequestBatch.Callback callback : requests.getCallbacks()) {
                callback.onBatchCompleted(requests);
            }
        }

        private final void serializeAttachments(Map<String, C10840a> map, C10842c c10842c) {
            for (Map.Entry<String, C10840a> entry : map.entrySet()) {
                if (GraphRequest.Companion.isSupportedAttachmentType(entry.getValue().m78894b())) {
                    c10842c.m78885i(entry.getKey(), entry.getValue().m78894b(), entry.getValue().m78895a());
                }
            }
        }

        private final void serializeParameters(Bundle bundle, C10842c c10842c, GraphRequest graphRequest) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (isSupportedParameterType(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    c10842c.m78885i(key, obj, graphRequest);
                }
            }
        }

        private final void serializeRequestsAsJSON(C10842c c10842c, Collection<GraphRequest> collection, Map<String, C10840a> map) {
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest graphRequest : collection) {
                graphRequest.serializeToBatch(jSONArray, map);
            }
            c10842c.m78883k(GraphRequest.BATCH_PARAM, jSONArray, collection);
        }

        private final void setConnectionContentType(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", getMimeContentType());
        }

        @NotNull
        public final GraphResponse executeAndWait(@NotNull GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<GraphResponse> executeBatchAndWait = executeBatchAndWait(request);
            if (executeBatchAndWait.size() == 1) {
                return executeBatchAndWait.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... requests) {
            List m17348D0;
            Intrinsics.checkNotNullParameter(requests, "requests");
            m17348D0 = _Arrays.m17348D0(requests);
            return executeBatchAndWait(m17348D0);
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... requests) {
            List m17348D0;
            Intrinsics.checkNotNullParameter(requests, "requests");
            m17348D0 = _Arrays.m17348D0(requests);
            return executeBatchAsync(m17348D0);
        }

        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAndWait(connection, new GraphRequestBatch(requests));
        }

        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        @Nullable
        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (str == null && accessToken != null) {
                str = accessToken.getApplicationId();
            }
            if (str == null) {
                str = Utility.getMetadataApplicationId(context);
            }
            if (str != null) {
                String m17064q = Intrinsics.m17064q(str, "/custom_audience_third_party_id");
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
                Bundle bundle = new Bundle();
                if (accessToken == null) {
                    if (attributionIdentifiers != null) {
                        String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                        if (attributionId != null) {
                            bundle.putString("udid", attributionId);
                        }
                    } else {
                        throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
                    }
                }
                if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited())) {
                    bundle.putString("limit_event_usage", "1");
                }
                return new GraphRequest(accessToken, m17064q, bundle, HttpMethod.GET, callback, null, 32, null);
            }
            throw new FacebookException("Facebook App ID cannot be determined");
        }

        @NotNull
        public final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
            return new GraphRequest(accessToken, str, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
            return new GraphRequest(accessToken, str, null, null, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable final GraphJSONObjectCallback graphJSONObjectCallback) {
            return new GraphRequest(accessToken, "me", null, null, new Callback() { // from class: com.facebook.r
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m110041newMeRequest$lambda0(graphJSONObjectCallback, graphResponse);
                }
            }, null, 32, null);
        }

        @NotNull
        public final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable final GraphJSONArrayCallback graphJSONArrayCallback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(@NotNull GraphResponse response) {
                    JSONArray optJSONArray;
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (graphJSONArrayCallback != null) {
                        JSONObject jSONObject = response.getJSONObject();
                        if (jSONObject == null) {
                            optJSONArray = null;
                        } else {
                            optJSONArray = jSONObject.optJSONArray("data");
                        }
                        graphJSONArrayCallback.onCompleted(optJSONArray, response);
                    }
                }
            }, null, 32, null);
        }

        @NotNull
        public final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int i, int i2, @Nullable String str, @Nullable final GraphJSONArrayCallback graphJSONArrayCallback) {
            if (location == null && Utility.isNullOrEmpty(str)) {
                throw new FacebookException("Either location or searchText must be specified.");
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i2);
            if (location != null) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString("center", format);
                bundle.putInt("distance", i);
            }
            if (!Utility.isNullOrEmpty(str)) {
                bundle.putString(CampaignEx.JSON_KEY_AD_Q, str);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new Callback() { // from class: com.facebook.s
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.Companion.m110042newPlacesSearchRequest$lambda1(graphJSONArrayCallback, graphResponse);
                }
            }, null, 32, null);
        }

        @NotNull
        public final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(jSONObject);
            return graphRequest;
        }

        @NotNull
        public final GraphRequest newPostRequestWithBundle(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable Callback callback) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Bitmap image, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(image, "image");
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", image);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final void runCallbacks$facebook_core_release(@NotNull final GraphRequestBatch requests, @NotNull List<GraphResponse> responses) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    GraphRequest graphRequest = requests.get(i);
                    if (graphRequest.getCallback() != null) {
                        arrayList.add(new Pair(graphRequest.getCallback(), responses.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.Companion.m110043runCallbacks$lambda2(arrayList, requests);
                    }
                };
                Handler callbackHandler = requests.getCallbackHandler();
                if (callbackHandler == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(callbackHandler.post(runnable));
                }
                if (valueOf == null) {
                    runnable.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void serializeToUrlConnection$facebook_core_release(@org.jetbrains.annotations.NotNull com.facebook.GraphRequestBatch r14, @org.jetbrains.annotations.NotNull java.net.HttpURLConnection r15) throws java.io.IOException, org.json.JSONException {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.Companion.serializeToUrlConnection$facebook_core_release(com.facebook.GraphRequestBatch, java.net.HttpURLConnection):void");
        }

        public final void setDefaultBatchApplicationId(@Nullable String str) {
            GraphRequest.defaultBatchApplicationId = str;
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequest... requests) {
            List m17348D0;
            Intrinsics.checkNotNullParameter(requests, "requests");
            m17348D0 = _Arrays.m17348D0(requests);
            return toHttpConnection(m17348D0);
        }

        public final void validateFieldsParamForGetRequests$facebook_core_release(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (HttpMethod.GET == next.getHttpMethod()) {
                    Utility utility = Utility.INSTANCE;
                    if (Utility.isNullOrEmpty(next.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                        Logger.Companion companion = Logger.Companion;
                        LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("GET requests for /");
                        String graphPath = next.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb2.append(graphPath);
                        sb2.append(" should contain an explicit \"fields\" parameter.");
                        companion.log(loggingBehavior, 5, "Request", sb2.toString());
                    }
                }
            }
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(new GraphRequestBatch(requests));
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(new GraphRequestBatch(requests));
        }

        @NotNull
        public final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphResponse> fromHttpConnection$facebook_core_release = GraphResponse.Companion.fromHttpConnection$facebook_core_release(connection, requests);
            Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size == fromHttpConnection$facebook_core_release.size()) {
                runCallbacks$facebook_core_release(requests, fromHttpConnection$facebook_core_release);
                AccessTokenManager.Companion.getInstance().extendAccessTokenIfNeeded();
                return fromHttpConnection$facebook_core_release;
            }
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(fromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        @NotNull
        public final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler handler, @NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(handler);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmpty(requests, "requests");
            return toHttpConnection(new GraphRequestBatch(requests));
        }

        @NotNull
        public final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<GraphResponse> list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = toHttpConnection(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = executeConnectionAndWait(httpURLConnection, requests);
                } else {
                    List<GraphResponse> constructErrorResponses = GraphResponse.Companion.constructErrorResponses(requests.getRequests(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(requests, constructErrorResponses);
                    list = constructErrorResponses;
                }
                Utility.disconnectQuietly(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
        }

        @NotNull
        public final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Validate.notEmptyAndContainsNoNulls(requests, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(requests);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        @NotNull
        public final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch requests) {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    url = new URL(ServerProtocol.getGraphUrlBase());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException {
            Intrinsics.checkNotNullParameter(file, "file");
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", open);
            if (str2 != null) {
                if (str2.length() > 0) {
                    bundle2.putString("caption", str2);
                }
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        @NotNull
        public final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @NotNull
        public final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri photoUri, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException, FacebookException {
            Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            if (Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, str, new File(photoUri.getPath()), str2, bundle, callback);
            }
            if (Utility.isContentUri(photoUri)) {
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                bundle2.putParcelable("picture", photoUri);
                if (str2 != null) {
                    if (str2.length() > 0) {
                        bundle2.putString("caption", str2);
                    }
                }
                return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
            }
            throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
        }

        @VisibleForTesting(otherwise = 2)
        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface GraphJSONArrayCallback {
        void onCompleted(@Nullable JSONArray jSONArray, @Nullable GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface GraphJSONObjectCallback {
        void onCompleted(@Nullable JSONObject jSONObject, @Nullable GraphResponse graphResponse);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface OnProgressCallback extends Callback {
        void onProgress(long j, long j2);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        @Nullable
        private final String mimeType;
        @Nullable
        private final RESOURCE resource;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new GraphRequest.ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i) {
                return new GraphRequest.ParcelableResourceWithMimeType[i];
            }
        };

        /* compiled from: GraphRequest.kt */
        @Metadata
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Nullable
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, @Nullable String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* renamed from: com.facebook.GraphRequest$a */
    /* loaded from: classes3.dex */
    public static final class C10840a {
        @NotNull

        /* renamed from: a */
        private final GraphRequest f24500a;
        @Nullable

        /* renamed from: b */
        private final Object f24501b;

        public C10840a(@NotNull GraphRequest request, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f24500a = request;
            this.f24501b = obj;
        }

        @NotNull
        /* renamed from: a */
        public final GraphRequest m78895a() {
            return this.f24500a;
        }

        @Nullable
        /* renamed from: b */
        public final Object m78894b() {
            return this.f24501b;
        }
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* renamed from: com.facebook.GraphRequest$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10841b {
        void writeString(@NotNull String str, @NotNull String str2);
    }

    /* compiled from: GraphRequest.kt */
    @Metadata
    /* renamed from: com.facebook.GraphRequest$c */
    /* loaded from: classes3.dex */
    public static final class C10842c implements InterfaceC10841b {
        @NotNull

        /* renamed from: a */
        private final OutputStream f24502a;
        @Nullable

        /* renamed from: b */
        private final Logger f24503b;

        /* renamed from: c */
        private boolean f24504c;

        /* renamed from: d */
        private final boolean f24505d;

        public C10842c(@NotNull OutputStream outputStream, @Nullable Logger logger, boolean z) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f24502a = outputStream;
            this.f24503b = logger;
            this.f24504c = true;
            this.f24505d = z;
        }

        /* renamed from: a */
        private final RuntimeException m78893a() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: b */
        public final void m78892b(@NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (!this.f24505d) {
                if (this.f24504c) {
                    OutputStream outputStream = this.f24502a;
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = "--".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f24502a;
                    String str = GraphRequest.MIME_BOUNDARY;
                    if (str != null) {
                        byte[] bytes2 = str.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f24502a;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f24504c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f24502a;
                C37612s0 c37612s0 = C37612s0.f99333a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                Charset charset2 = Charsets.UTF_8;
                if (format2 != null) {
                    byte[] bytes4 = format2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                    outputStream4.write(bytes4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            OutputStream outputStream5 = this.f24502a;
            C37612s0 c37612s02 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format3, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        /* renamed from: c */
        public final void m78891c(@NotNull String key, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            m78889e(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f24502a);
            m78886h("", new Object[0]);
            m78884j();
            Logger logger = this.f24503b;
            if (logger != null) {
                logger.appendKeyValue(Intrinsics.m17064q("    ", key), "<Image>");
            }
        }

        /* renamed from: d */
        public final void m78890d(@NotNull String key, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            m78889e(key, key, "content/unknown");
            this.f24502a.write(bytes);
            m78886h("", new Object[0]);
            m78884j();
            Logger logger = this.f24503b;
            if (logger != null) {
                String m17064q = Intrinsics.m17064q("    ", key);
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                logger.appendKeyValue(m17064q, format);
            }
        }

        /* renamed from: e */
        public final void m78889e(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            if (!this.f24505d) {
                m78892b("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m78892b("; filename=\"%s\"", str2);
                }
                m78886h("", new Object[0]);
                if (str3 != null) {
                    m78886h("%s: %s", "Content-Type", str3);
                }
                m78886h("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f24502a;
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            Charset charset = Charsets.UTF_8;
            if (format != null) {
                byte[] bytes = format.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: f */
        public final void m78888f(@NotNull String key, @NotNull Uri contentUri, @Nullable String str) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            m78889e(key, key, str);
            if (this.f24502a instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.f24502a).addProgress(Utility.getContentSize(contentUri));
                copyAndCloseInputStream = 0;
            } else {
                InputStream openInputStream = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri);
                Utility utility = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(openInputStream, this.f24502a) + 0;
            }
            m78886h("", new Object[0]);
            m78884j();
            Logger logger = this.f24503b;
            if (logger != null) {
                String m17064q = Intrinsics.m17064q("    ", key);
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                logger.appendKeyValue(m17064q, format);
            }
        }

        /* renamed from: g */
        public final void m78887g(@NotNull String key, @NotNull ParcelFileDescriptor descriptor, @Nullable String str) {
            int copyAndCloseInputStream;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            m78889e(key, key, str);
            OutputStream outputStream = this.f24502a;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                copyAndCloseInputStream = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                Utility utility = Utility.INSTANCE;
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(autoCloseInputStream, this.f24502a) + 0;
            }
            m78886h("", new Object[0]);
            m78884j();
            Logger logger = this.f24503b;
            if (logger != null) {
                String m17064q = Intrinsics.m17064q("    ", key);
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                logger.appendKeyValue(m17064q, format);
            }
        }

        /* renamed from: h */
        public final void m78886h(@NotNull String format, @NotNull Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            m78892b(format, Arrays.copyOf(args, args.length));
            if (!this.f24505d) {
                m78892b("\r\n", new Object[0]);
            }
        }

        /* renamed from: i */
        public final void m78885i(@NotNull String key, @Nullable Object obj, @Nullable GraphRequest graphRequest) {
            Intrinsics.checkNotNullParameter(key, "key");
            OutputStream outputStream = this.f24502a;
            if (outputStream instanceof RequestOutputStream) {
                ((RequestOutputStream) outputStream).setCurrentRequest(graphRequest);
            }
            Companion companion = GraphRequest.Companion;
            if (companion.isSupportedParameterType(obj)) {
                writeString(key, companion.parameterToString(obj));
            } else if (obj instanceof Bitmap) {
                m78891c(key, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m78890d(key, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m78888f(key, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m78887g(key, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable resource = parcelableResourceWithMimeType.getResource();
                String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof ParcelFileDescriptor) {
                    m78887g(key, (ParcelFileDescriptor) resource, mimeType);
                } else if (resource instanceof Uri) {
                    m78888f(key, (Uri) resource, mimeType);
                } else {
                    throw m78893a();
                }
            } else {
                throw m78893a();
            }
        }

        /* renamed from: j */
        public final void m78884j() {
            if (!this.f24505d) {
                m78886h("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream = this.f24502a;
            byte[] bytes = C21114v8.C21123i.f54135c.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: k */
        public final void m78883k(@NotNull String key, @NotNull JSONArray requestJsonArray, @NotNull Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            OutputStream outputStream = this.f24502a;
            if (!(outputStream instanceof RequestOutputStream)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                writeString(key, jSONArray);
                return;
            }
            RequestOutputStream requestOutputStream = (RequestOutputStream) outputStream;
            m78889e(key, null, null);
            m78892b(C21114v8.C21123i.f54137d, new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    m78892b(",%s", jSONObject.toString());
                } else {
                    m78892b("%s", jSONObject.toString());
                }
                i = i2;
            }
            m78892b(C21114v8.C21123i.f54139e, new Object[0]);
            Logger logger = this.f24503b;
            if (logger != null) {
                String m17064q = Intrinsics.m17064q("    ", key);
                String jSONArray2 = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
                logger.appendKeyValue(m17064q, jSONArray2);
            }
        }

        @Override // com.facebook.GraphRequest.InterfaceC10841b
        public void writeString(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            m78889e(key, null, null);
            m78886h("%s", value);
            m78884j();
            Logger logger = this.f24503b;
            if (logger != null) {
                logger.appendKeyValue(Intrinsics.m17064q("    ", key), value);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
            MIME_BOUNDARY = sb3;
            versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
        }
        String sb32 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb32, "buffer.toString()");
        MIME_BOUNDARY = sb32;
        versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* renamed from: _set_callback_$lambda-0 */
    public static final void m110040_set_callback_$lambda0(Callback callback, GraphResponse response) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        int length;
        String optString;
        String optString2;
        String optString3;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObject = response.getJSONObject();
        if (jSONObject == null) {
            optJSONObject = null;
        } else {
            optJSONObject = jSONObject.optJSONObject(DEBUG_KEY);
        }
        if (optJSONObject == null) {
            optJSONArray = null;
        } else {
            optJSONArray = optJSONObject.optJSONArray(DEBUG_MESSAGES_KEY);
        }
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 == null) {
                    optString = null;
                } else {
                    optString = optJSONObject2.optString("message");
                }
                if (optJSONObject2 == null) {
                    optString2 = null;
                } else {
                    optString2 = optJSONObject2.optString("type");
                }
                if (optJSONObject2 == null) {
                    optString3 = null;
                } else {
                    optString3 = optJSONObject2.optString("link");
                }
                if (optString != null && optString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.m17075f(optString2, DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Utility.isNullOrEmpty(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    Logger.Companion companion = Logger.Companion;
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion.log(loggingBehavior, TAG2, optString);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        if (callback != null) {
            callback.onCompleted(response);
        }
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token")) {
            Utility utility = Utility.INSTANCE;
            if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
                Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", DEBUG_SEVERITY_INFO);
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", DEBUG_SEVERITY_WARNING);
        }
    }

    private final String appendParametersToBaseUrl(String str, boolean z) {
        if (!z && this.httpMethod == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str2);
            if (obj == null) {
                obj = "";
            }
            Companion companion = Companion;
            if (companion.isSupportedParameterType(obj)) {
                buildUpon.appendQueryParameter(str2, companion.parameterToString(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    @NotNull
    public static final GraphResponse executeAndWait(@NotNull GraphRequest graphRequest) {
        return Companion.executeAndWait(graphRequest);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAndWait(graphRequestBatch);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAsync(graphRequestBatch);
    }

    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@Nullable Handler handler, @NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.Companion.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        boolean z;
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        boolean z2 = true;
        if (applicationId.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (clientToken.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                return applicationId + '|' + clientToken;
            }
        }
        Utility utility = Utility.INSTANCE;
        Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    @Nullable
    public static final String getDefaultBatchApplicationId() {
        return Companion.getDefaultBatchApplicationId();
    }

    private final String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final String getUrlWithGraphPath(String str) {
        if (!isValidGraphRequestForDomain()) {
            str = ServerProtocol.getFacebookGraphUrlBase();
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, getGraphPathWithVersion()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        String str = "^/?" + FacebookSdk.getApplicationId() + "/?.*";
        if (!this.forceApplicationRequest && !Pattern.matches(str, this.graphPath) && !Pattern.matches("^/?app/?.*", this.graphPath)) {
            return false;
        }
        return true;
    }

    private final boolean isValidGraphRequestForDomain() {
        if (!Intrinsics.m17075f(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return true;
        }
        return !isApplicationRequest();
    }

    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    @NotNull
    public static final GraphRequest newDeleteObjectRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return Companion.newDeleteObjectRequest(accessToken, str, callback);
    }

    @NotNull
    public static final GraphRequest newGraphPathRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Callback callback) {
        return Companion.newGraphPathRequest(accessToken, str, callback);
    }

    @NotNull
    public static final GraphRequest newMeRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONObjectCallback graphJSONObjectCallback) {
        return Companion.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    @NotNull
    public static final GraphRequest newMyFriendsRequest(@Nullable AccessToken accessToken, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    @NotNull
    public static final GraphRequest newPlacesSearchRequest(@Nullable AccessToken accessToken, @Nullable Location location, int i, int i2, @Nullable String str, @Nullable GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    @NotNull
    public static final GraphRequest newPostRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable Callback callback) {
        return Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @NotNull
    public static final GraphRequest newPostRequestWithBundle(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable Callback callback) {
        return Companion.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Bitmap bitmap, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    public final void serializeToBatch(JSONArray jSONArray, Map<String, C10840a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.Companion.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str3);
            if (Companion.isSupportedAttachmentType(obj)) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new C10840a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            Companion.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new InterfaceC10841b() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.InterfaceC10841b
                public void writeString(@NotNull String key, @NotNull String value) throws IOException {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ArrayList<String> arrayList3 = arrayList2;
                    C37612s0 c37612s02 = C37612s0.f99333a;
                    String format2 = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    arrayList3.add(format2);
                }
            });
            jSONObject.put("body", TextUtils.join(C21114v8.C21123i.f54135c, arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public static final void setDefaultBatchApplicationId(@Nullable String str) {
        Companion.setDefaultBatchApplicationId(str);
    }

    private final boolean shouldForceClientTokenForRequest() {
        boolean m16592R;
        boolean z;
        boolean m16624M;
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        if (accessTokenToUseForRequest != null) {
            m16592R = C37690r.m16592R(accessTokenToUseForRequest, SignedToken.f2767c, false, 2, null);
        } else {
            m16592R = false;
        }
        if (accessTokenToUseForRequest != null) {
            m16624M = StringsJVM.m16624M(accessTokenToUseForRequest, "IG", false, 2, null);
            if (m16624M && !m16592R) {
                z = true;
                if (!z && isApplicationRequest()) {
                    return true;
                }
                if (!isValidGraphRequestForDomain() || m16592R) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (!z) {
        }
        if (!isValidGraphRequestForDomain()) {
        }
        return false;
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.toHttpConnection(graphRequestBatch);
    }

    @NotNull
    public final GraphRequestAsyncTask executeAsync() {
        return Companion.executeBatchAsync(this);
    }

    @Nullable
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    @Nullable
    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    @Nullable
    public final Callback getCallback() {
        return this.callback;
    }

    @Nullable
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    public final String getGraphPath() {
        return this.graphPath;
    }

    @Nullable
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    @NotNull
    public final Bundle getParameters() {
        return this.parameters;
    }

    @NotNull
    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL == null) {
            String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
            addCommonParameters();
            Uri parse = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    @Nullable
    public final Object getTag() {
        return this.tag;
    }

    @NotNull
    public final String getUrlForSingleRequest() {
        String graphUrlBaseForSubdomain;
        boolean m16616x;
        String str = this.overriddenURL;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.graphPath;
        if (this.httpMethod == HttpMethod.POST && str2 != null) {
            m16616x = StringsJVM.m16616x(str2, VIDEOS_SUFFIX, false, 2, null);
            if (m16616x) {
                graphUrlBaseForSubdomain = ServerProtocol.getGraphVideoUrlBase();
                String urlWithGraphPath = getUrlWithGraphPath(graphUrlBaseForSubdomain);
                addCommonParameters();
                return appendParametersToBaseUrl(urlWithGraphPath, false);
            }
        }
        ServerProtocol serverProtocol = ServerProtocol.INSTANCE;
        graphUrlBaseForSubdomain = ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain());
        String urlWithGraphPath2 = getUrlWithGraphPath(graphUrlBaseForSubdomain);
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath2, false);
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setAccessToken(@Nullable AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final void setBatchEntryDependsOn(@Nullable String str) {
        this.batchEntryDependsOn = str;
    }

    public final void setBatchEntryName(@Nullable String str) {
        this.batchEntryName = str;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z) {
        this.batchEntryOmitResultOnSuccess = z;
    }

    public final void setCallback(@Nullable final Callback callback) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = callback;
        } else {
            this.callback = new Callback() { // from class: com.facebook.p
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    GraphRequest.m110040_set_callback_$lambda0(callback, graphResponse);
                }
            };
        }
    }

    public final void setForceApplicationRequest(boolean z) {
        this.forceApplicationRequest = z;
    }

    public final void setGraphObject(@Nullable JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void setGraphPath(@Nullable String str) {
        this.graphPath = str;
    }

    public final void setHttpMethod(@Nullable HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    public final void setParameters(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final void setTag(@Nullable Object obj) {
        this.tag = obj;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{Request: ");
        sb2.append(" accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.graphPath);
        sb2.append(", graphObject: ");
        sb2.append(this.graphObject);
        sb2.append(", httpMethod: ");
        sb2.append(this.httpMethod);
        sb2.append(", parameters: ");
        sb2.append(this.parameters);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }

    public GraphRequest(@Nullable AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull Collection<GraphRequest> collection) {
        return Companion.executeBatchAndWait(collection);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull Collection<GraphRequest> collection) {
        return Companion.executeBatchAsync(collection);
    }

    @NotNull
    public static final List<GraphResponse> executeConnectionAndWait(@NotNull HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> collection) {
        return Companion.executeConnectionAndWait(httpURLConnection, collection);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeConnectionAsync(@NotNull HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    @NotNull
    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(@Nullable AccessToken accessToken, @NotNull Context context, @Nullable String str, @Nullable Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull Uri uri, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException, FacebookException {
        return Companion.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull Collection<GraphRequest> collection) {
        return Companion.toHttpConnection(collection);
    }

    @NotNull
    public final GraphResponse executeAndWait() {
        return Companion.executeAndWait(this);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    @NotNull
    public static final List<GraphResponse> executeBatchAndWait(@NotNull GraphRequest... graphRequestArr) {
        return Companion.executeBatchAndWait(graphRequestArr);
    }

    @NotNull
    public static final GraphRequestAsyncTask executeBatchAsync(@NotNull GraphRequest... graphRequestArr) {
        return Companion.executeBatchAsync(graphRequestArr);
    }

    @NotNull
    public static final GraphRequest newUploadPhotoRequest(@Nullable AccessToken accessToken, @Nullable String str, @NotNull File file, @Nullable String str2, @Nullable Bundle bundle, @Nullable Callback callback) throws FileNotFoundException {
        return Companion.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    @NotNull
    public static final HttpURLConnection toHttpConnection(@NotNull GraphRequest... graphRequestArr) {
        return Companion.toHttpConnection(graphRequestArr);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    public GraphRequest(@Nullable AccessToken accessToken, @Nullable String str, @Nullable Bundle bundle, @Nullable HttpMethod httpMethod, @Nullable Callback callback, @Nullable String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(@Nullable AccessToken accessToken, @NotNull URL overriddenURL) {
        Intrinsics.checkNotNullParameter(overriddenURL, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = overriddenURL.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }
}
