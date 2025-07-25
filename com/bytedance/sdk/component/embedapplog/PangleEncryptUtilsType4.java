package com.bytedance.sdk.component.embedapplog;

import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class PangleEncryptUtilsType4 {
    PangleEncryptUtilsType4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<Integer, String> decrypt(String str) {
        try {
            Pair<Integer, String> cypher4Decrypt = PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new Pair<>(Integer.valueOf(getCryptFailedReason(((Integer) cypher4Decrypt.first).intValue())), cypher4Decrypt.second);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return new Pair<>(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject encrypt(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, JSONObject> pair;
        int cryptFailedReason;
        Object obj;
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pair = null;
        }
        if (pair != null && ((Integer) pair.first).intValue() == 0 && (obj = pair.second) != null) {
            return (JSONObject) obj;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        if (pair == null) {
            cryptFailedReason = 0;
        } else {
            cryptFailedReason = getCryptFailedReason(((Integer) pair.first).intValue());
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, cryptFailedReason);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Pair<Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        Pair<Integer, byte[]> pair;
        Object obj;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pair = null;
        }
        int i = 0;
        if (pair != null && ((Integer) pair.first).intValue() == 0 && (obj = pair.second) != null && ((byte[]) obj).length > 0) {
            bArr2 = (byte[]) obj;
        } else if (pair != null) {
            i = getCryptFailedReason(((Integer) pair.first).intValue());
        }
        return new Pair<>(Integer.valueOf(i), bArr2);
    }

    private static int getCryptFailedReason(int i) {
        switch (i) {
            case 501:
                return 6;
            case 502:
                return 4;
            case 503:
                return 1;
            case 504:
                return 3;
            case 505:
            case 506:
                return 2;
            default:
                return 0;
        }
    }
}
