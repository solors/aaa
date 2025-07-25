package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eJ\u0016\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0007J*\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u001a\u0010\u0012\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\f0\u0013J&\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u001e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\bR.\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/instagram/common/viewpoint/core/ViewpointRegistry;", "", "qeConfig", "Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;", "(Lcom/instagram/common/viewpoint/core/ViewpointQeConfig;)V", "multiViewpointDataMap", "", "Lcom/meta/analytics/dsp/uinode/DspViewableNode;", "Lcom/instagram/common/viewpoint/core/SharedViewpointManager$UniqueKey;", "Lcom/instagram/common/viewpoint/core/ViewpointData;", "viewpointDataMap", "getEligibleViews", "", "result", "", "getViewpointData", "node", "iterateMultiViewpointData", "action", "Lkotlin/Function1;", "registerView", "key", "viewpointData", "unregisterView", "fbandroid.java.com.instagram.common.viewpoint.core.core_an"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.dh  reason: from Kotlin metadata and invalid package */
/* loaded from: assets/audience_network.dex */
public final class ViewpointRegistry {
    public static byte[] A03;
    public static String[] A04 = {"hdmlO0", "Pao0VUuQuwhiUKXn89wfKbyo9VlN", "lRas", "TeEMb6eZZD5whrU9be0IX5ZV1M9RKr26", "Qnqbn5lACluJ2ApCqm5BpSPW4vhAMGtg", "gvJZrbHq4P5HQU5ufyPQZZXTOJgB", "vCidj0D7LJg5PqPuMk2VvvwKDqfmQpdZ", "0ZH2VL3AtCsRULFWGVsN9oD"};
    public final ViewpointQeConfig A00;
    public final Map<DspViewableNode, Map<C13261dt, C13257do<?, ?>>> A01;
    public final Map<DspViewableNode, C13257do<?, ?>> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[2].length() == 16) {
                throw new RuntimeException();
            }
            A04[4] = "98jXpaahab3bDGJdYqYLl1lSw3QVyboZ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 47);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-18, -10, -7, -3, 2, -98, -96, -79, -90, -84, -85, -94, -100, -80, -16, -15, -26, -25, 16, 4, -30, 14, 13, 5, 8, 6, -13, -26, -12, -10, -19, -11, -49, -62, -66, -48, -55, -56, -62, -57, -51, -99, -70, -51, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A05(DspViewableNode dspViewableNode, C13261dt c13261dt, C13257do<?, ?> c13257do) {
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        C13227d7.A07(c13261dt, A00(11, 3, 8));
        C13227d7.A07(c13257do, A00(32, 13, 42));
        Map<DspViewableNode, Map<C13261dt, C13257do<?, ?>>> map = this.A01;
        WeakHashMap weakHashMap = map.get(dspViewableNode);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            map.put(dspViewableNode, weakHashMap);
        }
        weakHashMap.put(c13261dt, c13257do);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A07(DspViewableNode dspViewableNode, InterfaceC11912Hd<? super C13257do<?, ?>, C13236dK> interfaceC11912Hd) {
        Collection<C13257do<?, ?>> values;
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        C13227d7.A07(interfaceC11912Hd, A00(5, 6, 14));
        C13257do<?, ?> c13257do = this.A02.get(dspViewableNode);
        if (c13257do != null) {
            interfaceC11912Hd.A9K(c13257do);
        }
        Map<C13261dt, C13257do<?, ?>> map = this.A01.get(dspViewableNode);
        if (map != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                interfaceC11912Hd.A9K((C13257do) it.next());
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A08(Collection<DspViewableNode> collection) {
        C13227d7.A07(collection, A00(26, 6, 82));
        collection.addAll(this.A02.keySet());
        if (this.A00.A00) {
            ArrayList<DspViewableNode> arrayList = new ArrayList();
            for (Object obj : this.A01.keySet()) {
                if (!this.A02.containsKey((DspViewableNode) obj)) {
                    arrayList.add(obj);
                }
            }
            for (DspViewableNode dspViewableNode : arrayList) {
                collection.add(dspViewableNode);
            }
        }
    }

    static {
        A01();
    }

    public ViewpointRegistry(ViewpointQeConfig viewpointQeConfig) {
        C13227d7.A07(viewpointQeConfig, A00(18, 8, 112));
        this.A00 = viewpointQeConfig;
        this.A02 = new WeakHashMap();
        this.A01 = new WeakHashMap();
    }

    public final synchronized C13257do<?, ?> A02(DspViewableNode dspViewableNode) {
        C13257do<?, ?> c13257do;
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        c13257do = this.A02.get(dspViewableNode);
        if (c13257do == null) {
            c13257do = C13257do.A08;
            C13227d7.A06(c13257do, A00(0, 5, 122));
        }
        return c13257do;
    }

    public final synchronized void A03(DspViewableNode dspViewableNode) {
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        this.A02.remove(dspViewableNode);
    }

    public final synchronized void A04(DspViewableNode dspViewableNode, C13261dt c13261dt) {
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        C13227d7.A07(c13261dt, A00(11, 3, 8));
        Map nodeDataMap = this.A01.get(dspViewableNode);
        if (nodeDataMap != null) {
            nodeDataMap.remove(c13261dt);
            if (nodeDataMap.isEmpty()) {
                this.A01.remove(dspViewableNode);
            }
        }
    }

    public final synchronized void A06(DspViewableNode dspViewableNode, C13257do<?, ?> c13257do) {
        C13227d7.A07(dspViewableNode, A00(14, 4, 83));
        C13227d7.A07(c13257do, A00(32, 13, 42));
        this.A02.put(dspViewableNode, c13257do);
    }
}
