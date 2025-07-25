package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class JsonObject extends JsonElement {

    /* renamed from: b */
    private final LinkedTreeMap<String, JsonElement> f43896b = new LinkedTreeMap<>();

    public void add(String str, JsonElement jsonElement) {
        LinkedTreeMap<String, JsonElement> linkedTreeMap = this.f43896b;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.f43896b.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof JsonObject) || !((JsonObject) obj).f43896b.equals(this.f43896b))) {
            return false;
        }
        return true;
    }

    public JsonElement get(String str) {
        return this.f43896b.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.f43896b.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.f43896b.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.f43896b.get(str);
    }

    public boolean has(String str) {
        return this.f43896b.containsKey(str);
    }

    public int hashCode() {
        return this.f43896b.hashCode();
    }

    public Set<String> keySet() {
        return this.f43896b.keySet();
    }

    public JsonElement remove(String str) {
        return this.f43896b.remove(str);
    }

    public int size() {
        return this.f43896b.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : this.f43896b.entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue().deepCopy());
        }
        return jsonObject;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch) {
        add(str, ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
    }
}
