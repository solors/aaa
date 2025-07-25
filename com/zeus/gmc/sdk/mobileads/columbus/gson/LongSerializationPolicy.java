package com.zeus.gmc.sdk.mobileads.columbus.gson;

/* loaded from: classes8.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.LongSerializationPolicy.1
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return new JsonPrimitive((Number) l);
        }
    },
    STRING { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.LongSerializationPolicy.2
        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return new JsonPrimitive(String.valueOf(l));
        }
    };

    public abstract JsonElement serialize(Long l);
}
