package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.gson.Gson;
import com.zeus.gmc.sdk.mobileads.columbus.gson.GsonBuilder;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonDeserializer;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonSerializer;
import com.zeus.gmc.sdk.mobileads.columbus.gson.TypeAdapter;
import com.zeus.gmc.sdk.mobileads.columbus.gson.TypeAdapterFactory;
import com.zeus.gmc.sdk.mobileads.columbus.gson.reflect.TypeToken;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonReader;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonToken;
import com.zeus.gmc.sdk.mobileads.columbus.gson.stream.JsonWriter;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.C32563c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.C32567cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IGsonEntity;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciii2coi2 */
/* loaded from: classes8.dex */
public final class C32459ciii2coi2 {
    private static final Map<Class, JsonSerializer> c2oc2i = Collections.synchronizedMap(new HashMap());
    private static final Map<Class, JsonDeserializer> cioccoiococ = Collections.synchronizedMap(new HashMap());
    private static final String coi222o222 = "GSON_CONTENT_VERSION";
    private static final String coo2iico = "GSU";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciii2coi2$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32460coo2iico implements TypeAdapterFactory {
        private final String coo2iico;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciii2coi2$coo2iico$coo2iico */
        /* loaded from: classes8.dex */
        class C32461coo2iico<T> extends TypeAdapter<T> {
            final /* synthetic */ TypeToken coi222o222;
            final /* synthetic */ TypeAdapter coo2iico;

            C32461coo2iico(TypeAdapter typeAdapter, TypeToken typeToken) {
                this.coo2iico = typeAdapter;
                this.coi222o222 = typeToken;
            }

            @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                Class<? super T> rawType = this.coi222o222.getRawType();
                if (C32459ciii2coi2.cioccoiococ.containsKey(rawType)) {
                    String coi222o222 = C32459ciii2coi2.coi222o222(C32460coo2iico.this.coo2iico);
                    MLog.m25887i(coi222o222, "TAF: skip " + rawType + " which has customized DESERIALIZER");
                    return (T) this.coo2iico.read(jsonReader);
                } else if (!String.class.isAssignableFrom(rawType) && !rawType.isEnum()) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        jsonReader.skipValue();
                        String coi222o2222 = C32459ciii2coi2.coi222o222(C32460coo2iico.this.coo2iico);
                        MLog.m25883w(coi222o2222, "TAF: skip string value for type : " + rawType);
                        return null;
                    }
                    return (T) this.coo2iico.read(jsonReader);
                } else {
                    return (T) this.coo2iico.read(jsonReader);
                }
            }

            @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t) throws IOException {
                this.coo2iico.write(jsonWriter, t);
            }
        }

        public C32460coo2iico(String str) {
            this.coo2iico = str;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return new C32461coo2iico(gson.getDelegateAdapter(this, typeToken), typeToken);
        }
    }

    static {
        C32567cioccoiococ.coo2iico();
        C32563c2oc2i.coo2iico();
    }

    private C32459ciii2coi2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String coi222o222(String str) {
        return str + "-" + coo2iico;
    }

    public static void coo2iico(Class cls, JsonSerializer jsonSerializer) {
        c2oc2i.put(cls, jsonSerializer);
    }

    public static void coo2iico(Class cls, JsonDeserializer jsonDeserializer) {
        cioccoiococ.put(cls, jsonDeserializer);
    }

    public static <T extends IGsonEntity> T coo2iico(Class<T> cls, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) coo2iico(cls, str2).fromJson(str, (Class<Object>) cls);
        } catch (Exception e) {
            String coi222o2222 = coi222o222(str2);
            MLog.m25889e(coi222o2222, "exception json string : " + str);
            MLog.m25888e(coi222o222(str2), "deserialize exception : ", e);
            return null;
        }
    }

    public static <T extends IGsonEntity> List<T> coo2iico(String str, Type type) {
        if (!TextUtils.isEmpty(str) && str.startsWith(C21114v8.C21123i.f54137d) && str.endsWith(C21114v8.C21123i.f54139e)) {
            try {
                return (List) new Gson().fromJson(str, type);
            } catch (Error e) {
                MLog.m25888e(coo2iico, "error json array string : " + str, e);
                return Collections.emptyList();
            } catch (Exception e2) {
                MLog.m25888e(coo2iico, "exception json array string : " + str, e2);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    public static <T extends IGsonEntity> T[] coo2iico(Class<T> cls, T[] tArr, String str, String str2) {
        if (!TextUtils.isEmpty(str) && cls != null && tArr != null) {
            try {
                return (T[]) ((IGsonEntity[]) coo2iico(cls, str2).fromJson(str, (Class<Object>) tArr.getClass()));
            } catch (Exception e) {
                String coi222o2222 = coi222o222(str2);
                MLog.m25888e(coi222o2222, "exception json array string : " + str, e);
            }
        }
        return null;
    }

    public static String coo2iico(IGsonEntity iGsonEntity, String str) {
        if (iGsonEntity == null) {
            return null;
        }
        try {
            return coo2iico((Class<? extends IGsonEntity>) iGsonEntity.getClass(), str).toJson(iGsonEntity);
        } catch (Exception e) {
            String coi222o2222 = coi222o222(str);
            MLog.m25888e(coi222o2222, "serialize exception, class: " + iGsonEntity.getClass().getCanonicalName(), e);
            return null;
        }
    }

    private static Gson coo2iico(Class<? extends IGsonEntity> cls, String str) {
        GsonBuilder excludeFieldsWithoutExposeAnnotation = new GsonBuilder().excludeFieldsWithoutExposeAnnotation();
        for (Map.Entry<Class, JsonSerializer> entry : c2oc2i.entrySet()) {
            excludeFieldsWithoutExposeAnnotation.registerTypeAdapter(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class, JsonDeserializer> entry2 : cioccoiococ.entrySet()) {
            excludeFieldsWithoutExposeAnnotation.registerTypeAdapter(entry2.getKey(), entry2.getValue());
        }
        try {
            excludeFieldsWithoutExposeAnnotation.setVersion(coo2iico(cls)).registerTypeAdapterFactory(new C32460coo2iico(str));
            return excludeFieldsWithoutExposeAnnotation.create();
        } catch (IllegalAccessException e) {
            String coi222o2222 = coi222o222(str);
            MLog.m25888e(coi222o2222, "illegal access GSON_CONTENT_VERSION in " + cls.getCanonicalName(), e);
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e2) {
            String coi222o2223 = coi222o222(str);
            MLog.m25888e(coi222o2223, "no GSON_CONTENT_VERSION in " + cls.getCanonicalName(), e2);
            throw new RuntimeException(e2);
        }
    }

    private static <T extends IGsonEntity> double coo2iico(Class<T> cls) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = cls.getDeclaredField(coi222o222);
        declaredField.setAccessible(true);
        return declaredField.getDouble(null);
    }
}
