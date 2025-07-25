package com.ironsource;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.zf */
/* loaded from: classes6.dex */
public class C21314zf extends File {
    public C21314zf(String str) {
        super(str);
    }

    /* renamed from: a */
    public JSONObject m53847a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public C21314zf(String str, String str2) {
        super(str, str2);
    }
}
