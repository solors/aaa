package com.zeus.gmc.sdk.mobileads.columbus.gson;

/* loaded from: classes8.dex */
public final class JsonNull extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    public boolean equals(Object obj) {
        if (this != obj && !(obj instanceof JsonNull)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.JsonElement
    public JsonNull deepCopy() {
        return INSTANCE;
    }
}
