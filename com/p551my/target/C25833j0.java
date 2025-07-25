package com.p551my.target;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p551my.target.common.MyTargetConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.j0 */
/* loaded from: classes7.dex */
public final class C25833j0 extends AbstractC26021q1 {

    /* renamed from: b */
    public static final int[] f67023b = AbstractC25651b0.m44195a(260, 272, 268, 276, IronSourceConstants.SDK_INIT_SUCCESS, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 532, 528, IronSourceError.ERROR_PLACEMENT_CAPPED, 512, 264, 256, 280);

    /* renamed from: a */
    public Method f67024a;

    public C25833j0() {
        try {
            this.f67024a = BluetoothDevice.class.getMethod("isConnected", new Class[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public Map m43735a(MyTargetConfig myTargetConfig, Context context) {
        BluetoothAdapter defaultAdapter;
        HashMap hashMap = new HashMap();
        if (this.f67024a != null && AbstractC26021q1.m43186a("android.permission.BLUETOOTH", context) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && defaultAdapter.isEnabled()) {
            List m43736a = m43736a(defaultAdapter, this.f67024a);
            if (!m43736a.isEmpty()) {
                hashMap.put("bdn", AbstractC25651b0.m44196a(m43736a));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List m43736a(BluetoothAdapter bluetoothAdapter, Method method) {
        ArrayList arrayList = new ArrayList();
        try {
            for (BluetoothDevice bluetoothDevice : bluetoothAdapter.getBondedDevices()) {
                if (Arrays.binarySearch(f67023b, bluetoothDevice.getBluetoothClass().getDeviceClass()) < 0 && ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue()) {
                    String name = bluetoothDevice.getName();
                    if (!TextUtils.isEmpty(name)) {
                        arrayList.add(new String(Base64.encode(name.getBytes(), 2), "UTF-8"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
