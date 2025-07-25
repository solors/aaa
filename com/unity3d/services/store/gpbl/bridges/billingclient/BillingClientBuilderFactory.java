package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.p622v4.BillingClientBridge;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class BillingClientBuilderFactory {
    public static IBillingClientBuilderBridge getBillingClientBuilder(Context context) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return BillingClientBridge.newBuilder(context);
    }
}
