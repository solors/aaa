package com.zeus.gmc.sdk.mobileads.columbus.bid;

import android.content.Context;
import android.util.Base64;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class BidderTokenProvider {
    private static final int COLUMBUS_TOKEN_VERSION = 2;
    private static final String CYPHER = "cypher";
    private static final String MESSAGE = "message";
    private static final String RSA = "RSA";
    private static final String TAG = "BidderTokenProvider";

    private BidderTokenProvider() {
    }

    public static String getBidToken(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("v", C32573coo2iico.cco22);
            String jSONObject2 = jSONObject.toString();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance(RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(C32573coo2iico.cioccoiococ, 0)));
            Cipher cipher = Cipher.getInstance(RSA);
            cipher.init(1, rSAPublicKey);
            byte[] bytes = jSONObject2.getBytes("UTF-8");
            int bitLength = (((RSAPublicKeySpec) KeyFactory.getInstance(RSA).getKeySpec(rSAPublicKey, RSAPublicKeySpec.class)).getModulus().bitLength() / 8) - 11;
            int ceil = (int) Math.ceil(bytes.length / bitLength);
            byte[] bArr = new byte[0];
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < ceil; i++) {
                int i2 = i * bitLength;
                int min = Math.min(bitLength, bytes.length - i2);
                byte[] bArr2 = new byte[min];
                System.arraycopy(bytes, i2, bArr2, 0, min);
                byte[] doFinal = cipher.doFinal(bArr2);
                byte[] bArr3 = new byte[bArr.length + doFinal.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                System.arraycopy(doFinal, 0, bArr3, bArr.length, doFinal.length);
                jSONArray.put(Base64.encodeToString(bArr3, 0));
                bArr = new byte[0];
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("message", jSONArray);
            jSONObject3.put("cypher", 2);
            return jSONObject3.toString();
        } catch (Exception unused) {
            MLog.m25892d(TAG, "gettoken failed");
            return null;
        }
    }
}
