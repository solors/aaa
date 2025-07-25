package io.bidmachine.utils;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressLint({"MissingPermission"})
/* loaded from: classes9.dex */
public class BluetoothUtils {
    private static final int[] profileArray;
    private static final Map<Integer, BluetoothProfile> proxyMap;
    private static final BluetoothProfile.ServiceListener listener = new C37112a();
    private static boolean isRegistered = false;

    static {
        int[] iArr = {1};
        profileArray = iArr;
        proxyMap = new HashMap(iArr.length);
    }

    @Nullable
    private static Set<String> getConnectedDevices(@NonNull Context context, @Nullable Integer num) {
        HashSet hashSet = null;
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            if (BluetoothAdapter.getDefaultAdapter() == null) {
                return null;
            }
            HashSet hashSet2 = new HashSet();
            try {
                for (Map.Entry<Integer, BluetoothProfile> entry : proxyMap.entrySet()) {
                    if (num == null || entry.getKey().equals(num)) {
                        BluetoothProfile value = entry.getValue();
                        if (value != null) {
                            for (BluetoothDevice bluetoothDevice : value.getConnectedDevices()) {
                                String name = bluetoothDevice.getName();
                                if (!TextUtils.isEmpty(name)) {
                                    hashSet2.add(name);
                                }
                            }
                        }
                    }
                }
                return hashSet2;
            } catch (Exception unused) {
                hashSet = hashSet2;
                return hashSet;
            }
        } catch (Exception unused2) {
        }
    }

    @Nullable
    public static Set<String> getConnectedHeadsets(@NonNull Context context) {
        return getConnectedDevices(context, 1);
    }

    @Nullable
    public static Boolean isHeadsetConnected(@NonNull Context context) {
        int i;
        if (!Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z = true;
            if (defaultAdapter != null) {
                i = defaultAdapter.getProfileConnectionState(1);
            } else {
                i = -1;
            }
            if (i != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void register(@Nullable Context context) {
        BluetoothAdapter defaultAdapter;
        if (context == null || context.getApplicationContext() == null || isRegistered || !Utils.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return;
        }
        try {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception unused) {
        }
        if (defaultAdapter == null) {
            return;
        }
        for (int i : profileArray) {
            defaultAdapter.getProfileProxy(context.getApplicationContext(), listener, i);
        }
        isRegistered = true;
    }

    /* renamed from: io.bidmachine.utils.BluetoothUtils$a */
    /* loaded from: classes9.dex */
    class C37112a implements BluetoothProfile.ServiceListener {
        C37112a() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            BluetoothUtils.proxyMap.put(Integer.valueOf(i), bluetoothProfile);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
        }
    }
}
