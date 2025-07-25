package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.st */
/* loaded from: classes6.dex */
public class C20985st {

    /* renamed from: b */
    private NetworkSettings f53495b;

    /* renamed from: a */
    private ArrayList<String> f53494a = new ArrayList<>();

    /* renamed from: c */
    private JSONObject f53496c = null;

    /* renamed from: d */
    private boolean f53497d = true;

    /* renamed from: a */
    public static C20985st m54891a() {
        return new C20985st();
    }

    /* renamed from: b */
    public JSONObject m54886b() {
        return this.f53496c;
    }

    @Nullable
    /* renamed from: c */
    public NetworkSettings m54885c() {
        return this.f53495b;
    }

    /* renamed from: d */
    public ArrayList<String> m54884d() {
        return this.f53494a;
    }

    /* renamed from: e */
    public boolean m54883e() {
        return this.f53497d;
    }

    /* renamed from: a */
    public void m54890a(NetworkSettings networkSettings) {
        this.f53495b = networkSettings;
    }

    /* renamed from: a */
    public void m54889a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53494a.add(str);
    }

    /* renamed from: a */
    public void m54888a(JSONObject jSONObject) {
        this.f53496c = jSONObject;
    }

    /* renamed from: a */
    public void m54887a(boolean z) {
        this.f53497d = z;
    }
}
