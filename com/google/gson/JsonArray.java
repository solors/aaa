package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: b */
    private final List<JsonElement> f43895b;

    public JsonArray() {
        this.f43895b = new ArrayList();
    }

    public void add(Boolean bool) {
        this.f43895b.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addAll(JsonArray jsonArray) {
        this.f43895b.addAll(jsonArray.f43895b);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.f43895b.contains(jsonElement);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof JsonArray) || !((JsonArray) obj).f43895b.equals(this.f43895b))) {
            return false;
        }
        return true;
    }

    public JsonElement get(int i) {
        return this.f43895b.get(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsBigDecimal();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsBigInteger();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsBoolean();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsByte();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsCharacter();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsDouble();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsFloat();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsInt();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsLong();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsNumber();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsShort();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        if (this.f43895b.size() == 1) {
            return this.f43895b.get(0).getAsString();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f43895b.hashCode();
    }

    public boolean isEmpty() {
        return this.f43895b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f43895b.iterator();
    }

    public boolean remove(JsonElement jsonElement) {
        return this.f43895b.remove(jsonElement);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        return this.f43895b.set(i, jsonElement);
    }

    public int size() {
        return this.f43895b.size();
    }

    public void add(Character ch) {
        this.f43895b.add(ch == null ? JsonNull.INSTANCE : new JsonPrimitive(ch));
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        if (!this.f43895b.isEmpty()) {
            JsonArray jsonArray = new JsonArray(this.f43895b.size());
            for (JsonElement jsonElement : this.f43895b) {
                jsonArray.add(jsonElement.deepCopy());
            }
            return jsonArray;
        }
        return new JsonArray();
    }

    public JsonElement remove(int i) {
        return this.f43895b.remove(i);
    }

    public JsonArray(int i) {
        this.f43895b = new ArrayList(i);
    }

    public void add(Number number) {
        this.f43895b.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String str) {
        this.f43895b.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.f43895b.add(jsonElement);
    }
}
