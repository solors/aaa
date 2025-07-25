package p661f1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;
import p036c1.AbstractC3413a;
import p630d1.C32834c;
import p989u0.C44417b;
import p989u0.EnumC44418c;
import p989u0.EnumC44419d;

/* renamed from: f1.a */
/* loaded from: classes3.dex */
public final class C33076a {

    /* renamed from: a */
    public final SharedPreferences f90287a;

    /* renamed from: b */
    public final C32834c f90288b = new C32834c();

    public C33076a(Context context) {
        this.f90287a = context.getSharedPreferences("odt_storage", 0);
    }

    /* renamed from: a */
    public final String m24959a() {
        String string = this.f90287a.getString("odt", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                String string2 = jSONArray.getString(0);
                return this.f90288b.m25798b(jSONArray.getString(1), Base64.decode(string2, 0));
            } catch (IOException e) {
                e = e;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (InvalidAlgorithmParameterException e2) {
                e = e2;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (InvalidKeyException e3) {
                e = e3;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (NoSuchPaddingException e5) {
                e = e5;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (JSONException e6) {
                e = e6;
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            } catch (Exception e7) {
                C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e7, EnumC44418c.FAILED_EXTRACT_ENCRYPTED_DATA));
                return "";
            }
        }
        return "";
    }

    /* renamed from: b */
    public final void m24958b(String str) {
        try {
            Pair m25799a = this.f90288b.m25799a(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m25799a.first).put(m25799a.second);
            this.f90287a.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e) {
            e = e;
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e3) {
            e = e3;
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e5) {
            e = e5;
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e6) {
            C44417b.m3082b(EnumC44419d.ENCRYPTION_EXCEPTION, AbstractC3413a.m103684a(e6, EnumC44418c.FAILED_STORE_ENCRYPTED_DATA));
        }
    }
}
