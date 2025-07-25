package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.smaato.sdk.core.network.d */
/* loaded from: classes7.dex */
final class AutoValue_MimeType extends MimeType {

    /* renamed from: a */
    private final String f71786a;

    /* renamed from: b */
    private final String f71787b;

    /* renamed from: c */
    private final String f71788c;

    /* renamed from: d */
    private final String f71789d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_MimeType(String str, String str2, String str3, @Nullable String str4) {
        if (str != null) {
            this.f71786a = str;
            if (str2 != null) {
                this.f71787b = str2;
                if (str3 != null) {
                    this.f71788c = str3;
                    this.f71789d = str4;
                    return;
                }
                throw new NullPointerException("Null subtype");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null string");
    }

    @Override // com.smaato.sdk.core.network.MimeType
    @Nullable
    public String charset() {
        return this.f71789d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MimeType)) {
            return false;
        }
        MimeType mimeType = (MimeType) obj;
        if (this.f71786a.equals(mimeType.string()) && this.f71787b.equals(mimeType.type()) && this.f71788c.equals(mimeType.subtype())) {
            String str = this.f71789d;
            if (str == null) {
                if (mimeType.charset() == null) {
                    return true;
                }
            } else if (str.equals(mimeType.charset())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f71786a.hashCode() ^ 1000003) * 1000003) ^ this.f71787b.hashCode()) * 1000003) ^ this.f71788c.hashCode()) * 1000003;
        String str = this.f71789d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    @Override // com.smaato.sdk.core.network.MimeType
    @NonNull
    public String string() {
        return this.f71786a;
    }

    @Override // com.smaato.sdk.core.network.MimeType
    @NonNull
    public String subtype() {
        return this.f71788c;
    }

    public String toString() {
        return "MimeType{string=" + this.f71786a + ", type=" + this.f71787b + ", subtype=" + this.f71788c + ", charset=" + this.f71789d + "}";
    }

    @Override // com.smaato.sdk.core.network.MimeType
    @NonNull
    public String type() {
        return this.f71787b;
    }
}
