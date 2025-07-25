package com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2;

import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonDeserializationContext;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonDeserializer;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonElement;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonParseException;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonPrimitive;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonSerializationContext;
import com.zeus.gmc.sdk.mobileads.columbus.gson.JsonSerializer;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.reflect.Type;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.c2oc2i */
/* loaded from: classes8.dex */
public class C32563c2oc2i {
    public int coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.c2oc2i$coi222o222 */
    /* loaded from: classes8.dex */
    public static class C32564coi222o222 implements JsonSerializer<C32563c2oc2i> {
        private static final String coo2iico = "IntHolderSerializer";

        C32564coi222o222() {
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.JsonSerializer
        /* renamed from: coo2iico */
        public JsonElement serialize(C32563c2oc2i c32563c2oc2i, Type type, JsonSerializationContext jsonSerializationContext) {
            MLog.m25887i(coo2iico, "IntHolder serialize: " + c32563c2oc2i.coo2iico);
            return new JsonPrimitive((Number) Integer.valueOf(c32563c2oc2i.coo2iico));
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.c2oc2i$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32565coo2iico implements JsonDeserializer<C32563c2oc2i> {
        private static final String coo2iico = "IntHolderDeserializer";

        C32565coo2iico() {
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.JsonDeserializer
        /* renamed from: coo2iico */
        public C32563c2oc2i deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            C32563c2oc2i c32563c2oc2i = new C32563c2oc2i();
            try {
                if (jsonElement.isJsonPrimitive()) {
                    c32563c2oc2i.coo2iico = jsonElement.getAsInt();
                    MLog.m25887i(coo2iico, "IntHolder JsonPrimitive: " + c32563c2oc2i.coo2iico);
                }
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "IntHolder deserialize exception", e);
            }
            return c32563c2oc2i;
        }
    }

    public static void coo2iico() {
        C32459ciii2coi2.coo2iico(C32563c2oc2i.class, new C32564coi222o222());
        C32459ciii2coi2.coo2iico(C32563c2oc2i.class, new C32565coo2iico());
    }
}
