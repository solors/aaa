package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38513v;

/* compiled from: CameraEffectJSONUtility.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CameraEffectJSONUtility {
    @NotNull
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();
    @NotNull
    private static final HashMap<Class<?>, InterfaceC13552a> SETTERS;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CameraEffectJSONUtility.kt */
    @Metadata
    /* renamed from: com.facebook.share.internal.CameraEffectJSONUtility$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC13552a {
        void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String str, @Nullable Object obj) throws JSONException;

        void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException;
    }

    static {
        HashMap<Class<?>, InterfaceC13552a> m17282l;
        m17282l = C37559r0.m17282l(C38513v.m14532a(String.class, new InterfaceC13552a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(key, "key");
                if (obj != null) {
                    builder.putArgument(key, (String) obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(key, "key");
                json.put(key, obj);
            }
        }), C38513v.m14532a(String[].class, new InterfaceC13552a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(key, "key");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(key, "key");
                JSONArray jSONArray = new JSONArray();
                if (obj != null) {
                    String[] strArr = (String[]) obj;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str = strArr[i];
                        i++;
                        jSONArray.put(str);
                    }
                    json.put(key, jSONArray);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
        }), C38513v.m14532a(JSONArray.class, new InterfaceC13552a() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(builder, "builder");
                Intrinsics.checkNotNullParameter(key, "key");
                if (obj != null) {
                    JSONArray jSONArray = (JSONArray) obj;
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            Object obj2 = jSONArray.get(i);
                            if (obj2 instanceof String) {
                                arrayList.add(obj2);
                                if (i2 >= length) {
                                    break;
                                }
                                i = i2;
                            } else {
                                throw new IllegalArgumentException(Intrinsics.m17064q("Unexpected type in an array: ", obj2.getClass()));
                            }
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        builder.putArgument(key, (String[]) array);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }

            @Override // com.facebook.share.internal.CameraEffectJSONUtility.InterfaceC13552a
            public void setOnJSON(@NotNull JSONObject json, @NotNull String key, @Nullable Object obj) throws JSONException {
                Intrinsics.checkNotNullParameter(json, "json");
                Intrinsics.checkNotNullParameter(key, "key");
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        }));
        SETTERS = m17282l;
    }

    private CameraEffectJSONUtility() {
    }

    @Nullable
    public static final CameraEffectArguments convertToCameraEffectArguments(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj != JSONObject.NULL) {
                InterfaceC13552a interfaceC13552a = SETTERS.get(obj.getClass());
                if (interfaceC13552a != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    interfaceC13552a.setOnArgumentsBuilder(builder, key, obj);
                } else {
                    throw new IllegalArgumentException(Intrinsics.m17064q("Unsupported type: ", obj.getClass()));
                }
            }
        }
        return builder.build();
    }

    @Nullable
    public static final JSONObject convertToJSON(@Nullable CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(str);
            if (obj != null) {
                InterfaceC13552a interfaceC13552a = SETTERS.get(obj.getClass());
                if (interfaceC13552a != null) {
                    interfaceC13552a.setOnJSON(jSONObject, str, obj);
                } else {
                    throw new IllegalArgumentException(Intrinsics.m17064q("Unsupported type: ", obj.getClass()));
                }
            }
        }
        return jSONObject;
    }
}
