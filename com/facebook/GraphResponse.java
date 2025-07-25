package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.android.material.timepicker.TimeModel;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse.kt */
@Metadata
/* loaded from: classes3.dex */
public final class GraphResponse {
    @NotNull
    private static final String BODY_KEY = "body";
    @NotNull
    private static final String CODE_KEY = "code";
    @NotNull
    public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
    @NotNull
    private static final String RESPONSE_LOG_TAG = "Response";
    @NotNull
    public static final String SUCCESS_KEY = "success";
    @Nullable
    private final HttpURLConnection connection;
    @Nullable
    private final FacebookRequestError error;
    @Nullable
    private final JSONObject graphObject;
    @Nullable
    private final JSONArray graphObjectArray;
    @Nullable
    private final JSONArray jsonArray;
    @Nullable
    private final JSONObject jsonObject;
    @Nullable
    private final String rawResponse;
    @NotNull
    private final GraphRequest request;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static final String TAG = GraphResponse.class.getCanonicalName();

    /* compiled from: GraphResponse.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final GraphResponse createResponseFromObject(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object NULL, Object obj) throws JSONException {
            Boolean bool = null;
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                FacebookRequestError checkResponseAndCreateError = FacebookRequestError.Companion.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
                if (checkResponseAndCreateError != null) {
                    Log.e(GraphResponse.TAG, checkResponseAndCreateError.toString());
                    if (checkResponseAndCreateError.getErrorCode() == 190) {
                        Utility utility = Utility.INSTANCE;
                        if (Utility.isCurrentAccessToken(graphRequest.getAccessToken())) {
                            if (checkResponseAndCreateError.getSubErrorCode() != 493) {
                                AccessToken.Companion.setCurrentAccessToken(null);
                            } else {
                                AccessToken.Companion companion = AccessToken.Companion;
                                AccessToken currentAccessToken = companion.getCurrentAccessToken();
                                if (currentAccessToken != null) {
                                    bool = Boolean.valueOf(currentAccessToken.isExpired());
                                }
                                if (Intrinsics.m17075f(bool, Boolean.FALSE)) {
                                    companion.expireCurrentAccessToken();
                                }
                            }
                        }
                    }
                    return new GraphResponse(graphRequest, httpURLConnection, checkResponseAndCreateError);
                }
                Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(jSONObject, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                if (stringPropertyAsJSON instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                } else if (stringPropertyAsJSON instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                } else {
                    NULL = JSONObject.NULL;
                    Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
                }
            }
            if (NULL == JSONObject.NULL) {
                return new GraphResponse(graphRequest, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new FacebookException(Intrinsics.m17064q("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.util.List<com.facebook.GraphResponse> createResponsesFromObject(java.net.HttpURLConnection r9, java.util.List<com.facebook.GraphRequest> r10, java.lang.Object r11) throws com.facebook.FacebookException, org.json.JSONException {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L51
                java.lang.Object r2 = r10.get(r3)
                com.facebook.GraphRequest r2 = (com.facebook.GraphRequest) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L43
                goto L52
            L34:
                r4 = move-exception
                com.facebook.GraphResponse r5 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
                goto L51
            L43:
                r4 = move-exception
                com.facebook.GraphResponse r5 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
            L51:
                r5 = r11
            L52:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto La4
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto La4
                int r0 = r2.length()
                if (r0 <= 0) goto La3
            L65:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                com.facebook.GraphRequest r4 = (com.facebook.GraphRequest) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                java.lang.Object r3 = r6.get(r3)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                com.facebook.GraphResponse r3 = r8.createResponseFromObject(r4, r9, r3, r11)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                r1.add(r3)     // Catch: com.facebook.FacebookException -> L81 org.json.JSONException -> L90
                goto L9e
            L81:
                r3 = move-exception
                com.facebook.GraphResponse r6 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
                goto L9e
            L90:
                r3 = move-exception
                com.facebook.GraphResponse r6 = new com.facebook.GraphResponse
                com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                r1.add(r6)
            L9e:
                if (r2 < r0) goto La1
                goto La3
            La1:
                r3 = r2
                goto L65
            La3:
                return r1
            La4:
                com.facebook.FacebookException r9 = new com.facebook.FacebookException
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphResponse.Companion.createResponsesFromObject(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        @NotNull
        public final List<GraphResponse> constructErrorResponses(@NotNull List<GraphRequest> requests, @Nullable HttpURLConnection httpURLConnection, @Nullable FacebookException facebookException) {
            int m17154x;
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<GraphRequest> list = requests;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (GraphRequest graphRequest : list) {
                arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        @NotNull
        public final List<GraphResponse> createResponsesFromStream$facebook_core_release(@Nullable InputStream inputStream, @Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch requests) throws FacebookException, JSONException, IOException {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String readStreamToString = Utility.readStreamToString(inputStream);
            Logger.Companion.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, GraphResponse.RESPONSE_LOG_TAG, "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(readStreamToString.length()), readStreamToString);
            return createResponsesFromString$facebook_core_release(readStreamToString, httpURLConnection, requests);
        }

        @NotNull
        public final List<GraphResponse> createResponsesFromString$facebook_core_release(@NotNull String responseString, @Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequestBatch requests) throws FacebookException, JSONException, IOException {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List<GraphResponse> createResponsesFromObject = createResponsesFromObject(httpURLConnection, requests, resultObject);
            Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), createResponsesFromObject);
            return createResponsesFromObject;
        }

        @NotNull
        public final List<GraphResponse> fromHttpConnection$facebook_core_release(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            List<GraphResponse> constructErrorResponses;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (FacebookException e) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e);
                    constructErrorResponses = constructErrorResponses(requests, connection, e);
                } catch (Exception e2) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e2);
                    constructErrorResponses = constructErrorResponses(requests, connection, new FacebookException(e2));
                }
                if (FacebookSdk.isFullyInitialized()) {
                    if (connection.getResponseCode() >= 400) {
                        inputStream = connection.getErrorStream();
                    } else {
                        inputStream = connection.getInputStream();
                    }
                    constructErrorResponses = createResponsesFromStream$facebook_core_release(inputStream, connection, requests);
                    return constructErrorResponses;
                }
                Log.e(GraphResponse.TAG, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } finally {
                Utility.closeQuietly(null);
            }
        }
    }

    /* compiled from: GraphResponse.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public enum PagingDirection {
        NEXT,
        PREVIOUS;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PagingDirection[] valuesCustom() {
            PagingDirection[] valuesCustom = values();
            return (PagingDirection[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable FacebookRequestError facebookRequestError) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    @NotNull
    public static final List<GraphResponse> constructErrorResponses(@NotNull List<GraphRequest> list, @Nullable HttpURLConnection httpURLConnection, @Nullable FacebookException facebookException) {
        return Companion.constructErrorResponses(list, httpURLConnection, facebookException);
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Nullable
    public final FacebookRequestError getError() {
        return this.error;
    }

    @Nullable
    public final JSONArray getJSONArray() {
        return this.graphObjectArray;
    }

    @Nullable
    public final JSONObject getJSONObject() {
        return this.graphObject;
    }

    @Nullable
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    @Nullable
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Nullable
    public final String getRawResponse() {
        return this.rawResponse;
    }

    @NotNull
    public final GraphRequest getRequest() {
        return this.request;
    }

    @Nullable
    public final GraphRequest getRequestForPagedResults(@NotNull PagingDirection direction) {
        String str;
        JSONObject optJSONObject;
        Intrinsics.checkNotNullParameter(direction, "direction");
        JSONObject jSONObject = this.graphObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("paging")) != null) {
            if (direction == PagingDirection.NEXT) {
                str = optJSONObject.optString("next");
            } else {
                str = optJSONObject.optString("previous");
            }
        } else {
            str = null;
        }
        if (Utility.isNullOrEmpty(str)) {
            return null;
        }
        if (str != null && Intrinsics.m17075f(str, this.request.getUrlForSingleRequest())) {
            return null;
        }
        try {
            return new GraphRequest(this.request.getAccessToken(), new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        String str;
        int responseCode;
        try {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(responseCode);
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @Nullable JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull String rawResponse, @NotNull JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(@NotNull GraphRequest request, @Nullable HttpURLConnection httpURLConnection, @NotNull FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
