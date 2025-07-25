package com.bytedance.sdk.openadsdk.tuV;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ironsource.C21114v8;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.ldr */
/* loaded from: classes3.dex */
public class C9425ldr {

    /* renamed from: IL */
    private WeakReference<C9380Kg> f21049IL;

    /* renamed from: bg */
    private Context f21051bg;

    /* renamed from: bX */
    private Map<String, InterfaceC9489bg> f21050bX = new HashMap();
    private SensorEventListener eqN = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C9380Kg eqN;
            if (sensorEvent.sensor.getType() != 1 || (eqN = C9425ldr.this.eqN()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                eqN.m82830bg("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    /* renamed from: zx */
    private SensorEventListener f21053zx = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C9380Kg eqN;
            if (sensorEvent.sensor.getType() != 4 || (eqN = C9425ldr.this.eqN()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                eqN.m82830bg("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener ldr = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            C9380Kg eqN;
            if (sensorEvent.sensor.getType() != 10 || (eqN = C9425ldr.this.eqN()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                eqN.m82830bg("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    /* renamed from: iR */
    private SensorEventListener f21052iR = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = C9421eo.f21037IL;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = C9421eo.f21038bX;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = C9421eo.eqN;
            SensorManager.getRotationMatrix(fArr5, null, C9421eo.f21037IL, C9421eo.f21038bX);
            float[] fArr6 = C9421eo.f21040zx;
            SensorManager.getOrientation(fArr5, fArr6);
            C9380Kg eqN = C9425ldr.this.eqN();
            if (eqN == null) {
                return;
            }
            float f = fArr6[0];
            float f2 = fArr6[1];
            float f3 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                eqN.m82830bg("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.tuV.ldr$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9489bg {
        /* renamed from: bg */
        JSONObject mo82721bg(JSONObject jSONObject) throws Throwable;
    }

    public C9425ldr(C9380Kg c9380Kg) {
        this.f21051bg = c9380Kg.m82845bg();
        this.f21049IL = new WeakReference<>(c9380Kg);
        m82729bX();
    }

    /* renamed from: bX */
    private void m82729bX() {
        this.f21050bX.put("adInfo", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.45
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                if (eqN != null) {
                    JSONObject tuV = eqN.tuV();
                    if (tuV != null) {
                        tuV.put(C26559a.f69635d, 1);
                        return tuV;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C26559a.f69635d, -1);
                return jSONObject3;
            }
        });
        this.f21050bX.put("appInfo", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.56
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C26559a.f69635d, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                for (String str : C9425ldr.this.m82727bg()) {
                    jSONArray.put(str);
                }
                jSONObject2.put("supportList", jSONArray);
                C9380Kg eqN = C9425ldr.this.eqN();
                if (eqN != null) {
                    jSONObject2.put("deviceId", eqN.m82823iR());
                    jSONObject2.put("netType", eqN.m82816vb());
                    jSONObject2.put("innerAppName", eqN.eqN());
                    jSONObject2.put("appName", eqN.m82815zx());
                    jSONObject2.put("appVersion", eqN.ldr());
                    Map<String, String> m82889IL = eqN.m82889IL();
                    for (String str2 : m82889IL.keySet()) {
                        jSONObject2.put(str2, m82889IL.get(str2));
                    }
                }
                return jSONObject2;
            }
        });
        this.f21050bX.put("playableSDKInfo", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.61
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C26559a.f69635d, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.f21050bX.put("subscribe_app_ad", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.62
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("download_app_ad", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.63
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put(C21114v8.C21122h.f54081o, new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.2
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                if (eqN == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C26559a.f69635d, 1);
                jSONObject3.put("viewStatus", eqN.m82857WR());
                return jSONObject3;
            }
        });
        this.f21050bX.put("getVolume", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.3
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                if (eqN == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C26559a.f69635d, 1);
                jSONObject3.put("endcard_mute", eqN.m82875Kg());
                return jSONObject3;
            }
        });
        this.f21050bX.put("getScreenSize", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.4
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                if (eqN == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject VzQ = eqN.VzQ();
                VzQ.put(C26559a.f69635d, 1);
                return VzQ;
            }
        });
        this.f21050bX.put("start_accelerometer_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.5
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C9423iR.m82732bg("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put(C26559a.f69635d, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C9421eo.m82736bg(C9425ldr.this.f21051bg, C9425ldr.this.eqN, i);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("close_accelerometer_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.6
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82737bg(C9425ldr.this.f21051bg, C9425ldr.this.eqN);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("start_gyro_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.7
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C9423iR.m82732bg("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put(C26559a.f69635d, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C9421eo.m82740IL(C9425ldr.this.f21051bg, C9425ldr.this.f21053zx, i);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("close_gyro_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.8
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82737bg(C9425ldr.this.f21051bg, C9425ldr.this.f21053zx);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("start_accelerometer_grativityless_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.9
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C9423iR.m82732bg("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put(C26559a.f69635d, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C9421eo.m82739bX(C9425ldr.this.f21051bg, C9425ldr.this.ldr, i);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("close_accelerometer_grativityless_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.10
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82737bg(C9425ldr.this.f21051bg, C9425ldr.this.ldr);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("start_rotation_vector_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.11
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C9423iR.m82732bg("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put(C26559a.f69635d, -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C9421eo.eqN(C9425ldr.this.f21051bg, C9425ldr.this.f21052iR, i);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("close_rotation_vector_observer", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.13
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82737bg(C9425ldr.this.f21051bg, C9425ldr.this.f21052iR);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("device_shake", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.14
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82738bg(C9425ldr.this.f21051bg, 300L);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("device_shake_short", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.15
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C9421eo.m82738bg(C9425ldr.this.f21051bg, 150L);
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put(C26559a.f69635d, -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f21050bX.put("playable_style", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.16
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN != null) {
                    JSONObject m82853bX = eqN.m82853bX();
                    m82853bX.put(C26559a.f69635d, 1);
                    return m82853bX;
                }
                jSONObject2.put(C26559a.f69635d, -1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("sendReward", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.17
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN != null) {
                    eqN.m82871LZ();
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, -1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("webview_time_track", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.18
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.f21050bX.put("playable_event", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.19
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN != null && jSONObject != null) {
                    eqN.m82879IL(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                    jSONObject2.put(C26559a.f69635d, 1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, -1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("reportAd", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.20
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("close", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.21
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("openAdLandPageLinks", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.22
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("get_viewport", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.24
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82890Fy = eqN.m82890Fy();
                m82890Fy.put(C26559a.f69635d, 1);
                return m82890Fy;
            }
        });
        this.f21050bX.put("jssdk_load_finish", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.25
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.aGH();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_material_render_result", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.26
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82854WR(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("detect_change_playable_click", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.27
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82826eo = eqN.m82826eo();
                m82826eo.put(C26559a.f69635d, 1);
                return m82826eo;
            }
        });
        this.f21050bX.put("check_camera_permission", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.28
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82866Ta = eqN.m82866Ta();
                m82866Ta.put(C26559a.f69635d, 1);
                return m82866Ta;
            }
        });
        this.f21050bX.put("check_external_storage", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.29
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject yDt = eqN.yDt();
                if (yDt.isNull("result")) {
                    yDt.put(C26559a.f69635d, -1);
                } else {
                    yDt.put(C26559a.f69635d, 1);
                }
                return yDt;
            }
        });
        this.f21050bX.put("playable_open_camera", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.30
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_pick_photo", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.31
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_download_media_in_photos", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.32
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82829bg(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_preventTouchEvent", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.33
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82878IL(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_settings_info", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.35
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82870Lq = eqN.m82870Lq();
                m82870Lq.put(C26559a.f69635d, 1);
                return m82870Lq;
            }
        });
        this.f21050bX.put("playable_load_main_scene", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.36
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82818tC();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_enter_section", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.37
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.eqN(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_end", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.38
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.rri();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_finish_play_playable", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.39
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.kMt();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_transfrom_module_show", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.40
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.JAA();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_transfrom_module_change_color", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.41
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82876Ja();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_set_scroll_rect", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.42
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_click_area", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.43
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82811zx(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_real_play_start", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.44
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_material_first_frame_show", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.46
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.m82863Uw();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_stuck_check_pong", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.47
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.DDQ();
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_material_adnormal_mask", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.48
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                eqN.ldr(jSONObject);
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_long_press_panel", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.49
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_alpha_player_play", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.50
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_transfrom_module_highlight", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.51
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_send_click_event", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.52
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_query_media_permission_declare", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.53
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82820iR = eqN.m82820iR(jSONObject);
                m82820iR.put(C26559a.f69635d, 1);
                return m82820iR;
            }
        });
        this.f21050bX.put("playable_query_media_permission_enable", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.54
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                C9380Kg eqN = C9425ldr.this.eqN();
                JSONObject jSONObject2 = new JSONObject();
                if (eqN == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                JSONObject m82872Kg = eqN.m82872Kg(jSONObject);
                m82872Kg.put(C26559a.f69635d, 1);
                return m82872Kg;
            }
        });
        this.f21050bX.put("playable_apply_media_permission", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.55
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_start_kws", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.57
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_close_kws", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.58
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_video_preload_task_add", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.59
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
        this.f21050bX.put("playable_video_preload_task_cancel", new InterfaceC9489bg() { // from class: com.bytedance.sdk.openadsdk.tuV.ldr.60
            @Override // com.bytedance.sdk.openadsdk.tuV.C9425ldr.InterfaceC9489bg
            /* renamed from: bg */
            public JSONObject mo82721bg(JSONObject jSONObject) throws Throwable {
                AbstractC9396bg m82723zx = C9425ldr.this.m82723zx();
                JSONObject jSONObject2 = new JSONObject();
                if (m82723zx == null) {
                    jSONObject2.put(C26559a.f69635d, -1);
                    return jSONObject2;
                }
                jSONObject2.put(C26559a.f69635d, 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C9380Kg eqN() {
        WeakReference<C9380Kg> weakReference = this.f21049IL;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zx */
    public AbstractC9396bg m82723zx() {
        C9380Kg eqN = eqN();
        if (eqN == null) {
            return null;
        }
        return eqN.xxp();
    }

    /* renamed from: bg */
    public Set<String> m82727bg() {
        return this.f21050bX.keySet();
    }

    /* renamed from: bg */
    public JSONObject m82725bg(String str, JSONObject jSONObject) {
        try {
            InterfaceC9489bg interfaceC9489bg = this.f21050bX.get(str);
            if (interfaceC9489bg == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C26559a.f69635d, -1);
                return jSONObject2;
            }
            return interfaceC9489bg.mo82721bg(jSONObject);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
