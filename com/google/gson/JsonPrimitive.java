package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class JsonPrimitive extends JsonElement {

    /* renamed from: b */
    private final Object f43897b;

    public JsonPrimitive(Boolean bool) {
        this.f43897b = C$Gson$Preconditions.checkNotNull(bool);
    }

    /* renamed from: a */
    private static boolean m66248a(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f43897b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f43897b == null) {
            if (jsonPrimitive.f43897b == null) {
                return true;
            }
            return false;
        } else if (m66248a(this) && m66248a(jsonPrimitive)) {
            if (getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.f43897b;
            if ((obj2 instanceof Number) && (jsonPrimitive.f43897b instanceof Number)) {
                double doubleValue = getAsNumber().doubleValue();
                double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
                if (doubleValue == doubleValue2) {
                    return true;
                }
                if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                    return true;
                }
                return false;
            }
            return obj2.equals(jsonPrimitive.f43897b);
        }
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.f43897b;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return new BigDecimal(this.f43897b.toString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.f43897b;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return new BigInteger(this.f43897b.toString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        if (isBoolean()) {
            return ((Boolean) this.f43897b).booleanValue();
        }
        return Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        if (isNumber()) {
            return getAsNumber().byteValue();
        }
        return Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public char getAsCharacter() {
        return getAsString().charAt(0);
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        if (isNumber()) {
            return getAsNumber().doubleValue();
        }
        return Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        if (isNumber()) {
            return getAsNumber().floatValue();
        }
        return Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        if (isNumber()) {
            return getAsNumber().intValue();
        }
        return Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        if (isNumber()) {
            return getAsNumber().longValue();
        }
        return Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.f43897b;
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        return (Number) obj;
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        if (isNumber()) {
            return getAsNumber().shortValue();
        }
        return Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) this.f43897b).toString();
        }
        return (String) this.f43897b;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f43897b == null) {
            return 31;
        }
        if (m66248a(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else {
            Object obj = this.f43897b;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean isBoolean() {
        return this.f43897b instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f43897b instanceof Number;
    }

    public boolean isString() {
        return this.f43897b instanceof String;
    }

    public JsonPrimitive(Number number) {
        this.f43897b = C$Gson$Preconditions.checkNotNull(number);
    }

    public JsonPrimitive(String str) {
        this.f43897b = C$Gson$Preconditions.checkNotNull(str);
    }

    public JsonPrimitive(Character ch) {
        this.f43897b = ((Character) C$Gson$Preconditions.checkNotNull(ch)).toString();
    }
}
