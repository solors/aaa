package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {

    /* renamed from: a */
    private final String f43560a;

    /* renamed from: b */
    private final int f43561b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.f43560a = str;
        this.f43561b = i;
    }

    /* renamed from: a */
    private String m66315a() {
        return asString().trim();
    }

    /* renamed from: b */
    private void m66314b() {
        if (this.f43560a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.f43561b == 0) {
            return false;
        }
        String m66315a = m66315a();
        if (ConfigGetParameterHandler.f43503e.matcher(m66315a).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.f43504f.matcher(m66315a).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m66315a, "boolean"));
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        if (this.f43561b == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
        }
        return this.f43560a.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.f43561b == 0) {
            return 0.0d;
        }
        String m66315a = m66315a();
        try {
            return Double.valueOf(m66315a).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m66315a, "double"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.f43561b == 0) {
            return 0L;
        }
        String m66315a = m66315a();
        try {
            return Long.valueOf(m66315a).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", m66315a, "long"), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.f43561b == 0) {
            return "";
        }
        m66314b();
        return this.f43560a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.f43561b;
    }
}
