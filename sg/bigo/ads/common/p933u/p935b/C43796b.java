package sg.bigo.ads.common.p933u.p935b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.p922j.C43709a;
import sg.bigo.ads.common.p933u.C43806f;
import sg.bigo.ads.common.p933u.InterfaceC43783a;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.common.u.b.b */
/* loaded from: classes10.dex */
public class C43796b<T extends InterfaceC43783a> extends AbstractC43797c<T> {

    /* renamed from: a */
    public static final C43806f f114606a = C43806f.m4959a("text/plain;charset=utf-8");

    /* renamed from: b */
    public JSONObject f114607b;

    /* renamed from: c */
    public byte[] f114608c;

    /* renamed from: d */
    public C43806f f114609d;

    /* renamed from: e */
    public boolean f114610e;

    /* renamed from: f */
    public boolean f114611f;

    /* renamed from: g */
    public int f114612g;

    /* renamed from: h */
    public String f114613h;

    /* renamed from: o */
    private String f114614o;

    public C43796b(int i, @NonNull T t) {
        super(i, t, true);
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    @NonNull
    /* renamed from: a */
    public final String mo4977a() {
        return "POST";
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    @Nullable
    /* renamed from: b */
    public final C43806f mo4974b() {
        C43806f c43806f = this.f114609d;
        if (c43806f != null) {
            return c43806f;
        }
        return f114606a;
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    @Nullable
    /* renamed from: c */
    public final byte[] mo4972c() {
        JSONObject jSONObject;
        if (this.f114608c == null && (jSONObject = this.f114607b) != null) {
            String jSONObject2 = jSONObject.toString();
            this.f114614o = jSONObject2;
            try {
                if (this.f114610e) {
                    String m5151a = C43709a.m5151a(jSONObject2, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (!TextUtils.isEmpty(m5151a)) {
                        this.f114611f = true;
                        this.f114614o = m5151a;
                        m4975a("enc", "1");
                    } else {
                        this.f114611f = false;
                    }
                }
            } catch (Exception unused) {
                this.f114611f = false;
            }
            try {
                this.f114608c = this.f114614o.getBytes(C20517nb.f52167N);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.f114608c;
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    @Nullable
    /* renamed from: d */
    public final String mo4971d() {
        if (mo4970e() >= 0) {
            return this.f114614o;
        }
        return "content is null.";
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    /* renamed from: e */
    public final int mo4970e() {
        byte[] mo4972c = mo4972c();
        if (mo4972c != null) {
            return mo4972c.length;
        }
        return super.mo4970e();
    }

    @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
    /* renamed from: f */
    public final boolean mo4969f() {
        return this.f114611f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m4978a(Map<String, Object> map) {
        if (this.f114607b == null || C43828k.m4873a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.f114607b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.f114608c = null;
    }
}
