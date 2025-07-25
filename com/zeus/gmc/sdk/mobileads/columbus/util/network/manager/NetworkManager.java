package com.zeus.gmc.sdk.mobileads.columbus.util.network.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32462ciiio2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2ic2icoi.C32485coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32662coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coc22.C32694coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class NetworkManager {
    private static final int cicc2iiccc = 3600000;
    private static final int cicic = -1;
    private static volatile NetworkManager ciii2coi2 = null;
    private static final String coiic = "NetworkManager";
    private volatile boolean cco22;
    private Context coi222o222;
    private C32485coo2iico coo2iico;
    Map<Object, List<C32694coo2iico>> c2oc2i = new HashMap();
    List<C32694coo2iico> cioccoiococ = new ArrayList();
    private int c2oc2o = -1;
    @RequiresApi(api = 21)
    ConnectivityManager.NetworkCallback cii2c2 = new C32757coo2iico();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public static class ParameterNotFoundException extends RuntimeException {
        public ParameterNotFoundException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    public static class VoidNotFoundException extends RuntimeException {
        public VoidNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.util.network.manager.NetworkManager$coo2iico */
    /* loaded from: classes8.dex */
    class C32757coo2iico extends ConnectivityManager.NetworkCallback {
        C32757coo2iico() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        @SuppressLint({"MissingPermission"})
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            try {
                if (NetworkManager.this.cco22) {
                    NetworkManager.this.cco22 = false;
                    MLog.m25892d(NetworkManager.coiic, "The network status changes. Because of init NetworkCallback.");
                    return;
                }
                MLog.m25892d(NetworkManager.coiic, "The network status changes. ");
                if (networkCapabilities.hasCapability(12)) {
                    if (networkCapabilities.hasTransport(1)) {
                        MLog.m25887i(NetworkManager.coiic, "onCapabilitiesChanged: WIFI");
                        if (NetworkManager.this.c2oc2o == 1) {
                            return;
                        }
                        NetworkManager.this.cioccoiococ();
                        NetworkManager.this.c2oc2o = 1;
                        return;
                    } else if (networkCapabilities.hasTransport(0)) {
                        MLog.m25887i(NetworkManager.coiic, "onCapabilitiesChanged: Cellular");
                        if (NetworkManager.this.c2oc2o == 0) {
                            return;
                        }
                        NetworkManager.this.cioccoiococ();
                        NetworkManager.this.c2oc2o = 0;
                        return;
                    } else {
                        return;
                    }
                }
                MLog.m25887i(NetworkManager.coiic, "onCapabilitiesChanged: no Internet");
            } catch (Exception e) {
                MLog.m25888e(NetworkManager.coiic, "", e);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            MLog.m25892d(NetworkManager.coiic, "The network is disconnected.");
            NetworkManager.this.c2oc2o = -1;
        }
    }

    private NetworkManager() {
    }

    @RequiresApi(api = 21)
    private void c2oc2i(Context context) {
        ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this.cii2c2);
    }

    public void c2oc2o() {
        if (!this.c2oc2i.isEmpty()) {
            this.c2oc2i.clear();
        }
        coi222o222().c2oc2i();
    }

    public void cioccoiococ() {
        MLog.m25887i(coiic, "netWorkAvailableExcecute()");
        if (C32462ciiio2o.coo2iico(ConfigCache.getInstance().getLastNetCheckTime(), 3600000L)) {
            C32111coo2iico.coo2iico(4);
            ConfigCache.getInstance().saveLastNetCheckTime();
        }
    }

    public static NetworkManager coi222o222() {
        if (ciii2coi2 == null) {
            synchronized (NetworkManager.class) {
                if (ciii2coi2 == null) {
                    ciii2coi2 = new NetworkManager();
                }
            }
        }
        return ciii2coi2;
    }

    public void c2oc2i(Object obj) {
        if (this.c2oc2i.isEmpty()) {
            return;
        }
        this.c2oc2i.remove(obj);
    }

    public Context coo2iico() {
        if (this.coi222o222 == null) {
            this.coi222o222 = GlobalHolder.getApplicationContext();
        }
        return this.coi222o222;
    }

    public void c2oc2i() {
        try {
            c2oc2i(this.coi222o222);
            if (this.coo2iico != null) {
                coo2iico().unregisterReceiver(this.coo2iico);
            }
        } catch (Exception e) {
            MLog.m25888e(coiic, "", e);
        }
    }

    public void coo2iico(String str) {
        Object next;
        List<C32694coo2iico> list;
        MLog.m25892d(coiic, str);
        Iterator<Object> it = this.c2oc2i.keySet().iterator();
        while (it.hasNext() && (list = this.c2oc2i.get((next = it.next()))) != null) {
            for (C32694coo2iico c32694coo2iico : list) {
                if (c32694coo2iico.c2oc2i().isAssignableFrom(str.getClass())) {
                    coo2iico(c32694coo2iico, next, str);
                }
            }
        }
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @RequiresApi(api = 21)
    private void coi222o222(Context context) {
        this.cco22 = true;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        builder.addTransportType(0);
        ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(builder.build(), this.cii2c2);
    }

    private void coo2iico(C32694coo2iico c32694coo2iico, Object obj, String str) {
        try {
            c32694coo2iico.coo2iico().invoke(obj, str);
        } catch (Exception e) {
            MLog.m25888e(coiic, "", e);
        }
    }

    public void coi222o222(Object obj) {
        List<C32694coo2iico> list = this.c2oc2i.get(obj);
        this.cioccoiococ = list;
        if (list == null) {
            List<C32694coo2iico> coo2iico = coo2iico(obj);
            this.cioccoiococ = coo2iico;
            this.c2oc2i.put(obj, coo2iico);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void coo2iico(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            this.coi222o222 = applicationContext;
            coi222o222(applicationContext);
        } catch (Exception e) {
            MLog.m25888e(coiic, "", e);
        }
    }

    private List<C32694coo2iico> coo2iico(Object obj) {
        Method[] methods;
        ArrayList arrayList = new ArrayList();
        try {
            for (Method method : obj.getClass().getMethods()) {
                InterfaceC32662coi222o222 interfaceC32662coi222o222 = (InterfaceC32662coi222o222) method.getAnnotation(InterfaceC32662coi222o222.class);
                if (interfaceC32662coi222o222 != null) {
                    if ("void".equals(method.getGenericReturnType().toString())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        MLog.m25887i("m,name", method.getParameterTypes().length + "");
                        if (parameterTypes.length == 1) {
                            arrayList.add(new C32694coo2iico(parameterTypes[0], interfaceC32662coi222o222.type(), method));
                        } else {
                            throw new ParameterNotFoundException(method.getName() + " only one parameter can be returned");
                        }
                    } else {
                        throw new VoidNotFoundException(method.getName() + " the return type must be void");
                    }
                }
            }
        } catch (Exception e) {
            MLog.m25888e(coiic, "", e);
        }
        return arrayList;
    }
}
