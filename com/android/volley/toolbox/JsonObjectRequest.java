package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.k */
/* loaded from: classes2.dex */
public class JsonObjectRequest extends JsonRequest<JSONObject> {
    public JsonObjectRequest(String str, Response.InterfaceC3756b<JSONObject> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(0, str, null, interfaceC3756b, interfaceC3755a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.m102282c(new JSONObject(new String(networkResponse.f3480b, HttpHeaderParser.m102233g(networkResponse.f3481c, C20517nb.f52167N))), HttpHeaderParser.m102235e(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.m102284a(new ParseError(e));
        } catch (JSONException e2) {
            return Response.m102284a(new ParseError(e2));
        }
    }

    @Deprecated
    public JsonObjectRequest(String str, @Nullable JSONObject jSONObject, Response.InterfaceC3756b<JSONObject> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, interfaceC3756b, interfaceC3755a);
    }

    public JsonObjectRequest(int i, String str, @Nullable JSONObject jSONObject, Response.InterfaceC3756b<JSONObject> interfaceC3756b, @Nullable Response.InterfaceC3755a interfaceC3755a) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, interfaceC3756b, interfaceC3755a);
    }
}
