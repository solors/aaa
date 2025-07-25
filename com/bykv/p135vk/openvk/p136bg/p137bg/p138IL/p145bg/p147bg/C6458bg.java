package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.C6449bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.C6454bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL.C6450IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL.C6452bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p148zx.C6488IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.C6499bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg */
/* loaded from: classes3.dex */
public class C6458bg implements InterfaceC6498IL {

    /* renamed from: bg */
    private String f13481bg = "video_reward_full";

    /* renamed from: IL */
    private String f13477IL = "video_brand";

    /* renamed from: bX */
    private String f13480bX = "video_splash";
    private String eqN = "video_default";

    /* renamed from: zx */
    private String f13483zx = null;
    private String ldr = null;

    /* renamed from: iR */
    private String f13482iR = null;

    /* renamed from: Kg */
    private String f13478Kg = null;

    /* renamed from: WR */
    private String f13479WR = null;

    /* renamed from: iR */
    private Set<String> m91869iR() {
        HashSet hashSet = new HashSet();
        for (C6454bg c6454bg : C6454bg.f13464bg.values()) {
            if (c6454bg != null && c6454bg.m91886bg() != null) {
                C6494bX m91886bg = c6454bg.m91886bg();
                hashSet.add(C6488IL.m91770IL(m91886bg.m91722IL(), m91886bg.yDt()).getAbsolutePath());
                hashSet.add(C6488IL.m91769bX(m91886bg.m91722IL(), m91886bg.yDt()).getAbsolutePath());
            }
        }
        for (C6450IL c6450il : C6452bX.f13463bg.values()) {
            if (c6450il != null && c6450il.m91900bg() != null) {
                C6494bX m91900bg = c6450il.m91900bg();
                hashSet.add(C6488IL.m91770IL(m91900bg.m91722IL(), m91900bg.yDt()).getAbsolutePath());
                hashSet.add(C6488IL.m91769bX(m91900bg.m91722IL(), m91900bg.yDt()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    private List<C6499bg> ldr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6499bg(new File(mo91689bg()).listFiles(), C6449bg.m91912bX()));
        arrayList.add(new C6499bg(new File(mo91692IL()).listFiles(), C6449bg.m91913IL()));
        arrayList.add(new C6499bg(new File(m91868zx()).listFiles(), C6449bg.eqN()));
        arrayList.add(new C6499bg(new File(mo91690bX()).listFiles(), C6449bg.m91907zx()));
        return arrayList;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: IL */
    public String mo91692IL() {
        if (this.f13478Kg == null) {
            this.f13478Kg = this.f13483zx + File.separator + this.f13480bX;
            File file = new File(this.f13478Kg);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f13478Kg;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: bX */
    public String mo91690bX() {
        if (this.f13479WR == null) {
            this.f13479WR = this.f13483zx + File.separator + this.eqN;
            File file = new File(this.f13479WR);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f13479WR;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: bg */
    public void mo91687bg(String str) {
        this.f13483zx = str;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    public synchronized void eqN() {
        Set<String> set = null;
        for (C6499bg c6499bg : ldr()) {
            File[] m91685bg = c6499bg.m91685bg();
            if (m91685bg != null && m91685bg.length >= c6499bg.m91686IL()) {
                if (set == null) {
                    set = m91869iR();
                }
                int m91686IL = c6499bg.m91686IL() - 2;
                if (m91686IL < 0) {
                    m91686IL = 0;
                }
                m91870bg(c6499bg.m91685bg(), m91686IL, set);
            }
        }
    }

    /* renamed from: zx */
    public String m91868zx() {
        if (this.f13482iR == null) {
            this.f13482iR = this.f13483zx + File.separator + this.f13477IL;
            File file = new File(this.f13482iR);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f13482iR;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: bg */
    public String mo91689bg() {
        if (this.ldr == null) {
            this.ldr = this.f13483zx + File.separator + this.f13481bg;
            File file = new File(this.ldr);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.ldr;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: IL */
    public long mo91691IL(C6494bX c6494bX) {
        if (TextUtils.isEmpty(c6494bX.m91722IL()) || TextUtils.isEmpty(c6494bX.yDt())) {
            return 0L;
        }
        return C6488IL.m91767bg(c6494bX.m91722IL(), c6494bX.yDt());
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL
    /* renamed from: bg */
    public boolean mo91688bg(C6494bX c6494bX) {
        if (TextUtils.isEmpty(c6494bX.m91722IL()) || TextUtils.isEmpty(c6494bX.yDt())) {
            return false;
        }
        return new File(c6494bX.m91722IL(), c6494bX.yDt()).exists();
    }

    /* renamed from: bg */
    private static void m91870bg(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List asList = Arrays.asList(fileArr);
                    Collections.sort(asList, new Comparator<File>() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg.1
                        @Override // java.util.Comparator
                        /* renamed from: bg */
                        public int compare(File file, File file2) {
                            int i2 = ((file2.lastModified() - file.lastModified()) > 0L ? 1 : ((file2.lastModified() - file.lastModified()) == 0L ? 0 : -1));
                            if (i2 == 0) {
                                return 0;
                            }
                            if (i2 < 0) {
                                return -1;
                            }
                            return 1;
                        }
                    });
                    while (i < asList.size()) {
                        File file = (File) asList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) asList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
