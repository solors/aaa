package com.bytedance.sdk.component.p233Kg;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.C7741PX;

/* renamed from: com.bytedance.sdk.component.Kg.IL */
/* loaded from: classes3.dex */
class RunnableC7225IL implements Comparable, Runnable {

    /* renamed from: IL */
    private C7241bg f15586IL;

    /* renamed from: bX */
    private long f15587bX;

    /* renamed from: bg */
    private AbstractRunnableC7227Kg f15588bg;
    private Thread eqN = null;

    public RunnableC7225IL(AbstractRunnableC7227Kg abstractRunnableC7227Kg, C7241bg c7241bg) {
        this.f15587bX = 0L;
        this.f15588bg = abstractRunnableC7227Kg;
        this.f15586IL = c7241bg;
        this.f15587bX = SystemClock.uptimeMillis();
    }

    /* renamed from: bg */
    private void m89555bg(String str, String str2, long j) {
        C7741PX.m87873bg("DelegateRunnable", "pool is " + str + "  name is " + str2 + "is timeout,cost " + j);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof RunnableC7225IL) {
            return this.f15588bg.compareTo(((RunnableC7225IL) obj).m89556bg());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        AbstractRunnableC7227Kg abstractRunnableC7227Kg;
        if ((obj instanceof RunnableC7225IL) && (abstractRunnableC7227Kg = this.f15588bg) != null && abstractRunnableC7227Kg.equals(((RunnableC7225IL) obj).m89556bg())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15588bg.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2;
        String str3;
        String str4;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.eqN = Thread.currentThread();
        AbstractRunnableC7227Kg abstractRunnableC7227Kg = this.f15588bg;
        if (abstractRunnableC7227Kg != null) {
            abstractRunnableC7227Kg.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f15586IL != null) {
            C7252eqN.m89470bg();
        }
        if (C7741PX.m87876bg()) {
            C7241bg c7241bg = this.f15586IL;
            if (c7241bg != null) {
                c7241bg.m89501bg();
            }
            AbstractRunnableC7227Kg abstractRunnableC7227Kg2 = this.f15588bg;
            if (abstractRunnableC7227Kg2 != null) {
                abstractRunnableC7227Kg2.getName();
            }
            String m89501bg = this.f15586IL.m89501bg();
            m89501bg.hashCode();
            char c = 65535;
            switch (m89501bg.hashCode()) {
                case 3107:
                    if (m89501bg.equals("ad")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (m89501bg.equals("io")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (m89501bg.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (m89501bg.equals("init")) {
                        c = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (m89501bg.equals("computation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            String str5 = "null";
            switch (c) {
                case 0:
                case 3:
                    if (uptimeMillis2 > 2000) {
                        C7241bg c7241bg2 = this.f15586IL;
                        if (c7241bg2 == null) {
                            str = "null";
                        } else {
                            str = c7241bg2.m89501bg();
                        }
                        AbstractRunnableC7227Kg abstractRunnableC7227Kg3 = this.f15588bg;
                        if (abstractRunnableC7227Kg3 != null) {
                            str5 = abstractRunnableC7227Kg3.getName();
                        }
                        m89555bg(str, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 1:
                    if (uptimeMillis2 > 5000) {
                        C7241bg c7241bg3 = this.f15586IL;
                        if (c7241bg3 == null) {
                            str2 = "null";
                        } else {
                            str2 = c7241bg3.m89501bg();
                        }
                        AbstractRunnableC7227Kg abstractRunnableC7227Kg4 = this.f15588bg;
                        if (abstractRunnableC7227Kg4 != null) {
                            str5 = abstractRunnableC7227Kg4.getName();
                        }
                        m89555bg(str2, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 2:
                    if (uptimeMillis2 > 3000) {
                        C7241bg c7241bg4 = this.f15586IL;
                        if (c7241bg4 == null) {
                            str3 = "null";
                        } else {
                            str3 = c7241bg4.m89501bg();
                        }
                        AbstractRunnableC7227Kg abstractRunnableC7227Kg5 = this.f15588bg;
                        if (abstractRunnableC7227Kg5 != null) {
                            str5 = abstractRunnableC7227Kg5.getName();
                        }
                        m89555bg(str3, str5, uptimeMillis2);
                        return;
                    }
                    return;
                case 4:
                    if (uptimeMillis2 > 1000) {
                        C7241bg c7241bg5 = this.f15586IL;
                        if (c7241bg5 == null) {
                            str4 = "null";
                        } else {
                            str4 = c7241bg5.m89501bg();
                        }
                        AbstractRunnableC7227Kg abstractRunnableC7227Kg6 = this.f15588bg;
                        if (abstractRunnableC7227Kg6 != null) {
                            str5 = abstractRunnableC7227Kg6.getName();
                        }
                        m89555bg(str4, str5, uptimeMillis2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: bg */
    public AbstractRunnableC7227Kg m89556bg() {
        return this.f15588bg;
    }
}
