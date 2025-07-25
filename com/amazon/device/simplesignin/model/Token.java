package com.amazon.device.simplesignin.model;

/* loaded from: classes2.dex */
public class Token {
    private String schema;
    private String token;

    protected boolean canEqual(Object obj) {
        return obj instanceof Token;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        if (!token.canEqual(this)) {
            return false;
        }
        String token2 = getToken();
        String token3 = token.getToken();
        if (token2 != null ? !token2.equals(token3) : token3 != null) {
            return false;
        }
        String schema = getSchema();
        String schema2 = token.getSchema();
        if (schema != null ? schema.equals(schema2) : schema2 == null) {
            return true;
        }
        return false;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode;
        String token = getToken();
        int i = 43;
        if (token == null) {
            hashCode = 43;
        } else {
            hashCode = token.hashCode();
        }
        String schema = getSchema();
        int i2 = (hashCode + 59) * 59;
        if (schema != null) {
            i = schema.hashCode();
        }
        return i2 + i;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
