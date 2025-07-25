package com.bytedance.sdk.openadsdk.p287LZ;

import android.text.TextUtils;
import android.util.Log;
import com.p552ot.pubsub.util.C26601v;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.LZ.bX */
/* loaded from: classes3.dex */
public class C7885bX {

    /* renamed from: IL */
    private C7884IL f17209IL;

    /* renamed from: bX */
    private InterfaceC7889eqN f17210bX;
    private InterfaceC7888bg eqN;

    /* renamed from: bg */
    private final String f17211bg = "StrategyCenter";

    /* renamed from: zx */
    private int f17212zx = 0;
    private Runnable ldr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.LZ.bX.2
        @Override // java.lang.Runnable
        public void run() {
            C7885bX.this.m87482IL();
        }
    };

    public C7885bX(InterfaceC7889eqN interfaceC7889eqN) {
        this.f17209IL = null;
        C7890zx c7890zx = new C7890zx(interfaceC7889eqN);
        this.f17210bX = c7890zx;
        String mo87466bX = c7890zx.mo87466bX();
        if (!TextUtils.isEmpty(mo87466bX) && !mo87466bX.startsWith("pag")) {
            mo87466bX = "pag_".concat(mo87466bX);
        }
        this.f17209IL = new C7884IL(this.f17210bX.mo87468IL(), mo87466bX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m87482IL() {
        InterfaceC7889eqN interfaceC7889eqN = this.f17210bX;
        if (interfaceC7889eqN == null || interfaceC7889eqN.mo87462zx() == null || this.f17210bX.ldr() == null) {
            return;
        }
        this.f17210bX.mo87465bg().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.LZ.bX.1
            @Override // java.lang.Runnable
            public void run() {
                String message;
                HttpURLConnection httpURLConnection;
                OutputStream outputStream;
                C7885bX.this.f17212zx++;
                try {
                    if (C7885bX.this.eqN != null) {
                        C7885bX.this.eqN.mo87470bg();
                    }
                    httpURLConnection = (HttpURLConnection) new URL(C7885bX.this.f17210bX.mo87462zx()).openConnection();
                    if (C7885bX.this.f17210bX.mo87463iR() != null && C7885bX.this.f17210bX.mo87463iR().size() > 0) {
                        for (Map.Entry<String, String> entry : C7885bX.this.f17210bX.mo87463iR().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                } catch (Throwable th) {
                    if (th.getMessage() == null) {
                        message = "error ";
                    } else {
                        message = th.getMessage();
                    }
                    Log.e("StrategyCenter", message);
                    if (C7885bX.this.eqN != null) {
                        C7885bX.this.eqN.mo87469bg(-1, th.getMessage());
                    }
                }
                try {
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(C7885bX.this.f17210bX.ldr().toString().getBytes());
                        outputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        Log.i("StrategyCenter", "executing strategy fetch");
                        if (responseCode == 200) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                            StringBuffer stringBuffer = new StringBuffer();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                stringBuffer.append(readLine);
                            }
                            bufferedReader.close();
                            JSONObject mo87464bg = C7885bX.this.f17210bX.mo87464bg(new JSONObject(stringBuffer.toString()));
                            C7885bX.this.f17209IL.m87488bg();
                            C7885bX.this.f17209IL.m87483bg(mo87464bg);
                            if (C7885bX.this.eqN != null) {
                                C7885bX.this.eqN.mo87471IL();
                            }
                        } else if (C7885bX.this.eqN != null) {
                            C7885bX.this.eqN.mo87469bg(responseCode, httpURLConnection.getResponseMessage());
                        }
                        C7885bX.this.f17209IL.m87486bg("local_last_update_time", System.currentTimeMillis());
                        C7885bX.this.m87479bg();
                    } catch (Throwable th2) {
                        th = th2;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            }
        });
    }

    /* renamed from: bg */
    public void m87476bg(InterfaceC7888bg interfaceC7888bg) {
        this.eqN = interfaceC7888bg;
    }

    /* renamed from: bg */
    public void m87479bg() {
        if (this.f17210bX != null) {
            C7884IL c7884il = this.f17209IL;
            int i = C26601v.f69837d;
            int m87487bg = c7884il.m87487bg("req_interval", C26601v.f69837d);
            long j = 0;
            long m87489IL = this.f17209IL.m87489IL("local_last_update_time", 0L);
            if (m87487bg >= 600000 && m87487bg <= 86400000) {
                i = m87487bg;
            }
            long currentTimeMillis = System.currentTimeMillis() - m87489IL;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(currentTimeMillis)));
            if (currentTimeMillis >= 0) {
                long j2 = i;
                if (currentTimeMillis <= j2) {
                    j = j2 - currentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j)));
            this.f17210bX.eqN().removeCallbacks(this.ldr);
            if (this.f17212zx > 24) {
                return;
            }
            this.f17210bX.eqN().postDelayed(this.ldr, j);
        }
    }

    /* renamed from: bg */
    public int m87475bg(String str, int i) {
        C7884IL c7884il = this.f17209IL;
        return c7884il == null ? i : c7884il.m87487bg(str, i);
    }

    /* renamed from: bg */
    public String m87474bg(String str, String str2) {
        C7884IL c7884il = this.f17209IL;
        return c7884il == null ? str2 : c7884il.m87485bg(str, str2);
    }

    /* renamed from: bg */
    public boolean m87473bg(String str, boolean z) {
        C7884IL c7884il = this.f17209IL;
        return c7884il == null ? z : c7884il.m87484bg(str, z);
    }
}
