package com.maticoo.sdk.utils.request.network.certificate;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;

/* loaded from: classes6.dex */
public final class PublicKeyPin {
    private final String pin;

    public PublicKeyPin(Certificate certificate) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            this.pin = Base64.encodeToString(messageDigest.digest(certificate.getPublicKey().getEncoded()), 0).trim();
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Should never happen");
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PublicKeyPin) && obj.toString().equals(toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.pin.hashCode();
    }

    public String toString() {
        return this.pin;
    }

    public PublicKeyPin(String str) {
        if (Base64.decode(str, 0).length == 32) {
            this.pin = str.trim();
            return;
        }
        throw new IllegalArgumentException("Invalid pin: length is not 32 bytes");
    }
}
