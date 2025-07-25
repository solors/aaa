package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.PX */
/* loaded from: classes3.dex */
public class C6385PX {

    /* renamed from: bX */
    private final ArrayList<C6386bg> f13313bX;
    private final int eqN;

    /* renamed from: iR */
    private final int f13314iR;
    private int ldr;

    /* renamed from: zx */
    private int f13315zx = -1;

    /* renamed from: bg */
    private static final Set<String> f13312bg = new HashSet();

    /* renamed from: IL */
    private static final Set<String> f13311IL = new HashSet();

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.PX$bg */
    /* loaded from: classes3.dex */
    public class C6386bg {

        /* renamed from: IL */
        int f13316IL;

        /* renamed from: bg */
        final String f13318bg;

        C6386bg(String str) {
            this.f13318bg = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: IL */
        public void m92061IL() {
            C6385PX.f13311IL.add(this.f13318bg);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bg */
        public void m92060bg() {
            C6385PX.f13312bg.add(this.f13318bg);
        }

        public String toString() {
            return this.f13318bg;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6385PX(List<String> list) {
        int i;
        if (!list.isEmpty()) {
            int size = list.size();
            this.eqN = size;
            this.f13313bX = new ArrayList<>(size);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String str : list) {
                C6386bg c6386bg = new C6386bg(str);
                if (f13312bg.contains(str)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c6386bg);
                } else if (f13311IL.contains(str)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c6386bg);
                } else {
                    this.f13313bX.add(c6386bg);
                }
            }
            if (arrayList != null) {
                this.f13313bX.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f13313bX.addAll(arrayList2);
            }
            Integer num = C6438zx.f13434WR;
            if (num != null && num.intValue() > 0) {
                i = num.intValue();
            } else {
                i = this.eqN >= 2 ? 1 : 2;
            }
            this.f13314iR = i;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public C6386bg m92064IL() {
        if (m92062bg()) {
            int i = this.f13315zx + 1;
            if (i >= this.eqN - 1) {
                this.f13315zx = -1;
                this.ldr++;
            } else {
                this.f13315zx = i;
            }
            C6386bg c6386bg = this.f13313bX.get(i);
            c6386bg.f13316IL = (this.ldr * this.eqN) + this.f13315zx;
            return c6386bg;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public boolean m92062bg() {
        if (this.ldr < this.f13314iR) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6385PX(String str) {
        ArrayList<C6386bg> arrayList = new ArrayList<>(1);
        this.f13313bX = arrayList;
        arrayList.add(new C6386bg(str));
        this.eqN = 1;
        this.f13314iR = 1;
    }
}
